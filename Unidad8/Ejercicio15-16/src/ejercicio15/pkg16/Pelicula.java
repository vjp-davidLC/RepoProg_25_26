/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15.pkg16;

import static ejercicio15.pkg16.Ejercicio1516.pedirCantidad;
import java.net.SocketOptions;
import java.util.Scanner;

/**
 *
 * @author David López
 */
public class Pelicula {
    //atributos
    private String titulo;
    private int costeLicencia;
    private Socios[] socios;
    
    // constructores
    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0;
        this.socios = new Socios[4]; // por defecto tendrá un tamaño de 4 posiciones
    }

    public Pelicula(String titulo, int costeLicencia, Socios[] socios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = socios;
    }
    
    // métodos setters

    public void setCosteLicencia(int costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public void setSocios(Socios[] socios) {
        this.socios = socios;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // métodos getters

    public int getCosteLicencia() {
        return costeLicencia;
    }

    public Socios[] getSocios() {
        return socios;
    }

    public String getTitulo() {
        return titulo;
    }
    
    // pide el nombre del socio
    public String pedirNombre() {
    
        Scanner entrada = new Scanner(System.in);
        String nombreSocio;
        
        System.out.println("Introduzca el nombre del socio: ");
        nombreSocio = entrada.nextLine();
        
        return nombreSocio;
        
    }
    
    // pide el precio abonado del socio
    public int precioAbonadoAleatorio() {

        Scanner entrada = new Scanner(System.in);
        int precioAbonado = (int) (Math.random()*1000000); // numero aleatorio del 0- 1M

        return precioAbonado;
        
    }
    
    // método que rellena 
    public void rellenarSocios() {
        
        for (int i = 0; i < this.socios.length; i++) {
            
            this.socios[i] = new Socios();
            
            socios[i].setNombre(pedirNombre()); // inserta un nombre dado por el usuario
            socios[i].setPrecioAbonado(precioAbonadoAleatorio()); // inserta un precio aleatorio
            System.out.println("Precio del abonado insertado aleatoriamente: "+socios[i].getPrecioAbonado()+" euros. \n");
        }
    
    }
    
    // método mostrar
    public void mostrar() {
        System.out.println("\n-- PELICULA --");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Coste de la licencia: "+this.costeLicencia+"\n");
        System.out.println("-- SOCIOS --");
        
        // tanbien mostraremos los valores del atributo socios[]
        for (int i = 0; i < this.socios.length; i++) {
            
            if (socios[i] != null) {
                socios[i].mostrar();
            }
            
        }
        
    }
    
    // método que calcula el beneficio total de una pelicula
    public int beneificioPelicula() {
    
        int beneficio = 0;
        int totalAbonado = 0;
        
        for (int i = 0; i < this.socios.length; i++) {
            
            totalAbonado += socios[i].getPrecioAbonado();
            
        }
        
        beneficio = totalAbonado - this.costeLicencia;
        
        return beneficio;
    }
    
    // apartado 6
    
    
    public int sociosConMayorImporte(int cantidadUsuario) {
    
        int contadorSocios = 0;
        
        for (int i = 0; i < socios.length; i++) {
            
            if (socios[i] != null && this.socios[0].getPrecioAbonado() > cantidadUsuario) {
                contadorSocios ++;
            }
            
        }
    
        return contadorSocios;
        
    }
    
}
