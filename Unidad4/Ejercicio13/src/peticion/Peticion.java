/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticion;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Peticion {
    
    public static int peticionNumero() {
    
        Scanner entrada = new Scanner (System.in);
        int numeroUsuario = entrada.nextInt();
        
        return numeroUsuario;
        
    } 
    
}
