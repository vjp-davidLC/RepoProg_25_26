/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author David López
 */
public class Empleado { // clase que recogerá los datos del empleado
    
    // atributos de la clase
    private String nombre;
    private int numeroHoras;
    private float tarifa;
    
    // constructores de la clase
    
    // por defecto
    public Empleado() {
    
        nombre = "";
        numeroHoras = 0;
        tarifa = 0;
    }
    
    // parametrizado
    Empleado(String nom, int num, float tarif) {
        nombre = nom;
        numeroHoras = num;
        tarifa = tarif;
    }
    
    // metodos get de los propios atributos de la clase
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerNumeroHoras() {
        return numeroHoras;
    }
    
    public float obtenerTarifa() {
        return tarifa;
    }

    
    public String toString() {
        return this.nombre+" trabajo "+this.numeroHoras+" horas, cobra";
    }
    
    
    
}
