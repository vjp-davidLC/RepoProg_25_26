/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David López 
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void rellenarArray(int[] vector){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Rellene las siguientes posiciones: ");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion "+i+": valor --> ");
            vector[i] = entrada.nextInt();
        }
    
        
    }
    
    public static void valoresPares(int[] vector) {
    
        System.out.println("-- Valores pares --");
        
        for (int i = 0; i < vector.length; i++) {
            
            
            if (vector[i] % 2 == 0) {
                System.out.println("Posicion "+i+" con valor "+vector[i]);
            
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        int[] vector = new int[5];
        
        rellenarArray(vector);
        valoresPares(vector);
        
    }
    
}
