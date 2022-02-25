package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class tabletwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabletwo);
    }

    public void tabletwo(View view) {
        Intent intent = new Intent(tabletwo.this, subtract.class);
        startActivity(intent);
    }

    public void bawas(View view) {
        Intent intent = new Intent(tabletwo.this, susginoo.class);
        startActivity(intent);
    }
}