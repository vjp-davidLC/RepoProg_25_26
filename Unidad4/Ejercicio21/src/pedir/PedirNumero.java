/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedir;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class PedirNumero {
    
    
    public static int pedirNumero() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte un numero --> ");
        int num = entrada.nextInt();
        
        return num;
    }
    
}
