/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int notaUsuario = 0; // Variable que almacenará la nota total del usuario
        String respuestaUsuario; // Variable para guardar la respuesta que escriba el usuario
        String respuestaPrimera = "Madrid"; // Respuesta correcta a la primera pregunta
        String respuestaSegunda = "Colon"; // Respuesta correcta a la segunda pregunta
        
        System.out.println("-- EXAMEN DE CULTURA GENERAL --");
        
        // ---------------- PRIMERA PREGUNTA ----------------
        System.out.println("1- PREGUNTA: Cual es la capital de Espanha?");
        respuestaUsuario = entrada.nextLine(); // Leemos la respuesta del usuario
        
        // Comprobamos si la respuesta del usuario es igual a la correcta (ignorando mayúsculas y minúsculas)
         if (respuestaUsuario.equalsIgnoreCase(respuestaPrimera)){
         
             System.out.println("Muy bien, respuesta correcta!");
             notaUsuario += 50; // Suma 50 puntos a la nota
         }
         else {
         
             System.out.println("No es correcto. La respuesta correcta es "+respuestaPrimera);
         }
         
         // ---------------- SEGUNDA PREGUNTA ----------------
        System.out.println("2- PREGUNTA: Quien descubrio America?");
        respuestaUsuario = entrada.nextLine();
         if (respuestaUsuario.equalsIgnoreCase(respuestaSegunda)){
         
             System.out.println("Muy bien, respuesta correcta!");
             notaUsuario += 50;
         }
         else {
         
             System.out.println("No es correcto. La respuesta correcta es "+respuestaSegunda);
         }
         // ---------------- RESULTADO FINAL ----------------
         System.out.println("NOTA DEL EXAMEN --> "+notaUsuario);
    }
    
}
