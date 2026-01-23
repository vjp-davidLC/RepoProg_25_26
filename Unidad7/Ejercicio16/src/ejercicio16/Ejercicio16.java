/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.net.ContentHandlerFactory;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    
    // método principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        int[][] notas = new int[6][4]; // array con un tamaño de 6x4 (24 notas)
        // arrays de tipo String con los nombres de los alumnos y el nombre de las asignaturas
        String[] alumnos =  {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas =  {"Lengua", "Mates", "Historia", "Fisica"};
        
        int opcion; // variable que recogerá la opcion que inserte el usuario
        boolean salir = false; // booelan que controla el bucle do while
        
        do {            
            
            mostrarMenu(); // llamamos al método mostrar el menu
            System.out.println("Inserte una de las opciones --> ");
            
            // recogemos la opciones que inserte el usuario 
            opcion = entrada.nextInt();
            
            // switch que depende de la opcion que inserte el usuario llamará a un método o saldrá del programa
            switch (opcion) {
                
                //llama al método rellenarArray
                case 1:
                    rellenarArray(notas);
                    break;
                // llama al método mostrarArray
                case 2:
                    mostrarArray(notas, alumnos, asignaturas);
                    System.out.println(""); // salto del línea
                    break;
                case 3:
                    System.out.println("\n El alumno con la media mas alta de la clase es --> "+mediaMasAlta(notas, alumnos, alumnoMedia(notas, alumnos)));
                    System.out.println("");
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Saliendo del programa....");
                    salir = true; // sale del programa
                    break;
                default: // si el usuario no elige una opcion del 1-6
                    System.out.println("¡ERROR!. Debe de inserte una opcion del 1-6.");;
            }
            
        } while (!salir); // mientras que el boolean no sea true no saldrá del programa
        
    }
    
    // método que muestra el menú
    public static void mostrarMenu() {
    
        System.out.println("---- BOLETIN DE NOTAS ---");
        System.out.println("1. Rellenar las notas de los alumnos.");
        System.out.println("2. Mostrar las notas introducidas en el punto anterior");
        System.out.println("3. Mostrar el mejor alumno de la clase.");
        System.out.println("4. Mostrar el alumno con mas suspensos.");
        System.out.println("5. Mostrar las asignaturas mas dificil. ");
        System.out.println("6. Salir del programa.");
        System.out.println("--------------------------\n");
    }
    
    // método que recorre el array y asigna valores a las distintas posiciones
    public static void rellenarArray(int[][] notas) {
    
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = (int) (Math.random()*11); // asigna un valor aleatorio del 0-10
            }
        }
        
    }
    
    // método que recorre el array bidimensional y muestra sus valores en las distintas posiciones
    public static void mostrarArray(int[][] notas, String[] alumnos, String[] asignaturas){
        int posicionAlumno;
        
        // recorremos por cada fila (alumnos)
        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nAlumno: "+alumnos[i]);
            // recorremos por cada columna (asignaturas)
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(asignaturas[j]+" nota --> "+notas[i][j]);
            }
        }
    }
    
    // método que saca la media total de CADA alumno
    public static float[] alumnoMedia(int[][] notas, String[] alumnos) {
    
        float[] mediaAlumnos = new float[alumnos.length]; // array que contendrá la media de cada alumno
        
        float mediaAlumn; // varibale que contendrá la media (de cada alumno)
        float totalAlumn; // variable que contendrá la suma de las notas de las asignaturas (de cada alumno)
        
        // recorremos por cada fila (alumnos)
        for (int i = 0; i < notas.length; i++) {
            totalAlumn = 0; // se reinicia este acumulador cada vez que pase a la siguiente fila (alumno)
            // recorremos por cada columna (asignaturas)
            for (int j = 0; j < notas[i].length; j++) {
                
                totalAlumn += (float) notas[i][j]; // guardamos la suma total de las notas de cada fila (alumno)
                
            }
            mediaAlumn = totalAlumn / notas[i].length; // calculamos para cada alumno la media
            mediaAlumnos[i] = mediaAlumn; // almacenamos la media en cada posicion del array
        }
    
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]+ " nota media --> "+mediaAlumnos[i]);
        }
    
        return mediaAlumnos; // devueleve un array
        
    }
    
    // método que devuelve el valor mas alto dado un array
    public static float mediaMasAlta(int[][] notas, String[] alumnos, float[] mediaAlumnos) {
    
        
        float mediaMasAlta = mediaAlumnos[0]; // asignamos a esta variable el valor de la primera posicion del array
        
        // recorremos el array 
        for (int i = 0; i < mediaAlumnos.length; i++) {
            if (mediaAlumnos[i] > mediaMasAlta) { // si un valor es mayor que otro numero 
                mediaMasAlta = mediaAlumnos[i]; // asignamos ese valor mayor en la variable
            }
        }
        return mediaMasAlta; // devuelve un número
    }
    
    public static void alumnMasSuspenso(int[][] notas, String[] alumnos) {
    
        int contador = 0;
        int posicionAlumn;
        int contadorMax = 0;
        
        
        for (int i = 0; i < notas.length; i++) {
            posicionAlumn = 0;
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < 5) {
                    contador++;
                }
            }
            if (contador > contadorMax) {
            contadorMax = contador;
            }
        }
        
        
    
    }
    
}
