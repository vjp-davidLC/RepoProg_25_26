/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author David
 */
public class Murcielago extends Mamifero implements Volador{ // clase hija de Mamifero e implementa la intrfaz Volador
    
    // Atributos
    private int alturaVuelo;
    
    // Constructores
    public Murcielago() {
        
        super("","","",0);
        this.alturaVuelo = 0;
        
    }

    public Murcielago(int alturaVuelo,String nombre, String sexo, String color, int edad) {
        super(nombre,sexo,color,edad);
        this.alturaVuelo = alturaVuelo;
    }
    // métodos setters
    public void setAlturaVuelo(int alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    // métodos getters
    public int getAlturaVuelo() {
        return alturaVuelo;
    }
    
    // método toString
    @Override
    public String toString() {
        return "Altura de vuelo en metros: "+this.alturaVuelo;
    }
    
    // métodos de la interfaz Volador
    @Override
    public void obtenerMensajeVolador() {
        System.out.println("El murcielago es un animal volador");
    }

    @Override
    public void aumentarAlturaVuelo() {
        this.alturaVuelo = this.alturaVuelo + 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        this.alturaVuelo = this.alturaVuelo - 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("Altura a la que va volando --> "+this.alturaVuelo+" metros");
    }
    
    
}
