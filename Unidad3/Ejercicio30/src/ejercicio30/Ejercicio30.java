/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double aleatorio = ((Math.random()*100));
        int aleatorioEntero = (int) aleatorio;
        boolean salida = false;
        Scanner entrada = new Scanner (System.in);
        int numeroIntroducido;
        int intentos = 0;
        
        // System.out.println("Numero aleatorio :"+aleatorioEntero);
        System.out.println("--- ADIVINA EL NUMERO DESCONOCIDO ---");
        System.out.println("Introduce un primero numero --> ");
        
        // java.util.InputMismatchException
        
        do {            
            try {
                
                numeroIntroducido = entrada.nextInt();
                intentos++;

                
                if (numeroIntroducido < aleatorioEntero){

                    System.out.println("Tu numero es menor que el numero desconocido.");
                    System.out.println("Inserte otro numero -->");

                    }
                if (numeroIntroducido > aleatorioEntero){

                    System.out.println("Tu numero es mayor que el numero desconocido.");
                    System.out.println("Inserte otro numero -->");

                    }
                if(numeroIntroducido == aleatorioEntero) {
                    System.out.println("HAS ENCONTRADO EL NUMERO DESCONOCIDO --> "+numeroIntroducido);
                    System.out.println("Numero de intentos --> "+intentos);
                    salida = true;

                    }
                
            }
            catch (InputMismatchException e) {
                intentos++;
                System.out.println("ERROR. Por favor inserte un numero.");
                entrada.next(); // limpiar el buffer del Scanner
            }
            

        } while (salida == false);

    }
    
}
