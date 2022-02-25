package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class foodie extends AppCompatActivity {
    ImageButton button71,button72,button73;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodie);

        button71 = (ImageButton) findViewById(R.id.imageButton71);
        button72 = (ImageButton) findViewById(R.id.imageButton72);
        button73 = (ImageButton) findViewById(R.id.imageButton73);


        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadGoFood = new Intent(foodie.this,gofood.class);
                startActivity(intentLoadGoFood);
            }
        });
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadGrowFood =  new Intent(foodie.this,groweshi.class);
                startActivity(intentLoadGrowFood);
            }
        });
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intentLoadGlowFood = new Intent(foodie.this,glowfood.class);
                startActivity(intentLoadGlowFood);
            }
        });

    }
}