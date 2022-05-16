package com.example.ejercicio1001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.example.ejercicio1001.capa_dibujo.TextoCircular;

public class ActPath2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_path2);
        // Añadimos nuestro view personalizado
        TextoCircular textoCircular = new TextoCircular(getApplicationContext());
        textoCircular.setText("Ejercicio realizado para la asignatura de Programación Multimedia y D. M.");

        ConstraintLayout miLayout = (ConstraintLayout)findViewById(R.id.ActPath2);
        miLayout.addView(textoCircular);
    }
}