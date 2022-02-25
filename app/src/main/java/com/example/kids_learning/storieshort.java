package com.example.kids_learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class storieshort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storieshort);
    }

    public void ghsoe(View view) {
        Intent intent = new Intent(storieshort.this, goose.class);
        startActivity(intent);
    }

    public void lionel(View view) {
        Intent intent = new Intent(storieshort.this, leiolel.class);
        startActivity(intent);
    }

    public void hares(View view) {
        Intent intent = new Intent(storieshort.this, hare.class);
        startActivity(intent);
    }

    public void grasho(View view) {
        Intent intent = new Intent(storieshort.this, grahop.class);
        startActivity(intent);
    }

    public void davud(View view) {
        Intent intent = new Intent(storieshort.this, davago.class);
        startActivity(intent);
    }

    public void jabok(View view) {
        Intent intent = new Intent(storieshort.this, jakbe.class);
        startActivity(intent);
    }

    public void foie(View view) {
        Intent intent = new Intent(storieshort.this, foxie.class);
        startActivity(intent);
    }

    public void dolke(View view) {
        Intent intent = new Intent(storieshort.this, dolmonk.class);
        startActivity(intent);
    }

    public void clevr(View view) {
        Intent intent = new Intent(storieshort.this, cleavver.class);
        startActivity(intent);
    }

    public void shepa(View view) {
        Intent intent = new Intent(storieshort.this, shimper.class);
        startActivity(intent);
    }
}