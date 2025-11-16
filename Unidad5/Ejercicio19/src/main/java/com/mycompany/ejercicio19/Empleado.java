/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio19;

/**
 *
 * @author David López
 */
public class Empleado {
    
    private String nombre;
    private int numeroHoras;
    private float tarifa;
    
    Empleado(String nom, int num, float tarif) {
        nombre = nom;
        numeroHoras = num;
        tarifa = tarif;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int numeroHoras() {
        return numeroHoras;
    }
    
    public float tarifa() {
        return tarifa;
    }
    
}
