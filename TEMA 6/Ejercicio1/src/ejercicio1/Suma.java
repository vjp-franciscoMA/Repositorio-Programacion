/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora {
    // ATRIBUTOS
    private int sumando;
    
    // CONSTRUCTORES
    // Por defecto
    public Suma() {
        super();
        this.sumando = 0;
    }
    // Parametrizado
    public Suma(int numero, int sumando) {
        super(numero);
        this.sumando = sumando;
    }
    
    // GETTERS Y SETTERS
    public int getSumando() {
        return this.sumando;
    }
    public void setSumando(int sumando) {
        this.sumando = sumando;
    }
    
    // MÉTODOS
    @Override
    public void realizarOperacion() {
        System.out.println(sumando + getNumero());
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + ", Sumando: " + sumando;
    }
    
}
