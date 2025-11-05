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
     * @return 
     */
    
    public static String juegoUsuario() {
    
        Scanner entrada = new Scanner (System.in);
        String opcionUsuario;
        
        // Se lee lo que el usuario escribe y se pasa todo a minúsculas
        opcionUsuario = entrada.nextLine().toLowerCase();
        
        // Se devuelve la palabra que ha introducido el usuario
        return opcionUsuario;
        
    }
    
    public static void caraOcruz() {
    
        
        String opcionUsuario;
        int cara = 0;
        int cruz = 1;
        boolean acierto = false;
        
        // Bucle que se repetirá hasta que el usuario acierte
        do {    
            
            System.out.println("Cara o cruz? --> ");
            // Llamamos al método que pide la opción del usuario
            opcionUsuario = juegoUsuario();
            
            // Generamos un número aleatorio entre 0 y 1 (0 = cara, 1 = cruz)
            int random = (int)Math.floor(Math.random()* 2);
            
            // con un switch tambien se podria hacer esas siguiente condicion
            // Si el usuario ha elegido "cara"
            if (opcionUsuario.equals("cara")){
                
                // Comprobamos si el número aleatorio también fue 0 (cara)
                if (random == cara) {
                    System.out.println("HAS ACERTADO.");
                    
                    // El usuario acierta, el bucle se detendrá
                    acierto = true;
                }
                else {
                    System.out.println("HAS PERDIDO");
                }
            }
            
            // Si el usuario ha elegido "cruz"
            else if (opcionUsuario.equals("cruz")) {
                
                // Comprobamos si el número aleatorio fue 1 (cruz)
                if (random == cruz){
                    System.out.println("HAS ACERTADO.");
                    acierto = true;
                }
                else {
                    System.out.println("HAS PERDIDO");
                }
            }
            
            // Si el usuario escribe algo distinto de "cara" o "cruz"
            else {
                System.out.println("Entrada no válida. Escribe 'cara' o 'cruz'.");
            }
            
            
        } while (!acierto);
        
        
        
    
    }
    
    public static void main(String[] args) {
        
        System.out.println("---- JUEGO DE LA MONEDA ----");
        
        // Llamamos al método que contiene el juego
        caraOcruz();
        
    }
    
}
