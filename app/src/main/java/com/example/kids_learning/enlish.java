package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class enlish extends AppCompatActivity {
    ImageButton button24,button25,button26,button27,button28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlish);
        button24 = (ImageButton) findViewById(R.id.imageButton24);
        button25 = (ImageButton) findViewById(R.id.imageButton25);
        button27 = (ImageButton) findViewById(R.id.imageButton27);
        button26 = (ImageButton) findViewById(R.id.imageButton26);
        button28 = (ImageButton) findViewById(R.id.imageButton28);

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadChoices = new Intent(enlish.this, choices.class);
                startActivity(intentLoadChoices);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadAlphabet = new Intent(enlish.this,alphaaus.class);
                startActivity(intentLoadAlphabet);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadShort = new Intent(enlish.this, storieshort.class);
                startActivity(intentLoadShort);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNursery = new Intent(enlish.this, nurlsery.class);
                startActivity(intentLoadNursery);
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadAction = new Intent(enlish.this, actionverb.class);
                startActivity(intentLoadAction);
            }
        });



    }
}