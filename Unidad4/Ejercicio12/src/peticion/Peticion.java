/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticion;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Peticion {
    
    public static int peticionContrasenna() {
        
        int contrasennaUsuario;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Inserte la contrasenna --> ");
        contrasennaUsuario = entrada.nextInt();
        
        return contrasennaUsuario;
    }
    
}
