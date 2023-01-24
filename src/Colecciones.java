import java.util.*;
import java.util.Map.Entry;

import com.agusbatti.prueba.Empleado;
import com.agusbatti.prueba.Persona;

public class Colecciones {

    public static void main(String[] args) {

        // INTERFAZ LIST

        ArrayList<String> nombres = new ArrayList<String>(); // Es un arreglo dinámico (puedo cambiar su tamaño en
                                                             // tiempo de ejecución) o lista simplemente enlazada.
                                                             // Permite elementos duplicados. Mantiene el orden de
                                                             // inserción.

        LinkedList<String> animales = new LinkedList<String>(); // Es una lista doblemente enlazada. Permite elementos
                                                                // repetidos. Mantiene el orden de inserción. Su
                                                                // manipulacion es más rapida.

        Vector<Persona> personas = new Vector<Persona>(); // Es parecido a una lista pero esta si es está sincornizada
                                                          // (se puede compartir una misma instancia entre varios
                                                          // hilos). Contiene mas métodos fuera del marco de las
                                                          // colecciones.

        Stack<Integer> numeros = new Stack<Integer>(); // Es una estructura de tipo LIFO (last in - first out), es
                                                       // decir, una pila, donde el último que ingresa es el primero que
                                                       // sale.

        List<Float> numerosFloat = new ArrayList<Float>(); // Se puedo usar List de manera general y luego especificar
                                                           // en la instanciación

        // INTERFAZ QUEUE

        PriorityQueue<Empleado> empleadosPriority = new PriorityQueue<>(); // Es una estructura de tipo FIFO (first in -
                                                                           // first out), es decir, una cola, donde el
                                                                           // primero que entra es el primero que sale.
                                                                           // Los elementos que contiene van a ser
                                                                           // procesados por prioridad y no permire
                                                                           // nulos.

        Queue<Empleado> empleadosDeque = new ArrayDeque<Empleado>(); // A diferencia de la cola podemos eliminar
                                                                     // elementos de ambos extremos. Es mas rápido que
                                                                     // ArrayList y Stack.

        // INTERFAZ SET

        HashSet<String> hashSets = new HashSet<String>(); // Utiliza la tabla hash para el almacenamiento a travéz del
                                                          // hashing. Los elementos deben ser únicos. No guardan con un
                                                          // orden especofico.

        LinkedHashSet<String> linkedSet = new LinkedHashSet<String>(); // Extiendo de la clase HashSet y tambien
                                                                       // contiene elementos únicos. Mantiene el orden
                                                                       // de inserción y permite elementos nulos.

        TreeSet<Persona> arbolPersonas = new TreeSet<Persona>(); // Utiliza un árbol para el almacenamiento. Contiene
                                                                 // elementos únicos. Tiene el timpo de recuperación más
                                                                 // rápido de los Sets. Los elementos estan ordenados de
                                                                 // manera ascendente.

        // INTERFAZ MAP

        // Esta interfaz permite almacenar datos de manera clave-valor (<c , v>) de
        // manera que para una clave solo se tiene un valor. Se conoce como diccionario

        HashMap<Integer, String> map = new HashMap<Integer, String>(); // No hay un orden especifico. No se aceptan
                                                                       // valores nulos.

        map.put(1, "Agustín");
        map.put(15, "Juan");
        map.put(3, "Pedro");
        map.put(27, "Lucas");

        // Se imprime el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); // Se ordenan los objetos por clave en un
                                                                           // "orden natural".

        treeMap.put(2, "Mar del Plata");
        treeMap.put(37, "Pinamar");
        treeMap.put(11, "Necochea");
        treeMap.put(1, "Tandil");

        // Se imprime el Map con un Iterador que ya hemos instanciado anteriormente
        it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
        }

        LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();  // Se ordena en función de como se van introduciendo los elementos

        linkedHashMap.put(2, "Jose");
        linkedHashMap.put(37, "Camila");
        linkedHashMap.put(11, "Nicolas");
        linkedHashMap.put(1, "Maria");

        // Una forma alternativa de como iterar Maps
        for (Entry<Integer, String> alumno : linkedHashMap.entrySet()){
            Integer clave = alumno.getKey();
            String valor = alumno.getValue();
            System.out.println(clave+"  ->  "+valor);
        }

        // Métodos del Map

        System.out.println("********* Métodos de Map *********");
        System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = " + treeMap.size());
        System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = " + treeMap.isEmpty());
        System.out.println("Obtenemos un elemento del Map pasandole la clave 11: treeMap.get(11) = " + treeMap.get(11));
        System.out.println("Borramos un elemento del Map el 1: treeMap.remove(1) " + treeMap.remove(1));
        System.out.println("Vemos que pasa si queremos obtener la clave 1 que ya no existe: treeMap.get(1) = " + treeMap.get(1));
        System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(18) = " + treeMap.containsKey(1));
        System.out.println("Vemos si existe un elemento con la clave 11: treeMap.containsKey(11) = " + treeMap.containsKey(11));
        System.out.println("Vemos si existe el valor 'Mar del Plata' en el Map: treeMap.containsValue('Mar del Plata') = " + treeMap.containsValue("Mar del Plata"));
        System.out.println("Vemos si existe el valor 'Villa Gesell' en el Map: treeMap.containsValue('Villa Gesell') = " + treeMap.containsValue("Villa Gesell"));
        System.out.println("Borramos todos los elementos del Map: treeMap.clear()");
        treeMap.clear();
        System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = " + treeMap.size());
        System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = " + treeMap.isEmpty());
    }
}
