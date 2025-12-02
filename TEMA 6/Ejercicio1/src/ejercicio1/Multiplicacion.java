/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    // ATRIBUTOS
    private int multiplicador;
    
    // CONSTRUCTORES
    // Por defecto
    public Multiplicacion() {
        super();
        this.multiplicador = 0;
    }
    // Parametrizado
    public Multiplicacion(int numero, int multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    // GETTERS Y SETTERS
    public int getMultiplicador() {
        return this.multiplicador;
    }
    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    // MÉTODOS
    @Override
    public void realizarOperacion() {
        System.out.println(multiplicador * getNumero());
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Multiplicador: " + multiplicador;
    }
    
}
