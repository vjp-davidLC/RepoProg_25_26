/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, suma = 0;
        Scanner entrada = new Scanner (System.in);
        
        
        try {
            // nos pide que evluemos CADA ENTRADA del usuario
            System.out.println("Introduce el primer numero -->");
            num1 = entrada.nextInt();
            System.out.println("Introduce el segundo numero -->");
            num2 = entrada.nextInt();
            
            suma = num1 + num2; // PREGUNTAR AL PROFESOR DE SI ESTA EN BUENA POSICION 
            
        } catch (InputMismatchException e) { // error que nos procede
            System.out.println("Error! Debes introducir un numero entero."); // mensaje de error
        }
        
        System.out.println("La suma de los dos numeros es "+suma);
        
    }
    
}
