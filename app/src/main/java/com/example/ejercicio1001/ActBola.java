package com.example.ejercicio1001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.example.ejercicio1001.capa_dibujo.Bola_Rebotante;

public class ActBola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_bola);
        // View personalizado
        Bola_Rebotante bola = new Bola_Rebotante(getApplicationContext());

        // Dibujamos nuestro view personalizado de la bola
        ConstraintLayout miLayout = (ConstraintLayout) findViewById(R.id.ActBola);

        miLayout.addView(bola);
    }
}