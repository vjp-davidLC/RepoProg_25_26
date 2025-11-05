/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author David
 */
public class Calculo {
    
    public static void calculoPotencia() {
        
        int numeroUsuario = numero.pedirNumero();
        int exponente = potencia.pedirExponente();
        
        // esta excepcion no esta bien
        try {
            double potencia = Math.pow(numeroUsuario, exponente);
            System.out.println("La potencia de "+numeroUsuario+" elevado a "+exponente+" es --> "+potencia);
        } catch (ArithmeticException e) {
            System.out.println("El numero 0 no se puede elevar con un numero negativo");
        }
            
        
          
        
    }
    
}
