/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author David López
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[3];
        boolean salir = false;
        int opcionUsuario;
        
        do {            
            
            mostrarMenu();
            
            System.out.println("Inserte una de las opciones --> ");
            opcionUsuario = entrada.nextInt();
            
            switch (opcionUsuario) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Error. Inserte una opcion de entre 1-5.");
            }
            
            
        } while (!salir);
        
        

    }
    
    public static void mostrarMenu() {
    
        System.out.println("-- BOLETIN DE LA CLASE --");
        System.out.println("1- Rellenar las notas de los alumnos.");
        System.out.println("2- Mostrar las notas introducidas.");
        System.out.println("3- Mostrar el mejor alumno de la clase");
        System.out.println("4- Mostrar alumno con mas suspensos.");
        System.out.println("5- Mostrar asignatura mas dificil.");
        
    }
    
}
