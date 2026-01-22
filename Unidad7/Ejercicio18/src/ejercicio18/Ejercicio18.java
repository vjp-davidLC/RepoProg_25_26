/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayUno = new int[5];
        int[] arrayDos = new int[5];
        int[] arrayTres = new int[10];
        
        // lamada a los métodos
        System.out.println("Rellene los valores: ");
        rellenarArray(arrayUno);
        rellenarArray(arrayDos);
        rellenarArrayVacio(arrayUno, arrayDos, arrayTres);
        ordenarArrayCreciente(arrayTres);
        mostrarArray(arrayTres);
        
    }
    
    public static void rellenarArray(int array[]) {
        Scanner entrada = new Scanner(System.in);
        // recorremos todos los indices del array y le asignamos en cada posicion un valor aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt(); // valor aleatorio de 10-100
        } 
        
    }
    
    public static void rellenarArrayVacio(int arrayUno[], int arrayDos[], int arrayTres[]) {
        int posicion = 0;
        // Copiar arrayUno
        for (int i = 0; i < arrayUno.length; i++) {
            arrayTres[posicion++] = arrayUno[i];
        }
        
        // Copiar arrayDos
        for (int i = 0; i < arrayDos.length; i++) {
            arrayTres[posicion++] = arrayDos[i];
        }
        
    }
    
    // realizamos el metodo burbuja para ordenar los valores de menor a mayor
    public static void ordenarArrayCreciente(int array[]) {
        
        int aux; // variable auxiliar para intercambiar valores

        for (int i = 0; i < array.length; i++) { // cada pasada empuja el valor mas grande hacia el final
            for (int j = 0; j < array.length - i - 1; j++) { // comparamos cada par de elementos consecutivos
                if (array[j] > array[j + 1]) { // si el valor de la izquierda es mayor que el de la derecha
                    aux = array[j]; // guardamos TEMOPRALMENTE el valor de la izquierda
                    array[j] = array[j + 1]; // movemos el valor de la derecha a la posicion izquierda
                    array[j + 1] = aux; // ponemos el valor guardado en la posicion derecha
                }
            }
        }
    
    }

    public static void mostrarArray(int array[]) {
        
        System.out.println("Se han generado los siguiente numeros: \n");
        // bucle que recorre el array hasta su posicion final
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Posicion "+i+ " valor: "+array[i]);
            
        }
    }
    
}
