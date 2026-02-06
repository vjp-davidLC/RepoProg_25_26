/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15.pkg16;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio1516 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Pelicula[] salaDeCine = new Pelicula[3]; // creamos una array de tipo Pelicula() con un tamaño de 3 posiciones
        
        boolean salir = false; // boolean que controlará el bucle do-while
        int opcionUsuario; // variable que recogerá la opcion del usuario
        
        do {            
            
            mostrarMenu(); // llamada al método 
            
            System.out.println("Inserte una de las opciones --> ");
            opcionUsuario = entrada.nextInt(); // recoge lo que el usuariointroduzca
            
            switch (opcionUsuario) {
                case 1:
                    rellenarPeliculas(salaDeCine);// rellena el array
                    break;
                case 2:
                    // muestra los datos del array
                    break;
                case 3:
                    // muestra el alumno con la nota media mas alta 
                    break;
                case 4:
                    // muestra el alumno con mas suspensos
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Error. Inserte una opcion de entre 1-7.");
            }
            
            
        } while (!salir);
        

    }
    
    public static void mostrarMenu() {
    
        System.out.println("-- Asociacion Nos gusta el cine --");
        System.out.println("1. Rellenar las peliculas juntos con los socios.");
        System.out.println("2. Mostrar las peliculas y los socios que la han visto.");
        System.out.println("3. Mostrar la pelicula mas rentable.");
        System.out.println("4. Mostrar la pelicula menos rentable.");
        System.out.println("5. Pedir pelicula y mostrar la informacion.");
        System.out.println("6. Numero de socios que han abonado una cantidad mayor.");
        System.out.println("7. Salir del programa");
        System.out.println("-----------------------------");
    }
    
    public static String pedirTitulo() {

        Scanner entrada = new Scanner(System.in);
        String tituloUsuario;

        System.out.println("Introduzca el titulo de la pelicula: ");
        tituloUsuario = entrada.nextLine();

        return tituloUsuario;
        
    }
    
    public static int pedirCosteLicencia() {

        Scanner entrada = new Scanner(System.in);
        int costeLicenciaUsuario;

        System.out.println("Inserte el coste de la licencia de la pelicula: ");
        costeLicenciaUsuario = entrada.nextInt();

        return costeLicenciaUsuario;
        
    }
    
    public static void rellenarPeliculas(Pelicula[] salaDeCine) {
    
        for (int i = 0; i < salaDeCine.length; i++) {
            
            salaDeCine[i] = new Pelicula();
            
            salaDeCine[i].setTitulo(pedirTitulo());
            salaDeCine[i].setCosteLicencia(pedirCosteLicencia());
            
            Socios[] socios = new Socios[4]; // creamos un array con 4 posiciones para cada pelicula
            
            for (int j = 0; j < socios.length; j++) {
                salaDeCine[i].rellenarSocios();
            }
            
                
           
            
        }
    
    }
    
}
