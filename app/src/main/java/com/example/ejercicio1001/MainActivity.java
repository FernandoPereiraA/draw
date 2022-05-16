package com.example.ejercicio1001;

import android.content.Intent;
import android.os.Bundle;

import com.example.ejercicio1001.capa_dibujo.Circulo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

      //  Imagen img = new Imagen(getApplicationContext());
      //  img.setImageBitmap(R.drawable.imagen1);
        // Añadimos el círculo a nuesto layout.
        ConstraintLayout mainLayout = (ConstraintLayout)findViewById(R.id.miLayout);
        Circulo circulo = new Circulo(this);
        mainLayout.addView(circulo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (id) {
            case R.id.imagen:
                Intent salto_imagen =new Intent(MainActivity.this, ActBitmap.class);
                startActivity(salto_imagen);
                break;
            case R.id.libreta:
                Intent salto_libreta =new Intent(MainActivity.this, ActLibreta.class);
                startActivity(salto_libreta);
                break;
            case R.id.texto:
                Intent salto_texto =new Intent(MainActivity.this, ActTexto.class);
                startActivity(salto_texto);
                break;
            case R.id.ActPath1:
                Intent salto_path1 =new Intent(MainActivity.this, ActPath1.class);
                startActivity(salto_path1);
                break;
            case R.id.ActPath2:
                Intent salto_path2 =new Intent(MainActivity.this, ActPath2.class);
                startActivity(salto_path2);
                break;
            case R.id.ActBola:
                Intent salto_bola =new Intent(MainActivity.this, ActBola.class);
                startActivity(salto_bola);
                break;

            case R.id.action_settings:
                finish();
                break;
        }

       return super.onOptionsItemSelected(item);
    }
}