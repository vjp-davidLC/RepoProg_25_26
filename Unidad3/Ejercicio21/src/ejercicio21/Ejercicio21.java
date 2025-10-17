/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, division = 0; // inicializamos la variable en 0 ya que al estar la operacion en un try
                                      // no sale un error
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce el primer numero -->");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero -->");
        num2 = entrada.nextInt();
        
        
        try {
            division = num1 / num2; // evaluamos la operacion
        } catch (ArithmeticException e) { //error que nos procede
            System.out.println("Ha introducido un 0 en la parte del divisor."); // mensaje que nos enseña
            
        }
        
        System.out.println("El resultado es "+ division);
        
    }
    
}
