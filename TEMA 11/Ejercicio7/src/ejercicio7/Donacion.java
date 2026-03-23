/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Donacion {
    // ATRIBUTOS
    private String nombre;
    private double cantidad;

    // CONSTRUCTORES
    // Por defecto
    public Donacion() {
        this.nombre = "";
        this.cantidad = 0;
    }

    // Parametrizado
    public Donacion(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
}
