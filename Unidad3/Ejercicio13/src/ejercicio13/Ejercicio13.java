/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author David Lopez
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 11;
        System.out.println("Numeros pares entre 11 y 133 --> ");
        
        while (num <= 133){ // condicion del bucle
        
            if (num % 2 == 0){ // si el num es PAR
                
                System.out.println(num); 
                
            }
            num ++;
        }
        
    }
    
}
