public class ControlStructs {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("i = " + i);
        }

        System.out.println("-----------------------------------------");

        bucle2:  // Sirve para indicar en que estructura de control se aplica un break o un continue
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 2; j++) {

                if (i % 2 == 0)
                    continue bucle2;  // Saltea el bloque de ejecución que le sigue y pasa a la siguiente iteración

                System.out.println("Estoy en el Bucle1");
            }

            System.out.println("i = " + i);
        }
    }
}
