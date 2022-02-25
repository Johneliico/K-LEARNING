package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class science extends AppCompatActivity {
    ImageButton button18,button19,button20,button21,button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        button18 = (ImageButton) findViewById(R.id.imageButton18);
        button19 = (ImageButton) findViewById(R.id.imageButton19);
        button20 = (ImageButton) findViewById(R.id.imageButton20);
        button21 = (ImageButton) findViewById(R.id.imageButton21);
        button23 = (ImageButton) findViewById(R.id.imageButton23);


        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadChoices = new Intent(science.this,choices.class);
                startActivity(intentLoadChoices);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadAnimals = new Intent(science.this,animals.class);
                startActivity(intentLoadAnimals);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadBody = new Intent(science.this,body.class);
                startActivity(intentLoadBody);
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadFood = new Intent(science.this,foodie.class);
                startActivity(intentLoadFood);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadWead = new Intent(science.this,wead.class);
                startActivity(intentLoadWead);
            }
        });



    }



}