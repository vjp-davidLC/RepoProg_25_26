/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio15;

/**
 *
 * @author David López
 */
public class Empleado { // clase que recogera los datos con su direccion
    
    // Atributos que contiene la clase
    private String nombre;
    private int salario;
    private Direccion direccion; // este atributo es de tipo Direccion que contendrá los datos de esa misma clase
    
    // consturctor de la clase
    Empleado(String nom, int sal, Direccion direc) {
        nombre = nom;
        salario = sal;
        direccion = direc;
    }
    
    // metodos set 
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerSalario(int s){
        salario = s;
    }
    
    public void establecerDireccion(Direccion d) {
        direccion = d;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int obtenerSalario() {
        return salario;
    }
    
    public Direccion obtenerDireccion() {
        return direccion;
    }
    
    // metodo que muestra los datos de la clase
    public String toString() {
    return "Nombre: " + nombre + "\n" +
           "Salario: " + salario + "\n" +
           "Dirección:\n" + direccion.toString();
}
}
