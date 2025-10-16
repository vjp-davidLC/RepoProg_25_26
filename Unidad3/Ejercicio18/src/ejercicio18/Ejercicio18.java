/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int contrasena = 1234;
        int contrasenaIntroducida;
        int intentos = 0;
        boolean acierto = false;
        Scanner entrada = new Scanner (System.in);

            
        do {            
            
            System.out.println("Inserte la contrasena: ");
            contrasenaIntroducida = entrada.nextInt();
            intentos ++;
            
            if (contrasenaIntroducida == contrasena){ 
                System.out.println("Contrasena correcta.");
                acierto = true;
            }
            
            else {
                System.out.println("Contrasena incorrecta.");   
                intentos ++;
                
                
            }
            
            
            

        } while ( acierto==false && intentos < 3);
    
        
    }
    
}
