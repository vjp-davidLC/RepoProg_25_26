/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class test { // clase que se comprobará el uso de la creacion de los objetos
    
    // metodo que recoge el nombre introducido por el usuario
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombreEmpleado;
        
        System.out.println("Inserte el nombre del empleado :");
        nombreEmpleado = entrada.nextLine();
        
        return nombreEmpleado;
    }
    
    // metodo que recoge el numero de horas introducido por el usuario
    public static int pedirNumeroHoras() {
        Scanner entrada = new Scanner(System.in);
        int numeroHorasEmpleado;
        
        System.out.println("Inserte el numero de horas trabajadas :");
        numeroHorasEmpleado = entrada.nextInt();
        
        return numeroHorasEmpleado;
    }
    
    
    // metodo que recoge la tarifa introducida por el usuario
    public static float pedirTarifaEmpleado() {
        Scanner entrada = new Scanner(System.in);
        float tarifaEmpleado;
        
        System.out.println("Inserte la tarifa del empleado :");
        tarifaEmpleado = entrada.nextInt();
        
        return tarifaEmpleado;
    }
    
    // metodo que hace el calculo de tarifa correspondiente para cada empleado
    public static float calcularTarifa(float tarifaEmpleado, int numeroHoras) {
        
        float tarifaExtra = tarifaEmpleado * 1.5f; // la tarifa extra se cobra la tarifa normal y media tarifa normal
        float sueldoBruto;
        
        if (numeroHoras > 40) { // si supera las 40 horas
            int horasExtras = numeroHoras - 40; // se calcula esas horas extras
            sueldoBruto = (40 * tarifaEmpleado) + (horasExtras * tarifaExtra); // y se calcula el sueldo de esas horas trabajadas mas las horas extras
        } 
        else { // su no supera las 40 horas 
            sueldoBruto = tarifaEmpleado * numeroHoras; // el sueldo seria multiplicado por las horas trabajadas y la tarifa
        }
        
        return sueldoBruto;
    }
    
    public static void main(String[] args) {
        
        // creacion de objetos
        Empleado empleado1 = new Empleado(pedirNombre(),pedirNumeroHoras(), pedirTarifaEmpleado());
        Empleado empleado2 = new Empleado(pedirNombre(),pedirNumeroHoras(), pedirTarifaEmpleado());
        Empleado empleado3 = new Empleado(pedirNombre(),pedirNumeroHoras(), pedirTarifaEmpleado());
        
        // le pasamos por parametros al metodo calcularTarifa el numero de horas y su tarifa a traves de metodos get 
        System.out.println(empleado1.obtenerNombre()+" trabajo "+empleado1.obtenerNumeroHoras()+" horas, cobra"
                + empleado1.obtenerTarifa()+" euros la hora por lo que le corresponde un sueldo de "+calcularTarifa(empleado1.obtenerTarifa(), empleado1.obtenerNumeroHoras())+
                "euros.");
        
        System.out.println(empleado2.obtenerNombre()+" trabajo "+empleado2.obtenerNumeroHoras()+" horas, cobra"
                + empleado2.obtenerTarifa()+" euros la hora por lo que le corresponde un sueldo de "+calcularTarifa(empleado2.obtenerTarifa(), empleado2.obtenerNumeroHoras())+
                "euros.");
        
        System.out.println(empleado3.obtenerNombre()+" trabajo "+empleado3.obtenerNumeroHoras()+" horas, cobra"
                + empleado3.obtenerTarifa()+" euros la hora por lo que le corresponde un sueldo de "+calcularTarifa(empleado3.obtenerTarifa(), empleado3.obtenerNumeroHoras())+
                "euros.");
        

    }
}
