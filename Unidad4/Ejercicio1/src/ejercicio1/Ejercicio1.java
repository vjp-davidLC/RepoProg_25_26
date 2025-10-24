/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    // EJERCICIO QUE PIDE UN NUMERO SI ES POSITIVO O NEGATIVO
    public static void postivONegativ(int num) {
    

        if (num < 0) {
            System.out.println("El numero que has introducido es negativo.");
        }
        else {
            System.out.println("El numero que has introducido es positivo.");
        }
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero --> ");
        int num = entrada.nextInt();
        
        Ejercicio1.postivONegativ(num);
    }
    
}
