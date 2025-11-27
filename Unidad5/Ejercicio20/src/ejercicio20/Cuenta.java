/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

/**
 *
 * @author David
 */
public class Cuenta {
    
    // Atributos de la clase      
    private float saldo;
    
    // constructor por defecto
    public Cuenta() {
        this.saldo = 0;
    }
    
    // constructor parametrizado
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }
    
    // metodo setter (establecer)
    public void establecerSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    // meotodo que suma el saldo
    public void ingresarSaldo(float saldo) {
        this.saldo += saldo;
    }
    
    // metodo getter (devolver)
    public float getSaldo() {
        return this.saldo;
    }
    
    // metodo que resta el saldo 
    public void extraerSaldo(float retirar) {
        this.saldo = this.saldo - retirar;
        
    }
    
    // metodo mostrar
    @Override
    public String toString() {
        return "su saldo actual es de "+this.saldo;
    }
    
    
    
}
