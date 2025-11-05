/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprobacion;
import edad.Edad;
import nombre.Nombre;
/**
 *
 * @author David
 */
public class Comprobacion {
    
    public static void mayorEdad() {
    
        int adulto = 18;
        String nombre = Nombre.nombreUsuario();
        int edad = Edad.edadUsuario();
        
        
        if (edad >= adulto) {
            System.out.println("El usuario llamado "+nombre+ " ES mayor de edad");
        }
        else {
            System.out.println("El usuario llamado "+nombre+ " NO es mayor de edad");
        }

    }
    
}
