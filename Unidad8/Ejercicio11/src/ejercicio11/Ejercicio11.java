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
    
    // método que muestra lel menú
    public static void mostrarMenu() {
    
        System.out.println("-- TIENDA DE MUEBLES --");
        System.out.println("1- Rellenar array de muebles. ");
        System.out.println("2- Mostrar los muebles. ");
        System.out.println("3- Mostrar muebles por precio. ");
        System.out.println("4- Salir del programa.");
        System.out.println("------------------------");
        
    }
    
    // método que pide la descripcion al usuario
    public static String pedirDescripcion() {
    
        Scanner entrada = new Scanner(System.in);
        
        String descripcion; 
        
        descripcion = entrada.nextLine();
        
        return descripcion;
    }
    
    // método que pide el precio al usuario
    public static int pedirPrecio() {
    
        Scanner entrada = new Scanner(System.in);
        
        int precio; 
        
        precio = entrada.nextInt();
        
        return precio;
    }
    
    // método que rellena el array
    public static void rellenarArray(Mueble[] tienda) {
        
        // recorre el array
        for (int i = 0; i < tienda.length; i++) {
            
            tienda[i] = new Mueble(); // crea 1 objeto por cada posicion del array 
            
            System.out.println("\nInserte el nombre mueble: ");
            tienda[i].setDescripcion(pedirDescripcion()); // inserta un valor al atributo pidiendoselo al usuario
            
            System.out.println("Inserte el precio del mueble: ");
            tienda[i].setPrecio(pedirPrecio()); // inserta un valor al atributo pidiendoselo al usuario
            
        }
    
        System.out.println("Array rellenado con EXITO!\n"); 
        
    }
    
    // mostramos los valores del array con sus atributos por cada objeto
    public static void mostrarArray(Mueble[] tienda) {
    
        // recorremos el array
        for (int i = 0; i < tienda.length; i++) {
            
            // si la posicion no está vacía
            if(tienda[i] != null) {
                tienda[i].Mostrar(); // muestra los datos del objeto
                System.out.println(""); // salto de línea
            }
        }
    
    }
    
    // método que muestra el inmueble que tenga el precio igual o menor que un precio dado por el usuario
    public static void mostrarArraySegunPrecio(Mueble[] tienda) {
        int precioUsuario; 
        
        System.out.println("\nInserte un precio: ");
        precioUsuario = pedirPrecio(); // pedimos un precio al usuario
        System.out.println("");
        
        // recorremos el array
        for (int i = 0; i < tienda.length; i++) {
            // si la posicion del array no está vacía 
            if (tienda[i] != null) {
                // si el precio del inmueble es igual o menor que el precio del usuario
                if (tienda[i].getPrecio() <= precioUsuario)
                {
                    tienda[i].Mostrar(); // muestra los valores del objeto
                    System.out.println(""); // salto de línea
                }
            }
            
            
        }
    
    }
    
}
