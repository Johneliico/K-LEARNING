package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class mainapps extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainapps);
    }

    public void logout(View view) {

        mAuth.signOut();
        Intent intent= new Intent(mainapps.this, MainActivity.class);
        startActivity(intent);


    }

    public void start(View view) {
        Intent intent = new Intent(mainapps.this, choices.class);
        startActivity(intent);
    }
}