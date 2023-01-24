package com.agusbatti.otro;

public class OtraPersona {  // Si lo dejo en default no va a poder ser imporada en otras clases que no esten en el mismo paquete
    
    public String dinero;
    public String empleo;

    public OtraPersona(){}

    public static void saludar(){System.out.println("Hola");}
}
