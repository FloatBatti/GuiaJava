package com.agusbatti.prueba;

public final class Empleado extends Persona { // Hereda de Persona. Al poner final estoy indicando que no puede ser
                                              // heredada

    private float sueldo;
    private String puesto;
    private String cbu;

    public Empleado(
            String nombre,
            String apellido,
            String dni,
            String ciudad,
            int cantMascotas,
            float sueldo,
            String puesto,
            String cbu) {

        super(nombre, apellido, dni, ciudad, cantMascotas); // Con super accedo a los métodos del padre, en este caso
                                                            // estoy llamando al método constructor porque no estoy
                                                            // poniendo ningun metodo
        this.sueldo = sueldo;
        this.puesto = puesto;
        this.cbu = cbu;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Sueldo: " + sueldo + ",\n" +
                "Puesto: " + puesto + ",\n" +
                "CBU: " + cbu + "\n";
    }

    @Override // Utilizo esta etiqueta para indicar que estoy sobreescrimiendo el método del
              // padre. Si o si tiene que implementar el metodo con super
    public void saludar() {
        super.saludar();
        System.out.println("Me llamo" + this.nombre + "y tambien soy un empleado"); // Puedo acceder al directamente al
                                                                                    // atributo nombre porque el dato
                                                                                    // esta con el modificador
                                                                                    // "protected", de lo contrario
                                                                                    // necesitaria un getter
    }
}
