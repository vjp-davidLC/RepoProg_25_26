/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void calificacion(int nota) {
        
        if (nota >= 0 && nota<=4){
            System.out.println("Tu nota da SUSPENSO.");
        }
        else if (nota <=6){
            System.out.println("Tu nota da BIEN.");
        }
        else if (nota <=8){
            System.out.println("Tu nota da NOTABLE.");
        }
        else if (nota <= 10){
            System.out.println("Tu nota da SOBRESALIENTE.");
        }
        else {
            System.out.println("NOTA INCORRECTA");
        }
    }
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int nota;

        System.out.println("Inserte tu  nota -->");
        nota = entrada.nextInt();
        
        Ejercicio6.calificacion(nota);
        
    }
    
}
