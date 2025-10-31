/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        String diaIntroducido;
        
        System.out.println("Por favor, introduzca un dia de la semana: ");
        diaIntroducido = entrada.nextLine();
        
        switch (diaIntroducido) {
            case "Lunes" :
            case "lunes" :
                System.out.println("El Lunes es el primer dia de la semana.");
                break;
            case "Martes":
            case "martes":
                System.out.println("El Martes es el segundo dia de la semana.");
                break;
            case "Miercoles":
            case "miercoles":
                System.out.println("El Miercoles es el tercer dia de la semana.");
                break;
            case "Jueves":
            case "jueves":
                System.out.println("El Jueves es el cuarto dia de la semana.");
                break;
            case "Viernes":
            case "viernes":
                System.out.println("El Viernes es el quinto dia de la semana.");
                break;
            case "Sabado":
            case "sabado":
                System.out.println("El Sabado es el sexto dia de la semana.");
                break;
            case "Domingo":
            case "domingo":
                System.out.println("El Domingo es el septimo dia de la semana.");
                break;
            default:
                System.out.println("Dia de la semana INCORRECTO.");
        }
    }
    
}
