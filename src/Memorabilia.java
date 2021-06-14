

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
    private static int[] diasPrestamoPelicula = new  int[contadorGeneral];

    //Para clientes

    private static String[] nombreCliente = new String[contadorGeneral];
    private static int[] idCliente = new int[contadorGeneral];
    private static int[] telefono = new int[contadorGeneral];
    private static boolean tienePeliculaPrestado = true;



    public static void main(String[] args) {


        //Se realizará el menú con las opciones correspondites
        while (!salir) {

            System.out.println("\n°|°|°|°|°|° Menú °|°|°|°|°|°");
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
                    imprimirDatos();
                    break;
                case 2:
                    System.out.println("--- Opción 2 ---");
                    devolucionPelicula();
                    break;
                case 3:
                    System.out.println("--- Opción 3 ---");
                    mostrarPelicula();
                    validarEstadoPelicula();
                    break;
                case 4:
                    System.out.println("--- Opción 4 ---");
                    ingresoPelicula();
                    break;
                case 5:
                    System.out.println("--- Opción 5 ---");
                    Peliculas();
                    mostrarPeliculaOrdenada();
                    break;
                case 6:
                    System.out.println("--- Opción 6 ---");
                    ingresoClienteNuevo();
                    break;
                case 7:
                    System.out.println("--- Opción 7 ---");
                    mostrarCliente();
                    validarClientePelicula();
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

    private static void imprimirDatos() {

        for (int p = 0; p < 1; p++) {
            System.out.println("\n### Prestamo pelicula ###");
            System.out.println("Id cliente: "+idCliente[p]);
            System.out.println("Id de película: "+idPelicula[p]);
            System.out.println("Días que será prestado: "+diasPrestamoPelicula[p]);
            System.out.println("Pelicula disponible: "+false);
        }

        }

    private static void mostrarPeliculaOrdenada() {

        for (String a:nombrePelicula) {
            System.out.println(a);
        }
    }

    private static void validarClientePelicula() {

        if (idPelicula == idPelicula) {
            tienePeliculaPrestado = true;
        } else {
            tienePeliculaPrestado = false;
        }
    }

    private static void validarEstadoPelicula() {

        if (idPelicula == idPelicula) {
            tienePeliculaPrestado = true;
        } else {
            tienePeliculaPrestado = false;
        }

    }

    private static void Reporte() {
    }

    private static void mostrarCliente() {

        for (int l = 0; l < contadorGeneral; l++) {
            System.out.println("\n« « « Cliente "+ (l+1) +"» » »");
            System.out.println("Nombre: "+nombreCliente[l]);
            System.out.println("ID cliente: "+idCliente[l]);
            System.out.println("Teléfono: "+telefono[l]);
            System.out.println("Tiene alguna película prestada: "+tienePeliculaPrestado);
        }

    }

    private static void ingresoClienteNuevo() {

        System.out.println("\nIngrese la cantidad de clientes nuevos que desee añadir");
        contadorGeneral = leer.nextInt();
        leer.nextLine();

        //Crearemos un ciclo para que dependiendo los clientes que desean agregarse
        //añadir se solicite los datos correspondientes

        nombreCliente = new String[contadorGeneral];
        idCliente = new int[contadorGeneral];
        telefono = new int[contadorGeneral];
        tienePeliculaPrestado = false;

        for (int k = 0; k < contadorGeneral; k++) {
            System.out.println("\n« « « Cliente "+(k+1) +"» » »");
            System.out.println("Nombre: ");
            nombreCliente[k] = leer.nextLine();
            System.out.println("ID cliente: ");
            idCliente[k] = leer.nextInt();
            leer.nextLine();
            System.out.println("Teléfono: ");
            telefono[k] = leer.nextInt();
            leer.nextLine();
            System.out.println("Tiene alguna película prestada : "+tienePeliculaPrestado);
        }
    }

    private static void Peliculas() {

        for (int m = 0; m < nombrePelicula.length ; m++) {
            for (int n = 0; n < nombrePelicula.length; n++) {
                
                //Se hará una comparación para que estos queden odenados de manera alfabetica

                if (nombrePelicula[m].compareToIgnoreCase(nombrePelicula[n]) < 0) {
                    String almacenarNombres = nombrePelicula[m];
                    nombrePelicula[m] = nombrePelicula[n];
                    nombrePelicula[n] = almacenarNombres;
                }
            }
        }
        System.out.println("\nEstado de película: "+tienePeliculaPrestado);
    }

    private static void ingresoPelicula() {

        System.out.println("\nIngrese la cantidad de películas para añadir");
        contadorGeneral= leer.nextInt();
        leer.nextLine();

        //Crearemos un ciclo para que dependiendo las peliculas que se desean
        //añadir se solicite los datos correspondientes

        idPelicula = new int[contadorGeneral];
        nombrePelicula = new String[contadorGeneral];
        año = new int[contadorGeneral];
        categoriaPelicula = new String[contadorGeneral];

        for (int i = 0; i < contadorGeneral; i++) {
            System.out.println("\n« « « Película "+(i+1) +"» » »");
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
            System.out.println("\n« « « Película "+ (j+1) +"» » »");
            System.out.println("Id de película: "+idPelicula[j]);
            System.out.println("Nombre de la película: "+nombrePelicula[j]);
            System.out.println("Año de la película: "+año[j]);
            System.out.println("Categoría: "+categoriaPelicula[j]);
            System.out.println("Pelicula disponible: "+tienePeliculaPrestado);
        }

    }


    private static void devolucionPelicula() {
    }

    private static void prestamoPelicula() {

        mostrarPelicula();

        idPelicula = new int[contadorGeneral];
        idCliente = new int[contadorGeneral];
        diasPrestamoPelicula = new  int[contadorGeneral];

        for (int o = 0; o < 1; o++) {
            System.out.println("\n### Prestamo pelicula ###");
            System.out.println("Ingrese ID (usuario): ");
            idCliente[o] = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese ID de la Pelicula");
            idPelicula[o] = leer.nextInt();
            leer.nextLine();
            System.out.println("Días que deseaa presta la película (no exceda de 15)");
            diasPrestamoPelicula[o] = leer.nextInt();
            leer.nextLine();
        }

    }
}

