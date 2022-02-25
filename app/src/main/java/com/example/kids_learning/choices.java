package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class choices extends AppCompatActivity {
        ImageButton button1,button2,button3,button4,button5,button6,button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);
        button1 = (ImageButton) findViewById(R.id.imageButton);
        button2 = (ImageButton) findViewById(R.id.imageButton2);
        button3 = (ImageButton) findViewById(R.id.imageButton3);
        button4 = (ImageButton) findViewById(R.id.imageButton4);
        button5 = (ImageButton) findViewById(R.id.imageButton5);
        button6 = (ImageButton) findViewById(R.id.imageButton6);
        button7 = (ImageButton) findViewById(R.id.imageButton7);
        button8 = (ImageButton) findViewById(R.id.imageButton8);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(choices.this,math.class);
                startActivity(intentLoadMath);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadScience = new Intent(choices.this,science.class);
                startActivity(intentLoadScience);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMainapps = new Intent(choices.this,mainapps.class);
                startActivity(intentLoadMainapps);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadEnlish  = new Intent(choices.this,enlish.class);
                startActivity(intentLoadEnlish);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDictionaryo = new Intent(choices.this,dictionaryo.class);
                startActivity(intentDictionaryo);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKidsProfile = new Intent(choices.this,kidsprofile.class);
                startActivity(intentKidsProfile);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQuiz = new Intent(choices.this,activityquiz.class);
                startActivity(intentQuiz);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentScoreBoard = new Intent(choices.this,scoreboards.class);
                startActivity(intentScoreBoard);
            }
        });

    }
}