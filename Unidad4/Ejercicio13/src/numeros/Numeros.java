/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

import peticion.Peticion;
import comprobacion.comprobacion;
/**
 *
 * @author David López
 */
public class Numeros {
    // Método que imprime todos los números del 1 al número introducido
    public static void numerosExistentes () {
        
        int numeroUsuario;
        boolean acierto;
        
        // Bucle que se repite hasta que el usuario introduzca un número válido
        do {            
            
            numeroUsuario = Peticion.peticionNumero();
            // Comprobamos si el número es mayor que 1
            acierto = comprobacion.comprobacionNumero(numeroUsuario);
            
            // Si no es válido, mostramos un mensaje de error
            if (!acierto) {
            
                System.out.println("Numero INCORRECTO.");
                System.out.println("Inserte otro numero --> ");                
            }
            
        } while (!acierto);// Repetimos mientras el número sea incorrecto
        
        // Una vez que el número es correcto, imprimimos los números del 1 al número introducido
        System.out.println("Los numeros del 1 al " + numeroUsuario + " son : ");
        for (int i = 1; i <= numeroUsuario; i++) {
            System.out.println(i);
        }
        
    }
    
}
