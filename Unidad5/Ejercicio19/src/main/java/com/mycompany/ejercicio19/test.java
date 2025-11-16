/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Miguel Ángel
 */
public class test {
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombreEmpleado;
        
        System.out.println("Inserte el nombre del empleado :");
        nombreEmpleado = entrada.nextLine();
        
        return nombreEmpleado;
    }
    
    public static int pedirNumeroHoras() {
        Scanner entrada = new Scanner(System.in);
        int numeroHorasEmpleado;
        
        System.out.println("Inserte el numero de horas trabajadas :");
        numeroHorasEmpleado = entrada.nextInt();
        
        return numeroHorasEmpleado;
    }
    
    public static float pedirTarifaEmpleado() {
        Scanner entrada = new Scanner(System.in);
        int tarifaEmpleado;
        
        System.out.println("Inserte el numero de horas trabajadas :");
        tarifaEmpleado = entrada.nextInt();
        
        return tarifaEmpleado;
    }
    
    public static void calcularTarifa
    
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(pedirNombre(),pedirNumeroHoras(), pedirTarifaEmpleado());
        Empleado empleado2 = new Empleado(pedirNombre(),pedirNumeroHoras(), pedirTarifaEmpleado());
        Empleado empleado3 = new Empleado(pedirNombre(),pedirNumeroHoras(), pedirTarifaEmpleado());
        

    }
}
