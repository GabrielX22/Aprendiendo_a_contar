package com.example.parte2programacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageButton uno;
    private ImageButton dos;
    private ImageButton tres;
    private ImageButton cuatro;
    private ImageButton cinco;
    private ImageButton comienzo;
    private ImageButton pasar2;
    private ImageView logo;
    private ImageButton creador1;
    MediaPlayer parauno;
    MediaPlayer parados;
    MediaPlayer paratres;
    MediaPlayer paracuatro;
    MediaPlayer paracinco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uno = (ImageButton) findViewById(R.id.btn1);
        parauno = MediaPlayer.create(getApplicationContext(), R.raw.audio1);
        dos = (ImageButton) findViewById(R.id.btn2);
        parados = MediaPlayer.create(getApplicationContext(), R.raw.audio2);
        tres = (ImageButton) findViewById(R.id.btn3);
        paratres = MediaPlayer.create(getApplicationContext(), R.raw.audio3);
        cuatro = (ImageButton) findViewById(R.id.btn4);
        paracuatro = MediaPlayer.create(getApplicationContext(), R.raw.audio4);
        cinco = (ImageButton) findViewById(R.id.btn5);
        paracinco = MediaPlayer.create(getApplicationContext(), R.raw.audio5);
        comienzo = (ImageButton) findViewById(R.id.btnempezar);
        pasar2 = (ImageButton) findViewById(R.id.imageida);
        logo = (ImageView) findViewById(R.id.imagelogo);
        creador1 = (ImageButton) findViewById(R.id.imagecreadores);

        uno.setVisibility(View.GONE);
        dos.setVisibility(View.GONE);
        tres.setVisibility(View.GONE);
        cuatro.setVisibility(View.GONE);
        cinco.setVisibility(View.GONE);
        pasar2.setVisibility(View.GONE);

        comienzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uno.setVisibility(View.VISIBLE);
                dos.setVisibility(View.VISIBLE);
                tres.setVisibility(View.VISIBLE);
                cuatro.setVisibility(View.VISIBLE);
                cinco.setVisibility(View.VISIBLE);
                pasar2.setVisibility(View.VISIBLE);
                logo.setVisibility(View.GONE);
                comienzo.setVisibility(View.GONE);
            }
        });

        pasar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parauno.start();
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parados.start();
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paratres.start();
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paracuatro.start();
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paracinco.start();
            }
        });

        creador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}