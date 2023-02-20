import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.agusbatti.clases.Perro;

public class APIStream {

    public static void main(String[] args) {

        //region STREAM

        // Combina las mejores ideas del Iterator y la programación funcional.
        // No sirven para almacenar datos, solo para procesarlos.
        // Se pueden crear streams a partir de colecciones, arrays o métodos.
        // Para procesar los datos de un stream se utilizan operadores. Estos operadores se pueden encadenar.
        // Los operadores se dividen en intermedios y terminales.
        // Los métodos intermedios devuelven un nuevo stream.
        // Los métodos terminales devuelven un valor o void.
        // Los métodos intermedios no se ejecutan hasta que no se invoca un método terminal.
        // Los métodos terminales cierran el stream.
        // Los métodos terminales no se pueden encadenar con otros métodos.
        // Los métodos terminales no se pueden invocar más de una vez.
        // Los métodos terminales no se pueden invocar sobre un stream que ya fue cerrado.
        // Un método terminal es por ejemplo forEach(), collect(), count(), min(), max(), etc.
        // Un método intermedio es por ejemplo map(), filter(), peek(), etc.
        // Los métodos terminales son obligatorios para procesar los datos de un stream.
        // No se puede reutilizar un stream una vez que se invoca un método terminal.
        // Los streams son inmutables, no se pueden modificar.
        
        // Stream.of() crea un stream a partir de una colección de elementos.
        Stream<String> stream = Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

        stream.forEach(System.out::println);

        System.out.println("------------------------");

        String [] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        // Arrays.stream() crea un stream a partir de un array.
        stream = Arrays.stream(array);

        // Builder es una clase interna de Stream que permite crear un stream a partir de un método.
        // Se utiliza para crear streams de forma dinámica.
        // Se utiliza el método add() para agregar elementos al stream.
        // Se utiliza el método build() para crear el stream.
        Stream<String> nombres = Stream.<String>builder()
                                                            .add("Agustin")
                                                            .add("Daniel")
                                                            .add("Gonzalo")
                                                            .add("Marcelo").build();

        nombres.forEach(System.out::println);

        System.out.println("------------------------");

        List<String> perros = new ArrayList<>();

        perros.add("Scooby");
        perros.add("Pluto");
        perros.add("Firulais");
        perros.add("Snoopy");
        
        // List.stream() crea un stream a partir de una lista.
        Stream<String> perrosStream = perros.stream();

        perrosStream.forEach(System.out::println);

        perros.stream().forEach(System.out::println);

        System.out.println("------------------------");

        //endregion

        //region OPERADOR MAP

        // El operador map() permite transformar cada elemento del stream, utiliza la interface Function.
        // Se utiliza para aplicar una función a cada elemento del stream.
        // Retorna un nuevo stream con los elementos transformados.
        
        // El operador peek() permite inspeccionar los elementos de un stream, utiliza la interface Consumer.
        Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")

                .peek(System.out::println)  // Inspecciona el elemento. Devuelve el elmento original.
                .map(String::toLowerCase)   // Transforma el elemento. Devuelve el elemento transformado.
                .forEach(System.out::println);  // Recorre el stream.
        
        System.out.println("------------------------");

        
        Stream<String> letras = Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
                .map(String::toLowerCase);  

        // El método collect() permite convertir un stream en una colección.
        
        List<String> letrasList = letras.collect(Collectors.toList());

        letrasList.forEach(System.out::println);

        System.out.println("------------------------");

        perrosStream = perros.stream();

        List<Perro> perrosList = perrosStream.map(nombre -> new Perro(nombre)).collect(Collectors.toList());

        perrosList.forEach(System.out::println);
                  
        //endregion

        //region OPERADOR FILTER

        // El operador filter() permite filtrar los elementos de un stream, utiliza la interface Predicate.
        // Retorna un nuevo stream con los elementos filtrados.
        // Si el predicado retorna true, el elemento es agregado al nuevo stream.
        // Si el predicado retorna false, el elemento no es agregado al nuevo stream.

        Stream<String> letrasFiltradas = Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
                .filter(letra -> letra.compareTo("E") > 0);

        letrasFiltradas.forEach(System.out::println);

        System.out.println("------------------------");

        // El operador distinct() permite eliminar los elementos duplicados de un stream.

        Stream<String> palabrasSinDuplicados = Stream.of("Casa", "Auto", "Moto", "Casa", "Moto", "Avion", "Casa", "Moto", "Avion")
                .distinct();

        // Puedo utilizar el método collect() porque el stream todavía no fue cerrado.
        // Si el stream ya fue cerrado (por ejemplo, con un .forEach) no puedo utilizar el método collect().
        List<String> palabras = palabrasSinDuplicados.collect(Collectors.toList());

        palabras.forEach(System.out::println);

        System.out.println("------------------------");



        //endregion
    }
}
