package com.example.ejercicio1001.capa_dibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.example.ejercicio1001.R;

/**
 *
 * View personalizado que simula el rebote de una pelota en las paredes de la pantalla.
 */
public class Bola_Rebotante extends View
{
    Paint brocha;              // Brocha para dibujar la bola
    private float radio = 80F; // Variable para dibujar una bola de un tamaño determinado.
    private float cX;          // Variables para la posición actual de la bola
    private float cY;
    private float minX;        // Límites de la pantalla
    private float maxX;
    private float minY;
    private float maxY;

    private boolean primeraVez; // Variable que indica si es la primera vez que se ejecuta

    private float velocidadX;  // Velocidad de movimiento
    private float velocidadY;  // Velocidad de movimiento

    public Bola_Rebotante(Context context)
    {
        super(context);

        primeraVez = true;



        // Le asignamos el evento onClick para que empiece a moverse
        //this.setOnClickListener(this);
    }

    // Método para dibujar en pantalla
    public void setRadio(float rad)
    {
        radio = rad;
    }


    //public void onClick(View v) {
        // Esperamos 0,1 segundos para cambiar las coordenadas x e y, y volver a llamar
        // al onDraw.

    //}

    // Método para dibujar en pantalla
    @Override
    protected void onDraw(Canvas canvas)
    {
        try
        {
            if (primeraVez == true)
            {
                // Dibujamos en el canvas, con una brocha verde
                brocha = new Paint();

                brocha.setColor(getResources().getColor(R.color.colorPrimaryDark));

                // Inicializamos las variables
                minX = 0F;
                maxX = this.getWidth();
                minY = 0F;
                maxY = this.getHeight();
                cX = maxX / 2F;
                cY = maxY / 2F;

                velocidadX = 5;
                velocidadY = 3;

                primeraVez = false;
            }

            // Añadimos la bola en el medio de la pantalla
            canvas.drawCircle(cX, cY, radio, brocha);

            this.update();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // Método que actualiza la posición de la pelota.
    public void update()
    {
        // Si ha llegado al borde o se ha pasado, cambiamos la velocidad
        if (((cX + radio) >= maxX) || ((cX - radio) <= minX))
        {
            velocidadX = -velocidadX;
        }
        if (((cY + radio) >= maxY) || ((cY - radio) <= minY))
        {
            velocidadY = -velocidadY;
        }

        // Aumentamos las coordenadas x, y según su velocidad
        cX += velocidadX;
        cY += velocidadY;

        // Repintamos
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.invalidate();
    }
}
