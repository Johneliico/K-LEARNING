package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class plants extends AppCompatActivity {
    ImageButton button74,button75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);
        button74 = (ImageButton) findViewById(R.id.imageButton74);
        button75 = (ImageButton) findViewById(R.id.imageButton75);


        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadPartOfPlants = new Intent(plants.this,nanamplan.class);
                startActivity(intentLoadPartOfPlants);
            }
        });
    }
}