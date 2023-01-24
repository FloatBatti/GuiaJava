package com.agusbatti.prueba;

public class Perro extends Mascota{

    public Perro(String nombre, String especie, String raza, String tamaño) {
        super(nombre, especie, raza, tamaño);
    }


    @Override
    public void hacerRuido() {
        System.out.println("El perro está ladrando");
    }
    
}
