package com.example.ejercicio1001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.example.ejercicio1001.capa_dibujo.Libreta;

public class ActLibreta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_libreta);
        // Añadimos el aspecto de libreta a nuestro layout
        ConstraintLayout miLayout = (ConstraintLayout)findViewById(R.id.libretaLayout);
        Libreta libreta = new Libreta(this);
        miLayout.addView(libreta);
    }
}