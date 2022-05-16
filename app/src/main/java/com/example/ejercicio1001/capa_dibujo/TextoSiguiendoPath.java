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
public class TextoSiguiendoPath extends View
{
    private String texto = null;
    private float textSize = 20; // 20 por defecto

    public TextoSiguiendoPath(Context context)
    {
        super(context);
    }

    // Método que recibe el texto a mostrar
    public void setText(String text)
    {
        texto = text;
    }

    // Método que cambia el tamaño del texto
    public void setTextSize(float size)
    {
        textSize = size;
    }

    // Método para dibujarlo
    protected void onDraw(Canvas canvas)
    {
        // Si hay algún texto
        if (texto != null)
        {
            float x = 5F;
            float y = canvas.getHeight() / 2F;

            // Creamos un path, que seguirá el texto
            Path path = new Path();
            path.moveTo(x, y); // Primer punto

            // Bucle para añadir todos los puntos
            for (int i = 0; i < 10; i++)
            {
                // aumentamos la x en 40 y la y decrementa en (30-i*3)
                x += 40;
                y -= 30 - (i*3);

                path.lineTo(x, y);
            }

            // Brocha para el texto
            Paint brocha = new Paint();

            brocha.setTextSize(textSize);
            brocha.setColor(getResources().getColor(R.color.primary_text));

            // Añadimos el texto, junto con el path
            canvas.drawTextOnPath(texto, path, 5, 0, brocha);
        }
    }
}
