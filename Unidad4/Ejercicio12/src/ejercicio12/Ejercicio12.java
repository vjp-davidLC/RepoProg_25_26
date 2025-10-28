/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author David López
 */

import comprobacion.*;

public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (Comprobacion.comprobacionContrasenna() == true){
            System.out.println("Contrasenna CORRECTA.");
        }
        else {
            System.out.println("Contrasenna INCORRECTA.");
        }
    }
    
}
