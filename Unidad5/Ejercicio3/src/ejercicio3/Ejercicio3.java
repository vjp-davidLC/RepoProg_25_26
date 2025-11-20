/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author David
 */
public class Ejercicio3 { // TEST

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        rueda1.establecerMaterial("Goma");
        rueda1.establecerPulgadas(30);
        
        rueda2.establecerMaterial("Plastico");
        rueda2.establecerPulgadas(28);
        
        System.out.println("Rueda 1");
        System.out.println("Material --> "+rueda1.obtenerMaterial());
        System.out.println("Pulgadas --> "+rueda1.obtenerPulgadas());
        
        System.out.println("Rueda 2");
        System.out.println("Material --> "+rueda2.obtenerMaterial());
        System.out.println("Pulgadas --> "+rueda2.obtenerPulgadas());
        
        System.out.println("----------------");
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
    
        coche1.establecerMarca("Michelin");
        coche1.establecerModelo("Sport");
        coche2.establecerMarca("Continental");
        coche2.establecerModelo("Water");
        coche3.establecerMarca("Pirelli");
        coche3.establecerModelo("Montanha");
        
        coche1.establecerRueda(rueda1);
        coche2.establecerRueda(rueda1);
        coche3.establecerRueda(rueda2);
        
        System.out.println("-- Coche 1 --");
        System.out.println("Marca : "+coche1.obtenerMarca());
        System.out.println("Modelo : "+coche1.obtenerModelo());
        System.out.println("Material de las ruedas : "+coche1.obtenerRueda().obtenerMaterial());
        System.out.println("Pulgadas de las ruedas : "+coche2.obtenerRueda().obtenerPulgadas());
        
        System.out.println("-- Coche 2 --");
        System.out.println("Marca : "+coche2.obtenerMarca());
        System.out.println("Modelo : "+coche2.obtenerModelo());
        System.out.println("Material de las ruedas : "+coche2.obtenerRueda().obtenerMaterial());
        System.out.println("Pulgadas de las ruedas : "+coche2.obtenerRueda().obtenerPulgadas());
        
        System.out.println("-- Coche 3 --");
        System.out.println("Marca : "+coche3.obtenerMarca());
        System.out.println("Modelo : "+coche3.obtenerModelo());
        System.out.println("Material de las ruedas : "+coche3.obtenerRueda().obtenerMaterial());
        System.out.println("Pulgadas de las ruedas : "+coche3.obtenerRueda().obtenerPulgadas());
        
    }
    
}
