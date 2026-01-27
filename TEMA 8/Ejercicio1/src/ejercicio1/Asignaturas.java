/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Asignaturas {
    // ATRIBUTOS
    private String asignatura;
    private double nota;
    
    // CONSTRUCTORES
    // Por defecto
    public Asignaturas() {
        this.asignatura = "";
        this.nota = 0;
    }
    // Parametrizado
    public Asignaturas(String asignatura, double nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }
    
    // GETTERS Y SETTERS
    public String getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Asignaturas{" + "asignatura=" + asignatura + ", nota=" + nota + '}';
    }
    
    
    
    
}
