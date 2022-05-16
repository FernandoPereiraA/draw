package com.example.ejercicio1001.capa_dibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import com.example.ejercicio1001.R;

/**
 *
 */
public class TextoCircular extends View
{
    private String texto = null;

    public TextoCircular(Context context)
    {
        super(context);
    }

    // Método para pedir un texto
    public void setText(String text)
    {
        texto = text;
    }

    // Método para dibujar en pantalla
    protected void onDraw(Canvas canvas)
    {
        // Comprobamos que haya texto
        if (texto != null)
        {
            float x = canvas.getWidth() / 2F;
            float y = canvas.getHeight() / 2F;

            // Definimos el path circular, según el tamaño de la pantalla
            Path path = new Path();

            path.addCircle(x, y, 130, Path.Direction.CW); // Sentido de las agujas del reloj

            // Brocha para el texto
            Paint brocha = new Paint();

            brocha.setTextSize(20);
            brocha.setColor(getResources().getColor(R.color.primary_text));

            // Añadimos el texto, junto con el path
            canvas.drawTextOnPath(texto, path, 0, 0, brocha);
        }
    }
}
