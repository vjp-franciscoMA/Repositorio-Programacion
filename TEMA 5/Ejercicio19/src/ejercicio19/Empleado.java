/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Empleado {
    // ATRIBUTOS
    private String nombre;
    private int horas;
    private double tarifaHora;

    // CONSTRUCTORES
    // Por defecto
    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifaHora = 0;
    }

    // Parametrizado
    public Empleado(String nombre, int horas, double tarifaHora) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    // GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getHoras() {
        return this.horas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    public double getTarifaHora() {
        return this.tarifaHora;
    }

    // MÉTODO PARA CALCULAR SUELDO BRUTO
    public double calcularSueldoBruto() {
        if (horas <= 40) {
            return horas * tarifaHora;
        } else {
            int extra = horas - 40;
            return 40 * tarifaHora + extra * tarifaHora * 1.5;
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Horas: " + horas + ", Tarifa por hora: " + tarifaHora;
    }
}
