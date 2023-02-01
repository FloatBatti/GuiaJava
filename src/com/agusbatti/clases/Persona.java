package com.agusbatti.clases;

import java.util.Arrays;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

    // region Attributes
    
    protected Integer id;
    protected String nombre; // La clase hija va a poder utilizar el atributo con "this"
    protected String apellido;
    protected String dni;
    protected String ciudad;
    private String[] mascotas; // La clase hija solo va a poder acceder al atributo a travez de un getter o
                               // setter.

    public static final String PAIS = "Argentina"; // Con Final no se puede modificar, es una constante. Suele ser
                                                   // estática, pública y se pone en mayúscula
    // endregion

    // region Constructors
    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, String ciudad, int cantMascotas) { // Al utilizar los
                                                                                                  // '...' estamos
                                                                                                  // pidiendo una
                                                                                                  // cantidad de
                                                                                                  // parámetros variable
                                                                                                  // que luego se pasa
                                                                                                  // como arreglo.

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.mascotas = new String[cantMascotas];
    }
    // endregion

    // region Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    // endregion

    // region Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Persona persona))
            return false;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni); // Sirve para complementar el método equals y comparar de una forma más rápida
                                  // dos objetos en una tabla hash. Cuando Java compara dos objetos en estructuras
                                  // de tipo hash (HashMap, HashSet etc) primero invoca al método hashcode y luego
                                  // el equals. Si los métodos hashcode de cada objeto devuelven diferente hash no
                                  // seguirá comparando y considerará a los objetos distintos. En el caso en el
                                  // que ambos objetos compartan el mismo hashcode Java invocará al método
                                  // equals() y revisará a detalle si se cumple la igualdad. De esta forma las
                                  // búsquedas quedan simplificadas en estructuras hash.

    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ",\n" +
                "Apellido: " + this.apellido + ",\n" +
                "Dni: " + this.dni + ",\n" +
                "Ciudad: " + this.ciudad + ",\n" +
                "Mascotas:" + Arrays.toString(this.mascotas) + "\n";
    }

    @Override
    public int compareTo(Persona o) {

        return this.dni.compareTo(o.dni) * -1;
    }

    // endregion

    public void saludar() {
        System.out.println("Hola soy una persona");
    }

    public final Persona addMascota(String mascota) { // Al poner final indico que no puede sobreescribirse en las
                                                      // clases hijas

        for (int i = 0; i < this.mascotas.length; i++) {

            if (this.mascotas[i] == null) {

                this.mascotas[i] = mascota;
                break;
            }
        }

        return this; // Permite concatenar el método
    }

}
