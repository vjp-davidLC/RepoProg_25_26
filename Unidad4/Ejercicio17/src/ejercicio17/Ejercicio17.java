/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        char letra; // variable que recogerá lo que introduzca el usuario
        boolean acierto = false; // booleano que cerrará el bucle
        int intentos = 1; // contador de intentos
        
        int aleatorio = (int)(Math.random()*(122-97+1))+97; // un numero aleatorio que se transforma a int y se lo pasamos a una variable char tambien transformarndola
        char aleatorioLetra = (char) aleatorio;
        
        System.out.println("------ ADIVINA LA LETRA ------");
        
        // System.out.println("Letra aleatoria : "+aleatorioLetra);
        
        // bucle que pedirá al usuario una letra y si no es esa le dirá si es menor o mayor que la aleatoria.
        do {            
            System.out.println("Introduce una letra --> ");
            letra = entrada.nextLine().charAt(0);
        
            if (letra == aleatorioLetra) {
                System.out.println("HAS ENCONTRADO LA LETRA ALEATORIA !!!");
                acierto = true; // sale del bucle
            }
            else if (letra < aleatorioLetra) {
                System.out.println("Tu letra es menor que la eltra a adivinar.");
                intentos++; // cuenta los intentos
            }
            else if (letra > aleatorioLetra) {
                System.out.println("Tu letra es mayor a la letra a adivinar");
                intentos ++; // cuenta los intentos
            }
        
        } while (!acierto); // se repite el bucle mientras el booleano acierto sea false
        
        System.out.println("Numeros de intentos : "+intentos);
    }
    
}
