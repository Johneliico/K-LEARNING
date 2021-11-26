package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

    public void number(View view) {
        Intent intent = new Intent(math.this, numbers.class);
        startActivity(intent);
    }

    public void shapes(View view) {
        Intent intent = new Intent(math.this, shape.class);
        startActivity(intent);
    }

    public void addition(View view) {
        Intent intent = new Intent(math.this, addition.class);
        startActivity(intent);
    }

    public void minus(View view) {
        Intent intent = new Intent(math.this, minus.class);
        startActivity(intent);
    }
}