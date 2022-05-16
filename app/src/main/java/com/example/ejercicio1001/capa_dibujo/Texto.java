package com.example.ejercicio1001.capa_dibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

import com.example.ejercicio1001.R;

/**
 * Clase para escribir un texto
 */
public class Texto extends View
{
    Paint brocha;
    public Texto(Context context)
    {
        super(context);
        brocha = new Paint();
    }

    // Sobreescribimos el método para dibujarlo
    protected void onDraw(Canvas canvas)
    {
        // Empezamos haciendo una brocha para el primer texto

        brocha.setColor(getResources().getColor(R.color.primary_text));
        brocha.setTextSize(30F);

        brocha.setTypeface(Typeface.SERIF);
        float y = canvas.getHeight() / 8F;

        canvas.drawText("Hola Mundo (SERIF)", 0, y, brocha);

        // Segundo texto. Sin serifas
        brocha.setTypeface(Typeface.SANS_SERIF);
        y += brocha.getTextSize();

        canvas.drawText("Hola Mundo (SANS SERIF)", 0, y, brocha);

        // Tercer texto. Monoespaciada
        brocha.setTypeface(Typeface.MONOSPACE);
        y += brocha.getTextSize();

        canvas.drawText("Hola Mundo (MONOSPACE)", 0, y, brocha);

        // Cuarto texto. Serif italic
        brocha.setTypeface(Typeface.create(Typeface.SERIF, Typeface.ITALIC));
        y += brocha.getTextSize();

        canvas.drawText("Hola Mundo (SERIF ITALIC)", 0, y, brocha);

        // Cuarto texto. Serif italic bold
        brocha.setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD_ITALIC));
        y += brocha.getTextSize();

        canvas.drawText("Hola Mundo (SERIF ITALIC BOLD)", 0, y, brocha);
    }
}
