
//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import java.util.*;

/* Se solicita que desarrolle un programa para llevar el contros
de las películas que tiene una empresa de alquiler de películas*/

public class Memorabilia {

    //Las variables globales que tendrá el código
    private static boolean salir;
    private static int opcion;
    private static int cantidadPelicula = 0;
    static Scanner leer = new Scanner(System.in);
    private static int[] idPelicula = new int[cantidadPelicula] ;
    private static String[] nombrePelicula = new String[cantidadPelicula];
    private static String[] categoriaPelicula = new String[cantidadPelicula];
    private static int[] año = new int[cantidadPelicula];

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

        idPelicula = new int[cantidadPelicula];
        nombrePelicula = new String[cantidadPelicula];
        año = new int[cantidadPelicula];
        categoriaPelicula = new String[cantidadPelicula];

        for (int i = 0; i < cantidadPelicula; i++) {
            System.out.println("« « « Película "+(i+1) +"» » »");
            System.out.println("Id de película: ");
            idPelicula[i] = leer.nextInt();
            leer.nextLine();
            System.out.println("Nombre de la película: ");
            nombrePelicula[i] = leer.nextLine();
            System.out.println("Año de la película: ");
            año[i] = leer.nextInt();
            leer.nextLine();
            System.out.println("Categoría, ejemplo: terror, fantasía, otros):");
            categoriaPelicula[i] = leer.nextLine();
        }

    }

    private static void mostrarPelicula() {

        for (int j = 0; j < cantidadPelicula; j++) {
            System.out.println("« « « Película "+ (j+1) +"» » »");
            System.out.println("Id de película: "+idPelicula[j]);
            System.out.println("Nombre de la película: "+nombrePelicula[j]);
            System.out.println("Año de la película: "+año[j]);
            System.out.println("Categoría: "+categoriaPelicula[j]);
        }

    }

    private static void devolucionPelicula() {
    }

    private static void prestamoPelicula() {
    }

}
