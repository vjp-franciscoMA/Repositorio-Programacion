/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author alumno
 */
public class Dia {
    // ATRIBUTOS
    private String nombreDia;
    private int temperatura;
    
    // CONSTRUCTORES
    // Por defecto
    public Dia() {
        this.nombreDia = "";
        this.temperatura = 0;
    }
    // Parametrizado
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
    
    // GETTERS Y SETTERS
    public String getNombreDia() {
        return this.nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
}
