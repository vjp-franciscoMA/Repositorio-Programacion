/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {
    public static Alumno crearAlumno(Scanner entrada) {
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
       
        System.out.print("Introduce la nota del alumno (0-10): ");
        int nota = entrada.nextInt();
        entrada.nextLine();  // Limpiar buffer
       
        Alumno alumno = new Alumno(nombre, nota);
        return alumno;
    }
   
    public static void mostrarCalificacion(Alumno alumno) {
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Nota: " + alumno.getNota());
        System.out.println("Calificación: " + alumno.getCalificacion());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        Alumno alumno1 = crearAlumno(entrada);
        Alumno alumno2 = crearAlumno(entrada);
        Alumno alumno3 = crearAlumno(entrada);
       
        mostrarCalificacion(alumno1);
        mostrarCalificacion(alumno2);
        mostrarCalificacion(alumno3);
    }
    
}
