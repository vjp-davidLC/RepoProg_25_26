/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author David Lopez
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 11;
        System.out.println("Numeros pares entre 11 y 133 --> ");
        
        do {            
            
            if (i % 2 == 0) { // si el número es par
                System.out.println(i);
            }
            
            i ++;
            
        } while (i <=133); // condicion del bucle
        
    }
    
}
