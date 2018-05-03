package com.example.usuario.listado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    class Tarjeta
    {
        public int edad;
        public String nombre;
        public String descripcion;
        public int img;
    }

}
