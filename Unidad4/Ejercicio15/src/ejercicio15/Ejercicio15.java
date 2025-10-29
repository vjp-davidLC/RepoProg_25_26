/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio15 {

/**
* @param args the command line arguments
*/
    // metodo que pide un primer numero
    public static int pedirPrimerNumero() { 
        
        Scanner entrada = new Scanner (System.in);
        int num1;
        
        System.out.println("Inserte un numero --> ");
        num1 = entrada.nextInt();
       
        return num1;
        
    }
    // metodo que pide un segundo numero
    public static int pedirSegundoNumero() {
        
        Scanner entrada = new Scanner (System.in);
        int num2;
        
        System.out.println("Inserte un segundo numero --> ");
        num2 = entrada.nextInt();
        
        return num2;
    }
    
    // metodo que invoca el porgrama de la calculadora
    public static void Calculadora() {
        
        Scanner entrada = new Scanner (System.in);
        boolean salida = false; // Controla si el usuario quiere salir
        int opcion;
        
        int num1 = pedirPrimerNumero();
        int num2 = pedirSegundoNumero();
        
        do {
            // Mostramos el menú
            System.out.println("-- PROGRAMA CALCULADORA --");
            System.out.println("1.- Sumar los numeros.");
            System.out.println("2.- Restar los numeros");
            System.out.println("3.- Multiplicar los numeros.");
            System.out.println("4.- Dividir los numeros.");
            System.out.println("5.- Salir del programa.");
            
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                
                case 1:
                    
                    int suma = num1 + num2;
                    System.out.println(+num1+ " + "+num2+" = "+suma);
                    System.out.println("---------------------------");
                    break;
                    
                case 2:
                    
                    int resta = num1 - num2;
                    System.out.println(+num1+ " - "+num2+" = "+resta);
                    System.out.println("---------------------------");
                    break;
                    
                case 3:
                    
                    int producto = num1 * num2;
                    System.out.println(+num1+ " x "+num2+" = "+producto);
                    System.out.println("---------------------------");
                    break;
                    
                case 4:
                    
                    boolean divisionCorrecta = false;
                    do {
                        // Intentamos dividir
                        try {
                            int division = num1 / num2;
                            System.out.println(+num1+ " / "+num2+" = "+division);
                            System.out.println("---------------------------");
                            divisionCorrecta = true; // Division exitosa
                            
                        } catch (ArithmeticException e) {
                            // Error: divisor = 0
                            System.out.println("ERROR");
                            System.out.println("Estas intentando dividir un numero entre 0");
                            num2 = pedirSegundoNumero(); // volvemos a pedirlo
                        }
                    }while (!divisionCorrecta);
                    // Una vez terminada la division correctamente, vuelve al menu
                    break;
                    
                case 5:
                    
                    System.out.println("SALIENDO DEL PROGRAMA ...");
                    salida = true;
                    break;
                    
                default:
                    System.out.println("Has introducido un numero INCORRECTO.");
            }
        } while (!salida); // Repite hasta que el usuario elija salir
        
    }
    
    // metodo principal
    public static void main(String[] args) {
        // llamamos a programa de calculadora
        Calculadora();

    }
    
}
