/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Empleado {
    // ATRIBUTOS
    private String nombre;
    private int salario;
    private Direccion direccion;

    // CONSTRUCTORES
    // Por defecto
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }

    // Parametrizado
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    // GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario: " + salario + ", Dirección: [" + direccion.toString() + "]";
    }
}
