/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar -->");
        num = entrada.nextInt();
                
        for (int i = 0; i <= 10; i++) { // el valor de i se incremneta hasta que llegue a 10 y inicializa con 0
            int resultado = num*i;   // num contiene el numero insertado por el usuario    
            System.out.println(num+" x "+i+" = "+resultado);
        }
        
    }
    
}
