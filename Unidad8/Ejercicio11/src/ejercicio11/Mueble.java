/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author David
 */
public class Mueble {
    
    // atributos
    private int precio;
    private String descripcion;

    // constructores
    public Mueble() {
        this.precio = 0;
        this.descripcion = "";
    }

    public Mueble(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //método setters
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // métodos getters
    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    // método mostrar
    public void Mostrar() {
    
        System.out.println("Descripcion : "+descripcion);
        System.out.println("Precio: "+precio);
    
    }
    
}
