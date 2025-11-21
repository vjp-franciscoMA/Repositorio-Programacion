/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author alumno
 */
public class Servidor {
    // ATRIBUTOS
    private int memoriaRAM;
    private int discoDuro;
    private String procesador;
    private String tarjetaGrafica;
    private double precio;
    private double tamanoMonitor;
    private String teclado;
    private String raton;

    // CONSTRUCTORES
    // Por defecto
    public Servidor() {
        this.memoriaRAM = 0;
        this.discoDuro = 0;
        this.procesador = "";
        this.tarjetaGrafica = "";
        this.precio = 0;
        this.tamanoMonitor = 15;
        this.teclado = "";
        this.raton = "";
    }

    // Parametrizado
    public Servidor(int memoriaRAM, int discoDuro, String procesador, String tarjetaGrafica, double precio, double tamanoMonitor, String teclado, String raton) {
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.precio = precio;
        this.tamanoMonitor = tamanoMonitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    // GETTERS Y SETTERS
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public String getProcesador() {
        return procesador;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

    public void setTamanoMonitor(double tamanoMonitor) {
        this.tamanoMonitor = tamanoMonitor;
    }
    public double getTamanoMonitor() {
        return tamanoMonitor;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    public String getTeclado() {
        return teclado;
    }

    public void setRaton(String raton) {
        this.raton = raton;
    }
    public String getRaton() {
        return raton;
    }

    // TO STRING
    @Override
    public String toString() {
        return "RAM: " + memoriaRAM + "GB, Disco: " + discoDuro + "GB, Procesador: " + procesador +
               ", Tarjeta gráfica: " + tarjetaGrafica + ", Precio: " + precio + "€, Monitor: " +
               tamanoMonitor + "\", Teclado: " + teclado + ", Ratón: " + raton;
    }
}
