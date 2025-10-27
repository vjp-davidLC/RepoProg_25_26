/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author David
 */
public class MayorQue {
    
    public static void mayorQue(int a, int b, int c) {
    
        if (a >= b && a>= c){
            System.out.println("El numero mayor de los introducidos es el "+a);
        }
        else if (b >= a && b >= c){
            System.out.println("El numero mayor de los introducidos es el "+b);
        }
        else {
            System.out.println("El numero mayor de los introducidos es el "+c);
        }
        
    }
    
}
