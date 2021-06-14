
//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import java.util.*;

/* Se solicita que desarrolle un programa para llevar el control
de las películas que tiene una empresa de alquiler de películas*/

public class Memorabilia {

  //Las variables globales que tendrá el código
    //Para peliculas
    private static boolean salir = false;
    private static int opcion;
    private static int contadorGeneral = 0; // Sólo se puede tener un contador en general, tomar eso en cuenta
    static Scanner leer = new Scanner(System.in);
    private static int[] idPelicula = new int[contadorGeneral] ;
    private static String[] nombrePelicula = new String[contadorGeneral];
    private static String[] categoriaPelicula = new String[contadorGeneral];
    private static int[] año = new int[contadorGeneral];

    //Para clientes
    private static String[] nombreCliente = new String[contadorGeneral];
    private static int[] idCliente = new int[contadorGeneral];
    private static int[] telefono = new int[contadorGeneral];
    private static boolean tienePeliculaPrestado = false;

    

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

        for (int l = 0; l < contadorGeneral; l++) {
            System.out.println("« « « Cliente "+ (l+1) +"» » »");
            System.out.println("Nombre: "+nombreCliente[l]);
            System.out.println("ID cliente: "+idCliente[l]);
            System.out.println("Teléfono: "+año[l]);
            System.out.println("Tiene alguna película prestada: "+tienePeliculaPrestado);
        }

    }

    private static void ingresoClienteNuevo() {

        System.out.println("Ingrese la cantidad de clientes nuevos que desee añadir");
        contadorGeneral = leer.nextInt();
        leer.nextLine();

        //Crearemos un ciclo para que dependiendo los clientes que desean agregarse
        //añadir se solicite los datos correspondientes

        nombreCliente = new String[contadorGeneral];
        idCliente = new int[contadorGeneral];
        telefono = new int[contadorGeneral];
        tienePeliculaPrestado = false;

        for (int k = 0; k < contadorGeneral; k++) {
            System.out.println("« « « Cliente "+(k+1) +"» » »");
            System.out.println("Nombre: ");
            nombreCliente[k] = leer.nextLine();
            System.out.println("ID cliente: ");
            idCliente[k] = leer.nextInt();
            leer.nextLine();
            System.out.println("Teléfono: ");
            telefono[k] = leer.nextInt();
            leer.nextLine();
            System.out.println("Tiene alguna película prestada : ");
            //tienePeliculaPrestado = leer.next();
            leer.nextLine();
        }
    }

    private static void Peliculas() {
    }

    private static void ingresoPelicula() {

        System.out.println("Ingrese la cantidad de películas para añadir");
        contadorGeneral= leer.nextInt();
        leer.nextLine();

        //Crearemos un ciclo para que dependiendo las peliculas que se desean
        //añadir se solicite los datos correspondientes

        idPelicula = new int[contadorGeneral];
        nombrePelicula = new String[contadorGeneral];
        año = new int[contadorGeneral];
        categoriaPelicula = new String[contadorGeneral];

        for (int i = 0; i < contadorGeneral; i++) {
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

        for (int j = 0; j < contadorGeneral; j++) {
            System.out.println("« « « Película "+ (j+1) +"» » »");
            System.out.println("Id de película: "+idPelicula[j]);
            System.out.println("Nombre de la película: "+nombrePelicula[j]);
            System.out.println("Año de la película: "+año[j]);
            System.out.println("Categoría: "+categoriaPelicula[j]);
            System.out.println("Pelicula disponible: ");
        }

    }

    private static void devolucionPelicula() {
    }

    private static void prestamoPelicula() {
    }
}
