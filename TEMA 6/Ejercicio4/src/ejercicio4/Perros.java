/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos {
    public Perros() {
        super();
    }
    public Perros(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public void sonido() {
        System.out.println("Ladrido.");
    }

    @Override
    public void alimentacion() {
        System.out.println("Carnívora.");
    }

    @Override
    public void habitat() {
        System.out.println("Doméstico");
    }

    @Override
    public void nombreCientifico() {
        System.out.println("Canis lupus familiaris.");
    }
    
}
