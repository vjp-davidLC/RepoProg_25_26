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
        int notaUsuario = 0;
        String respuestaUsuario;
        String respuestaPrimera = "Madrid";
        String respuestaSegunda = "Colon";
        
        System.out.println("-- EXAMEN DE CULTURA GENERAL --");
        System.out.println("1- PREGUNTA: Cual es la capital de Espanha?");
        respuestaUsuario = entrada.nextLine();
         if (respuestaUsuario.equalsIgnoreCase(respuestaPrimera)){
         
             System.out.println("Muy bien, respuesta correcta");
             notaUsuario += 50;
         }
         else {
         
             System.out.println("No es correcto. La respuesta correcta es "+respuestaPrimera);
         }
         
        System.out.println("2- PREGUNTA: Quien descubrio America?");
        respuestaUsuario = entrada.nextLine();
         if (respuestaUsuario.equalsIgnoreCase(respuestaSegunda)){
         
             System.out.println("Muy bien, respuesta correcta");
             notaUsuario += 50;
         }
         else {
         
             System.out.println("No es correcto. La respuesta correcta es "+respuestaSegunda);
         }
         
         System.out.println("NOTA DEL EXAMEN --> "+notaUsuario);
    }
    
}
