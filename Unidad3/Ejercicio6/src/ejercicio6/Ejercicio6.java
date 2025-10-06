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
     */
    public static void main(String[] args) {
       
        int nota;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la nota del alumno --> ");
        nota = entrada.nextInt();
        
        if (nota <= 4){
            System.out.println("La nota es suspenso.");
        }
        else if (nota == 5 || nota == 6){
            System.out.println("La nota es Bien.");
        }
        else if (nota == 7 || nota == 8){
            System.out.println("La nota es Notable.");
        }
        else if (nota == 9 || nota == 10){
            System.out.println("La nota es Sobresaliente");
        }
        else {
            System.out.println("La nota introducida es incorrecta.");
        }
    }
    
}
