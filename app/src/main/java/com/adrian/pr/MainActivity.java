package com.adrian.pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    EditText  text3;
    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        text1 = findViewById(R.id.nombre);
        text2 = findViewById(R.id.usuario);
        text3 = findViewById(R.id.txtmensj);
        buton = findViewById(R.id.button);
        //diseño
        Button button = findViewById(R.id.button);
        button.setX(400);
        button.setY(1200);
        //
        TextView textView = findViewById(R.id.txtmensj);
        textView.setTranslationX(250);
        textView.setTranslationY(1000);
        //
        //
        TextView textu = findViewById(R.id.usuario);
        textu.setTranslationX(250);
        textu.setTranslationY(850);
        //
        //
        TextView textn = findViewById(R.id.nombre);
        textn.setTranslationX(250);
        textn.setTranslationY(700);
        //
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setX(210);
        imageView.setY(100);

    }
    public void eviarmensaje(View view) {
        String texto1= text1.getText().toString();
        String texto2= text2.getText().toString();
        String texto3= text3.getText().toString();
        Intent intent = new Intent(this, SegundoActivity.class);
        intent.putExtra( "name", texto1);
        intent.putExtra( "name1", texto2);
        intent.putExtra( "name2", texto3);
        startActivity(intent);//iniciamos el segundo activity
        finish();
        //
    }

}