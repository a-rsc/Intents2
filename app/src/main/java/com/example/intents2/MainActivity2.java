package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv = findViewById(R.id.salutacio);

        // Si enviem 1 dada
        // String nom = getIntent().getStringExtra("etiquetaNom");
        // tv.setText("Hola " + nom);

        // Més d'una dada (Bundle)
        Bundle sacRecuperat = getIntent().getExtras();
        String nom = sacRecuperat.getString("etiquetaNom");
        int edat = sacRecuperat.getInt("etiquetaEdat");

        tv.setText("Hola " + nom + ", tens " + edat + " anys.");
    }
}