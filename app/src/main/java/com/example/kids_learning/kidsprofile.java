package com.example.kids_learning;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.UUID;

import de.hdodenhof.circleimageview.CircleImageView;

public class kidsprofile extends AppCompatActivity {

    CircleImageView imageProfile;
    ActivityResultLauncher<String> mgGetContent;
    StorageReference storage;
    Uri imageUri;

    TextView imgupload;

    FirebaseAuth mAuth;
    FirebaseUser user;
    DatabaseReference dbReference;


    String userID;
    TextView txtDisplay;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidsprofile);

        imageProfile = findViewById(R.id.profile_image);
        imgupload = findViewById(R.id.upload);


        storage = FirebaseStorage.getInstance().getReference();

        imgupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadPicture();


            }
        });

        mgGetContent = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback<Uri>() {
            @Override
            public void onActivityResult(Uri result) {
                if (result != null)
                    imageProfile.setImageURI(result);

                imageUri = result;


            }
        });


        imageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgGetContent.launch("image/*");


            }
        });





        mAuth=FirebaseAuth.getInstance();


        user=mAuth.getCurrentUser();
        dbReference= FirebaseDatabase.getInstance().getReference("User");
        userID=user.getUid();

        txtDisplay=findViewById(R.id.textView_eh);



        dbReference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User user= snapshot.getValue(User.class);


                if (user!= null){
                    String id, name, address, email;
                    id= user.id;
                    name= user.name;
                    address=user.address;
                    email=user.email;

                    txtDisplay.setText("ID Number"+id+"\nName"+name+"\nAddress"+address+"\nEmail"+email);
                }
            }




            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(kidsprofile.this, "An error occurred", Toast.LENGTH_SHORT).show();

            }
        });


   DatabaseReference db = FirebaseDatabase.getInstance().getReference("User").child(userID)
           .child("images");
        db.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                    Glide.with(kidsprofile.this).load(snapshot.getValue().toString()).into(imageProfile);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }


    private void uploadPicture() {

        if (imageUri != null) {

            StorageReference reference= storage.child("images/"+ UUID.randomUUID().toString());


            reference.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            DatabaseReference db= FirebaseDatabase.getInstance().getReference("User").child(userID)
                                    .child("images");
                            db.setValue(uri.toString());
                            Toast.makeText(kidsprofile.this, "Image Uploaded.", Toast.LENGTH_SHORT).show();

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(kidsprofile.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(kidsprofile.this, "Failed to upload.", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }





            public void lagawt(View view) {

        mAuth.signOut();
        Intent intent = new Intent(kidsprofile.this, MainActivity.class);
        startActivity(intent);


    }
}