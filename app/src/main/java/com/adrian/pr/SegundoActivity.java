package com.adrian.pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
        TextView txtn;
        TextView txtu;
        TextView txtc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Intent intent=getIntent();
        txtn = findViewById(R.id.txtn);
        txtn.setTranslationX(500);
        txtn.setTranslationY(800);
        txtu = findViewById(R.id.txtu);
        txtu.setTranslationX(500);
        txtu.setTranslationY(900);
        txtc = findViewById(R.id.txtc);
        txtc.setTranslationX(500);
        txtc.setTranslationY(1000);
        String mensajeRecibido=intent.getStringExtra("name");
        String mensajeRecibido1=intent.getStringExtra("name1");
        String mensajeRecibido2=intent.getStringExtra("name2");
        txtn.setText(mensajeRecibido);
        txtu.setText(mensajeRecibido1);
        txtc.setText(mensajeRecibido2);




    }
}