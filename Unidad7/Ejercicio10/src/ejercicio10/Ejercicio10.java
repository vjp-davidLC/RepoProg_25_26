/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author David López
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos el array con una longitud de 10 índices
        int[] numeros = new int[10];
        
        // llamadas a métodos
        rellenarArray(numeros);
        mostrarArray(numeros);
        sustituirValRepe(numeros);
        
        
    }
    // método que rellena el array con números aleatorios
    public static void rellenarArray(int array[]) {
        // bucle que recorre el array hasta su posicion final
        for (int i = 0; i < array.length; i++) {
            // asignamos un numeros aleatorio como valor en cada posicion del indice
            array[i] = (int) (Math.random()*8+1);
            
        }
    
    }
    
    // método que muestra el array
    public static void mostrarArray(int array[]) {
        
        System.out.print("Se han generado los siguiente numeros: ");
        // bucle que recorre el array hasta su posicion final
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i]+"");
            
        }
        System.out.println(""); // salto de línea
    }
    
    
    // método que determina si dos numeros son repetidos
    public static boolean esRepe(int num, int num2){
        boolean repetido; // variable boolean que determinará el resultado de este método
        repetido = num == num2; // si los dos numeros son iguales entonces es verdadero que son repetidos
        // si no, no son repetidos
        
        return repetido; // devuelve el valor de la variable boolean repetido
    }
    
    // método que sutituye un valor repetido por el número 0
    public static void sustituirValRepe(int array[]) {
        
        int i = 0; // variable que controlará las posiciones del array
        
        // mientras que i sea menor que [10] se ejecutará lo que haya dentro del bucle
        while (i < array.length) {         
                 
            // el bucle recorrerá desde la poscion [0] hasta la posicion según lo que tenga como valor i
            for (int j = 0; j < i; j++) {

            /** si el método esRepe no devuelve un True al comprar dos numeros (array[i] y array[j])
             * asignará a la posicion i el valor 0
            */ 
                if (esRepe(array[i], array[j])) {
                    array[i] = 0;
                }
            }
            i++; // irá incrementando la posición cada vez que se ejecute el for
        }
        
        // mostramos el resultado de sustitución
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        for (int k = 0; k < array.length; k++) {          
            System.out.print(array[k]+"");
        }
        System.out.println(""); // salto de línea
              
    }
    
}
