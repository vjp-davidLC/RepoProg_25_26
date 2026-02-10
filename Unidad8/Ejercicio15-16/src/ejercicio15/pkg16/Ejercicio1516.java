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
                    rellenarPeliculas(salaDeCine); // rellena el array
                    break;
                case 2:
                    mostrarPeliculas(salaDeCine); // muestra los datos del array
                    break;
                case 3:
                    peliculaMasRentable(salaDeCine); // muestra la pelicula con mas beneficio 
                    break;
                case 4:
                    peliculaMenosRentable(salaDeCine); // muestra la pelicula con menos beneficio
                    break;
                case 5:
                    mostrarBeneficioYSociosPelicula(salaDeCine); // muestra la informacion de una pelicula dada por el usuario
                    break;
                case 6:
                    sociosConMayorImporte(salaDeCine); // muestra el numero de socios con un importe de abonado mayor que una cantidad dada por el usuairo
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
    
        System.out.println("\n-- Asociacion Nos gusta el cine --");
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

        System.out.println("\nIntroduzca el titulo de la pelicula: ");
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
            
            salaDeCine[i].rellenarSocios(); // llama al método (se ubica en la clase Socios()) que rellena el array de Socios()

        }
    
    }
    
    public static void mostrarPeliculas(Pelicula[] salaDeCine) {
    
        for (int i = 0; i < salaDeCine.length; i++) {
            
            if (salaDeCine[i] != null) {
                salaDeCine[i].mostrar();
            }
            
            
        }
    
    }
    
    public static void peliculaMasRentable(Pelicula[] salaDeCine) {
    
        int masBeneficio = salaDeCine[0].beneificioPelicula(); // inicializamos en el valor de la primera peli
        int posicionArray = 0;
        
        for (int i = 0; i < salaDeCine.length; i++) {
            // comparamos el beneficio de todas las peliculas
            if (salaDeCine[i].beneificioPelicula() > masBeneficio) {
                
                masBeneficio = salaDeCine[i].beneificioPelicula();
                posicionArray = i;
            }

        }
    
        System.out.println("\nLa pelicula mas rentable es "+salaDeCine[posicionArray].getTitulo()+""
                + " con un beneficio de "+masBeneficio+" euros.");
    }
    
    public static void peliculaMenosRentable(Pelicula[] salaDeCine) {
    
        int menosBeneficio = salaDeCine[0].beneificioPelicula(); // inicializamos en el valor de la primera peli
        int posicionArray = 0;
        
        for (int i = 0; i < salaDeCine.length; i++) {
            // comparamos el beneficio de todas las peliculas
            if (salaDeCine[i].beneificioPelicula() < menosBeneficio) {
                
                menosBeneficio = salaDeCine[i].beneificioPelicula();
                posicionArray = i;
            }

        }
    
        System.out.println("\nLa pelicula menos rentable es "+salaDeCine[posicionArray].getTitulo()+""
                + " con un beneficio de "+menosBeneficio+" euros.");
    }
    
    // muestra la informacion de una pelicula dada por el usuario
    public static void mostrarBeneficioYSociosPelicula(Pelicula[] salaDeCine) {
    
        String nombrePeliUsuario = pedirTitulo();
        boolean encontrado = false;
        int posicionArray = 0;
        int beneficioNetoPelicula = 0;
        
        // mientras la posicion sea menor que alumnos.length y false el boolean nombreEncontrado
        while (posicionArray < salaDeCine.length && !encontrado) {            
            
            // compara el nombre dado or el usuario por los reales del array
            if (salaDeCine[posicionArray] != null && nombrePeliUsuario.equals(salaDeCine[posicionArray].getTitulo())) {
                encontrado = true;
                beneficioNetoPelicula = salaDeCine[posicionArray].beneificioPelicula(); // recoge el beneficio de la pelicula
            }
            else {
                posicionArray ++;
            }
            
        }
        
        if (encontrado) {
            System.out.println("\nLa pelicula "+nombrePeliUsuario+" tiene un beneficio de "+beneficioNetoPelicula+" euros");
            salaDeCine[posicionArray].mostrar();
        }

    }
    
    public static int pedirCantidad() {
    
        Scanner entrada = new Scanner(System.in);
        int cantidadUsuario;

        System.out.println("\nInserte una cantidad.  ");
        cantidadUsuario = entrada.nextInt();

        return cantidadUsuario;
    
    }
    
    public static void sociosConMayorImporte(Pelicula[] salaDeCine) {
    
        int cantidadUsuario = pedirCantidad();
        int contadorTotal = 0;
        
        for (int i = 0; i < salaDeCine.length; i++) {
            
            contadorTotal += salaDeCine[i].sociosConMayorImporte(cantidadUsuario);
            
        }
        
        System.out.println("\nEl total de socios que han abonado más de " 
                   + cantidadUsuario + "euros es: " + contadorTotal);
    
    }
    
}
