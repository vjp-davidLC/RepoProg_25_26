/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    
    // método principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] ventasCoches = new int[12]; // array con 12 indices de longitud
        // array con los meses del año
        String[] meses = new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        
        int opcion ; // variable que recogerá la opcion dsel usuario
        boolean salir = false; // booleano que controlará la salida del programa
        
        System.out.println("Seleccione una opcion: ");
        
        do {
            mostrarMenu(); // metodo del menu
            opcion = entrada.nextInt(); // recogemos la opcion del usuario
            
            // swicth que seleccionará el método según lo que ek usuario haya elegido
            switch (opcion) {
                case 1:
                    System.out.println("Rellenando automaticamente las ventas.\n");
                    rellenarArray(ventasCoches); // llamada al método
                    break;
                case 2:
                    System.out.println("Mostrando las ventas.\n");
                    mostrarArray(ventasCoches); // llamada al método
                    break;
                case 3:
                    System.out.println("Mostrando las ventas al reves.\n");
                    mostrarArrayReves(ventasCoches); // llamada al método
                    break;
                case 4:
                    System.out.println("La suma total de las ventas del anho son: "+valorTotalVentas(ventasCoches)+" euros\n");
                    break;
                case 5:
                    System.out.println("La suma total de los meses pares son: "+valorTotalVentasPares(ventasCoches)+" euros\n");
                    break;
                case 6:
                    mostrarMesConMasVentas(ventasCoches, meses); // llamada al método
                    break;
                    
                case 7:
                    System.out.println("Saliendo del programa...\n");
                    salir = true; // sale del programa
                    break;
                // si el usuario no inserta un numero del 1-7 sldrá el siguiente mensaje    
                default:
                    System.out.println("Tiene que insertar una opcione del 1-7.\n");
            }
            
        } while (!salir); // mientras el booleano salir no sea TRUE seguirá el bucle
        
    }
    
    // menú del programa
    public static void mostrarMenu() {
    
        System.out.println("--- PROGRAMA DE VENTAS DE COCHES ---");
        System.out.println("1- Rellenar automaticamente las ventas.");
        System.out.println("2- Mostrar ventas.");
        System.out.println("3- Mostrar ventas invertidad.");
        System.out.println("4- Total ventas del anho.");
        System.out.println("5- Total ventas de meses pares.");
        System.out.println("6- Mes con mas ventas del anho.");
        System.out.println("7- Salir del programa.");
        System.out.println("-------------------------------");
    
    }
    
    public static void rellenarArray(int array[]) {
        // recorremos todos los indices del array y le asignamos en cada posicion un valor aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*90)+10; // valor aleatorio de 10-100
        } 
        
    }
    
    public static void mostrarArray(int array[]) {
        // recorremos todos los indices del array y mostramos su valor
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Posicion "+i+ " valor: "+array[i]+" euros");
        }
        System.out.println(""); // salto de línea
    }
    
    public static void mostrarArrayReves(int array[]) {
        // recorremos todos los indices del array empezando desde el último [11] hasta el primero [0]
        for (int i = array.length - 1; i >= 0 ; i--) {
            
            System.out.println("Posicion "+i+ " valor: "+array[i]+" euros");
        }
        System.out.println(""); // salto de línea
    }
    
    public static int valorTotalVentas(int array[]) {
    
        int totalventas = 0; // inicializamos el valor de total de ventas en 0
        
        // recorremos todos los indices del array mientras que se van sumando los valores en la variable anterior
        for (int i = 0; i < array.length; i++) {
            totalventas += array[i]; // incrementando el valor de la variable segun el recorrido
            
        }
        return totalventas; // devuelve el total
        
    }
    
    public static int valorTotalVentasPares(int array[]) {
        
        int totalventas = 0; // inicializamos el valor de total de ventas en 0
        
        // recorremos todos los indices del array pero saltando directamente a la seguunda posicion [1]
        // y dando saltos de en dos en dos 
        for (int i = 1; i < array.length; i += 2) {
            totalventas += array[i]; // incrementando el valor de la variable segun el recorrido

        }
        return totalventas; // devuelve el total
        
    }
    
    public static void mostrarMesConMasVentas(int ventas[], String meses[]) {
    
        int mesMayorVentas = 0; // en esta varibale guardariamos la posicion del mes (seria enero en este caso)
        // este bucle recorre el array desde la posición 0 hasta la 11 (enero a diciembre)
        for (int i = 0; i < ventas.length; i++) {
            // si la ventas de dicho mes es mayor que el valor de la variable "mesMayorVentas" se le vuelve 
            // a asignar el valor a la varibale
            if (ventas[i] > ventas[mesMayorVentas]) {
                mesMayorVentas = i; // guardamos dicha posicion (mes) en la variable
                
            }
        }
        System.out.println("Mes con mas ventas: " + meses[mesMayorVentas]+" ventas --> "+ ventas[mesMayorVentas]+" euros.\n");;
        
    }
    
}
