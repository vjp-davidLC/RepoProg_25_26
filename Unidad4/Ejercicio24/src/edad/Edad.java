/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edad;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Edad {
    
    public static int edadUsuario() {
    
        Scanner entrada = new Scanner (System.in);
        int edad;
                
        System.out.println("Inserte aqui tu edad : ");
        edad = entrada.nextInt();
        
        return edad;
        
    }
    
}
