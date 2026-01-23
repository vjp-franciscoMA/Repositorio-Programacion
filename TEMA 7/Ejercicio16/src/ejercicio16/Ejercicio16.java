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
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENÚ:");
        System.out.println("1. Rellenar las notas de los alumnos.");
        System.out.println("2. Mostrar las notas de los alumnos.");
        System.out.println("3. Mostrar alumno con más nota.");
        System.out.println("4. Mostrar alumno con más suspensos.");
        System.out.println("5. Mostrar asignatura más dificil.");
        System.out.println("6. Salir del programa.");
        int opcion = entrada.nextInt();
        return opcion;
    }
    public static int[][] rellenarNotas() {
        Scanner entrada = new Scanner(System.in);
        int[][] notas = new int[6][4];
        int i, j;
        for(i = 0; i < notas.length; i++) {
            System.out.println("Alumno "+(i+1)+":");
            for(j = 0; j < notas[0].length; j++) {
                System.out.println("Nota "+(j+1)+"");
                notas[i][j] = entrada.nextInt();
            }
        }
        return notas;
    }
    public static void mostrarNotas(int[][] notas) {
        int i, j;
        for(i = 0; i < notas.length; i++) {
            System.out.println("Alumno "+(i+1)+":");
            for(j = 0; j < notas[0].length; j++) {
                System.out.println("Nota "+(j+1)+"");
                System.out.println(notas[i][j]);
            }
        }
    }
    public static void mostrarMejorAlumno(int[][] notas) {
        String[] nombres = {"Pepe","Juan","Ana","Marta","Pedro","Maria"};
        int i, j;
        double media;
        double mejorMedia = -1;
        int indiceMejor = -1;
        for(i = 0; i < notas.length; i++) {
            int suma = 0;
            for(j = 0; j < notas[0].length; j++) {
                suma = suma + notas[i][j];
            }
            media = suma / 4.0;
            if(media > mejorMedia) {
                mejorMedia = media;
                indiceMejor = i;
            }
        }
        System.out.println("El mejor alumno es "+nombres[indiceMejor]+" con una media de "+mejorMedia+"");
    }
    public static void mostrarAlumnoMasSuspensos(int[][] notas) {
    String[] nombres = {"Pepe","Juan","Ana","Marta","Pedro","Maria"};
    
    int maxSuspensos = -1;
    int indiceAlumno = -1;

    for (int i = 0; i < notas.length; i++) {
        int suspensos = 0;

        for (int j = 0; j < notas[0].length; j++) {
            if (notas[i][j] < 5) {
                suspensos++;
            }
        }

        if (suspensos > maxSuspensos) {
            maxSuspensos = suspensos;
            indiceAlumno = i;
        }
    }

    System.out.println("El alumno con más suspensos es "+nombres[indiceAlumno]+" con "+maxSuspensos+" suspensos.");
    
    }
    public static void mostrarAsignaturaMasDificil(int[][] notas) {
    String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};

    double peorMedia = 11; // mayor que la nota máxima posible
    int indiceAsignatura = -1;

    for (int j = 0; j < notas[0].length; j++) {
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i][j];
        }

        double media = suma / (double) notas.length;

        if (media < peorMedia) {
            peorMedia = media;
            indiceAsignatura = j;
        }
    }

    System.out.println("La asignatura más difícil es "+asignaturas[indiceAsignatura]+" con una media de "+peorMedia+"");
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[][] notas = new int[6][4];
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    notas = rellenarNotas();
                    break;
                case 2:
                    mostrarNotas(notas);
                    break;
                case 3:
                    mostrarMejorAlumno(notas);
                    break;
                case 4:
                    mostrarAlumnoMasSuspensos(notas);
                    break;
                case 5:
                    mostrarAsignaturaMasDificil(notas);
                    break;
                case 6:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Número incorrecto.");
            }
        } while(opcion != 6);
    }
    
}
