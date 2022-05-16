package com.example.ejercicio1001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import com.example.ejercicio1001.capa_dibujo.Imagen;

public class ActBitmap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_bitmap);
        // Añadimos nuestra imagen
        Imagen img = new Imagen(getApplicationContext());
        img.setImageBitmap(R.drawable.imagen1);

        ConstraintLayout miLayout = (ConstraintLayout)findViewById(R.id.bitmapLayout);
        miLayout.addView(img);
    }
}