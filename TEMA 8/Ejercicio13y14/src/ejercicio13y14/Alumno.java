/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13y14;

/**
 *
 * @author alumno
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private double notaMedia;
    
    // CONSTRUCTORES
    // Por defecto
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0;
    }
    // Parametrizado
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return this.notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }
    
}
