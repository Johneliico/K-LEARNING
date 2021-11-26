package com.example.kids_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);
    }

    public void math(View view) {
        Intent intent = new Intent(choices.this, math.class);
        startActivity(intent);
    }

    public void science(View view) {
        Intent intent = new Intent(choices.this, science.class);
        startActivity(intent);
    }

    public void quiz(View view) {
        Intent intent = new Intent(choices.this, quiz.class);
        startActivity(intent);
    }
}