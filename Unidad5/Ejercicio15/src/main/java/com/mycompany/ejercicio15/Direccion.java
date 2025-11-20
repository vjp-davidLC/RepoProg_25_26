/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio15;

/**
 *
 * @author David López
 */
public class Direccion { // clase que recoge los datos al crear el objeto
    
    //Atributos que contiene la clase
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    // COnstructor de la clase
    Direccion(String call, int num, int p, String ciu) {
    
        calle = call;
        numero = num;
        piso = p;
        ciudad = ciu;
 
}
    
    Direccion() {
    
        calle = "";
        numero = 0;
        piso = 0;
        ciudad = "";
 
}
    
    // metodos set
    public void establecerCalle(String c) {
        calle = c;
    }
    
    public void establecerNumero(int n) {
        numero = n;
    }
    
    public void establecerPiso(int p) {
        piso = p;
    }
    
    public void establecerCiudad(String c) {
        ciudad = c;
    }
    
    // metodos get
    public String obtenerCalle() {
        return calle;
    }
    
    public int obtenerNumero() {
        return numero;
    }
    
    public int obtenerPiso() {
        return piso;
    }
    
    public String obtenerCiudad() {
        return ciudad;
    }
    
    // con este metodo lo que hacemos es mostrar los datos que contiene la clase Direccion
    public String toString() {
 
        return "Calle: " + calle + "\n" +
           "Número: " + numero + "\n" +
           "Piso: " + piso + "\n" +
           "Ciudad: " + ciudad; 
        
    }
    
}
