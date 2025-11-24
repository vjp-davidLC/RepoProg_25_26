/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param args the command line arguments
     * @return 
     */
    
    /**public static boolean comprobarStock(){
    
        boolean unidadesDisponibles = true;
        
    } */
    
    public static int pedirUnidades() {
        Scanner entrada = new Scanner(System.in);
        int unidesUsuario;
        
        unidesUsuario = entrada.nextInt();
        
        return  unidesUsuario;
    }
    
    public static void mostrarMenu() {
       
        
        System.out.println("-- Bienvenido a mi Tienda de Mascotas –-");
        System.out.println("Pulse 1 para comprar Perros cuyo precio es de 500 euros y el stock es de 20 unidades.");
        System.out.println("Pulse 2 para comprar Gatos cuyo precio es de 200 euros y el stock es de 15 unidades.");
        System.out.println("Pulse 3 para comprar Conejos cuyo precio es de 300 euros y el stock es de 7 unidades.");
        System.out.println("Elige una de las opciones --> ");
    
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcionUsuario; 
        boolean salir = false;
        String salirPrograma;
        
        Producto producto1 = new Producto("Perro", 500,20);
        Producto producto2 = new Producto("Gato", 200, 15);
        Producto producto3 = new Producto("Conejo",300, 7);
        
        do {            
                    
            mostrarMenu();
            opcionUsuario = entrada.nextInt();
            
            switch (opcionUsuario) {
                    case 1:
                        
                        System.out.println("Ha elegido comprar Perros");
                        System.out.println("Cuantas unidades desea?");
                        int unidadesUsuario = pedirUnidades();
                        
                        if (unidadesUsuario < producto1.devolverStock()) {
                            System.out.println("Desea comprar otro producto?");
                            salirPrograma = entrada.nextLine();

                                if (salirPrograma.equals("no")) {
                                salir = true;
                                }
                        }
                        else {
                            System.out.println("Lo sentimos, solo tenemos disponibles 20 unidades.");
                        }

                        break;
                    case 2:
                        System.out.println("Ha elegido comprar Gatos");
                        break;
                    case 3:
                        System.out.println("Ha elegido comprar Conejos");
                        break;
                    default:
                        System.out.println("Error. Tienes que insertar un numero del 1-3.");;
                }
        
        }
        while (!salir);
    }
    
}
