/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author fmont
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIA DE OBJETOS
        Libro libro = new Libro("Harry Potter", "Rowling", "Fantasía");
        System.out.println(libro.toString());
        System.out.println(libro.concatenarTodo());
        System.out.println(libro.obtenerIniciales());
        
        Persona persona = new Persona("Francisco", "Montero Acosta", "Fran");
        System.out.println(persona.toString());
        System.out.println(persona.concatenarTodo());
        System.out.println(persona.obtenerIniciales());
        
        // POLIMORFISMO
        Transformable t1 = new Libro("Harry Potter", "Rowling", "Fantasía");
        System.out.println(t1.toString());
        System.out.println(t1.concatenarTodo());
        System.out.println(t1.obtenerIniciales());
        
        Transformable t2 = new Persona("Francisco", "Montero Acosta", "Fran");
        System.out.println(t2.toString());
        System.out.println(t2.concatenarTodo());
        System.out.println(t2.obtenerIniciales());
    }
    
}
