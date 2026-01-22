/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author David López
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    
    // método principal
    public static void main(String[] args) {
        
        int[] array = new int[10]; // array con una longitud de 10 posiciones
        
        // lamada a los métodos
        rellenarArray(array);
        mostrarArray(array);
        ordenarArrayMayorAMenor(array);
        System.out.println(""); // salto de línea
        mostrarArray(array);

    }
    // método que asigna valores a la posciones del array
    public static void rellenarArray(int[] array) {
        
        // recorremos todos los indices del array y le asignamos en cada posicion un valor aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10); //numero aleatorio del 0-9
        }
        
    }
    
    public static void mostrarArray(int[] array) {
        // recorremos todos los indices del array y mostramos los valores de cada posicion
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+i+" valor --> "+array[i]);
        }
    
    }
    
    // método que ordenará de mayor a menor los valores del array (método burbuja)
    public static void ordenarArrayMayorAMenor(int[] array) {
    
        int aux; // variable auxiliar
        
        // en este primer for recorremos el array para controlar las pasadas
        for (int i = 0; i < array.length - 1; i++) {
            // en este segundo for recorremos el array para controlar las comparaciones
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) { // si dado un valor es menor que el valor siguiente a la posicion
                    aux = array[j];            // se intercambiará los valores en las posicones
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        
    }
    
}
