/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13y14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio13y14 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Rellenar alumno.");
        System.out.println("2. Mostrar alumnos.");
        System.out.println("3. Mostrar alumnos con nota media por encima de una nota dada.");
        System.out.println("4. Mostrar cuántos alumnos hay con la nota media suspensa.");
        System.out.println("5. Buscar alumnos.");
        System.out.println("6. Salir.");
        int opcion = entrada.nextInt();
        return opcion;
    }
    public static Alumno[] rellenarAlumnos() {
        Scanner entrada = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[5];
        int i;
        for (i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce el nombre del alumno "+(i+1)+":");
            String nombre = entrada.nextLine();
            System.out.println("Introducde la edad del alumno "+(i+1)+":");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Introduce la nota media del alumno "+(i+1)+"");
            double notaMedia = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Introduce la posición del alumno que quieres crear:");
            int posicion = entrada.nextInt();
            entrada.nextLine();
            alumnos[posicion] = new Alumno(nombre, edad, notaMedia);
        }
        return alumnos;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("ERROR. Introduce un número válido.");
            }
        } while(opcion != 6);
    }
    
}
