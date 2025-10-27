/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int num1;
        
        System.out.println("Inserte un numero para saber si es PAR o IMPAR --> ");
        num1 = entrada.nextInt();
        
        ParOImpar.paroimpar(num1);
        
    }
    
}
