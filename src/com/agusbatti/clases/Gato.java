package com.agusbatti.clases;

public class Gato extends Mascota {

    public Gato(String nombre, String especie, String raza, String tamaño) {
        super(nombre, especie, raza, tamaño);
    }

    public Gato(){}

    @Override
    public void hacerRuido() {
        System.out.println("El gato está maullando");  
    }

    @Override
    public void dormir() {
        System.out.println("El gato está duermiendo");
        
    }
    
}
