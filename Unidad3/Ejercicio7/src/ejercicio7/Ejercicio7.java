/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int diasemana;
        boolean laborable = false;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Escribe el numero del dia de la semana -->");
        diasemana = entrada.nextInt();
        
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable=true;
                break;
            case 6:
            case 7: 
                laborable=false; 
        }
        
        if (laborable){
            System.out.println("Laboral.");
        }
        else {
            System.out.println("No laboral.");
        }
    }
    
}
