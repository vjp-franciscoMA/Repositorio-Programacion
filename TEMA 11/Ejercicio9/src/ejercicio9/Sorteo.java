/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;
import java.time.LocalDate;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Sorteo {
    // ATRIBUTOS
    private LocalDate fecha;
    private int[] ganadores;
    
    // CONSTRUCTORES
    // Por defecto
    public Sorteo() {
        this.fecha = LocalDate.now();
        this.ganadores = new int[4];
        
        for(int i = 0; i < ganadores.length; i++) {
            ganadores[i] = (int)(Math.random() * (100 - 1 + 1) + 1);
        }
    }
    // Parametrizado
    public Sorteo(LocalDate fecha, int[] ganadores) {
        this.fecha = fecha;
        this.ganadores = ganadores;
    }
    
    // GETTERS Y SETTERS
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getGanadores() {
        return ganadores;
    }

    public void setGanadores(int[] ganadores) {
        this.ganadores = ganadores;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Sorteo{" + "fecha=" + fecha + ", ganadores=" + Arrays.toString(ganadores) + '}';
    }
    
}
