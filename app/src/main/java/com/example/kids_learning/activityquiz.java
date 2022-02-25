package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activityquiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityquiz);
    }

    public void startGame(View view) {
        Intent intent = new Intent(activityquiz.this, letsquizz.class);
        startActivity(intent);
    }
}