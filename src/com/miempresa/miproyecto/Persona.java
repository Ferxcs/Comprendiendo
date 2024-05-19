package com.miempresa.miproyecto;

public class Persona {
    //Aqui pondremos los atributos y métodos, teniendo en cuenta que ambos archivos están en la misma carpeta

    //Atributos de una Persona
    public String nombre;
    public int edad;
    
    
    public void presentarse (){
        System.out.printf("¡Hola!, Soy %s y tengo %d años encantado de conocerte.", nombre, edad);
    }
}
