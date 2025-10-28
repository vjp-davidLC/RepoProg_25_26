/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticion;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class peticionNumero {
    
    public static int peticionNumero(){
    
        Scanner entrada = new Scanner (System.in);
        int numero;
        
        System.out.println("Inserte un numero --> ");
        numero = entrada.nextInt();
        
        while (numero <0) {            
            System.out.println("Has insertado un numero negativo. Vuelve a insertar otro numero --> ");
            numero = entrada.nextInt();
        }
        
        return numero;
    }
    
}
