/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author David López
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = new int[100];
        
        rellenarArray(array); // llamamos a los métodos
        System.out.println("El valor mayor es --> "+valorMayor(array)+"\n");
        System.out.println("El valor menor es --> "+valorMenor(array)+"\n");
        System.out.println("El valor que mas se repite es --> "+valorMasrepe(array)+"\n");
        System.out.println("La media es --> "+valorMedia(array)+"\n");
        
    }
    
    // método que rellena los valores del array
    public static void rellenarArray(int[] array) {
    
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*71+10); // número aleatorio del 10-80
        }
        
    }
    
    public static int valorMayor(int[] array) {
        int valorMayor = array[0]; // empezar con el primer valor real
        
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] > valorMayor) {
                valorMayor = array[i]; 
            }
            
        }
    
        return valorMayor;
    }
    
    public static int valorMenor(int[] array) {
        int valorMenor = array[0]; // empezar con el primer valor real
        
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] < valorMenor) {
                valorMenor = array[i]; 
            }
            
        }
    
        return valorMenor;
    }
    
    public static int valorMasrepe(int[] array) {
        int valorMasrepe = array[0]; // empezar con el primer valor
        int maxRepeticiones = 0; // guarda el numero de repeticiones mas alto encontrado

        for (int i = 0; i < array.length; i++) { // recorremos cada numero del array
            int contador = 0; // reiniciamos el contador para el numero actual
            int j = 0; // posicion en el que debemos de inicar en el array

            while (j < array.length) { // comparamos con todos los elementos
                if (array[i] == array[j]) { // si encontramos el mismo numero
                    contador++; // aumentamos el contador
                }
                j++;
            }

            if (contador > maxRepeticiones) { // si este numero se repite mas que los anteriores
                maxRepeticiones = contador; // actualizamos el maximo de repeticiones
                valorMasrepe = array[i]; // guardamos el numero que mas se repite
            }
        }

        return valorMasrepe; // devolvemos el numero que mas veces aparece
    }
    
    public static float valorMedia(int[] array) {
    
        float suma = 0;
        float totalMedia = 0;
        
        for (int i = 0; i < array.length; i++) {

            suma += array[i]; // guardamos la suma total de los grados en una variable

        }
    
        totalMedia = (float)suma / array.length; // dividimos la suma total entre los dias del mes
        
        return totalMedia; // devuelve la media en un numero con decimales
        
    }
    
}
