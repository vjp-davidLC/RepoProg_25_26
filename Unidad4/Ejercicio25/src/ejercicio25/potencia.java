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
public class potencia {
    
    public static int pedirExponente() {
    
        Scanner entrada = new Scanner (System.in);
        int potenciaUsuario;
        
        System.out.println("Inserte la potencia : ");
        potenciaUsuario = entrada.nextInt();
        
        return potenciaUsuario;
    }
    
}
