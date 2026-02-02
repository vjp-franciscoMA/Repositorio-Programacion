/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package ejercicio11y12;

/**
 *
 * @author alumno
 */
public class Mueble {
    // ATRIBUTOS
    private double precio;
    private String descripcion;
    
    // CONSTRUCTORES
    // Por defecto
    public Mueble() {
        this.precio = 0;
        this.descripcion = "";
    }
    // Parametrizado
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    // GETTERS Y SETTERS
    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
    
}
