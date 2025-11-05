/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nombre;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Nombre {
    
    public static String nombreUsuario() {
    
        Scanner entrada = new Scanner (System.in);
        String nombreUsuario;
                
        System.out.println("Inserte aqui tu nombre : ");
        nombreUsuario = entrada.nextLine();
        
        return nombreUsuario;
        
    }
    
}
