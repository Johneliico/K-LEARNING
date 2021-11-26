package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
    }

    public void animals(View view) {
        Intent intent = new Intent(science.this, animals.class);
        startActivity(intent);
    }

    public void body(View view) {
        Intent intent = new Intent(science.this, body.class);
        startActivity(intent);
    }

    public void matter(View view) {
        Intent intent = new Intent(science.this, matter.class);
        startActivity(intent);
    }
}