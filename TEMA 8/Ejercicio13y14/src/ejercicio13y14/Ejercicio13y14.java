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
        System.out.println("1. Rellenar alumnos.");
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
            System.out.println("Introduce la posición del alumno que quieres crear (0-4):");
            int posicion = entrada.nextInt();
            entrada.nextLine();
            while(alumnos[posicion] != null) {
                System.out.println("La posición introducida está ocupada. Elige otra:");
                posicion = entrada.nextInt();
                entrada.nextLine();
            }
            alumnos[posicion] = new Alumno(nombre, edad, notaMedia);
        }
        return alumnos;
    }
    public static void mostrarAlumnos(Alumno[] alumnos) {
        int i;
        for(i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
    }
    public static void mostrarAlumnosMedia(Alumno[] alumnos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una nota para que te salgan los alumnos que tengan una nota media superior a la nota introducida:");
        double nota = entrada.nextDouble();
        entrada.nextLine();
        int i;
        for (i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getNotaMedia() > nota) {
                System.out.println("La media del alumno "+alumnos[i].getNombre()+" es "+alumnos[i].getNotaMedia()+"");
            }
        }
    }
    public static void mostrarAlumnosMediaSuspensa(Alumno[] alumnos) {
        int i;
        for (i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getNotaMedia() < 5) {
                System.out.println("La media del alumno "+alumnos[i].getNombre()+" es "+alumnos[i].getNotaMedia()+"");
            }
        }
    }
    public static void buscarAlumnos(Alumno[] alumnos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de un alumno para ver si está matriculado:");
        String nombreAlumno = entrada.nextLine();
        boolean encontrado = false;
        int i = 0;
        while (i < alumnos.length && !encontrado) {
            if (alumnos[i].getNombre().equals(nombreAlumno)) {
                encontrado = true;
            }
            else {
                i++;
            }
        }
        if (encontrado == true) {
            System.out.println("El alumno "+nombreAlumno+" está matriculado.");
        }
        else {
            System.out.println("El alumno "+nombreAlumno+" no está matriculado.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Alumno[] alumnos = new Alumno[5];
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    alumnos = rellenarAlumnos();
                    break;
                case 2:
                    mostrarAlumnos(alumnos);
                    break;
                case 3:
                    mostrarAlumnosMedia(alumnos);
                    break;
                case 4:
                    mostrarAlumnosMediaSuspensa(alumnos);
                    break;
                case 5:
                    buscarAlumnos(alumnos);
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
