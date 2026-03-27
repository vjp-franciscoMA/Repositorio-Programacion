/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class Sede implements Comparable<Sede>{
    // ATRIBUTOS
    private String nombre;
    private double ingresos;
    
    // CONSTRUCTORES
    // Por defecto
    public Sede() {
        this.nombre = "";
        this.ingresos = 0;
    }
    // Parametrizado
    public Sede(String nombre, double ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    // MÉTODOS
     @Override
    public int compareTo(Sede o) {
        return (int) (o.getIngresos() - this.getIngresos());    
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresos=" + ingresos + '}';
    }
    
}
