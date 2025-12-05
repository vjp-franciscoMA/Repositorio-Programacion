/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.tema5;

/**
 *
 * @author fmont
 */
public class Coche {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean motorEncendido;
    // CONSTRUCTORES
    // Por defecto
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.velocidad = 0;
        this.motorEncendido = false;
    }
    // Parametrizado
    public Coche(String marca, String modelo, int velocidad, boolean motorEncendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;
    }
    
    // GETTES Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean getMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
    
    // MÉTODOS
    public String establecerMarca() {
        return marca;
    }
    public String establecerModelo() {
        return modelo;
    }
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }
    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }
    public void acelerarCoche() {
        velocidad = velocidad + 20;
    }
    public void frenarCoche() {
        velocidad = velocidad - 6;
    }
    
    // TO STRING

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", motorEncendido=" + motorEncendido + '}';
    }
    
}
    