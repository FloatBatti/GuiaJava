package com.agusbatti.clases;

public enum Enumerador {

    MDP("Mar del Plata", "593.337"),
    BSAS("Buenos Aires", "3.075.646"),
    PIN("Pinamar", "25.397"),
    NEC("Necochea", "92.933"),
    MARCHI("Mar Chiquita", "487"),
    MIR("Miramar", "29.433 ");

    private final String ciudad;  // Acá se guarda el atributo de cada constante
    private final String habitantes;

    Enumerador(String ciudad, String habitantes) {

        this.ciudad = ciudad;
        this.habitantes = habitantes;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return ciudad + ", habitantes: " + habitantes;
    }

    public String getHabitantes() {
        return habitantes;
    }
}
