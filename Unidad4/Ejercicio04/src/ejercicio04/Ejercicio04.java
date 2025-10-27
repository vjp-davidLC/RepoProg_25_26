/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, num3;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero --> ");
        num1 = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero --> ");
        num2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero --> ");
        num3 = entrada.nextInt();
        
        MenorQue.menorQue(num1, num2, num3);
        
    }
    
}
