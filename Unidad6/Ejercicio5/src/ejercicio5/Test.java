/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PARTE 1
        // Creamos un objeto de tipo ornitorrinco y de murcielago
        Ornitorrinco orni = new Ornitorrinco(0,"Perry","Macho","verde-azul",5);
        Murcielago murci = new Murcielago(0, "Batman", "Macho", "negro", 29);
        
        // implementamos los metodos
        orni.obtenerMensajeOviparo();
        orni.ponerHuevo();
        orni.ponerHuevo();
        orni.ponerHuevo();
        orni.incubarHuevo();
        orni.mostrarNumHuevos();
        
        murci.obtenerMensajeVolador();
        murci.aumentarAlturaVuelo();
        murci.aumentarAlturaVuelo();
        murci.bajarAlturaVuelo();
        murci.mostrarAlturaVuelo();
        
        System.out.println("");
        
        // PARTE 2
        // Creamos dos objetos a partir de las interfaces
        Oviparo orni2 = new Ornitorrinco(2,"Pepe","Macho","marron",7);
        Volador murci2 = new Murcielago(3, "Murci", "Hembra", "gris", 1);
        
        // implementamos los metodos
        orni2.obtenerMensajeOviparo();
        orni2.ponerHuevo();
        orni2.ponerHuevo();
        orni2.ponerHuevo();
        orni2.incubarHuevo();
        orni2.mostrarNumHuevos();
        
        murci2.obtenerMensajeVolador();
        murci2.aumentarAlturaVuelo();
        murci2.aumentarAlturaVuelo();
        murci2.bajarAlturaVuelo();
        murci2.mostrarAlturaVuelo();
        
    }
    
}
