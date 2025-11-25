/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22;

/**
 *
 * @author David
 */
public class Producto {
    
    private String nombre;
    private int precio;
    private int stock;
    
    // constructor por defecto
    public Producto() {
    
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
    
    }
    
    // constructor parametrizado
    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void establecerPrecio(int precio) {
        this.precio = precio;
    }
    
    public void esteblecerStock(int stock) {
        this.stock = stock;
    }
    
    public String devolverNombre() {
        return nombre;
    }
    
    public int devolverPrecio() {
        return precio;
    }
    
    public int devolverStock() {
        return stock;
    }
    
    public void restarStock(int unidadesUsuario) { // metodo que devuelve el numero de unidades que hay en el stock restandole lo que usuario pida
        
       this.stock = this.stock - unidadesUsuario;
       
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    
    
}
