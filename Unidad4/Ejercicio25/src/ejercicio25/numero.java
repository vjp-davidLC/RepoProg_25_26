/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class numero {
    
    public static int pedirNumero() {
    
        Scanner entrada = new Scanner (System.in);
        int numeroUsuario;
        
        System.out.println("Inserte un numero : ");
        numeroUsuario = entrada.nextInt();
        
        return numeroUsuario;
        
    }
    
}
