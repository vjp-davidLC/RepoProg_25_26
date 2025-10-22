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
    
        int numeroIntroducido;
        boolean salida = false;

        Scanner entrada = new Scanner (System.in);
        
        do {            
            
            System.out.println("Introduce un numero --> ");
            numeroIntroducido = entrada.nextInt();
            
            for (int num1 = 1;num1 <= numeroIntroducido ;num1++) {
                

                if (num1 % 3 == 0){
                    System.out.println(num1);
                    salida = true;
                    num1 ++;
                }
               
   
            }
            
        } while (salida == false);
        
    }
    
}
