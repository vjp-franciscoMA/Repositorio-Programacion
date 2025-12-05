/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Direccion {
    // ATRIBUTOS
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;

    // CONSTRUCTORES
    // Por defecto
    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "";
    }

    // Parametrizado
    public Direccion(String calle, int numero, int piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    // GETTERS Y SETTERS
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getCalle() {
        return this.calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    public int getPiso() {
        return this.piso;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getCiudad() {
        return this.ciudad;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Calle: " + calle + ", Número: " + numero + ", Piso: " + piso + ", Ciudad: " + ciudad;
    }
}
