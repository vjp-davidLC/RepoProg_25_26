/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import comprobacion.Comprobacion;
import numero.Numero;
/**
 *
 * @author David
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Llamamos al método que pide el número al usuario
        int numeroUsuario = Numero.numeroUsuario();
        
        // Llamamos al método que comprueba si el número es primo
        if (Comprobacion.esPrimo(numeroUsuario)) {
        
            System.out.println("El numero "+numeroUsuario+" ES primo.");
            
        }
        else {
        
            System.out.println("el numero "+numeroUsuario+" NO es primo.");
        }
        
    }
    
}
