/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    public static void rellenarArray(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Rellene las posiciones del vector.");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion "+i+"");
            System.out.println("Valor --> ");
            vector[i] = entrada.nextInt();
            
        }
    }
    
    public static void mostrarValoresArray(int[] vector){
    
        System.out.println("-- Valores del array --");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion "+i+" con valor "+vector[i]);
        }
    }
    
    public static void intercambiarPosiciones(int[] vector){
        
        int aux = vector[1];
        vector[1] = vector[3];
        vector[3] = aux;
        
    }
    
    public static void main(String[] args) {
        
        int[] vector = new int[7];
        
        rellenarArray(vector);
        mostrarValoresArray(vector);
        intercambiarPosiciones(vector);
        System.out.println("");
        System.out.println("Volvemos a mostrar los valores una vez cambiados");
        mostrarValoresArray(vector);
    }
    
}
