/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

public class Portatil {
    // ATRIBUTOS
    private int memoriaRAM;
    private int discoDuro;
    private String procesador;
    private String tarjetaGrafica;
    private double precio;
    private String marca;
    private double tamanoPantalla;
    private double peso;

    // CONSTRUCTORES
    // Por defecto
    public Portatil() {
        this.memoriaRAM = 0;
        this.discoDuro = 0;
        this.procesador = "";
        this.tarjetaGrafica = "";
        this.precio = 0;
        this.marca = "";
        this.tamanoPantalla = 0;
        this.peso = 0;
    }

    // Parametrizado
    public Portatil(int memoriaRAM, int discoDuro, String procesador, String tarjetaGrafica, double precio, String marca, double tamanoPantalla, double peso) {
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.precio = precio;
        this.marca = marca;
        this.tamanoPantalla = tamanoPantalla;
        this.peso = peso;
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

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    // TO STRING
    @Override
    public String toString() {
        return "RAM: " + memoriaRAM + "GB, Disco: " + discoDuro + "GB, Procesador: " + procesador +
               ", Tarjeta gráfica: " + tarjetaGrafica + ", Precio: " + precio + "€, Marca: " +
               marca + ", Pantalla: " + tamanoPantalla + "\", Peso: " + peso + "kg";
    }
}
