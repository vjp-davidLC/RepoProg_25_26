/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        System.out.println("Escribe tu nombre : ");
        nombre = entrada.nextLine();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("--> "+nombre);
        }
    }
    
}
