/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Dia[] mes = new Dia[30]; // array bidimensional 4x7
        boolean salir = false; //  // booleano que controlará la salida del programa
        int opcion; // variable que recogerá la opcion dsel usuario
        
        do {            
            mostrarMenu();
            System.out.println("Inserte una opcion: ");
            opcion = entrada.nextInt(); // recogemos la opcion del usuario
            
             // swicth que seleccionará el método según lo que ek usuario haya elegido
            switch (opcion) {
                case 1:
                    // llamada al método
                    break; 
                case 2:
                     // llamada al método
                    break;
                case 3:
                    
                    break;
                case 4:
                     // llamada al método
                    break;       
                case 5:
                    System.out.println("Saliendo del programa...\n");
                    salir = true; // sale del programa
                    break;
                // si el usuario no inserta un numero del 1-5 sldrá el siguiente mensaje    
                default:
                    System.out.println("Tiene que insertar una opcion del 1-5.\n");
            }
            
        } while (!salir);

    }
    
    public static void mostrarMenu() {
    
        System.out.println("\n--- Temperatura de Abriñ ---");
        System.out.println("1. Rellenar las temperaturas de forma aleatoria.");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar las temperaturas media del mes.");
        System.out.println("4. Dia o dias mas calurosos del mes.");
        System.out.println("5. Salir del programa.\n");
        
    }
    
    
        public static void rellenarArray(Dia[] mes) {
        Scanner entrada = new Scanner(System.in);
        
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
// recorremos todos los indices del array y le asignamos en cada posicion un valor aleatorio
        for (int i = 0; i < mes.length; i++) {
            System.out.println("Inserte la temperatura de la semana "+(i+1)+" dia "+(j+1)+" --> ");
            mes[i] = entrada.nextInt(); // guardamos el valor segun lo que inserte el usuario en cada posicion del array
        }
    
    }
    
}
