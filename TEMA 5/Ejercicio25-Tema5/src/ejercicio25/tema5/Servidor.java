/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25.tema5;

/**
 *
 * @author fmont
 */
public class Servidor extends Ordenador{
    // ATRIBUTOS
    private int tamanoMonitor;
    private String modeloTeclado;
    private String modeloRaton;
    
    // CONSTRUCTORES
    // Por defecto
    public Servidor() {
        super();
        this.tamanoMonitor = 0;
        this.modeloTeclado = "";
        this.modeloRaton = "";
    }
    // Parametrizado
    public Servidor(int tamanoMonitor, String modeloTeclado, String modeloRaton, int cantidadMemoria, int capacidadDisco, String modeloProcesador, String modeloTarjeta, int precio) {
        super(cantidadMemoria, capacidadDisco, modeloProcesador, modeloTarjeta, precio);
        this.tamanoMonitor = tamanoMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }
    
    // GETTERS Y SETTERS
    public int getTamanoMonitor() {
        return tamanoMonitor;
    }

    public void setTamanoMonitor(int tamanoMonitor) {
        this.tamanoMonitor = tamanoMonitor;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }
    
    // MÉTODOS
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString()+ ", Servidor{" + "tamanoMonitor=" + tamanoMonitor + ", modeloTeclado=" + modeloTeclado + ", modeloRaton=" + modeloRaton + '}';
    }
    
    
    
}
