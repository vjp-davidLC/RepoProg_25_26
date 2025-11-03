/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedir;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class PedirNumero {
    
    
    // Método para pedir el primer número al usuario
    public static int pedirPrimerNumero() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte un numero --> ");
        int num = entrada.nextInt();
        
        return num; // Devolver el número leído
    }
    
    // Método para pedir el segundo número, que debe ser mayor que el primero
    public static int pedirSegundoNumero(int num1) {
        
        Scanner entrada = new Scanner(System.in);
        boolean correcto = false; // Variable para controlar el bucle
        int num2;
        System.out.println("Inserte un segundo numero --> ");
        
        do {            
            num2 = entrada.nextInt();
            
            if (num2 < num1) { // Si el número es menor que el primero
                System.out.println("El segundo numero es menor que "+num1+" y no se puede realizar la operacion.");
                System.out.println("Vuelve a inserte otro numero --> ");
            }
            else {
                correcto = true; // Si el número es válido, salir del bucle
            }
            
        } while (!correcto); // Repetir mientras el número no sea válido
        
        return num2; // Devolver el segundo número válido
    }
    
}
