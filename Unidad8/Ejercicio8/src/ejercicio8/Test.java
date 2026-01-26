/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array de tipo Asignaturas con una longitud de 6 posiciones
        Asignaturas[] boletin = new Asignaturas[6];

        boletin[0] = new Asignaturas("Programacion");
        boletin[1]  = new Asignaturas("Lenguajes de Marca");
        boletin[2]  = new Asignaturas("Base de Datos");
        boletin[3]  = new Asignaturas("Entornos de Desarrollo");
        boletin[4]  = new Asignaturas("Sistemas Informaticos");
        boletin[5]  = new Asignaturas("Formacion y Orientacion Laboral");
        
        rellenarArray(boletin);
        
        System.out.println("Su nota media del curso es: "+mostrarMedia(boletin));
        
    }
    
    public static void rellenarArray(Asignaturas[] boletin) {
        Scanner entrada = new Scanner(System.in);
        float nota = 0;
        
        for (int i = 0; i < boletin.length; i++) {
            
            if (boletin[i] != null) {
                System.out.println("Introduce la nota de "+boletin[i].getNombre()+": ");
                nota = entrada.nextFloat();
                boletin[i].setNota(nota); 
            }
            
        }
    
    }
    
    public static float mostrarMedia(Asignaturas[] boletin) {
        
        float suma = 0;
        float media = 0;
        
        for (int i = 0; i < boletin.length; i++) {
            suma += boletin[i].getNota();
        }
        
        media = suma / boletin.length;
        
        return media;
    
    }
    
}
