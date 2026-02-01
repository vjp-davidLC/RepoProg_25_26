/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mueble[] tienda = new Mueble[4]; // creacion del array con 4 posiciones
        
        Scanner entrada = new Scanner(System.in);
        boolean salir = false; // boolean que controlará el bucle do-while
        int opcionUsuario; // variable que recogerá la opcion del usuario
        
        do {            
            
            mostrarMenu(); // llamada al método 
            
            System.out.println("Inserte una de las opciones --> ");
            opcionUsuario = entrada.nextInt(); // recoge lo que el usuariointroduzca
            
            switch (opcionUsuario) {
                case 1:
                    rellenarArray(tienda); // rellena el array
                    break;
                case 2:
                    mostrarArray(tienda);// muestra los datos del array
                    break;
                case 3:
                    mostrarArraySegunPrecio(tienda);// muestra el alumno con la nota media mas alta 
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;

                default:
                    System.out.println("Error. Inserte una opcion de entre 1-4.");
            }
            
            
        } while (!salir);
        
    }
    
    public static void mostrarMenu() {
    
        System.out.println("-- TIENDA DE MUEBLES --");
        System.out.println("1- Rellenar array de muebles. ");
        System.out.println("2- Mostrar los muebles. ");
        System.out.println("3- Mostrar muebles por precio. ");
        System.out.println("4- Salir del programa.");
        System.out.println("------------------------");
        
    }
    
    public static String pedirDescripcion() {
    
        Scanner entrada = new Scanner(System.in);
        
        String descripcion; 
        
        descripcion = entrada.nextLine();
        
        return descripcion;
    }
    
    public static int pedirPrecio() {
    
        Scanner entrada = new Scanner(System.in);
        
        int precio; 
        
        precio = entrada.nextInt();
        
        return precio;
    }
    
    public static void rellenarArray(Mueble[] tienda) {
        
        
        for (int i = 0; i < tienda.length; i++) {
            
            tienda[i] = new Mueble();
            
            System.out.println("\nInserte el nombre mueble: ");
            tienda[i].setDescripcion(pedirDescripcion());
            
            System.out.println("Inserte el precio del mueble: ");
            tienda[i].setPrecio(pedirPrecio());
            
        }
    
        System.out.println("Array rellenado con EXITO!\n"); 
        
    }
    
    
    public static void mostrarArray(Mueble[] tienda) {
    
        for (int i = 0; i < tienda.length; i++) {
            
            tienda[i].Mostrar();
            System.out.println("");
        }
    
    }
    
    public static void mostrarArraySegunPrecio(Mueble[] tienda) {
        int precioUsuario; 
        
        System.out.println("\nInserte un precio: ");
        precioUsuario = pedirPrecio();
        System.out.println("");
        
        for (int i = 0; i < tienda.length; i++) {
            
            if (tienda[i].getPrecio() <= precioUsuario) {
                tienda[i].Mostrar();
                System.out.println("");
            }
            
        }
    
    }
    
}
