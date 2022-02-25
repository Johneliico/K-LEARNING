package com.example.kids_learning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class body extends AppCompatActivity {
    ImageButton button53,button54,button55,button56,button57,button58,button59,button60,button61,button62,button63,button64,button65,button66;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        setTitle("Body");
        button53 = findViewById(R.id.imageButton53);
        button54 = findViewById(R.id.imageButton54);
        button55 = findViewById(R.id.imageButton55);
        button56 = findViewById(R.id.imageButton56);
        button57 = findViewById(R.id.imageButton57);
        button58 = findViewById(R.id.imageButton58);
        button59 = findViewById(R.id.imageButton59);
        button60 = findViewById(R.id.imageButton60);
        button61 = findViewById(R.id.imageButton61);
        button62 = findViewById(R.id.imageButton62);
        button63 = findViewById(R.id.imageButton63);
        button64 = findViewById(R.id.imageButton64);
        button65 = findViewById(R.id.imageButton65);
        button66 = findViewById(R.id.imageButton66);


        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.eyes);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.head);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.nose);
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.mouth);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.ears);
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.neck);
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.shoulder);
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.arms);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.chest);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.elbow);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.thigh);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.knee);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.foot);
        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, R.raw.toes);
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });


    }
}