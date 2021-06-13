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

            //Dependiendo la opción que se elija se hará algo
            switch (opcion) {
                case 1:
                    System.out.println("--- Opción 1 ---");
                    prestamoPelicula();
                    break;
                case 2:
                    System.out.println("--- Opción 2 ---");
                    devolucionPelicula();
                    break;
                case 3:
                    System.out.println("--- Opción 3 ---");
                    mostrarPelicula();
                    break;
                case 4:
                    System.out.println("--- Opción 4 ---");
                    ingresoPelicula();
                    break;
                case 5:
                    System.out.println("--- Opción 5 ---");
                    Peliculas();
                    break;
                case 6:
                    System.out.println("--- Opción 6 ---");
                    ingresoClienteNuevo();
                    break;
                case 7:
                    System.out.println("--- Opción 7 ---");
                    mostrarCliente();
                    break;
                case 8:
                    System.out.println("--- Opción 8 ---");
                    Reporte();
                    break;
                case 9:
                    salir = false;
                    System.out.println("---Gracias---");
                    break;    
            
                default:
                   // break;
                    System.out.println("Opción no encontrada");
            }
        }
    }

    private static void Reporte() {
    }

    private static void mostrarCliente() {
    }

    private static void ingresoClienteNuevo() {
    }

    private static void Peliculas() {
    }

    private static void ingresoPelicula() {
    }

    private static void mostrarPelicula() {
    }

    private static void devolucionPelicula() {
    }

    private static void prestamoPelicula() {
    }
}
