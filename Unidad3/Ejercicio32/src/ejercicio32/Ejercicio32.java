/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int annoActual, mesActual, diaActual;
        int annoNacimnt, mesNacimnt, diaNacimnt;
        
        System.out.println("Introduzca el anho actual --> ");
        annoActual = entrada.nextInt();
        System.out.println("Introduzca el mes actual --> ");
        mesActual = entrada.nextInt();
        System.out.println("Introduzca el dia actual --> ");
        diaActual = entrada.nextInt();
        System.out.println("Ahora, introduzca su anho de nacimiento --> ");
        annoNacimnt = entrada.nextInt();
        System.out.println("Introduzca su mes de nacimiento --> ");
        mesNacimnt = entrada.nextInt();
        System.out.println("Por ultimo introduzca su dia de nacimiento --> ");
        diaNacimnt = entrada.nextInt();
        
        int annoEdad = annoActual - annoNacimnt;
        int mesEdad = mesActual - mesNacimnt;
        int diaEdad = diaActual - diaNacimnt;
        
        if(diaEdad < 0){ // si el dia sale negativo
            diaEdad += 30; 
            mesEdad -= 1;
        }

        if(mesEdad < 0){ // si el mes sale negativo
            mesEdad += 12;
            annoEdad -= 1;
        }
        
        System.out.println("Su edad exacta es de "+annoEdad+" anhos, "+mesEdad+" meses y "+diaEdad+" dias.");
        
    }
    
}
