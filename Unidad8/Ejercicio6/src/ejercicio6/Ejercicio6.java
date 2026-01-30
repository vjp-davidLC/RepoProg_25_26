/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numEmpleados = pedirNumEmpleados();
        
        Empleado[] empleados = new Empleado[numEmpleados];
        
        pedirAtributos(empleados);
        
        calcularSueldo(empleados);

    }
    
    public static int pedirNumEmpleados() {
        Scanner entrada = new Scanner(System.in);
        int numEmpleados;
        
        System.out.println("Cuantos empleado desea introducir?");
        numEmpleados = entrada.nextInt();
        
        
        return numEmpleados;
    }
    
    public static void pedirAtributos(Empleado[] empleados) {
        Scanner entrada = new Scanner(System.in);
        int numeroHoras;
        float tarifa;
        
        for (int i = 0; i < empleados.length; i++) {
            
            empleados[i] = new Empleado(); // creacion de los objetos
            
            if (empleados[i] != null) {
                System.out.println("-- EMPLEADO "+(i+1)+" --");

                
                System.out.println("Introduzca el nombre del empleado:");
                empleados[i].setNombre(entrada.nextLine());

                System.out.println("Cuanntas horas trabajo este mes?");
                numeroHoras = Integer.parseInt(entrada.nextLine());
                empleados[i].setNumeroHoras(numeroHoras);

                System.out.println("Cual es su tarifa por hora de trabajo? ");
                tarifa = Integer.parseInt(entrada.nextLine());
                empleados[i].setTarifa(tarifa);
                
                System.out.println("-- EMPLEADO "+(i+1)+" ALMACENADO CON EXITO --\n");
                
            } /** recogemos lo que introduzca el usuario con el metodo entrada.nextLine() para que 
             * convirtamos manualmento a numero y no tengamos que limpiar el buffer
             */
        }
        
    }
    
    // método que calcula la tarifa total de cada empleado recorriendo el array
    public static void calcularSueldo(Empleado[] empleados) {
        float sueldoBruto = 0; // inicializamos el sueldo bruto en 0
        float tarifaExtra; // variable que recogerá la tarifa extra de cada empleado
        int horasExtras;
        
            // recorremos el array 
            for (int i = 0; i < empleados.length; i++) {
                tarifaExtra = empleados[i].getTarifa() * 1.5f; // calculamos y asignamos el valor de tarifa extra para cada empleado 
                
               if (empleados[i].getNumeroHoras() > 40) { // si supera las 40 horas
                    horasExtras = empleados[i].getNumeroHoras() - 40; // se calcula esas horas extras
                    sueldoBruto = (40 * empleados[i].getTarifa()) + (horasExtras * tarifaExtra); // y se calcula el sueldo de esas horas trabajadas mas las horas extras
                } 
                else { // si no supera las 40 horas 
                    sueldoBruto = empleados[i].getTarifa() * empleados[i].getNumeroHoras(); // el sueldo seria multiplicado por las horas trabajadas y la tarifa
                } 
                
               System.out.println(empleados[i].getNombre()+" trabajo "+empleados[i].getNumeroHoras()+" horas,"
                    + " cobra "+empleados[i].getTarifa()+" euros la hora por lo que corresponde un sueldo de "+sueldoBruto);
               
            }
            
    }
    
}
