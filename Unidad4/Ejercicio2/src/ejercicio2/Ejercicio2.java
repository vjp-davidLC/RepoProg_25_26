/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un numero --> ");
        num1 = entrada.nextInt();
        System.out.println("Por favor, introduzca un segundo  numero --> ");
        num2 = entrada.nextInt();
    
        if (num1 > 10){
            Producto.multiplicacion(num1, num2);

        }
        else {
            Suma.sumaNumeros(num1, num2);
        }
    }
    
}
