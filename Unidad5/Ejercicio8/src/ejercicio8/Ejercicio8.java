/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicio8 { // TEST

    /**
     * @param args the command line arguments
     * @return 
     */
    
    public static int pedirNumero() {
    
        Scanner entrada = new Scanner (System.in);
        
        int numeroUsuario;
        
        System.out.println("Inserta un numero: ");
        numeroUsuario = entrada.nextInt();
                
        return numeroUsuario;
        
    }
    
    public static void parImpar(int numeroUsuario) {
    
        if (numeroUsuario % 2 == 0) {
            System.out.println("Tu numero es PAR");
        } else {
            System.out.println("Tu numero es IMPAR");
        }
        
    }
    
    public static void main(String[] args) {
        
        int numero = pedirNumero();
        
        Numero numeroTest = new Numero();
        
        numeroTest.establecerValor(numero);
        
        parImpar(numeroTest.obtenerValor());
        
    }
    
}
