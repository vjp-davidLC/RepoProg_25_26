/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author David
 */
public class Moto extends Vehiculo{
    
    private boolean haciendoCaballito;

    public Moto() {
        super();
        this.haciendoCaballito = false;
    }

    public Moto(int velocidad,boolean haciendoCaballito) {
        super(velocidad);
        this.haciendoCaballito = haciendoCaballito;
    }

    public void setHaciendoCaballito(boolean haciendoCaballito) {
        this.haciendoCaballito = haciendoCaballito;
    }

    public boolean getHaciendoCaballito() {
        return haciendoCaballito;
    }

    @Override
    public String toString() {
        return "Haciendo caballito --> "+this.haciendoCaballito;

    }

    @Override
    public void mostrarMovimiento() {
        System.out.println("La moto esta circulando a "+getVelocidad()+"km/h.");
    }
    
    public void hacerCaballito(){
      
        if(!this.haciendoCaballito){
            this.haciendoCaballito = true;
            System.out.println("La moto esta haciendo un caballito. La velocidad aumenta.");
            setVelocidad(getVelocidad() + 15);
        }
        else{
            System.out.println("La moto ya esta haciendo un caballito.");
        }
    
    }
}
