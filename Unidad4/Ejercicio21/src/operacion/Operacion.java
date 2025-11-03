/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacion;
import pedir.*;
/**
 *
 * @author David López
 */
public class Operacion {
    
    // Método que calcula y muestra la suma de todos los números pares entre num1 y num2
    public static void  sumaTotalNumerosPares() {
        
        int num1 = PedirNumero.pedirPrimerNumero(); // Pedir primer número
        int num2 = PedirNumero.pedirSegundoNumero(num1); // Pedir segundo número mayor que el primero
        int sumaPares = 0; // Inicializar variable para acumular la suma de pares
        
        for (int i = num1; i < num2; i++) { // Bucle para recorrer todos los números entre num1 y num2
            
            if (i % 2 == 0){ // Comprobar si el número es par
                sumaPares += i; // Si es par, añadirlo a la suma
            }
        }
        
        System.out.println("La suma de los numeros pares entre " + num1 + " y " + num2 + " es: " + sumaPares);
        
    }
    
}
