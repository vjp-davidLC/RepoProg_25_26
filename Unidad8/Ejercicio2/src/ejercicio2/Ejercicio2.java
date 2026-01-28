/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numUsuario = pedirLongitud();
        int[] array = new int[numUsuario];
        rellenarArray(array);
        mostrarArray(array);
        

    }
    
    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int numUsuario = 0;
        boolean salir = false;
        
        do {            
            System.out.println("Inserte la longitud que desea del array --> ");
            
            try {
                numUsuario = entrada.nextInt();
                if ( numUsuario >= 1 && numUsuario <= 6) {
                    salir = true;
                }
                else {
                    System.out.println("\nError. Debe insertar un numero del 1-6");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nError: debe insertar un numero valido.");
                entrada.nextLine(); // limpia el buffer (eliminar ese dato)

            }
 
        } while (!salir);
    
        return numUsuario;
        
    }
    
    public static void rellenarArray(int[] array) {
    
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*7)+1; // numero aleatorio del 1-6
        }
        
    }
    
    public static void mostrarArray(int[] array) {
    
        System.out.println("\nValores del array: ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }
    
}
