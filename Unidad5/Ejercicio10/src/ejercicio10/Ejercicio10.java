/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicio10 {

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
    
    public static void menorAMayor(int num1, int num2, int num3, int num4) {
        
        int aux;
        
        for (int i = 0; i < 3; i++) {
            
            if (num1 > num2){
                aux = num2;
                num2 = num1;
                num1 = aux;
            }

            if (num2 > num3) {
                aux = num3;
                num3 = num2;
                num2 = aux;
            }
            if (num3 > num4) {
                aux = num4;
                num4 = num3;
                num3 = aux;
            }
        }
        
        System.out.println("De menor a mayor --> "+num1+ " < "+num2+" < "+num3+" < "+num4);
        
    }
    
    public static void main(String[] args) {

        System.out.println("-- Primer numero -- ");
        int num1 = pedirNumero();
        System.out.println("-- Segundo numero -- ");
        int num2 = pedirNumero();
        System.out.println("-- Tercer numero -- ");
        int num3 = pedirNumero();
        System.out.println("-- Cuarto numero -- ");
        int num4 = pedirNumero();
       
       Numero numeroUsuario1 = new Numero();
       Numero numeroUsuario2 = new Numero();
       Numero numeroUsuario3 = new Numero();
       Numero numeroUsuario4 = new Numero();
       
       numeroUsuario1.establecerValor(num1);
       numeroUsuario2.establecerValor(num2);
       numeroUsuario3.establecerValor(num3);
       numeroUsuario4.establecerValor(num4);
       
        menorAMayor(numeroUsuario1.obtenerValor(), numeroUsuario2.obtenerValor(), numeroUsuario3.obtenerValor(), numeroUsuario4.obtenerValor());
       
    }
    
}
