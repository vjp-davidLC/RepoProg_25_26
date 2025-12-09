/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author David
 */
public class SuscripcionPeriodico extends Suscripcion{
    
    private final float IVA = 0.10f;

    public SuscripcionPeriodico() {
        super();
    }

    public SuscripcionPeriodico(float precioBase) {
        super(precioBase);
    }


    @Override
    public float calcularPrecio() {
        float precio = (float) (getPrecioBase() * 1.10);
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"
                + "IVA: "+this.IVA;
    }
    
    
    
}
