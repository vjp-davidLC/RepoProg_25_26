/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario;
        
        System.out.println("Introdiuzca un numero entero: ");
        numeroUsuario = entrada.nextInt();
        
        return numeroUsuario;
    }
    
    public static int contarCifras(int numeroUsuario){
        int contador = 0;
        int i = numeroUsuario;
         // Este bucle divide el número entre 10 en cada iteración para eliminar 
         //cifras y usa un contador para saber cuántas cifras tiene el número.
        if (i == 0) {
            contador = 1;
        } else {
            while (i > 0) {
                contador++;
                i /= 10;
    }
}
        
        return contador;
    }
    
    public static void dividirNumero(int array[], int numeroUsuario){
         // este bucle directamente rellena las celdas con el numero invertido por la operacion matemática
        for (int i = 0; i < array.length; i++) { 
            array[i] = numeroUsuario % 10; // Obtenemos el ultimo digito
            numeroUsuario /= 10;           // Eliminamos el ultimo digito
        }
    }
    
    public static void mostrarArray(int array[]) {
    
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+i+" valor: "+array[i]);
        }
        
    }
    
    public static void mostrarNumeroInvertido(int array[]) {
    
        System.out.println("Numero invertido: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    
    public static void main(String[] args) {
        
        int numeroUsuario = pedirNumero();
        int[] array = new int[contarCifras(numeroUsuario)];
        
        System.out.println("Cifras que tiene el usuario: "+contarCifras(numeroUsuario));
        dividirNumero(array, numeroUsuario);
        mostrarArray(array);
        mostrarNumeroInvertido(array);
        System.out.println("");
        

    }
    
}
