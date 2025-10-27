/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author David López
 */
public class MenorQue {
    
    public static void menorQue (int num1, int num2, int num3) {
        
        
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("El menor es el numero "+num1);
        }
        if (num2 <= num1 && num2 <= num3){
            System.out.println("El menor es el numero "+num2);
        }
        if (num3 <= num1 && num3 <= num2){
            System.out.println("El menor es el numero "+num3);
        }
    
    }
    
}
