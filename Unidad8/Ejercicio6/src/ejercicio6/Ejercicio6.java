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
            } /** recogemos lo que introduzca el usuairo con el metodo entrada.nextLine() para que 
             * convirtamos manualmento a numero y no tengamos que limpiar el buffer
             */
        }
        
    }
    
    
    
}
