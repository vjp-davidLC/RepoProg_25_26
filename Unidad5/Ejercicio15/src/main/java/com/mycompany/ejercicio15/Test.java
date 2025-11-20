/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15;

/**
 *
 * @author David López
 */
public class Test { // TEST
    
    // metodo que muestra los datos de los empleados con su direccion, le pasamos por parámetros los empleados
    public static void mostrarDatosEmpleados(Empleado em1, Empleado em2, Empleado em3) {
    System.out.println("EMPLEADO 1:");
    System.out.println(em1);
    System.out.println();

    System.out.println("EMPLEADO 2:");
    System.out.println(em2);
    System.out.println();

    System.out.println("EMPLEADO 3:");
    System.out.println(em3);
    System.out.println();
}
    // metodo main donde se construye los objetos con sus clases pasandoles los datos por parámetro
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Los Arces", 27, 3,"Lisboa");
        Direccion direccion2 = new Direccion("Avenida del Horizonte", 142,12,"Ciudad Real");
        Direccion direccion3 = new Direccion("Pasaje del cometa", 9, 1, "Burgos");

        Empleado empleado1 = new Empleado("Lucas", 1350, direccion2);
        Empleado empleado2 = new Empleado("David", 1900, direccion1);
        Empleado empleado3 = new Empleado("Maria",1460, direccion3);

        mostrarDatosEmpleados(empleado1, empleado2, empleado3);
        
    }
}
