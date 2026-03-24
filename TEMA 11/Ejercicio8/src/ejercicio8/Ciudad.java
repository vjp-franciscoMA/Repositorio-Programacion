/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ciudad {
    // ATRIBUTOS
    private String nombre;
    private Set<Sede> sedes;
    
    // CONSTRUCTORES
    // por defecto
    public Ciudad() {
        this.nombre = "";
        this.sedes = new LinkedHashSet<>();
    }
    // Parametrizado
    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }
    
    public Ciudad(String nombres) {
        this.nombre = nombre;
        this.sedes = new LinkedHashSet<>();
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }
    
}
