/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;

import pedir.Pedir;
import comprobar.Comprobar;
/**
 *
 * @author David López
 */
public class Calculo {
    
    public static void multiplosTres() {
    
        int numeroUsuario;
        boolean salida; // indica si el número es válido
        int contador = 0; // cuenta cuantos multiplos de 3 se muestran
        
        // Bucle que se repite hasta que el usuario introduzca un número válido mayor que 0
        do {            
            
            numeroUsuario = Pedir.pedirNumero();
            salida = Comprobar.comprobacionMayorqueCero(numeroUsuario);
            
            if (!salida) {
                System.out.println("Numero INCORRECTO. Intentelo de nuevo.");              
            }
               
   
            
        } while (salida == false);
        
        System.out.println("Multiplos de 3 hasta " + numeroUsuario + " :");
        
        // Mostramos los múltiplos de 3 hasta el número introducido
        for (int i = 1;i <= numeroUsuario ;i++) {
            
                // Si el número es múltiplo de 3, lo mostramos y aumentamos el contador
                if (i % 3 == 0){
                    System.out.println(i);
                    contador ++; // incrementamos 1 al total de múltiplos encontrados
                }
            
        }
        // Mostramos cuántos múltiplos de 3 se han encontrado
        System.out.println("Total de numeros multiplos de 3 --> "+contador);
        
    }
}
