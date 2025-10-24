/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    public static void mayorQue(int a, int b, int c) {
    
        if (a >= b && a>= c){
            System.out.println("El numero mayor de los introducidos es el "+a);
        }
        else if (b >= a && b >= c){
            System.out.println("El número mayor de los introducidos es el "+b);
        }
        else {
            System.out.println("El número mayor de los introducidos es el "+c);
        }
        
    }
    
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero --> ");
        num1 = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero --> ");
        num2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero --> ");
        num3 = entrada.nextInt();
        
        Ejercicio3.mayorQue(num3, num3, num3);
        
    }
    
}
