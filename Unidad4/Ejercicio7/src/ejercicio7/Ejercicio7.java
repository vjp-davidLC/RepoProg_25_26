/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    
    public static void ordenado(int num1, int num2, int num3, int num4) {
        
        int temp;
        
        if (num1 > num2){     // --> si el num1 uno es mayor que num2 entonces se intercambia las posiciones
            temp = num1;
            num1 = num2;
            num2 = temp;
        } 
        if (num2 > num3){    // --> si el num2 uno es mayor que num3 entonces se intercambia las posiciones
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num3 > num4){   // --> si el num3 uno es mayor que num4 entonces se intercambia las posiciones
            temp = num3;
            num3 = num4;
            num4 = temp;
        }
        
        // Para asegurar el orden correcto
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num3 > num4){
            temp = num3;
            num3 = num4;
            num4 = temp;
        }
        
        // Tercera pasada
        
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num3 > num4){
            temp = num3;
            num3 = num4;
            num4 = temp;
        }
        
        System.out.println("El orden de los numeros introducidos es el "+num1+" - "+num2+" - "+num3+" - "+num4);
        
    
    }
    
    public static void main(String[] args) {
        
        int num1, num2, num3, num4; // variables donde se alamcenará los numeros insertados
        
        
        Scanner entrada = new Scanner(System.in); // variable que pide al usuario que inserte un numero
        
        System.out.println("Por favor, introduzca el primer numero --> ");
        num1 = entrada.nextInt(); // primer numero
        
        System.out.println("Ahora, introduzca un segundo numero --> ");
        num2 = entrada.nextInt(); // segundo  numero
        
        System.out.println("Introduzca el tercer numero --> ");
        num3 = entrada.nextInt(); // tercer numero
        
        System.out.println("Por ultimo, introduzca un cuarto numero --> ");
        num4 = entrada.nextInt(); // curato numero
        
        Ejercicio7.ordenado(num1, num2, num3, num4);
        
    }
    
}
