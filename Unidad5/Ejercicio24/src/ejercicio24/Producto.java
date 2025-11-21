/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author David
 */
public class Producto { // SUPERCLASE que recogerá los datos a traves de los atributos
    
    // atributos de la clase
    private int mesCaducidad;
    private int anhoCaducidad;
    private int numeroLote;

    // constuctores de las clase
    // constuctor parametrizado
    Producto(int mesCaducidad, int anhoCaducidad, int numeroLote) {
    
        this.mesCaducidad = mesCaducidad;
        this.anhoCaducidad = anhoCaducidad;
        this.numeroLote = numeroLote;
    
    }

    Producto() {
    
        this.mesCaducidad = 0;
        this.anhoCaducidad = 0;
        this.numeroLote = 0;
    
    }
    
    
    
    // metodos get
    public void establecerMesCaducidad(int mesCaducidad) {
        this.mesCaducidad = mesCaducidad;
    }
    
    public void estableceraAnhoCaducidad(int anhoCaducidad) {
        this.anhoCaducidad = anhoCaducidad;
    }
    
    public void establecerNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    // metodos set
    public int obtenerMesCaducidad() {
        return mesCaducidad;
    }
    
    public int obtenerAnhoCaducidad() {
        return anhoCaducidad;
    }
    
    public int obtenerNumeroLote() {
        return numeroLote;
    }
    
    
    // metodo que muestra la informacion del producto 
    public void mostrarInformacionProducto() {
    
        System.out.println("Fecha de caducidad -> MES "+mesCaducidad+" ANHO "+anhoCaducidad );
        System.out.println("Numero de Lote -> "+numeroLote);
    
    }
    
}
