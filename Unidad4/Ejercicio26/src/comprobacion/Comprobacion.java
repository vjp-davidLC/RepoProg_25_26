/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprobacion;

/**
 *
 * @author David
 */
public class Comprobacion {
    
    public static boolean esPrimo(int numeroUsuario) {
        
        boolean esPrimo = true;
        
        // Solo comprobamos hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numeroUsuario); i++) {
            
            // Si encontramos un número que divide exactamente (resto 0)
            if (numeroUsuario % i == 0) {
                esPrimo = false;// No es primo
            }
        }
        
        
        return esPrimo;// Devolvemos true si es primo, false si no lo es
    }
    
}
