/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprobacion;
import java.util.Scanner;
import peticion.*;

/**
 *
 * @author David López
 */
public class Comprobacion {
    
    public static boolean comprobacionContrasenna() {
        
        int contrasenna = 1234;
        int contrasennaUsuario = Peticion.peticionContrasenna();
        int intentos = 1;
        boolean acierto = false;

            
        do {            
            

            if (contrasennaUsuario == contrasenna){ 
                acierto = true;
                intentos = 3;
            }
            
            else {
                System.out.println("Contrasena incorrecta.");   
                intentos ++;
                contrasennaUsuario = Peticion.peticionContrasenna();
            }
            

        } while ( acierto==false && intentos < 3);
        
        return acierto;
        
    }
    
}
