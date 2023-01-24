package com.agusbatti.prueba;

public abstract class Mascota { // Siempre es una clase padre, representa un concepto y no se puede instanciar.
                                // Dede tener como minimo un método abstracto (sin implementación).
                                // Cada clase hija va a sobreescribir sus métodos para implementarlo de formas
                                // distintas. Sirve como protocolo de diseño

    protected String nombre;
    protected String especie;
    protected String raza;
    protected String tamaño;
    protected String[] comidaFavorita;

    public Mascota(String nombre, String especie, String raza, String tamaño) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.tamaño = tamaño;
        this.comidaFavorita = new String[5];
    }

    public void agregarComida(String comida) { // Puede haber métodos no abstractos. A veces todas las clases hijas
                                               // implementan los mismo

        for (int i = 0; i < this.comidaFavorita.length; i++) {

            if (this.comidaFavorita[i] == null) {

                this.comidaFavorita[i] = comida;
                break;
            }
        }

    }

    abstract public void hacerRuido(); // Sea la clase hija que sea (perro, gato, caballo, ect) va a poder hacer ruido

}
