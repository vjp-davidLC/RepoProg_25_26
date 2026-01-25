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
                
                case 1:
                    //llama al método rellenarArray
                    rellenarArray(notas);
                    break;
                
                case 2:
                    // llama al método mostrarArray
                    mostrarArray(notas, alumnos, asignaturas);
                    System.out.println(""); // salto del línea
                    break;
                case 3:
                    // muestra la media mas alta de entre los alumnos
                    System.out.println("\n El alumno con la media mas alta de la clase es --> "+mediaMasAlta(notas, alumnos, alumnoMedia(notas, alumnos)));
                    System.out.println("");
                    break;
                case 4:
                    // llama al método alumnMasSuspenso
                    alumnMasSuspenso(notas, alumnos);
                    break;
                case 5:
                    // llama al método asiganturaMasDificil
                    asignaturaMasdificil(notas, asignaturas);
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
    
    // método que muestra cuál es el alumno con más suspensos
    public static void alumnMasSuspenso(int[][] notas, String[] alumnos) {
    
        int contadorSuspensos; // contador de suspenos de cada alumno
        int contadorMax = 0; // varibale que guardará el máximo de suspensos de entre los alumnos
        String nombreAlumno = ""; // variable que guardará el nombre del alumno
        
        // recorremos el array por cada alumno
        for (int i = 0; i < notas.length; i++) {
            contadorSuspensos = 0; // cada vez que pasemos de alumno (fila) el contador se reiniciará a 0
            // por cad alumno recorremos las notas (columnas)
            for (int j = 0; j < notas[i].length; j++) {
                // si la nota es menor que 5 
                if (notas[i][j] < 5) {
                    contadorSuspensos++; // se incrementa el contador de suspensos
                }
            }
            // por cada alumno se compara el contador de suspensos
            if (contadorSuspensos > contadorMax) {
                contadorMax = contadorSuspensos; // se guarda el valor del contador de dicho alumno
                nombreAlumno = alumnos[i]; // se guarda el nombre del alumno con el máximo de suspensos
            }
        }
        
        System.out.println("El alumno con mas suspensos es: "+nombreAlumno+"\n");
    
    }
    
    // método que muestra cuál es la asignatura con una nota media mas baja de entre los alumnos
    public static void asignaturaMasdificil(int[][] notas, String[] asignaturas) {
    
        float notaMedia; // variable que guardará la nota media de cada alumno
        float suma; // suma entre las notas de cada alumno por asignatura
        float notaMediaMax = 11; // inicalizamos en 10 porque sabemos que es la nota media más alta
        String asignatura = ""; // guardará el nombre de al asignatura 
        
        // recorremos por CADA COLUMNA
        for (int i = 0; i < notas[0].length; i++) { // notas[0].length numero de columnas
            // cada vez que pasamos de asignatura se reiniciará estas variables
            notaMedia = 0;
            suma = 0;
            // recorremos por cada columna su fila correspondiente
            for (int j = 0; j < notas.length; j++) {
                suma += (float) notas[j][i]; // acumulamos la suma de las notas de cada alumno en la asignatura
                
            } 
            notaMedia = suma / notas.length; // por cada asignatura calculamos la media
            
            // guardamos la nota media mas baja que haya de entre CADA asignatura
            if (notaMedia < notaMediaMax) {
                notaMediaMax = notaMedia;
                asignatura = asignaturas[i]; // guardamos el nombre de la asignatura
            }
        }
        System.out.println("La asignatura mas dificil es "+asignatura+" con una nota media de "+notaMediaMax+"\n");
    }
    
}
