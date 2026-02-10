/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15.pkg16;

/**
 *
 * @author David López
 */
public class Socios {
    
    // atributos
    private String nombre;
    private int precioAbonado;
    
    // constructores

    public Socios() {
        this.nombre = "";
        this.precioAbonado = 0; // la voluntah
    }

    public Socios(String nombre, int precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }
    
    // métodos setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioAbonado(int precioAbonado) {
        this.precioAbonado = precioAbonado;
    }
    
    // métodos getters

    public String getNombre() {
        return nombre;
    }

    public int getPrecioAbonado() {
        return precioAbonado;
    }
    
    // método mostrar
    public void mostrar() {
    
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio abonado: "+this.precioAbonado+"\n");
        
    }
    
}
