/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author fmont
 */
public abstract class FiguraGeometrica {
    // ATRIBUTOS
    private String color;
    
    // CONSTRUCTORES
    // Por defecto
    public FiguraGeometrica() {
        this.color = "";
    }
    // Parametrizado
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    // GETTERS Y SETTERS
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // MÉTODOS
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    
    // TO STRING
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
    
    
}
