/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio5 {

    /**
     * @param array
     * @param args the command line arguments
     */
    
    // método que rellena el array segun lo que el usuario introduzca
    public static void rellenarArray(int[][] array) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Rellena el array con valores.");
        for (int i = 0; i < array.length; i++) { // filas
            for (int j = 0; j < array[i].length; j++) { // columnas
                System.out.println("Introduce un valor para la posicion ["+i+"-"+j+"] --> ");
                array[i][j] = entrada.nextInt();
            }
        }
    
    }
    
    // método que muestra el array
    public static void mostrarArray(int[][] array) {
    
        for (int i = 0; i < array.length; i++) { // filas
            for (int j = 0; j < array[i].length; j++) { // columnas
                System.out.println("Posicion ["+i+"-"+j+"] Valor --> "+array[i][j]);
            }
        }
        
    }
    
    // método que muestra el valor menor del array
    public static void menorValor(int[][] array){
    
        int numMenor = array[0][0]; // inicializamos esta variable con el primer valor del array
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ( array[i][j] < numMenor){ // si dado un valor del array es menor que un supuesta numero mneor
                    numMenor = array[i][j]; // se guarda en la variable
                }
            }
        }
        
        System.out.println("El numero menor es: "+numMenor);
    }
    
    // método que muestra el valor mayor del array (la lógica es igual que el método anterior pero cambiando el símbolo de mayor que)
    public static void mayorValor(int[][] array){
    
        int numMayor = array[0][0]; // inicializamos esta variable con el primer valor del array
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ( array[i][j] > numMayor){ // si dado un valor del array es mayor que un supuesta numero mayor
                    numMayor = array[i][j]; // se guarda en la variable
                }
            }
        }
        
        System.out.println("El numero mayor es: "+numMayor);
    }
    
    // método que muestra la suma de todos los valores del array
    public static void sumaValores(int[][] array){
   
        int sumaValores = 0; // inicializamos esta variable con el valor 0
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                sumaValores += array[i][j]; // recorremos todas las posiciones y en cada posición vamos sumando en la variable
                
            }
        }
        
        System.out.println("La suma de todos los valores en total es: "+sumaValores);
        
    }
           
    // método principal
    public static void main(String[] args) {

        int[][] array = new int[4][2]; // array bidimensional
        
        // llamadas a los métodos
        rellenarArray(array);
        mostrarArray(array);
        mayorValor(array);
        menorValor(array);
        sumaValores(array);
    }
    
    
}
