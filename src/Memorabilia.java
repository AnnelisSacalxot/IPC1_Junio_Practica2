//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import java.util.*;

/* Se solicita que desarrolle un programa para llevar el contros
de las películas que tiene una empresa de alquiler de películas*/


public class Memorabilia {
    public static void main(String[] args) {
     
        //Las variables globales que tendrá el código
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int opcion=0;

         //Se realizará el menú con las opciones correspondites
        while (!salir) {

            System.out.println("°|°|°|°|°|° Menú °|°|°|°|°|°");
            System.out.println("1. Prestamos de películas");
            System.out.println("2. Devolución de películas");
            System.out.println("3. Mostrar películas");
            System.out.println("4. Ingreso de películas");
            System.out.println("5. Todas las películas");
            System.out.println("6. Ingreso de cliente nuevo");
            System.out.println("7. Mostrar clientes");
            System.out.println("8. Reportes");
            System.out.println("9. Salir");
            System.out.println("\n Escriba la opción a elegir: ");

            opcion = leer.nextInt();
        }
    }
}
