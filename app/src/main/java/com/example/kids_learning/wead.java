package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class wead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wead);
    }

    public void summe(View view) {
        Intent intent = new Intent(wead.this, summers.class);
        startActivity(intent);
    }

    public void spleng(View view) {
        Intent intent = new Intent(wead.this, springel.class);
        startActivity(intent);
    }

    public void uktum(View view) {
        Intent intent = new Intent(wead.this, autuk.class);
        startActivity(intent);
    }

    public void weynter(View view) {
        Intent intent = new Intent(wead.this, wenter.class);
        startActivity(intent);
    }

    public void reing(View view) {
        Intent intent = new Intent(wead.this, rene.class);
        startActivity(intent);
    }
}