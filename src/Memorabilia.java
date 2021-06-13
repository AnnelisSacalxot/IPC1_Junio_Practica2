
//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import java.util.*;

/* Se solicita que desarrolle un programa para llevar el contros
de las películas que tiene una empresa de alquiler de películas*/

public class Memorabilia {

            //Las variables globales que tendrá el código
            static Scanner leer = new Scanner(System.in);
            static boolean salir = false;
            static int opcion=0;
    
    
    
        //Vamos a declarar las variables globales y dentro de los métodos las
        //variables locales
       // String nombre[] = new String(1);
        //int idCliente[] = new int(1);
        //int telefono[] = new int();
        boolean tienePeliculaPrestado = false;
        int idPelicula[] = new int[cantidadPelicula];
        String nombrePelicula[] = new String[cantidadPelicula];
        int año[] = new int[cantidadPelicula];
        String categoriaPelicula[] = new String[cantidadPelicula];
        boolean disponible = false;
        //int diasPrestamo[] = new int();
        static int cantidadPelicula = leer.nextInt();
    public static void main(String[] args) {
        

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

        System.out.println("Ingrese la cantidad de películas para añadir");
        cantidadPelicula = leer.nextInt();
        leer.nextLine();

        //Crearemos un ciclo para que dependiendo las peliculas que se desean
        //añadir se solicite los datos correspondientes 

        for (int i = 0; i < cantidadPelicula; i++) {
            System.out.println("« « « Película"+(i+1) +"» » »");
            System.out.println("Id de película: ");
            idPelicula[i] = leer.nextInt();
            System.out.println("Nombre de la película: ");
            nombrePelicula[i] = leer.nextLine();
            System.out.println("Año de publicación: ");
            año[i] = leer.nextInt();
            System.out.println("Categoría, ejemplo: terror, fantasía, otros):");
            categoriaPelicula[i] = leer.nextLine();
        }

    }

    private static void mostrarPelicula() {
    }

    private static void devolucionPelicula() {
    }

    private static void prestamoPelicula() {
    }
}
