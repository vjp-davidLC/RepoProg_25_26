/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author David
 */
public class CuentaClave extends Cuenta{

    private int clave;
    
    //  CONSTURCTORES
    public CuentaClave() {
    }

    public CuentaClave(int clave) {
        this.clave = clave;
    }

    public CuentaClave(int clave, float saldo) {
        super(saldo);
        this.clave = clave;
    }
    
    // metodo setter
    public void establecerClave(int clave) {
        this.clave = clave;
    }
    
    // metodo getter
    public int devolverClave() {
        return this.clave;
    }

   
    
    @Override
    public void extraerSaldo(float retirar) {
        
        if (getSaldo() >= retirar) {
            establecerSaldo(retirar);
        } 
        
    }
    
    @Override
    public String toString() {
        return "Clave: "+this.clave;
    }
    
    
    
}
