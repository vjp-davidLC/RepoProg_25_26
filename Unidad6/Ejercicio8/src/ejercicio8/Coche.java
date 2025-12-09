/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author David
 */
public class Coche extends Vehiculo{
    
    private boolean aireAcondicionado;

    public Coche() {
        super();
        this.aireAcondicionado = false;
    }

    public Coche(int velocidad,boolean aireAcondicionado) {
        super(velocidad);
        this.aireAcondicionado = aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Aire acondicionado --> "+this.aireAcondicionado;

    }

    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche esta circulando a "+getVelocidad()+"km/h.");
    }
    
    public void encenderAire(){
      
        if(!this.aireAcondicionado){
            this.aireAcondicionado = true;
            System.out.println("El coche ha encendido el aire. La velocidad se reduce");
            setVelocidad(getVelocidad() - 10);
        }
        else{
            System.out.println("El aire ya esta encendido.");
        }
    
    }
    
}
