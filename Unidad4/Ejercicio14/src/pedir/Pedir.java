/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedir;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Pedir {
    
    // Método que pide un número al usuario
    public static int pedirNumero() {
    
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduce un numero: ");
        int numeroUsuario = entrada.nextInt();
        
        // Leemos el número introducido por el usuario y lo devolvemos
        return numeroUsuario;
            
    }
}
