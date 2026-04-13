/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Contacto implements Comparable<Contacto>{
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private String numeroMovil;
    
    // CONSTRUCTORES
    // Por defecto
    public Contacto() {
        this.nombre = "";
        this.edad = 0;
        this.numeroMovil = "";
    }
    // Parametrizado
    public Contacto(String nombre, int edad, String numeroMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMovil = numeroMovil;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(String numeroMovil) {
        this.numeroMovil = numeroMovil;
    }
    
    // MÉTODOS
    @Override
    public int compareTo(Contacto o) {
        return (int)(o.getEdad() - this.getEdad());
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", numeroMovil=" + numeroMovil + '}';
    }
    
}
