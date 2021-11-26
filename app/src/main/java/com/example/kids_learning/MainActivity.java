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

public class MainActivity extends AppCompatActivity {

    EditText editEm, editPass;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEm= findViewById(R.id.editText1);
        editPass= findViewById(R.id.editText2);

        mAuth= FirebaseAuth.getInstance();
    }

    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, register.class);
        startActivity(intent);
    }

    public void login(View view) {
        String email, password;

        email= editEm.getText().toString().trim();
        password= editPass.getText().toString().trim();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Intent intent= new Intent(getApplicationContext(), mainapps.class);
                            startActivity(intent);

                        }else{
                            Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }
}