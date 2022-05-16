package com.example.ejercicio1001.capa_dibujo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 *
 */
public class Imagen extends View
{
    Bitmap imagen;
    Paint brocha;
    public Imagen(Context context)
    {
        super(context);
        brocha = new Paint();
    }



    // Añadimos un método para asignarle un bitmap. Recibe la id del recurso
    public void setImageBitmap(int resID)
    {
        imagen = BitmapFactory.decodeResource(getResources(), resID);
    }

    // Sobreescribimos el método para dibujarlo
    protected void onDraw(Canvas canvas)
    {
        // Calculamos el centro de la imagen
        float x = canvas.getWidth() / 2F;
        x -= imagen.getWidth() / 2F;
        float y = canvas.getHeight() / 2F;
        y -= imagen.getHeight() / 2F;

        // Si hay alguna imagen
        if (imagen != null)
        {
            canvas.drawBitmap(imagen, x, y,brocha);
        }
    }
}
