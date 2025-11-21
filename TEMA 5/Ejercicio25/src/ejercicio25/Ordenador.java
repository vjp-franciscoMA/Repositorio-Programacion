/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author alumno
 */
public class Ordenador {
    // ATRIBUTOS
    private int memoriaRAM;
    private int discoDuro;
    private String procesador;
    private String tarjetaGrafica;
    private double precio;

    // CONSTRUCTORES
    // Por defecto
    public Ordenador() {
        this.memoriaRAM = 0;
        this.discoDuro = 0;
        this.procesador = "";
        this.tarjetaGrafica = "";
        this.precio = 0;
    }

    // Parametrizado
    public Ordenador(int memoriaRAM, int discoDuro, String procesador, String tarjetaGrafica, double precio) {
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.precio = precio;
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

    // TO STRING
    @Override
    public String toString() {
        return "RAM: " + memoriaRAM + "GB, Disco: " + discoDuro + "GB, Procesador: " + procesador +
                ", Tarjeta gráfica: " + tarjetaGrafica + ", Precio: " + precio + "€";
    }
}
