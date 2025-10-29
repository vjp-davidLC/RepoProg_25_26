/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprobar;

/**
 *
 * @author David López
 */
public class Comprobar {
    public static boolean comprobacionMayorqueCero(int numeroUsuario) {

        // Inicializamos la variable 'acierto' como false
        // Esto indica que por defecto el número no es válido
        boolean acierto = false;
        
        // Si el número es mayor que 1, cambiamos 'acierto' a true
        if (numeroUsuario > 0) {
        
            acierto = true;
        }
        
        // Devolvemos true si el número es válido o false si no lo es
        return acierto;
    }
        

}
