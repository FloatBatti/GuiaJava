package Clases;

import java.util.Arrays;
import java.util.Objects;

public class Persona implements Comparable<Persona>{

    //region Attributes
    private String nombre;
    private String apellido;
    private String dni;
    private String ciudad;
    private String[] mascotas;

    public static final String PAIS = "Argentina";  // Con Final no se puede modificar, es una constante. Suele ser estática, pública y se pone en mayúscula
    //endregion

    //region Constructors
    public Persona(){}
    public Persona(String nombre, String apellido, String dni, String ciudad, int cantMascotas) {  // Al utilizar los '...' estamos pidiendo una cantidad de parámetros variable que luego se pasa como arreglo.

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.mascotas = new String[cantMascotas];
    }
    //endregion

    //region Getters and Setters
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
    //endregion

    //region Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ",\n" +
                "Apellido: " + this.ciudad + ",\n" +
                "Dni: " + this.dni + ",\n" +
                "Ciudad: " + this.ciudad + ",\n"+
                "Mascotas:" + Arrays.toString(this.mascotas);
    }

    @Override
    public int compareTo(Persona o) {

        return this.dni.compareTo(o.dni) * -1;
    }

    //endregion

    public Persona addMascota(String mascota){

        for (int i = 0; i < this.mascotas.length; i++) {

            if(this.mascotas[i] == null){

                this.mascotas[i] = mascota;
                break;
            }
        }

        return this;  // Permite concatenar el método
    }


}
