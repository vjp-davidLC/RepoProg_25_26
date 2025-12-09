/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author David
 */
public abstract class Suscripcion {
    
    private float precioBase;

    public Suscripcion() {
        this.precioBase = 0;
    }

    public Suscripcion(float precioBase) {
        this.precioBase = precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public float getPrecioBase() {
        return precioBase;
    }
    
    public abstract float calcularPrecio();

    @Override
    public String toString() {
        return "Precio Base: "+this.precioBase;
    }
    
    
    
}
