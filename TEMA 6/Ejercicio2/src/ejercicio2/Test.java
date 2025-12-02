/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIA DE OBJETOS DE CADA CLASE
        Profesor profesor = new Profesor("Antonio", "LMSGI");
        Alumno alumno = new Alumno("Francisco","1ºDAW");
        
        profesor.saludar();
        alumno.saludar();
        
        // POLIMORFISMO
        Persona p1 = new Profesor("Antonio", "LMSGI");
        Persona p2 = new Alumno("Francisco", "1ºDAW");
        
        p1.saludar();
        p2.saludar();
    }
    
}
