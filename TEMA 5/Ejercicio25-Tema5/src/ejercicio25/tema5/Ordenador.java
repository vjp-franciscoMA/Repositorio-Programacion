/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25.tema5;

import java.util.Scanner;

/**
 *
 * @author fmont
 */
public class Ordenador {
    // ATRIBUTOS
    private int cantidadMemoria;
    private int capacidadDisco;
    private String modeloProcesador;
    private String modeloTarjeta;
    private int precio;
    
    // CONSTRUCTORES
    // Por defecto
    public Ordenador() {
        this.cantidadMemoria = 0;
        this.capacidadDisco = 0;
        this.modeloProcesador = "";
        this.modeloTarjeta = "";
        this.precio = 0;
    }
    // Parametrizado
    public Ordenador(int cantidadMemoria, int capacidadDisco, String modeloProcesador, String modeloTarjeta, int precio) {
        this.cantidadMemoria = cantidadMemoria;
        this.capacidadDisco = capacidadDisco;
        this.modeloProcesador = modeloProcesador;
        this.modeloTarjeta = modeloTarjeta;
        this.precio = precio;
    }
    
    // GETTERS Y SETTERS
    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloTarjeta() {
        return modeloTarjeta;
    }

    public void setModeloTarjeta(String modeloTarjeta) {
        this.modeloTarjeta = modeloTarjeta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // MÉTODOS
    public void controlarCapacidad() {

    }
    
    // TO STRING

    @Override
    public String toString() {
        return "Ordenador{" + "cantidadMemoria=" + cantidadMemoria + ", capacidadDisco=" + capacidadDisco + ", modeloProcesador=" + modeloProcesador + ", modeloTarjeta=" + modeloTarjeta + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
