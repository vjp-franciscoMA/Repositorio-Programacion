/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author alumno
 */
public class Alumno implements Comparable<Alumno>{
    // ATRIBUTOS
    private String dni;
    private int expediente;
    private float notaMedia;
    
    // CONSTRUCTORES
    // Por defecto
    public Alumno() {
        this.dni = "";
        this.expediente = 0;
        this.notaMedia = 0.0f;
    }
    // Parametrizado
    public Alumno(String dni, int expediente, float notaMedia) {
        this.dni = dni;
        this.expediente = expediente;
        this.notaMedia = notaMedia;
    }
    
    // GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // MÉTODOS
    @Override
    public int compareTo(Alumno o) {
        return (int) (this.getExpediente() - o.getExpediente());
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", expediente=" + expediente + ", notaMedia=" + notaMedia + '}';
    }
    
}
