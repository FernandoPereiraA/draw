package com.example.ejercicio1001.capa_dibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;

import com.example.ejercicio1001.R;


/**
 * Created by             . Extends View
 */
public class Circulo extends View
{    Paint brocha;
    public Circulo(Context context)
    {
        super(context);

        brocha= new Paint();
    }

    // Sobreescribimos el método para dibujarlo

    protected void onDraw(Canvas canvas)
    {
        brocha.setColor(getResources().getColor(R.color.colorPrimary));

        // Obtenemos el centro del canvas
        float cx = canvas.getWidth() / 2.0F;
        float cy = canvas.getHeight() / 2.0F;

        // Dibujamos el círculo
        canvas.drawCircle(cx, cy, 25, brocha);
    }
}
