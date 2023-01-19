public class Strings {

    public static void main(String[] args) {

        // Los strings son inmutables. Todas las funciones que los modifiquen van a devolver un nuevo string modificado.

        String nombre = "Agustín";  // Manera literal
        String nombre2 = new String("Agustín"); //Forma explicita (operador new)
        String apellido = "Battisti";  // Se le asigna la dirección de memoria del objeto (String) anterior creado. Sucede cuando es implícito
        System.out.println("Chequea si es el mismo objeto " + (nombre2 == nombre));  // Compara referencias
        System.out.println("Chequea si es el mismo valor " + nombre.equals(nombre2));

        // MANERAS DE CONCATENAR

        System.out.println("Me llamo " + nombre + " " + apellido);

        //El método concat es más rápido que usar +
        System.out.println("My name is ".concat(nombre).concat(" ").concat(apellido));

        //El objeto StringBuilder es más rápido que el concat(). Se usa para unir varias cadenas de caracteres
        StringBuilder nombreCompleto = new StringBuilder(nombre);

        nombreCompleto.append(" ").append(apellido);

        System.out.println(nombreCompleto);

        // ALGUNOS OTROS MÉTODOS DE LOS STRINGS

        String name = String.valueOf(nombreCompleto);  // El StringBuilder no posee métodos del String

        System.out.println("Mi nombre en mayúscula: " + name.toUpperCase());
        System.out.println("Cantidad de caracteres: " + name.length());
        System.out.println("Comparación sin case sensitive: " + name.equalsIgnoreCase("AgUstíN BatTiSti"));
        System.out.println("Comparación alfabética: " + name.compareTo("Carlos Gomez"));  // Lo compara lexicográficamente
        System.out.println("Character del nombre en posición 0: " + nombre.charAt(0));
        System.out.println("Substrae string desde la posición 4 inclusive a la 7 sin incluirlo: " + name.substring(4,7));

        System.out.println("Reemplazo las \"t\" por un \"-\": " + name.replace('t','-'));
        System.out.println("Se busca la primer posición del character n: " + name.indexOf('n'));
        System.out.println("El nombre contiene la letra  \"h\": " + name.contains("h"));
        System.out.println("El nombre comienza con \"A\": " + name.startsWith("A"));
        System.out.println("El nombre termina con \"A\": " + name.endsWith("A"));
        System.out.println("     Voy a sacar los espacios de los extremos    ".trim());

        //Obtener la extension de un archivo

        String archivo = "foto.png";
        int pos = archivo.indexOf(".");
        System.out.println("La extension es: " + archivo.substring(pos+1));

        // MÉTODOS DE STRINGS CON ARREGLOS

        char[] arreglo = name.toCharArray();

        for (char letra: arreglo) {
            System.out.print(letra);
        }

        String[] arreglo2 = archivo.split("\\.");  // Creo un arreglo dividido por el character indicado

        System.out.println("\nLa extension del archivo es: " + arreglo2[1]);
    }
}
