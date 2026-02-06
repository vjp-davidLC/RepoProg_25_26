/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author David López
 */
public class Empleado {
    
    // atributos de la clase
    private String nombre;
    private int numeroHoras;
    private float tarifa;
    
    // constructores de la clase
    
    // por defecto
    public Empleado() {
    
        this.nombre = "";
        this.numeroHoras = 0;
        this.tarifa = 0;
    }
    
    // parametrizado
    public Empleado(String nom, int num, float tarif) {
        this.nombre = nom;
        this.numeroHoras = num;
        this.tarifa = tarif;
    }
    
    // metodos getters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public float getTarifa() {
        return tarifa;
    }

    // métodos setters   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    // método toString
    
    public String toString() {
        return this.nombre+" trabajo "+this.numeroHoras+" horas, cobra";
    }
    
}
