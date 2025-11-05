/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Numero {
    
    public static int numeroUsuario() {
    
        Scanner entrada = new Scanner (System.in);
        int numero;
        
        System.out.println("Inserte aqui cualquier numero : ");
        numero = entrada.nextInt();
        
        return numero;
    
    }
    
}
