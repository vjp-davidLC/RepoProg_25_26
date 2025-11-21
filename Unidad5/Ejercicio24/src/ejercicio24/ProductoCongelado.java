/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author David
 */
public class ProductoCongelado extends Producto{ // SUBCLASE de la superclase de Producto
    
    // atributos de la clase
    private int temperaturaCongelacion;
    
    // constuctor por defecto
    public ProductoCongelado() {
    
        this.temperaturaCongelacion = 0;
   
    }
    
    //constuctor parametrizado

    public ProductoCongelado(int temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
    
    
    // constructor de la clase implementando los atributos de la SUPERCLASE Producto
    ProductoCongelado(int mesCaducidad, int anhoCaducidad, int numeroLote) {
        super(mesCaducidad, anhoCaducidad, numeroLote);
    }
    // metodo get
    public void establecerTemperaturaCongelacion(int temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }
    
    // metodos set
    public int obtenerTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }
    
    public void mostrarInformacionProductoCongelado() {
    
        System.out.println("-- Producto Congelado --");
        super.mostrarInformacionProducto();
        System.out.println("Temperatura de congelación recomendada -> "+temperaturaCongelacion);
        System.out.println("");
    }
    
}
