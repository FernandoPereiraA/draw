package com.example.ejercicio1001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.example.ejercicio1001.capa_dibujo.TextoSiguiendoPath;

public class ActPath1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_path1);
        // Añadimos el texto deformado a nuestra pantalla
        ConstraintLayout miLayout = (ConstraintLayout)findViewById(R.id.ActPath1);

        TextoSiguiendoPath texto = new TextoSiguiendoPath(getApplicationContext());

        // Le asignamos en las propiedades el texto y el tamaño
        texto.setText("Grupo DAM2 IES 1 Gijón");
        texto.setTextSize(35);

        miLayout.addView(texto);
    }
}