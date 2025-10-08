/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Por favor, introduzca un numero --> ");
        num = entrada.nextInt();
        
        if (num < 0) { // condicion que evalua si el numero introducido es negativo
            System.out.println("El numero introducido es Negativo.");
        }
        else { // // condicion que evalua si el numero introducido es positivo
            System.out.println("El numero introducido es POSITIVO");
        }
    }
    
}
