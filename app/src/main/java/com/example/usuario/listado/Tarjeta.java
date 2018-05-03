package com.example.usuario.listado;

/**
 * Created by Usuario on 24/04/2018.
 */

public class Tarjeta {
    private int edad;
    private String nombre;
    private String descripcion;
    private int img;

    public void setNombre (String n)
    {
        nombre=n;
    }
    public String getNombre ()
    {
        return nombre;
    }

    public void setEdad (int n)
    {
        edad=n;
    }
    public int getEdad ()
    {
        return edad;
    }

    public void setDescripcion (String n)
    {
        descripcion=n;
    }
    public String getDescripcion ()
    {
        return descripcion;
    }

    public void setImg (int n)
    {
        img=n;
    }
    public int getImg ()
    {
        return img;
    }

    Tarjeta()
    {

    }

    Tarjeta(int x)
    {

    }



}

