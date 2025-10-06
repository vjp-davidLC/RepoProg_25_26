/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Por favor, introduzca un numero --> ");
        num = entrada.nextInt();
        
        if (num % 2 == 0) { // condicion que evalua si el numero introducido en PAR
            System.out.println("El numero introducido en PAR.");
        }
        else { // // condicion que evalua si el numero introducido en IMPAR
            System.out.println("El numero introducido en IMPAR");
        }
    }
    
}
