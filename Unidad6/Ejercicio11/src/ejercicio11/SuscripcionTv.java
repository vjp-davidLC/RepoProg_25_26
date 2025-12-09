/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author David
 */
public class SuscripcionTv extends Suscripcion{
    
    private final float IVA = 0.21f;

    public SuscripcionTv() {
        super();
    }

    public SuscripcionTv(float precioBase) {
        super(precioBase);
    }


    @Override
    public float calcularPrecio() {
        float precio = (float) (getPrecioBase() * 1.21f);
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"
                + "IVA: "+this.IVA;
    }
    
}
