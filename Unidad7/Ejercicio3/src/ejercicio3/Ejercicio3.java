/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirTamanho() {
    
        Scanner entrada = new Scanner(System.in);
        int tamanho = 0;
        
        do {
            System.out.println("Inserte la longitud que desee para el array entre 1-10--> ");

            try {
                tamanho = entrada.nextInt();
                
            } catch (Exception e) {
                System.out.println(e); // esto enseña el nombre de la excepcion
                System.out.println("El tamanho del array debe de ser entero.");
            }
            
            if (tamanho < 1 || tamanho > 10) {
            
                System.out.println("El tamanho debe de estar en el 1-10.");
            }
            
        }
        while(tamanho < 1 || tamanho > 10);
        
        return tamanho;
    }
    
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
    
    public static void main(String[] args) {

        int[] vector = new int[pedirTamanho()];
        
        rellenarArray(vector);
        mostrarValoresArray(vector);
        

    }
    
}
