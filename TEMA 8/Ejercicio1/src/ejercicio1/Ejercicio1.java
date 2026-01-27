/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {
    public static Asignaturas[] crearYDefinirArray() {
        Asignaturas[] asignatura = new Asignaturas[6];
        String[] nombreAsignaturas = {"Programación", "Lenguajes de Marcas", "Bases de Datos", "Entornos de Desarrollo", "Sistemas Informáticos", "Formación y Orientación Laboral"};
        int i;
        for(i = 0; i < asignatura.length; i++) {
            System.out.println("Introduce la nota de "+nombreAsignaturas[i]+"");
            asignatura[i] = new Asignaturas(nombreAsignaturas[i], pedirNotas());
        }
        return asignatura;
    }
    
    public static double pedirNotas() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextDouble();
    }
    
    public static double mediaNotas(Asignaturas[] asignatura) {
        int i;
        double suma = 0;
        double media;
        for(i = 0; i < asignatura.length; i++) {
            suma = suma + asignatura[i].getNota();
        }
        media = suma / asignatura.length;
        return media;
    }
    
    public static void resultadoMedia(double media) {
        System.out.println("La nota media de todas las asignaturas es de: "+media+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignaturas[] array = crearYDefinirArray();
        double media = mediaNotas(array);
        resultadoMedia(media);
        
    }
    
}
