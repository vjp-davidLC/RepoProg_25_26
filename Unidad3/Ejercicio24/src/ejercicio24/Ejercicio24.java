/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int num1 = 1;
        int numeroIntroducido;
        boolean salida = false;

        Scanner entrada = new Scanner (System.in);
        
        do {            
            
            System.out.println("Introduce un numero --> ");
            numeroIntroducido = entrada.nextInt();
            
            for (int i = 1;i <= numeroIntroducido;i++) {
                
                int multiplo = i % 3 ;
                
                if (multiplo == 0){
                    System.out.println(multiplo);
                    salida = true;
                }
   
            }
            
        } while (salida == false);
        
    }
    
}
