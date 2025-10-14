/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float num;
        Scanner entrada = new Scanner (System.in);
        
        do {
            
            System.out.println("Intruce un numero --> ");
            num = entrada.nextFloat();
            
            if (num > 0) {
                float resultado = (float) Math.sqrt(num);
                System.out.println("La raiz cuadrada de "+num+" es "+resultado);
            }
            else {
                System.out.println("Has introducido un numero negativo o cero. Vuelve a insertar otro numero -->");
            }
        } while (num <= 0);
        
    }
    
}
