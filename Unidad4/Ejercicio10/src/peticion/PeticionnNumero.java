/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticion;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PeticionnNumero {
        
        public static int peticionNumero (){
    
        Scanner entrada = new Scanner (System.in);
        int numero;
        
        System.out.println("Inserte un numero --> ");
        numero = entrada.nextInt();
        
        return numero;
    }
        
}
