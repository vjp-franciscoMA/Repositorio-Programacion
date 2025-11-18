/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author alumno
 */
public class Enunciado {
    // ATRIBUTOS
    private String pregunta;
    private String respuesta;
    
    // CONSTRUCTORES
    // Por defecto
    public Enunciado() {
        this.pregunta = "";
        this.respuesta = "";
    }
    // Parametrizado
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    // GETTERS Y SETTERS
    public String getPregunta() {
        return this.pregunta;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public String getRespuesta() {
        return this.respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Pregunta: "+pregunta+", Respuesta: "+respuesta; 
    }
    
    
}
