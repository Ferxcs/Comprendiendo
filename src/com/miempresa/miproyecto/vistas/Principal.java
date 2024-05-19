package com.miempresa.miproyecto.vistas;

import com.miempresa.miproyecto.Persona;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona persona1 = new Persona();

        persona1.nombre = "Jose Fernando";
        persona1.edad = 21;

        persona1.presentarse();
    }
}
