/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona{
    // ATRIBUTOS
    private String especialidad;
    
    // CONSTRUCTORES
    // Por defecto
    public Profesor() {
        super();
        this.especialidad = "";
    }
    // Parametrizado
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    
    // GETTERS Y SETTERS
    public String getEspecialidad() {
        return this.especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // MÉTODOS
    @Override
    public String saludar() {
        return "Hola, soy el profesor " + getNombre() + ", y soy de la especialidad de " + especialidad;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + especialidad;
    }
    
}
