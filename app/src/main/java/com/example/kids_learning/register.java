package com.example.kids_learning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {

    EditText editId, editName, editAddress, editEmail, editPassword;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editId= findViewById(R.id.editText3);
        editName= findViewById(R.id.editText4);
        editAddress= findViewById(R.id.editText5);
        editEmail= findViewById(R.id.editText6);
        editPassword= findViewById(R.id.editText7);

        mAuth=FirebaseAuth.getInstance();
    }

    public void register(View view) {
        String id, name, address, email, password;

        id=editId.getText().toString().trim();
        name=editName.getText().toString().trim();
        address=editAddress.getText().toString().trim();
        email=editEmail.getText().toString().trim();
        password=editPassword.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){
                            User user= new User(id, name, address, email);

                            FirebaseDatabase.getInstance().getReference("User")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if (task.isSuccessful()){
                                        Toast.makeText(register.this, "Register is Successful", Toast.LENGTH_SHORT).show();
                                    }else {
                                        Toast.makeText(register.this, "Register is Failed. Please try again", Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });
                        }else{
                            Toast.makeText(register.this, "Register is Failed. Please try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    public void already(View view) {
        Intent intent = new Intent(register.this, MainActivity.class);
        startActivity(intent);
    }
}