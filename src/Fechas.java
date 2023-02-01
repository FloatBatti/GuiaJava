import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas {

    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("La fecha de hoy es: " + fecha);  // Muestra los datos actuales por defecto

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM,yyy");
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyy");
        SimpleDateFormat df3 = new SimpleDateFormat("yyy-MM-dd");

        System.out.println("La fecha formateada: " + df.format(fecha));  // Format es un método de la clase SimpleDateFormat

        System.out.println("La fecha formateada con barras: " + df2.format(fecha));

        System.out.println("La fecha formateada con guiones:= " + df3.format(fecha));

        Calendar calendario = Calendar.getInstance();

        fecha = calendario.getTime();

        System.out.println("Otra manera de obtener fecha actual: " + fecha);

        calendario.set(1997, Calendar.DECEMBER,18,20,0,0);  // El mes se indica como la posición en un arreglo donde enero es 0.

        fecha = calendario.getTime();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);


        System.out.println("La fecha seteada en el calendario: " + fecha);
        System.out.println("La hora seteada es: " + hora);

        String fechaString = "2022-12-24";

        SimpleDateFormat formatFecha = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fechaParse = formatFecha.parse(fechaString);  // Parse es un método de la clase SimpleDateFormat
            System.out.println("fechaParse sin format= " + fechaParse);
            System.out.println("fechaParse con format= " + formatFecha.format(fechaParse));

            Date fecha2 = new Date();

            if(fechaParse.before(fecha2)){
                System.out.println("fechaParse es anterior a fecha2 (fecha actual)");
            }else if (fechaParse.after(fecha2)) {
                System.out.println("fechaParse posterior a fecha2 (fecha actual)");
            } else if (fechaParse.equals(fecha2)) {
                System.out.println("fechaParse y fecha son iguales");
            }

        } catch (ParseException e) {
            System.out.println("error = " + e);
        }

        String fechaNacimiento = "1997-12-18";

        try {
            Date fechaNac = formatFecha.parse(fechaNacimiento);
            String date = formatFecha.format(fechaNac);
            System.out.println(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
