package com.example.kids_learning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class alphaaus extends AppCompatActivity {
    ImageButton but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16,but17,but18,but19,but20,but21,but22,but23,but24,but25,but26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphaaus);
        setTitle("alphabet");
        but1 = findViewById(R.id.image1);
        but2 = findViewById(R.id.image2);
        but3 = findViewById(R.id.image3);
        but4 = findViewById(R.id.image4);
        but5 = findViewById(R.id.image5);
        but6 = findViewById(R.id.image6);
        but7 = findViewById(R.id.image7);
        but8 = findViewById(R.id.image8);
        but9 = findViewById(R.id.image9);
        but10 = findViewById(R.id.image10);
        but11 = findViewById(R.id.image11);
        but12 = findViewById(R.id.image12);
        but13 = findViewById(R.id.image13);
        but14 = findViewById(R.id.image14);
        but15 = findViewById(R.id.image15);
        but16 = findViewById(R.id.image16);
        but17 = findViewById(R.id.image17);
        but18 = findViewById(R.id.image18);
        but19 = findViewById(R.id.image19);
        but20 = findViewById(R.id.image20);
        but21 = findViewById(R.id.image21);
        but22 = findViewById(R.id.image22);
        but23 = findViewById(R.id.image23);
        but24 = findViewById(R.id.image24);
        but25 = findViewById(R.id.image25);
        but26 = findViewById(R.id.image26);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.aeisforapple);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mediaPlayer.start();
            }
        });
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.beisforbag);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.cisforcar);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.disfordog);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.eisforelephant);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.fisforfork);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.gisforgiraffe);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.hisforheat);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.iisforiron);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.jisforjar);
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.kisforkite);
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.lisforlion);
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });
        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.misformoon);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, R.raw.nisfornose);
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer13.start();
            }
        });
        MediaPlayer mediaPlayer14 = MediaPlayer.create(this, R.raw.oisforoctupus);
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer14.start();
            }
        });
        MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.pisforpineapple);
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer15.start();
            }
        });
        MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.qisforqueen);
        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer16.start();
            }
        });
        MediaPlayer mediaPlayer17 = MediaPlayer.create(this, R.raw.risforrabbit);
        but18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer17.start();
            }
        });
        MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.sisforspaghetti);
        but19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer18.start();
            }
        });
        MediaPlayer mediaPlayer19 = MediaPlayer.create(this, R.raw.tisfortoy);
        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer19.start();
            }
        });
        MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.uisforumbrella);
        but21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer20.start();
            }
        });
        MediaPlayer mediaPlayer21 = MediaPlayer.create(this, R.raw.visforvegetables);
        but22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer21.start();
            }
        });
        MediaPlayer mediaPlayer22 = MediaPlayer.create(this, R.raw.wisforwhale);
        but23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer22.start();
            }
        });
        MediaPlayer mediaPlayer23 = MediaPlayer.create(this, R.raw.xisforxray);
        but24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer23.start();
            }
        });
        MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.yisforyacht);
        but25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer24.start();
            }
        });
        MediaPlayer mediaPlayer25 = MediaPlayer.create(this, R.raw.zisforzebra);
        but26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer25.start();
            }
        });



    }
}