/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;
import javax.security.auth.callback.TextOutputCallback;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param stock
     * @param unidadesUsuario
     * @return 
     */
    
    
    // comprobamos si hay stock
    public static boolean comprobarStock(int stock, int unidadesUsuario){
    
        boolean unidadesDisponibles = true;
        
        if(unidadesUsuario > stock) { // si las unidades que inserta el usuario es mas grande que stock el booleano es false
            unidadesDisponibles = false;
        }
        // si no es true
        return unidadesDisponibles;
        
    }
    
    public static int pedirUnidades() { // metodo que pide las unidades al usuario
        
        Scanner entrada = new Scanner(System.in);
        int unidesUsuario;
        
        unidesUsuario = entrada.nextInt();
        
        return  unidesUsuario;
    }
    
    
    public static void mostrarMenu(Producto producto1, Producto producto2, Producto producto3) {
       
        System.out.println(" \n-- Bienvenido a mi Tienda de Mascotas --");
        System.out.println("Pulse 1 para comprar Perros cuyo precio es de 500 euros y el stock es de "+producto1.devolverStock()+" unidades.");
        System.out.println("Pulse 2 para comprar Gatos cuyo precio es de 200 euros y el stock es de "+producto2.devolverStock()+" unidades.");
        System.out.println("Pulse 3 para comprar Conejos cuyo precio es de 300 euros y el stock es de "+producto3.devolverStock()+" unidades.");
        System.out.println("Elige una de las opciones --> ");
    
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcionUsuario; 
        int totalApagar = 0; //inicializamos la variable
        boolean salir = false; // variable que controlara el bucle
        String salirPrograma; // variable que recogera la respuesta del usuario
        
        Producto producto1 = new Producto("Perro", 500,20); // creacionde los objetos
        Producto producto2 = new Producto("Gato", 200, 15);
        Producto producto3 = new Producto("Conejo",300, 7);
        
        // mostramos el menu
        mostrarMenu(producto1,producto2,producto3); // mostramos el menu
        
        // bucle del menu 
        do { // mientras "salir" sea false no saldrá del bucle    
                    
            
            opcionUsuario = entrada.nextInt(); //opcion que inserta el usuario
            entrada.nextLine();   // limpiar salto de línea
            
            switch (opcionUsuario) {
                    case 1: // opcion 1
                        
                        System.out.println("Ha elegido comprar Perros");
                        System.out.println("Cuantas unidades desea?");
                        int unidadesUsuario = pedirUnidades(); // pedimos las unidades al usuario
                        

                        if (comprobarStock(producto1.devolverStock(), unidadesUsuario)) { // invocamos al metodo que controla que la unidades que inserta el usuario sea menor que el stock
                            producto1.restarStock(unidadesUsuario); // al atributo "stock" del objeto se le resta las unidades que haya pedido el usuario
                            System.out.println("Venta realizada con exito.");
                            totalApagar = unidadesUsuario * producto1.devolverPrecio(); // a la variable se le implementa el precio
                        }
                        else { // si las unidades que pide el usuario son mayor que el stock
                            System.out.println("Lo sentimos, solo tenemos disponibles "+producto1.devolverStock()+" unidades.");  
                        }
                        
                        System.out.println("Desea comprar otro producto? si/no");
                        salirPrograma = entrada.nextLine(); // pide al usuario la respuesta
                        
                        if (salirPrograma.equals("si")) { // si el usuario inserta "si" volvera a mostrarse el menu
                            mostrarMenu(producto1, producto2, producto3);
                        }
                        else { // si no mostrará el usuario final
                            System.out.println("El total de su compra asciende a "+totalApagar+" Euros");
                            System.out.println("Muchas gracias. Vuelva cuando quiera");
                            salir = true; // salimos del bucle
                        }
                        break;
                        
                    case 2: //opcion 2
                        System.out.println("Ha elegido comprar Gatos");
                        System.out.println("Cuantas unidades desea?");
                        unidadesUsuario = pedirUnidades();
                        

                        if (comprobarStock(producto2.devolverStock(), unidadesUsuario)) {
                            producto2.restarStock(unidadesUsuario); // al atributo stock del objeto se le resta las unidades que haya pedido el usuario
                            System.out.println("Venta realizada con exito.");
                            totalApagar += unidadesUsuario * producto2.devolverPrecio();
                        }
                        else {
                            System.out.println("Lo sentimos, solo tenemos disponibles "+producto2.devolverStock()+" unidades.");  
                        }
                        
                        System.out.println("Desea comprar otro producto? si/no");
                        salirPrograma = entrada.nextLine();
                        
                        if (salirPrograma.equals("si")) {
                            mostrarMenu(producto1, producto2, producto3);
                        }
                        else {
                            System.out.println("El total de su compra asciende a "+totalApagar+" Euros");
                            System.out.println("Muchas gracias. Vuelva cuando quiera");
                            salir = true;
                        }
                        break;
                        
                    case 3: //opcion 3
                        System.out.println("Ha elegido comprar Conejos");
                        System.out.println("Cuantas unidades desea?");
                        unidadesUsuario = pedirUnidades();
                        

                        if (comprobarStock(producto3.devolverStock(), unidadesUsuario)) {
                            producto3.restarStock(unidadesUsuario); // al atributo stock del objeto se le resta las unidades que haya pedido el usuario
                            System.out.println("Venta realizada con exito.");
                            totalApagar += unidadesUsuario * producto3.devolverPrecio();
                        }
                        else {
                            System.out.println("Lo sentimos, solo tenemos disponibles "+producto3.devolverStock()+" unidades.");  
                        }
                        
                        System.out.println("Desea comprar otro producto? si/no");
                        salirPrograma = entrada.nextLine();
                        
                        if (salirPrograma.equals("si")) {
                            mostrarMenu(producto1, producto2, producto3);
                        }
                        else {
                            System.out.println("El total de su compra asciende a "+totalApagar+" Euros");
                            System.out.println("Muchas gracias. Vuelva cuando quiera");
                            salir = true;
                        }
                        break;
                        
                    default:
                        System.out.println("Error. Tienes que insertar un numero del 1-3.");; // si el usuario no inserta una del as opciones se mostrará ese mensaje
                }
        
        }
        while (!salir); // mientra salir sea false no saldrá del bucle
    }
    
}
