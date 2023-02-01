package com.agusbatti.clases;

import java.util.Arrays;

public abstract class Mascota { // Siempre es una clase padre, representa un concepto y no se puede instanciar.
                                // Dede tener como minimo un método abstracto (sin implementación).
                                // Cada clase hija se ve obligada va a sobreescribir sus métodos abstractos para
                                // implementarlos de formas distintas. Puede tener métodos con cuerpo (no abstractos).
                                // Sirve como protocolo de diseño.

    protected String nombre;
    protected String especie;
    protected String raza;
    protected String tamaño;
    protected String[] comidaFavorita;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, String raza, String tamaño) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.tamaño = tamaño;
        this.comidaFavorita = new String[5];
    }

    // region Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String[] getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String[] comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    // endregion

    
    public void agregarComida(String comida) { // Puede haber métodos no abstractos. A veces todas las clases hijas
                                               // implementan los mismo

        for (int i = 0; i < this.comidaFavorita.length; i++) {

            if (this.comidaFavorita[i] == null) {

                this.comidaFavorita[i] = comida;
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", tamaño=" + tamaño
                + ", comidaFavorita=" + Arrays.toString(comidaFavorita) + "]";
    }

    abstract public void hacerRuido(); // Sea la clase hija que sea (perro, gato, caballo, ect) va a poder hacer ruido

    abstract public void dormir();

}
