/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, num3;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero --> ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero --> ");
        num2 = entrada.nextInt();
        
        System.out.println("Por ultimo, introduzca un tercer numero --> ");
        num3 = entrada.nextInt();
     
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El numero mayor de los introducidos es el "+num1);
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println("El numero mayor de los introducidos es el "+num2);
        }
        else {
            System.out.println("El numero mayor de los introducidos es el "+num3);
        }
    }
    
}
