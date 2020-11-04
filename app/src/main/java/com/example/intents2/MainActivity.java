package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Esto es un cambio para hacer un nuevo commit!!!

        Button bt = findViewById(R.id.button);
        editText = findViewById(R.id.name);
        editText2 = findViewById(R.id.edat);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String nom = editText.getText().toString();
        int edat = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, MainActivity2.class);

        // Si enviem 1 dada el putExtra és correcta sino utilitzem un Bundle
        // intent.putExtra("etiquetaNom", nom); // codi o etiqueta perque s'entenguin les 2 activitats
        // startActivity(intent);

        // Més d'una dada (Bundle)
        Bundle sac = new Bundle();
        sac.putString("etiquetaNom", nom);
        sac.putInt("etiquetaEdat", edat);
        intent.putExtras(sac);
        startActivity(intent);


    }
}