/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param vehiculo
     */
    
    public static void procesarVehiculo(Vehiculo vehiculo){
    
        vehiculo.mostrarMovimiento();
        
        if(vehiculo instanceof Coche){
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento();
        }
        else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento();
        }
        
    }
    
    public static void main(String[] args) {

        Vehiculo coche1 = new Coche(50, false);
        Vehiculo moto1 = new Moto(10, false);

        procesarVehiculo(coche1);
        System.out.println();
        procesarVehiculo(moto1);
        
    }
    
}
