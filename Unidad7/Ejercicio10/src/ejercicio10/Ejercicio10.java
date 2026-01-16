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
        
            if (num == num2) { // si los dos numeros son iguales entonces es verdadero que son repetidos
                repetido = true;
            }else{ // si no, no son repetidos
                repetido = false;
            }
        
        return repetido; // devuelve el valor de la variable boolean repetido
    }
    
    // método que sutituye un valor repetido por el número 0
    public static void sustituirValRepe(int array[]) {
        int i = 0; // variable que controlará las posición del bucle
        
        /** bucle que recorre el array hasta su posicion final,
         * (-1) porque en la condición del while comparamos una posición con la posición siquiente
         * entonces cuando lleguemos al final no se compará con una posición que no exista.
         */
        for (int j = 0; j < array.length -1; j++) {
            /** mientras la i sea menor que el valor de las posciones del array 
             * Y el método esRepe(boolean) sea "false" seguirá en el bucle
             */ 
            while (i < array.length && esRepe(array[j],array[j+1])) {            
                array[j] = 0; // le asignamos un numero 0 al valor de dada posicion en el array
                i++; // incrementamos el valor del posición
            }
        }
        
        // mostramos el resultado de sustitución
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        for (int k = 0; k < array.length; k++) {          
            System.out.print(array[k]+"");
        }
        System.out.println(""); // salto de línea
              
    }
    
}
