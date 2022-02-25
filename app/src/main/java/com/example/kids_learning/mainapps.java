package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class mainapps extends AppCompatActivity {

    FirebaseAuth mAuth;
    ImageButton button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainapps);
        button9 = (ImageButton) findViewById(R.id.imageButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(mainapps.this,choices.class);
                startActivity(intentLoadMath);
            }
        });
    }

    public void logout(View view) {

        mAuth.signOut();
        Intent intent= new Intent(mainapps.this, MainActivity.class);
        startActivity(intent);


    }

}