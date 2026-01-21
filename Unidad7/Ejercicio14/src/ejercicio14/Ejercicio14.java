/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    // variables constantes
    public static final int FILA = 4; 
    public static final int COLUM = 7;
    
    // programa principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mes = new int[FILA][COLUM]; // array bidimensional 4x7
        boolean salir = false; //  // booleano que controlará la salida del programa
        int opcion; // variable que recogerá la opcion dsel usuario
        
        do {            
            mostrarMenu(); // llamada al método mostrar el menu
            System.out.println("Inserte una opcion: ");
            opcion = entrada.nextInt(); // recogemos la opcion del usuario
            
            // swicth que seleccionará el método según lo que ek usuario haya elegido
            switch (opcion) {
                case 1:
                    rellenarArray(mes);// llamada al método
                    break; 
                case 2:
                    mostrarArray(mes); // llamada al método
                    break;
                case 3:
                    System.out.println("\n La media de temperatura del mes es de --> "+mediaTempMes(mes));
                    break;
                case 4:
                    diasGradosMayor(mes); // llamada al método
                    break;       
                case 5:
                    System.out.println("Saliendo del programa...\n");
                    salir = true; // sale del programa
                    break;
                // si el usuario no inserta un numero del 1-5 sldrá el siguiente mensaje    
                default:
                    System.out.println("Tiene que insertar una opcion del 1-5.\n");
            }
            
        } while (!salir);// mientras que el boolean salir sea false se repetirá el bucle

    }

    public static void mostrarMenu() {
    
        System.out.println("\n--- Temperatura de Febrero ---");
        System.out.println("1. Rellenar las temperaturas.");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar las temperaturas media del mes.");
        System.out.println("4. Dia o dias mas calurosos del mes.");
        System.out.println("5. Salir del programa.\n");
        
    }
    
    public static void rellenarArray(int[][] array) {
        Scanner entrada = new Scanner(System.in);
        // recorremos todos los indices del array y le asignamos en cada posicion un valor aleatorio
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Inserte la temperatura de la semana "+(i+1)+" dia "+(j+1)+" --> ");
                array[i][j] = entrada.nextInt(); // guardamos el valor segun lo que inserte el usuario en cada posicion del array
            }
        }
    
    }
    
    public static void mostrarArray(int[][] array) {
        // recorremos todos los indices del array y mostramos su valor
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Semana "+(i+1)+" dia "+(j+1)+" temp : "+array[i][j]);
            }
        }
    
    }
    
    // método que calcula la media de grados al mes
    public static float mediaTempMes(int[][] array) {
    
        float mediaTem;
        float totalTemp = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                totalTemp += (float) array[i][j]; // guardamos la suma total de los grados en una variable
                
            }
        }
    
        mediaTem = totalTemp / 28; // dividimos la suma total entre los dias del mes
        
        return mediaTem; // devuelve la media en un numero con decimales
        
    }
    
    // método que saca el mayor de los grados de todos los dias
    public static int gradosMayor(int[][] array) {
    
        int gradosMayor = array[0][0]; // empieza con el primer valor
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                if (array[i][j] > gradosMayor) {
                    gradosMayor = array[i][j]; // actualizar si encontramos un valor mayor
                }
                
            }
        }
    
        return gradosMayor; // devuelve el mayor de los grados
        
    }
    
    // método que devuelve la semana y el dia que tenga el mismo valor que nos devuelva el método anterior
    public static void diasGradosMayor(int[][] array) {
        // array con los dias de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
         int mayor = gradosMayor(array); // guardamos el mayor de los grados
        
        System.out.println(" El dia o dias mas calurosos fueron:");
        // recorremos todos los indices del array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                if (mayor == array[i][j]) { // si el mayor de los grados es igual a uno de los valores del array lo muestra
                    System.out.println("El "+diasSemana[j]+" de la Semana "+(i+1)+" con "+mayor);
                }
                // "diasSemana[j]" segun la posicion que tenga [j] mostrará el valor en el array diasSemana[]
            }
        }

    
    }
    
}
