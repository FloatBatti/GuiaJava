package com.agusbatti.otro;

public class OtraPersona { // Si lo dejo en default (sin public) no va a poder ser importada en otras clases que no
                           // esten en el mismo paquete

    public String sueldo;

    public OtraPersona() {
    }

    public static void saludar() {
        System.out.println("Hola");
    }
}
