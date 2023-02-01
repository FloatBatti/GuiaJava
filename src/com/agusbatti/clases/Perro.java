package com.agusbatti.clases;

public class Perro extends Mascota{

    public Perro(String nombre, String especie, String raza, String tamaño) {
        super(nombre, especie, raza, tamaño);
    }

    public Perro(){}
    
    @Override
    public void hacerRuido() {
        System.out.println("El perro está ladrando");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está duermiendo");
        
    }
    
}
