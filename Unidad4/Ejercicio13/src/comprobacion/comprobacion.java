/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprobacion;

/**
 *
 * @author David López
 */
import peticion.*;

public class comprobacion {
    
    public static boolean comprobacionNumero() {
    
        int numeroUsuario = Peticion.peticionNumero();
        boolean acierto = false;

            
        do {            
            

            if (numeroUsuario >1){ 
                acierto = true;
            }
            
            else {
                System.out.println("Numero INCORRECTO.");   
                numeroUsuario = Peticion.peticionNumero();
            }
            

        } while ( acierto==false);
        
        return acierto;
        
    }
   
}
