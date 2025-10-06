/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, num3, num4;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("POr favor, introduca el primer numero --> ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero --> ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero --> ");
        num3 = entrada.nextInt();
        
        System.out.println("Por último, introduzca un cuarto numero --> ");
        num4 = entrada.nextInt();
        
        if (num1 > num2){
            num2 = num1;
        }
        else if (num2 > num3){
            num3 = num2;
        }
        else if (num3 > num4){
            num4 = num3;
        }
        
        
    }
    
}
