/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora{
    // ATRIBUTOS
    private int exponente;
    
    // CONSTRUCTORES
    // Por defecto
    public Potencia() {
        super();
        this.exponente = 0;
    }
    // Parametrizado
    public Potencia(int numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }

    // GETTERS Y SETTERS
    public int getExponente() {
        return this.exponente;
    }
    
    public void setExponente(int exponente) {    
        this.exponente = exponente;
    }

    // MÉTODOS
    @Override
    public void realizarOperacion() {
        System.out.println(Math.pow(getNumero(), exponente));
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + ", Exponente: " + exponente;
    }
    
}
