/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.LinkedHashSet;
/**
 *
 * @author alumno
 */
import java.util.Set;
import java.util.TreeSet;
public class Ejercicio11 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir alumno.");
        System.out.println("2. Mostrar alumnos (ordenados de mayor a menor número de expediente).");
        System.out.println("3. Buscar por número de expediente.");
        System.out.println("4. Mostrar alumnos por nota.");
        System.out.println("5. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void añadirAlumno(Set<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el dni del alumno:");
        String dni = entrada.nextLine();
        
        System.out.print("Introduce el número de expediente del alumno:");
        int expediente = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce la nota media del alumno:");
        float notaMedia = entrada.nextFloat();
        entrada.nextLine();
        
        alumnos.add(new Alumno(dni, expediente, notaMedia));
    }
    
    public static void mostrarAlumnosOrdenadosPorExpediente(Set<Alumno> alumnos) {
        TreeSet<Alumno> ordenadas = new TreeSet<>(alumnos);
        
        for(Alumno a : ordenadas) {
            System.out.println(a.toString());
        }
    }
    
    public static void buscarPorNumeroDeExpediente(Set<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número de expediente para mostrarte el alumno con ese expediente:");
        int expediente = entrada.nextInt();
        
        boolean encontrado = false;
        
        for(Alumno a : alumnos) {
            if(a.getExpediente() == expediente) {
                encontrado = true;
                System.out.println(a.toString());
            }
        }
        
        if(!encontrado) {
            System.out.println("No se ha encontrado ningún alumno con ese expediente.");
        }
    }
    
    public static void mostrarAlumnosPorNota(Set<Alumno> alumnos) {
        TreeSet<Alumno> ordenadas = new TreeSet<>((a1, a2) -> Float.compare(a1.getNotaMedia(), a2.getNotaMedia()));

        ordenadas.addAll(alumnos);

        for (Alumno a : ordenadas) {
            System.out.println(a);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Alumno> alumnos = new LinkedHashSet<>();
        int opcion = 0;
        do {
            try {
            opcion = menu();
            switch(opcion) {
                case 1:
                    añadirAlumno(alumnos);
                    break;
                case 2:
                    mostrarAlumnosOrdenadosPorExpediente(alumnos);
                    break;
                case 3:
                    buscarPorNumeroDeExpediente(alumnos);
                    break;
                case 4:
                    mostrarAlumnosPorNota(alumnos);
                    break;
                case 5:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 5.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un número entero entre 1 y 5.");
            }
        } while(opcion != 5);
    }
    
}
