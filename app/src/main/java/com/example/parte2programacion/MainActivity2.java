package com.example.parte2programacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton seis;
    private ImageButton siete;
    private ImageButton ocho;
    private ImageButton nueve;
    private ImageButton diez;
    private ImageButton pasar1;
    private ImageButton creador2;
    MediaPlayer paraseis;
    MediaPlayer parasiete;
    MediaPlayer paraocho;
    MediaPlayer paranueve;
    MediaPlayer paradiez;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        seis = (ImageButton) findViewById(R.id.btn6);
        paraseis = MediaPlayer.create(getApplicationContext(), R.raw.audio6);
        siete = (ImageButton) findViewById(R.id.btn7);
        parasiete = MediaPlayer.create(getApplicationContext(), R.raw.audio7);
        ocho = (ImageButton) findViewById(R.id.btn8);
        paraocho = MediaPlayer.create(getApplicationContext(), R.raw.audio8);
        nueve = (ImageButton) findViewById(R.id.btn9);
        paranueve = MediaPlayer.create(getApplicationContext(), R.raw.audio9);
        diez = (ImageButton) findViewById(R.id.btn10);
        paradiez = MediaPlayer.create(getApplicationContext(), R.raw.audio10);
        pasar1 = (ImageButton) findViewById(R.id.imageregreso);
        creador2 = (ImageButton) findViewById(R.id.imagecreadores2);

pasar1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        finish();
    }
});

seis.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        paraseis.start();
    }
});

siete.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        parasiete.start();
    }
});

ocho.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        paraocho.start();
    }
});

nueve.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        paranueve.start();
    }
});

diez.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        paradiez.start();
    }
});

        creador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}