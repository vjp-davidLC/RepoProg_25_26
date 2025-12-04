/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author David
 */
public class Televisor implements ControlRemoto{
    
    //Atributos de la clase
    private boolean encendido;
    private int canal;
    private int volumen;
    
    // Consturctores
    // Constructor por defecto
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }

    // Constructor parametrizado
    public Televisor( int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }
    
    // Métodos setters      
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    
    // Métodos getters
    public int getCanal(){
        return canal;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    // Métodos declarados en la interfaz
    
    // metodo que encienda la TV si esta apagada
    @Override
    public void encender(){
        
        if (!this.encendido) {
        this.encendido = true;
        System.out.println("Canal actual: " + this.canal);
        }
    }
    
    // metodo que aoaga la TV si esta encendida
    @Override
    public void apagar(){
        
        if (this.encendido) {
        System.out.println("La TV se apagara en 10s");
        this.encendido = false;
        }
    }
    
    // metodo que resta 1 al atributo Volumen
    @Override
    public void bajarVolumen(){
        
        if (this.encendido){
            this.volumen --;
            System.out.println("Volumen actual : "+this.volumen);
        }
        
    }
    // metodo que suma 1 al atributo Volumen
    @Override
    public void subirVolumen(){
        
        if (this.encendido){
            this.volumen ++;
            System.out.println("Volumen actual : "+this.volumen);
        }
        
    }
    
    // Método que cambia el canal segun lo que le pasemos por prámetro
    @Override
    public void cambiarCanal(float canal){
    
        if (this.encendido){
            this.canal = (int)canal; //hacemos un casting para cambiar el tipo del valor
            System.out.println("Canal cambiado: "+ this.canal);
        }
        
    }
    
    // Método Mostrar
    public void mostrarTelevisor(){
        
        System.out.println("\n__Informacion de la TV__");
        if (!this.encendido){
            System.out.println("TV Apagada");
        } else {
            System.out.println("TV Encendida");
        }
        
        System.out.println("Canal : "+this.canal);
        System.out.println("Volumen : "+this.volumen);
        System.out.println("-------------------------\n");
    }
}
