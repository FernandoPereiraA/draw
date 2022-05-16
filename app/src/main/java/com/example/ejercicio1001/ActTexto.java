package com.example.ejercicio1001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.example.ejercicio1001.capa_dibujo.Texto;

public class ActTexto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_texto);

        // Añadimos nuestro texto a la pantalla
        ConstraintLayout mainLayout = (ConstraintLayout)findViewById(R.id.ActTexto);

        mainLayout.addView(new Texto(getApplicationContext()));
    }
}