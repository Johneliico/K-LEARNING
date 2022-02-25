package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class muteplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muteplay);
    }

    public void ontable(View view) {
        Intent intent = new Intent(muteplay.this,tablethree.class);
        startActivity(intent);
    }

    public void mathemul(View view) {
        Intent intent = new Intent(muteplay.this,timingsnum.class);
        startActivity(intent);
    }
}