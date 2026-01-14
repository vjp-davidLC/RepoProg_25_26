/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Arrays;

/**
 *
 * @author David López
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = new int[15]; // array de 15 posiciones
        
        // bucle que rellenar automáticamente los valores de las posiciones
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*51); // 0 a 50
        }
        
        System.out.println("--- TODOS LOS VALORES ---");
        // bucle que muestra los valores del array en cada posicion antes de ser editado
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+i+ " valor: "+array[i]);
        }
        
        Arrays.sort(array);// este método ordena automáticamente de menor a mayor el array que se le pase por parámetros
        
        System.out.println("\nLos 10 numeros mayores son:");
        
        // el bucle siguiente recorre empezando desde la Última posición hasta la posición 5 del array
        for (int i = array.length - 1; i >= array.length - 10 ; i--) {
                System.out.println("Posicion "+i+ " valor: "+array[i]);
        }
        
    }
    
}
