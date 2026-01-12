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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                    
                case 7:
                    System.out.println("Saliendo del programa");
                    salir = true; // sale del programa
                    break;
                // si el usuario no inserta un numero del 1-7 sldrá el siguiente mensaje    
                default:
                    System.out.println("Tiene que insertar una opcione del 1-7.");
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
    
    public static void rellenarArray() {
    
    }
    
}
