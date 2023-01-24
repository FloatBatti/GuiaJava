import java.util.Arrays;

import com.agusbatti.prueba.*;
import static com.agusbatti.otro.OtraPersona.saludar; // Importo un método estático y lo puedo usar como si fuera de la clase

public class PruebaPersona {

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

        saludar();

        System.out.println("----------------------------");

        Persona[] personaArray = { persona1, persona2 };

        Arrays.sort(personaArray);

        System.out.print(Arrays.toString(personaArray));

        System.out.println("----------------------------");

        Empleado empleado = new Empleado("Jose", "Gómez", "40884962", Enumerador.MARCHI.getCiudad(), 2, 83000,
                "Vendedor", "00003044548454");

        empleado.saludar();

        System.out.println(empleado);

    

    }
}
