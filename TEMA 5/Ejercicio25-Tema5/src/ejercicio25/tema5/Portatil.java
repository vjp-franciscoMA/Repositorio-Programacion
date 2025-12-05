/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25.tema5;

/**
 *
 * @author fmont
 */
public class Portatil extends Ordenador{
    // ATRIBUTOS
    private String marca;
    private int tamanoPantalla;
    private int peso;
    
    // COSNTRUCTORES
    // Por defecto
    public Portatil() {
        super();
        this.marca = "";
        this.peso = 0;
        this.tamanoPantalla = 0;
    }
    // Parametrizado
    public Portatil(String marca, int tamanoPantalla, int peso, int cantidadMemoria, int capacidadDisco, String modeloProcesador, String modeloTarjeta, int precio) {
        super(cantidadMemoria, capacidadDisco, modeloProcesador, modeloTarjeta, precio);
        this.marca = marca;
        this.tamanoPantalla = tamanoPantalla;
        this.peso = peso;
    }
    
    // GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    // MÉTODOS
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString()+ ", Portatil{" + "marca=" + marca + ", tamanoPantalla=" + tamanoPantalla + ", peso=" + peso + '}';
    }
    
    
}
