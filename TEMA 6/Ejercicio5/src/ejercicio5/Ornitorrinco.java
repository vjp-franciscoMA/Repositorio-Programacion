/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author fmont
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    // ATRIBUTOS
    private int numeroHuevos;
    
    // CONSTRUCTORES
    // Por defecto
    public Ornitorrinco() {
        this.numeroHuevos = 0;
    }
    // Parametrizado
    public Ornitorrinco(int numeroHuevos, String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.numeroHuevos = numeroHuevos;
    }
    
    // GETTERS Y SETTERS
    public int getNumeroHuevos() {
        return this.numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }
    
    // MÉTODOS
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo.";
    }

    @Override
    public void ponerHuevo() {
        numeroHuevos++;
    }

    @Override
    public void incubarHuevo() {
        numeroHuevos--;
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println(numeroHuevos);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString()+ ", Ornitorrinco{" + "numeroHuevos=" + numeroHuevos + '}';
    }
    
    
    
    
}
