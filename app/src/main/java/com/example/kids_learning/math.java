package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class math extends AppCompatActivity {
   ImageButton button12,button11,button13,button14,button15,button16,button17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        button12 = (ImageButton) findViewById(R.id.imageButton12);
        button11 = (ImageButton) findViewById(R.id.imageButton11);
        button13 = (ImageButton) findViewById(R.id.imageButton13);
        button14 = (ImageButton) findViewById(R.id.imageButton14);
        button15 = (ImageButton) findViewById(R.id.imageButton15);
        button16 = (ImageButton) findViewById(R.id.imageButton16);
        button17 = (ImageButton) findViewById(R.id.imageButton17);



        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(math.this,numbers.class);
                startActivity(intentLoadMath);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(math.this,choices.class);
                startActivity(intentLoadMath);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(math.this,shape.class);
                startActivity(intentLoadMath);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(math.this,addition.class);
                startActivity(intentLoadMath);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(math.this,tabletwo.class);
                startActivity(intentLoadMath);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(math.this,muteplay.class);
                startActivity(intentLoadMath);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMath = new Intent(math.this,liners.class);
                startActivity(intentLoadMath);
            }
        });

    }


}