/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author fmont
 */
public class Triangulo extends TrianguloRectangulo{
    // ATRIBUTOS
    private double base;
    private double altura;
    
    // CONSTRUCTORES
    // Por defecto
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }
    // Parametrizado
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // GETTERS Y SETTERS
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // MÉTODOS
    @Override
    public double hipotenusa() {
        return Math.hypot(base, altura);
    }

    @Override
    public void tipoTriangulo() {
        if (base == altura && altura == hipotenusa()) {
            System.out.println("El triángulo es equilátero.");
        }
        else if (base == altura || base == hipotenusa() || altura == hipotenusa()) {
            System.out.println("El triángulo es isósceles.");
        }
        else {
            System.out.println("El triángulo es escaleno.");
        }
    }
    
    
    // TO STRING
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
