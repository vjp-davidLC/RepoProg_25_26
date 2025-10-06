/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num;
        
        Scanner entrada = new Scanner (System.in); // variable que recoge lo que el usuario introduzca
        
        System.out.println("Por favor, introduzca un numero de 4 cifras --> "); 
        num = entrada.nextLine(); // variable que contiene el numero de 4 cifras
        System.out.println("El numero introducido es: "+num);
        System.out.println("La primera cifra es: "+num.charAt(0)); // lo que hace num.charAt(0) coge la primera posicion del contenido de la variable num.
        System.out.println("La primera cifra es: "+num.charAt(1));
        System.out.println("La primera cifra es: "+num.charAt(2));
        System.out.println("La primera cifra es: "+num.charAt(3));
        
    }
    
}
