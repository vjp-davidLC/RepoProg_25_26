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
    
    // menu principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] ventasCoches = new int[12]; // array con 12 indices de longitud
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
                    rellenarArray(ventasCoches);
                    break;
                case 2:
                    System.out.println("Mostrando las ventas.\n");
                    mostrarArray(ventasCoches);
                    break;
                case 3:
                    System.out.println("Mostrando las ventas al reves.\n");
                    mostrarArrayReves(ventasCoches);
                    break;
                case 4:
                    System.out.println("La suma total de las ventas del anho son: "+valorTotalVentas(ventasCoches)+" euros\n");
                    break;
                case 5:
                    System.out.println("La suma total de los meses pares son: "+valorTotalVentasPares(ventasCoches)+" euros\n");
                    break;
                case 6:
                    
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
    
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*90)+10;
        } 
        
    }
    
    public static void mostrarArray(int array[]) {
    
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Posicion "+i+ " valor: "+array[i]+" euros");
        }
        System.out.println("");
    }
    
    public static void mostrarArrayReves(int array[]) {
    
        for (int i = array.length - 1; i >= 0 ; i--) {
            
            System.out.println("Posicion "+i+ " valor: "+array[i]+" euros");
        }
        System.out.println("");
    }
    
    public static int valorTotalVentas(int array[]) {
    
        int totalventas = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            totalventas += array[i];
            
        }
        
        return totalventas;
        
    }
    
    public static int valorTotalVentasPares(int array[]) {
    
        String[] meses = new String[] {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        int totalventas = 0;
        
        for (int i = 1; i < array.length; i += 2) {
            
            totalventas += array[i];

        }
        
        return totalventas;
        
    }
    
}
