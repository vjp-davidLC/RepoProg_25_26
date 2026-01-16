/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author David López
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    // método principal
    public static void main(String[] args) {
        // array de 10 indices de longitud
        int[] array = new int[10]; 
        
        boolean repetido ; // variable que controlorá si un numero es repetido o no
        int i = 0; // variable que controlará las posiciones del array
        int num; // variable que recogerá un numero aleatorio
        
        // mientras que i sea menor que [10] se ejecutará lo que haya dentro de él
        while (i < array.length) {         
            
            num = (int) (Math.random() * 10); // genera un numero del 0-9
            
            repetido = false; // inicializamos la variable booleana en false 
                              /** si es la primera interación del bucle while directamente se saltará el for
                               * porque la condicion de " j<i " no se cumple
                              */
            
            // el bucle recorrerá desde la poscion [0] hasta la posicion según lo que tenga como valor i
            for (int j = 0; j < i; j++) {

            /** si dada la posicion [j] es igual que el numero aleatorio que hemos recogido antes
            * el boolean pasará a ser true y se tendrá que repetir el bucle while desde el principio
            * sin incrementar la posicion de [i]
            */ 
                if (array[j] == num) {
                    repetido = true; // Marcar que ya está
                }
            }
            
            // si el boolean es false
            if (!repetido) {
                // se le asigna dado numero aleatorio a la poscion actual de i
                array[i] = num;
                i++; // se incrementa la posicion de i
            }
            
        }
        
        // método mostrar el array
        mostrararray(array);
    }
    
    public static void mostrararray(int array[]) {
        // recorre desde la posicion [0] hasta [10] en este caso 
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion: "+i+" valor: "+array[i]);
        }
        
    }
    
}
