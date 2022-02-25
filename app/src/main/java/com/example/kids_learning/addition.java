package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class addition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
    }

    public void tableones(View view) {
        Intent intent = new Intent(addition.this, tableone.class);
        startActivity(intent);
    }

    public void adding(View view) {
        Intent intent = new Intent(addition.this, adding.class);
        startActivity(intent);
    }
}