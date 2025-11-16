/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Test {
    
    // metodo que recoge el nombre del alumno insertado por el usuario
    public static String pedirNombre() {
    
        Scanner entrada = new Scanner(System.in);
        String nombreAlumno;
        
        System.out.println("Establezca el nombre del alumno :");
        nombreAlumno = entrada.nextLine();
        
        return nombreAlumno;
    }
    
    // metodo que recoge la nota del alumno que el usuario inserta por teclado evaluando que no sea menor que cero ni mayor que 10
    public static int pedirNota() {
    
        Scanner entrada = new Scanner(System.in);
        int notaAlumno;
        boolean correcto = false;
        
        System.out.println("Establezca la nota del alumno :");
        
        // bucle que vuelve a pedir al usuario si la nota que ha insertado es menor que cero o mayor que 10
        do{
            
            notaAlumno = entrada.nextInt();
            
            if (notaAlumno >= 0 && notaAlumno <= 10) {
                correcto = true;
            }
            else {
                System.out.println("Vuelve a insetar la nota :");
            }
        }
        while(!correcto);
        
        return notaAlumno;
    }
    
    
    public static void main(String[] args) {
        
        // creacion del objeto pasandole el nombre por parámetro
        Alumno alumno1 = new Alumno(pedirNombre());
        // establecemos la nota con el metodo set
        alumno1.establecerNota(pedirNota());
        // usamos este metodo para que nos diga la calificacion de la nota insrtada por el usuario
        alumno1.obtenerCalificacion(alumno1.obtenerNota());
        
        Alumno alumno2 = new Alumno(pedirNombre());
        alumno2.establecerNota(pedirNota());
        alumno2.obtenerCalificacion(alumno2.obtenerNota());
        
        Alumno alumno3 = new Alumno(pedirNombre());
        alumno3.establecerNota(pedirNota());
        alumno3.obtenerCalificacion(alumno3.obtenerNota());
        
        
        
    }
}
