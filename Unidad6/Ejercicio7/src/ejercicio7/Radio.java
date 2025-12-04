/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author David
 */
public class Radio implements ControlRemoto{
    
    // Atributos
    private boolean encendido;
    private float emisora;
    private int volumen;

    // Constructores
    // Constructores por defecto
    public Radio() {
        this.encendido = false;
        this.emisora = 80.0f;
        this.volumen = 15;
    }
    
    //Constructores parametrizado
    public Radio( float emisora, int volumen) {
        this.emisora = emisora;
        this.volumen = volumen;
    }
    
    // Métodos setters
    public void setEmisora(float emisora){
        this.emisora = emisora;
    }
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    
    // Métodos getters
    public float setEmisora(){
        return this.emisora;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    // metodo que encienda la RADIO si esta apagada
    @Override
    public void encender(){
        
        if (!this.encendido) {
        this.encendido = true;
        }
    }
    
    // metodo que aoaga la TV si esta encendida
    @Override
    public void apagar(){
        
        if (this.encendido) {
        System.out.println("La RADIO se apagara en 10s");
        this.encendido = false;
        }
    }
    
    // metodo que resta 5 al atributo Volumen
    @Override
    public void bajarVolumen(){
        
        if (this.encendido){
            this.volumen = this.volumen - 5 ;
            System.out.println("Volumen actual : "+this.volumen);
        }
    }
    // metodo que suma 1 al atributo Volumen
    @Override
    public void subirVolumen(){
        
        if (this.encendido){
            this.volumen = this.volumen + 5 ;
            System.out.println("Volumen actual : "+this.volumen);
        }
    }
    
    // Método que cambia la emisora segun lo que le pasemos por prámetro
    @Override
    public void cambiarCanal(float emisora){
    
        if (this.encendido){
            this.emisora = emisora;
            System.out.println("Emisora cambiada: "+this.emisora);
        }  
    }
    
    // Método Mostrar
    public void mostrarTelevisor(){
    
        System.out.println("\n__Informacion de la RADIO__");
        if (!this.encendido){
            System.out.println("RADIO Apagada");
        } else {
            System.out.println("RADIO Encendida");
        }
        
        System.out.println("Emisora : "+this.emisora);
        System.out.println("Volumen : "+this.volumen);
        System.out.println("-------------------------\n");
    }
    
}
