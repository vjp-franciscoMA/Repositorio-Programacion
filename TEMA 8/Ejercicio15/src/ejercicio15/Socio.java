/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Socio {
    // ATRIBUTOS
    private String nombre;
    private double abonado;
    
    // CONSTRUCTORES
    // Por defecto
    public Socio() {
        this.nombre = "";
        this.abonado = 0;
    }
    // Parametrizado
    public Socio(String nombre, double abonado) {
        this.nombre = nombre;
        this.abonado = abonado;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAbonado() {
        return abonado;
    }

    public void setAbonado(double abonado) {
        this.abonado = abonado;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", abonado=" + abonado + '}';
    }
    
}
