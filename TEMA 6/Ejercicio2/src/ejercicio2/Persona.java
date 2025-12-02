/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    // ATRIBUTOS
    private String nombre;
    
    // CONSTRUCTORES
    // Por defecto
    public Persona() {
        this.nombre = "";
    }
    // Parametrizado
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // MÉTODOS
    public abstract String saludar();
    
    // TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
