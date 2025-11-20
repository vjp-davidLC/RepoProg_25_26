/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicio9 { // TEST

    /**
     * @return 
     */
    
    public static int pedirNumero() {
    
        Scanner entrada = new Scanner (System.in);
        
        int numeroUsuario;
        
        System.out.println("Inserta un numero: ");
        numeroUsuario = entrada.nextInt();
                
        return numeroUsuario;
        
    }
    
    public static void numeroMayor(int num1, int num2, int num3) {
    
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es el "+num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("El numero mayor es el "+num2);
        }
        else {
            System.out.println("El numero mayor es el "+num3);
        }
    
    }
    
    public static void main(String[] args) {
        
        System.out.println("-- Primer numero -- ");
        int num1 = pedirNumero();
        System.out.println("-- Segundo numero -- ");
        int num2 = pedirNumero();
        System.out.println("-- Tercer numero -- ");
        int num3 = pedirNumero();
       
       Numero numeroUsuario1 = new Numero();
       Numero numeroUsuario2 = new Numero();
       Numero numeroUsuario3 = new Numero();
       
       numeroUsuario1.establecerValor(num1);
       numeroUsuario2.establecerValor(num2);
       numeroUsuario3.establecerValor(num3);
       
        numeroMayor(numeroUsuario1.obtenerValor(), numeroUsuario2.obtenerValor(), numeroUsuario3.obtenerValor());
       
    }
    
}
