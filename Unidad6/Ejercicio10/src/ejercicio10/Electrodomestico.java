/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author David
 */
public class Electrodomestico implements ConsumoEnergetico{
    
    private int kwh;
    private float precioKwh;
    private String eficiencia;

    public Electrodomestico() {
        this.kwh = 0;
        this.precioKwh = 0f;
        this.eficiencia = "";
    }

    public Electrodomestico(int kwh, float precioKwh, String eficiencia) {
        this.kwh = kwh;
        this.precioKwh = precioKwh;
        this.eficiencia = eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public void setPrecioKwh(float precioKwh) {
        this.precioKwh = precioKwh;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public int getKwh() {
        return kwh;
    }

    public float getPrecioKwh() {
        return precioKwh;
    }

    @Override
    public String toString() {
        return "kwh: "+this.kwh+"\n"
                + "Precio kwh: "+this.precioKwh+"\n"
                + "Eficiencia: "+this.eficiencia;
    }

    @Override
    public float calcularConsumo(float horasDeUso) {
    
        return horasDeUso * this.kwh * obtenerFactorEficiencia(this.eficiencia);
    }

    @Override
    public float calcularFactura(float horasDeUso) {

        return calcularConsumo(horasDeUso) * this.precioKwh;
    }
    
    public float obtenerFactorEficiencia(String eficiencia) {
        
        float factorEficiencia;
        
        switch (eficiencia) {
            case "A++":
                factorEficiencia = 0.5f;
                break;
            case "A+":
                factorEficiencia = 0.7f;
                break;
            case "A":
                factorEficiencia = 1f;
                break;
            case "B":
                factorEficiencia = 1.2f;
                break;
            default:
                factorEficiencia = 1f;
        }
        
        return factorEficiencia;
    }
    
}
