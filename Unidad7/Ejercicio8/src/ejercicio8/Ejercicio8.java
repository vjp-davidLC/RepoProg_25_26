/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */

    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario;
        boolean valido = false;
        
        
        do {            
            
            System.out.println("Introduzca un numero entero de 5 cifras: ");
            numeroUsuario = entrada.nextInt();
            
            if (numeroUsuario >= 10000 && numeroUsuario <= 99999) {
                System.out.println("Numero correcto.");
                valido = true;
            } else {
                System.out.println("Numero incorrecto, debe de ser un numero de 5 cifras.");
                System.out.println("Vuelve a intentarlo.");
                System.out.println("");
            }
            
        } while (!valido);
            
        
        return numeroUsuario;
    }

    public static void dividirNumero(int array[], int numeroUsuario){
         // este bucle directamente rellena las celdas con el numero invertido por la operacion matemática
        for (int i = 0; i < array.length; i++) { 
            array[i] = numeroUsuario % 10; // Obtenemos el ultimo digito
            numeroUsuario /= 10;           // Eliminamos el ultimo digito
        }

    }
    
    public static void mostrarValoresArray(int[] array){
    
        System.out.println("-- Valores del array --");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+i+" con valor "+array[i]);
        }
    }
    
    public static void mostrarNumeroInvertido(int array[]) {
           
        int celda1 = array[0];
        int celda2 = array[1];
        int celda3 = array[2];
        int celda4 = array[3];
        
        System.out.println("-- Numero invertido --");
        System.out.println(array[0]+""+array[1]+""+array[2]+""+array[3]+""+array[4]);
    
    }
    
    public static void main(String[] args) {
        
        int[] array = new int[5];
        
        dividirNumero(array, pedirNumero());
        mostrarValoresArray(array);
        mostrarNumeroInvertido(array);
    
    }
    
}
