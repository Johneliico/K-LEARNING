package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class animals extends AppCompatActivity {
    ImageButton button31,button32,button33,button34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        button31 = (ImageButton) findViewById(R.id.imageButton31);
        button32 = (ImageButton) findViewById(R.id.imageButton32);
        button33 = (ImageButton) findViewById(R.id.imageButton33);
        button34 = (ImageButton) findViewById(R.id.imageButton34);

          button31.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intentLoadAnimalSound = new Intent(animals.this,animalsound.class);
                  startActivity(intentLoadAnimalSound);
              }
          });
          button32.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intentLoadLandAnimal = new Intent(animals.this,landanimals.class);
                  startActivity(intentLoadLandAnimal);
              }
          });
          button33.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intentLoadWaterAnimal = new Intent(animals.this,wateranimals.class);
                  startActivity(intentLoadWaterAnimal);
              }
          });
          button34.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intentLoadFlyingAnimal = new Intent(animals.this,flyinganimal.class);
                  startActivity(intentLoadFlyingAnimal);
              }
          });

    }
}