/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author David
 */
public class Ornitorrinco extends Mamifero implements Oviparo{ // clase hija de Mamifero e implementa la intrfaz Oviparo
    
    // Atributos
    private int numeroHuevos;
    
    // Constructores
    public Ornitorrinco() {
        
        super("","","",0);
        this.numeroHuevos = 0;
        
    }

    public Ornitorrinco(int numeroHuevos,String nombre, String sexo, String color, int edad) {
        super(nombre,sexo,color,edad);
        this.numeroHuevos = numeroHuevos;
    }
    // métodos setters
    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }
    
    // métodos getters
    public int getNumeroHuevos() {
        return numeroHuevos;
    }
    
    // método toString
    @Override
    public String toString() {
        return "Numero de huevos: "+this.numeroHuevos;
    }

    // métodos de la interfaz Oviparo
    @Override
    public void obtenerMensajeOviparo() {
        System.out.println("El ornitorrinco es un mamifero oviparo");
    }

    @Override
    public void ponerHuevo() {
        this.numeroHuevos ++ ; // aumenta el numero de huevos en 1
    }

    @Override
    public void incubarHuevo() {
        this.numeroHuevos -- ; // disminuye el numero de huevos en 1
    }

    @Override
    public void mostrarNumHuevos() {

        System.out.println("Numero de huevos --> "+this.numeroHuevos);
        
    }
    
    
    
}
