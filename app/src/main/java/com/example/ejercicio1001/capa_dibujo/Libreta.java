package com.example.ejercicio1001.capa_dibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.example.ejercicio1001.R;

/**
 *
 * Clase para dibujar una libreta en el canvas
 */
public class Libreta extends View {
    Paint brochaRosa;
    Paint brochaGris;

    // Constructor
    public Libreta(Context context)
    {

        super(context);
        brochaGris = new Paint() ;
        brochaRosa = new Paint();
    }

    // Sobreescribimos el método en el que dibujaremos todas las líneas
    protected void onDraw(Canvas canvas)
    {
        // Brocha para la línea rosa vertical

        brochaRosa.setColor(getResources().getColor(R.color.colorPrimary));
        brochaRosa.setStrokeWidth(10.0F);

        // Brocha para las líneas grises horizontales

        brochaGris.setColor(getResources().getColor(R.color.divider));
        brochaRosa.setStrokeWidth(1.5F);

        float startX = canvas.getWidth() / 4.5F;
        float endX = canvas.getWidth();

        float startY = canvas.getHeight() / 7F;
        float endY = canvas.getHeight();

        // Dibujamos las líneas rosas
        canvas.drawLine(startX, 0, startX, endY, brochaRosa);
        canvas.drawLine(0, endY, endX, endY, brochaRosa);

        // Dibujamos todas las líneas grises horizontales
        // Las dibujamos todas con una separación de 20
        for (float pos = startY; pos < endY; pos += 20)
        {
            canvas.drawLine(0, pos, endX, pos, brochaGris);
        }
    }
}