package com.example.kids_learning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class animalsound extends AppCompatActivity {
    ImageButton button36,button37,button38,button39,button40,button41,button42,button43,button44,button45,button46,
    button47,button48,button49,button50,button51,button52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalsound);
        setTitle("Animals");
        button37 = findViewById(R.id.imageButton37);
        button36 = findViewById(R.id.imageButton36);
        button38 = findViewById(R.id.imageButton38);
        button39 = findViewById(R.id.imageButton39);
        button40 = findViewById(R.id.imageButton40);
        button41 = findViewById(R.id.imageButton41);
        button42 = findViewById(R.id.imageButton42);
        button43 = findViewById(R.id.imageButton43);
        button44 = findViewById(R.id.imageButton44);
        button45 = findViewById(R.id.imageButton45);
        button46 = findViewById(R.id.imageButton46);
        button47 = findViewById(R.id.imageButton47);
        button48 = findViewById(R.id.imageButton48);
        button49 = findViewById(R.id.imageButton49);
        button50 = findViewById(R.id.imageButton50);
        button51 = findViewById(R.id.imageButton51);
        button52 = findViewById(R.id.imageButton52);


        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.moneky);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

            }
        });
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.meow);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.chickin);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.dog);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.bird);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.sheep);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.lion);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.cow);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.horse);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.tiger);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.duck);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.pig);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.elephant);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.owl);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.snake);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.goat);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.wolf);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });



    }
}