/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Autobus {
    // ATRIBUTOS
    private String matricula;
    private Map<String, Conductor> conductores;
    
    // CONSTRUCTORES
    // Por defecto
    public Autobus() {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }
    // Parametrizado
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }
    
    public Autobus(String matricula, Map<String, Conductor> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }
    
    
    // GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, Conductor> conductores) {
        this.conductores = conductores;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }
    
}
