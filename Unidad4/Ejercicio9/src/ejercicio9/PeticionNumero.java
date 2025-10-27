/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class PeticionNumero {
    
    public static int peticionNumer (){
    
        Scanner entrada = new Scanner (System.in);
        int numero;
        
        System.out.println("Inserte un numero --> ");
        numero = entrada.nextInt();
        
        return numero;
    }
    
    
}
