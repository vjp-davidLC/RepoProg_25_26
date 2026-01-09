/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author David
 */
public class Vehiculo implements Gravable{
    
    private int matricula;
    private int dni;
    private int cc;

    public Vehiculo() {
        this.matricula = 0;
        this.dni = 0;
        this.cc = 0;
    
    }

    public Vehiculo(int matricula,int dni, int cc) {
        this.matricula = matricula;
        this.dni = dni;
        this.cc = cc;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
   
    public int getDni() {
        return dni;
    }

    public int getCc() {
        return cc;
    }

    public int getMatricula() {
        return matricula;
    }
    
    

    @Override
    public String toString() {
        return "DNI: "+this.dni+"\n"
                + "Matricula: "+this.matricula+"\n"
                + "Centimetros cubicos: "+this.cc;

    }

    @Override
    public void calcularImpuesto() {

        if (this.cc <= 1000) {
            System.out.println("El vehiculo con la matricula "+this.matricula+" paga una Tarifa de 12 euros");
        }
        else if (this.cc <= 1499) {
            System.out.println("El vehiculo con la matricula "+this.matricula+" paga una Tarifa de 34 euros");
        }
        else if (this.cc <= 1999) {
            System.out.println("El vehiculo con la matricula "+this.matricula+" paga una Tarifa de 71 euros");
        }
        else if (this.cc <= 2999) {
            System.out.println("El vehiculo con la matricula "+this.matricula+" paga una Tarifa de 122 euros");
        }
        else {
            System.out.println("El vehiculo con la matricula "+this.matricula+" paga una Tarifa de 152 euros");
        }
    }
    
}
