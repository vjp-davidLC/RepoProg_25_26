/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author David López
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[3]; // array que contiene 3 objetos de alumno
        String[] nombresAlumn = {"Pepe", "Juan", "Marta"}; // array con los nombres de los alumnos
        String[] nombresAsignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        boolean salir = false; // boolean que controlará el bucle do-while
        int opcionUsuario; // variable que recogerá la opcion del usuario
        
        do {            
            
            mostrarMenu(); // llamada al método 
            
            System.out.println("Inserte una de las opciones --> ");
            opcionUsuario = entrada.nextInt(); // recoge lo que el usuariointroduzca
            
            switch (opcionUsuario) {
                case 1:
                    rellenarArray(alumnos, nombresAlumn, nombresAsignaturas); // rellena el array
                    break;
                case 2:
                    mostrarArray(alumnos); // muestra los datos del array
                    break;
                case 3:
                    mostrarMejoralumn(alumnos); // muestra el alumno con la nota media mas alta 
                    break;
                case 4:
                    mostrarAlumnMasSuspen(alumnos); // muestra el alumno con mas suspensos
                    break;
                case 5:
                    mostrarAsignaturaMasDificil(alumnos, nombresAsignaturas);
                    break;
                case 6:
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Error. Inserte una opcion de entre 1-5.");
            }
            
            
        } while (!salir);
        
        

    }
    
    public static void mostrarMenu() {
    
        System.out.println("-- BOLETIN DE LA CLASE --");
        System.out.println("1- Rellenar las notas de los alumnos.");
        System.out.println("2- Mostrar las notas introducidas.");
        System.out.println("3- Mostrar el mejor alumno de la clase");
        System.out.println("4- Mostrar alumno con mas suspensos.");
        System.out.println("5- Mostrar asignatura mas dificil.");
        System.out.println("6- Salir del programa .");
        System.out.println("------------------------");
        
    }
    
    public static float notaAlumno() {
        
        float notaAlumn = (float) (Math.random()*10.01); // numero random del 0-10 con decimales
        
        // Redondear a 2 decimales
        notaAlumn = Math.round(notaAlumn * 100) / 100f;
        
        return notaAlumn;
    }
    
    
    // método que rellena el array
    public static void rellenarArray(Alumno[] alumnos, String[] nombresAlumn, String[] nombresAsignaturas) {
    
        for (int i = 0; i < alumnos.length; i++) {
            
            alumnos[i] = new Alumno(); // creacion de objetos
            alumnos[i].setNombreAlumbo(nombresAlumn[i]); // asignamos los nombres de los alumnos
            
            Asignatura[] notas = new Asignatura[4]; // creamos un array con 4 posiciones para cada alumno
            
            for (int j = 0; j < notas.length; j++) {
                
                notas[j] = new Asignatura(nombresAsignaturas[j], notaAlumno()); // creamos los objetos para cada posicion

            }
            
            alumnos[i].setNotas(notas); // para cada alumno se le asigna un array de notas
            
            
        }
        System.out.println("\nRellenado con EXITO!\n");
    
    }
    
    public static void mostrarArray(Alumno[] alumnos) {
    
        for (int i = 0; i < alumnos.length; i++) {
            
            alumnos[i].mostrar();
            
        }
    
    }
    
    
    public static void mostrarMejoralumn(Alumno[] alumnos) {
    
        float mejorNotaMedia = 0;
        int posicionAlumn = 0;
        float mediaAlumn;
        
        for (int i = 0; i < alumnos.length; i++) {
            
            mediaAlumn = alumnos[i].notaMedia();
            
            if (mediaAlumn > mejorNotaMedia) {
                mejorNotaMedia = mediaAlumn;
                posicionAlumn = i;
            }
            
        }
        
        System.out.println("\nEl alumno con la mayor nota media es "+alumnos[posicionAlumn].getNombreAlumbo()+""
                + " con una nota media de "+mejorNotaMedia+".\n");
    
    }
    
    
    public static void mostrarAlumnMasSuspen(Alumno[] alumnos) {
        int maxSuspensos = 0;
        int totalSuspensos;
        int posicionAlumn = 0;
        
        for (int i = 0; i < alumnos.length; i++) {
            
            totalSuspensos = alumnos[i].totalSuspensos();
            
            if (totalSuspensos > maxSuspensos ) {
                maxSuspensos = totalSuspensos;
                posicionAlumn = i;
                
            }
            
        }
        
        System.out.println("\nEl alumno con mas suspensos es "+alumnos[posicionAlumn].getNombreAlumbo()+""
                + " con un total de "+maxSuspensos+".\n");
    
    }
    
    // muestra la asignatura con mas medias suspensas
    public static void mostrarAsignaturaMasDificil(Alumno[] alumnos, String[] nombresAsignaturas) {

        float[] medias = new float[nombresAsignaturas.length]; // array que contendrá las medias de cada asignatura
        float suma;
        int posicionarray = 0;
        
        // Calculamos la media de cada asignatura
        for (int j = 0; j < nombresAsignaturas.length; j++) {
            suma = 0; // cada vez que pasemos de asignatura la variable se inicializará a 0
            for (int i = 0; i < alumnos.length; i++) { // por cada alumno sacamos la nota media de dicha asignatura
                suma += alumnos[i].getNotas()[j].getNota(); // acumulamos la suma de las notas
            }
            medias[j] = suma / alumnos.length; // por cada asignatura calculamos la nota media 
        }
    
        // recorremos el array de medias[]
        for (int i = 0; i < medias.length; i++) {
            // si alguna media es menor que otra media
            if (medias[i] < medias[posicionarray]) {
                posicionarray = i; // se actualiza y se guarda la POSICION del array de medias[] 
            }
            
        }
        
        System.out.println("\nLa asignatura con mas dificil es "+nombresAsignaturas[posicionarray]+""
                + " con una nota media de "+medias[posicionarray]+"\n");
        
    }
    
        
    
}
