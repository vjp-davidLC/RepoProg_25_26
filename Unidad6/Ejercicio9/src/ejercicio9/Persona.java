/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author David
 */
public class Persona implements Gravable{
    
    private int dni;
    private int ingresosAnuales;

    public Persona() {
        this.dni = 0;
        this.ingresosAnuales = 0;
    
    }

    public Persona(int dni, int ingresosAnuales) {
        this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setIngresosAnuales(int ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    

    public int getDni() {
        return dni;
    }

    public int getIngresosAnuales() {
        return ingresosAnuales;
    }

    
    @Override
    public String toString() {
        return "DNI: "+this.dni+"\n"
                + "Ingresos ANUALES: "+this.ingresosAnuales+" euros.";

    }

    @Override
    public void calcularImpuesto() {

        
        if (this.ingresosAnuales <= 12450) {
            System.out.println("La persona con el dni "+this.dni+" paga por el IRPF un 19%");
        }
        else if (this.ingresosAnuales <= 20200) {
            System.out.println("La persona con el dni "+this.dni+" paga por el IRPF un 24%");
        }
        else if (this.ingresosAnuales <= 35200) {
            System.out.println("La persona con el dni "+this.dni+" paga por el IRPF un 30%");
        }
        else if (this.ingresosAnuales <= 60000) {
            System.out.println("La persona con el dni "+this.dni+" paga por el IRPF un 37%");
        }
        else if (this.ingresosAnuales <= 300000) {
            System.out.println("La persona con el dni "+this.dni+" paga por el IRPF un 45%");
        }
        else{
            System.out.println("La persona con el dni "+this.dni+" paga por el IRPF un 47%");
        }
    }
    
    
    
}
