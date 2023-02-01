import java.util.Arrays;

import com.agusbatti.clases.*;
import com.agusbatti.repoGenerico.Cuidador;

import static com.agusbatti.otro.OtraPersona.saludar; // Importo un método estático y lo puedo usar como si fuera 
                                                      // de la clase.

public class PruebaClases {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setDni("12345678");
        persona1.setCiudad(Enumerador.BSAS.getCiudad());

        System.out.println("persona1 = " + persona1);

        Persona persona2 = new Persona("Agustin", "Battisti", "40884962", Enumerador.MDP.getCiudad(), 4);

        Enumerador[] ciudades = Enumerador.values();

        for (Enumerador ciudad : ciudades) {
            System.out.println(ciudad);
        }

        persona2.addMascota("Iki").addMascota("Richard");

        System.out.println(persona2);

        saludar();  // Método importado de manera estática

        System.out.println("----------------------------");

        Persona[] personaArray = { persona1, persona2 };

        Arrays.sort(personaArray);

        System.out.print(Arrays.toString(personaArray));

        System.out.println("----------------------------");

        Empleado empleado = new Empleado("Jose", "Gómez", "40884962", Enumerador.MARCHI.getCiudad(), 2, 83000,
                "Vendedor", "00003044548454");

        empleado.saludar();

        System.out.println(empleado);

        empleado.entrada();

        empleado.tomarBreak();

        empleado.salida();

        empleado.deafult();

        System.out.println("----------------------------");

        Mascota mascota1 = new Mascota() { // Clase anónima. Nos permite instanciar a la clase abstracta
                                           // sobreescribiendo sus métodos abstractos.

            @Override
            public void hacerRuido() {

                System.out.println("Soy una clase anónima");

            }

            @Override
            public void dormir() {

                System.out.println("El animal está durmiendo");

            }

        };

        mascota1.hacerRuido();
        mascota1.dormir();
        mascota1.setNombre("Pelusa");

        System.out.println("mascota1: " + mascota1);

        System.out.println("----------------------------");

        Cuidador<Gato> cuidador = new Cuidador<>();

        Gato gato = new Gato();

        gato.setNombre("Germán");
        
        cuidador.cuidar(gato);
    }
}
