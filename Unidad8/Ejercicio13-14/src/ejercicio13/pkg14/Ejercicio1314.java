/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.pkg14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio1314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[5];
        
        boolean salir = false; // boolean que controlará el bucle do-while
        int opcionUsuario; // variable que recogerá la opcion del usuario
        
        do {            
            
            mostrarMenu(); // llamada al método 
            
            System.out.println("Inserte una de las opciones --> ");
            opcionUsuario = entrada.nextInt(); // recoge lo que el usuariointroduzca
            
            switch (opcionUsuario) {
                case 1:
                    rellenarPosicion(alumnos);// rellena el array
                    break;
                case 2:
                    mostrarVector(alumnos);// muestra los datos del array
                    break;
                case 3:
                    mostrarAlumnNotaDada(alumnos);// muestra los alunmos dado una nota media
                    break;
                case 4:
                    mostrarAlumnSuspensos(alumnos);// muestra los alumnos suspensos
                    break;
                case 5:
                    buscarAlumno(alumnos); // busca si dado un nombre esta en el array
                    break;
                case 6:
                    System.out.println("\nSaliendo del programa...");
                    salir = true; // sale del bucle 
                    break;
                default:
                    System.out.println("Error. Inserte una opcion de entre 1-6.");
            }
            
            
        } while (!salir); // mientras el boolean salir sea false no sale del bucle

    }
    
    // método que muestra el menú
    public static void mostrarMenu() {
    
        System.out.println("-- BOLETIN DE LA CLASE --");
        System.out.println("1- Rellenar un alumno");
        System.out.println("2- Mostrar vector de alumnos.");
        System.out.println("3- Mostrar alumnos con nota media por encima de una nota dada.");
        System.out.println("4- Mostrar cuantos alumnos hay con la nota media suspensa.");
        System.out.println("5- Buscar alumnos.");
        System.out.println("6- Salir del programa.");
        System.out.println("------------------------");
        
    }
    
    // método que pide un nombre
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombreAlumno;
        
        System.out.println("\nInserte un nombre para el alumno: ");
        nombreAlumno = entrada.nextLine();
        
        return nombreAlumno;
    
    }
    
    // método que pide una edad
    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        int edadAlumno;
        
        System.out.println("Inserte la edad del alumno: ");
        edadAlumno = entrada.nextInt();
        
        return edadAlumno;
    
    }
    
    // método que pide una nota media
    public static float pedirNotaMedia() {
        Scanner entrada = new Scanner(System.in);
        float notaMediaAlumno;
        
        System.out.println("Inserte la nota media del alumno: ");
        notaMediaAlumno = entrada.nextFloat();
        
        return notaMediaAlumno;
    
    }
        
    // método que rellena el array de alumnos pidiendo la posicion al usuario
    public static void rellenarPosicion(Alumno[] alumnos) {
        
        Scanner entrada = new Scanner(System.in);
        int posicionUsuario; //recoge una posicion dado el usuario
        boolean posicionValida = false; // boolean que controlará el bucle 
        
            
            do {   
                    System.out.println("\nInserte una posicion: ");
                    posicionUsuario = entrada.nextInt(); // recoge lo que introduzca el usuario
                    
                    // Validar si la posicion esta dentro del rango
                    if (posicionUsuario < 0 || posicionUsuario >= alumnos.length) {
                        System.out.println("Posicion fuera de rango.");
                    } 
                    
                    // Validar si está ocupada
                    else if (alumnos[posicionUsuario] != null) {
                        System.out.println("\nLa posicion "+posicionUsuario+" esta ocupada.");
                    }
                    
                    // Posición correcta y libre. Rellenamos la posicion
                    else{
                        System.out.println("\nLa posicion "+posicionUsuario+" no esta ocupada.");
                        alumnos[posicionUsuario] = new Alumno(); // crea un objeto en la posicion 

                        alumnos[posicionUsuario].setNombre(pedirNombre()); // recoge un nombre y lo inserta como valor al atributo nombre
                        alumnos[posicionUsuario].setEdad(pedirEdad()); // recoge una edad y lo inserta como valor al atributo edad
                        alumnos[posicionUsuario].setNotaMedia(pedirNotaMedia()); // recoge una nota media y lo inserta como valor al atributo notaMedia
                        System.out.println("\nAlumno insertado correctamente.\n");
                        posicionValida = true; // sale del bucle
                    }
                
            } while (!posicionValida); // mientras no sea true seguirá en el bucle
    
    }
    
    // método que muestra las posicion que no estes vacias
    public static void mostrarVector(Alumno[] alumnos) {
    
        for (int i = 0; i < alumnos.length; i++) {
            
            if (alumnos[i] != null) {
                
                System.out.print("En la posicion "+i+"\n");
                alumnos[i].mostrar();
                System.out.println("----------------------");
                
            }
            
        }
    
    }
    
    // métoddo que muestra los alumnos con una nota media mas alta que la que inserte el usuairo
    public static void mostrarAlumnNotaDada(Alumno[] alumnos) {
        Scanner entrada = new Scanner(System.in);
        float notaMediaUsuario;
        
        System.out.println("Inserte un nota media :");
        notaMediaUsuario = entrada.nextFloat(); // pide un numero al usuario
        
        for (int i = 0; i < alumnos.length; i++) {
            
            if (alumnos[i] != null) {
                
                    // si la nota media del usuairo es menor que la nota media de dado alumno lo muestra
                    if ( notaMediaUsuario <= alumnos[i].getNotaMedia() ) {
                        System.out.print("En la posicion "+i+"\n");
                        alumnos[i].mostrar();
                        System.out.println("----------------------");
                
                    }
            }
            
        }
    
    }
    
    // método que muestra los alumnos con la nota media suspensa
    public static void mostrarAlumnSuspensos(Alumno[] alumnos) {
        
        System.out.println("Alumnos suspensos :\n");
        
        for (int i = 0; i < alumnos.length; i++) {
            
            if (alumnos[i] != null) {
                    // si la nota media del alumno es inferior a 5 lo muestra
                    if ( alumnos[i].getNotaMedia() <= 5.0f ) {
                        System.out.print("En la posicion "+i+"\n");
                        alumnos[i].mostrar();
                        System.out.println("----------------------");
                
                    }
            }
            
        }
    
    }
    
    // método que muestra si dado un alumno esta en el array
    public static void buscarAlumno(Alumno[] alumnos) {
    
        String nombreUsuario = pedirNombre(); // recoge un nombre
        boolean nombreEncontrado = false; // determinará está o no está el alumno

            
        for (int i = 0; i < alumnos.length; i++) {
            
            // si la posicion no esta vacía y el nombre que ha introducido el usuario es igual al nombre de dicho objeto 
            if (alumnos[i] != null) {
                if (nombreUsuario.equals(alumnos[i].getNombre())) {
                    nombreEncontrado = true; // cambia el valor del boolean
                }

            }
        }
        // si ha ecnontrado el nombre (true)
        if (nombreEncontrado) {
            System.out.println("\nEl alumno "+nombreUsuario+" ESTA matriculado.\n");
        }
        else{ // si no lo ha encontrado
            System.out.println("\nEl alumno "+nombreUsuario+" NO esta  matriculado.\n");
        }
    }
    
}
