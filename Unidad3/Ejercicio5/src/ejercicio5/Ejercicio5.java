/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero --> ");
        num1 = entrada.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("El numero introducido es PAR.");
        }
        else {
            System.out.println("El numero introducido es IMPAR.");
        }
        
    }
    
}
