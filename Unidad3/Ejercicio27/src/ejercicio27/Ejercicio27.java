/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner entrada = new Scanner (System.in);
        boolean salida = true; // variable que controlará el bucle
        
        System.out.println("Introduce el primer numero -->");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero -->");
        num2 = entrada.nextInt();
            
        do { //usamos el bucle do while  ya que queremos que enseñe el menú de operaciones al menos 1 vez
            System.out.println("--- MENU DE OPERACIONES ---"); // menú de operaciones aritmeticas
            System.out.println("1.- Sumar los numeros.");
            System.out.println("2.- Restar los numeros.");
            System.out.println("3.- Multiplicar los numeros");
            System.out.println("4.- Dividir los numeros.");
            System.out.println("5.- Salir del programa.");
            
            System.out.println("Eliga cualquier operacion: ");
            int operacion = entrada.nextInt(); // le pedimos al usuario que eliga una de dichas operaciones
            
            switch (operacion) { // con el swicth hacemos una perfecta condicion para cada opcion que eliga el usuario
                case 1 -> { 
                        int suma = num1 + num2;
                        System.out.println("La suma es: "+suma);
                    }
                case 2 -> {
                        int resta = num1 - num2;
                        System.out.println("La resta es: "+resta);
                    }
                case 3 -> {
                        int producto = num1 * num2;
                        System.out.println("La multiplicacion es: "+producto);
                    }
                case 4 -> {
                        try { // excepcio de error para cuando el usuario haya introducio un 0 en el divisor
                            int division = num1 / num2;
                            System.out.println("La division es: "+division);
                        } 
                        catch (ArithmeticException e) {
                            System.out.println("Ha introducido un 0 en la parte del divisor.");
                        } 
                    }
                case 5 -> {

                    System.out.println("Salieno del programa.");
                    salida = false; // si el usuario introduce el numero 5 la variable salida cambiará de valor y se saldrá del programa
                    }
                default -> {
                    System.out.println("Te has equivocado de numero.");
                }
            }
            
        } while (salida); // si la variable salida sigue siendo true, seguirá ejecutandose el bucle.
        
        
    }
    
}
