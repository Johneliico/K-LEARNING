package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

    }

    public void wantoten(View view) {
        Intent intent = new Intent(numbers.this, wantoten.class);
        startActivity(intent);
    }

    public void twentye(View view) {
        Intent intent = new Intent(numbers.this, twentye.class);
        startActivity(intent);
    }

    public void thirtye(View view) {
        Intent intent = new Intent(numbers.this, thirtye.class);
        startActivity(intent);
    }

    public void fourtye(View view) {
        Intent intent = new Intent(numbers.this, fourtye.class);
        startActivity(intent);
    }

    public void fiftye(View view) {
        Intent intent = new Intent(numbers.this, fiftye.class);
        startActivity(intent);

    }

    public void sistye(View view) {
        Intent intent = new Intent(numbers.this, sistye.class);
        startActivity(intent);

    }

    public void seventye(View view) {
        Intent intent = new Intent(numbers.this, seventye.class);
        startActivity(intent);
    }

    public void eightye(View view) {
        Intent intent = new Intent(numbers.this, eightye.class);
        startActivity(intent);
    }

    public void ninetye(View view) {
        Intent intent = new Intent(numbers.this, ninetye.class);
        startActivity(intent);
    }

    public void onehundredye(View view) {
        Intent intent = new Intent(numbers.this, onehundredtye.class);
        startActivity(intent);
    }
}