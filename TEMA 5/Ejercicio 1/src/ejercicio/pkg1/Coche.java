/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Coche {
    // 1. ATRIBUTOS: características. NUNCA se inicializan aquí.
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;
    
    // 2. CONSTRUCTORES: permite "construir" (instanciar) un objeto de este tipo.
    // Inicializan todos los atributos.
    // 2.1. CONSTRUCTOR POR DEFECTO
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
        this.motorEncendido = false;
    }
    // 2.2. CONSTRUCTOR PARAMETRIZADO (sobrecarga de métodos y autoreferencia this)
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;
    }
    // 3. MÉTODOS:
    // 3.1. GETTERS Y SETTERS: devuelven y establecen el valor de los atributos
    public String getEstablecerMarca() {
        return this.marca;
    }
    public void setEstablecerMarca() {
        this.marca = marca;
    }
    
    // 4. TO STRING: devuelve un String con los datos del objeto
    @Override
    public String toString() {
        return "Mi coche tiene ruedas " + this.ruedas + ", suspensión " + this.suspension + " y " + this.espejos + " espejos";
    }
}   
