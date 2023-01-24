package com.agusbatti.prueba;

public class Gato extends Mascota {

    public Gato(String nombre, String especie, String raza, String tamaño) {
        super(nombre, especie, raza, tamaño);
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato está maullando");  
    }
    
}
