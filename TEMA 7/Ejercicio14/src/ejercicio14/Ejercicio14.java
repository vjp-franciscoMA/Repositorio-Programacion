/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio14 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENÚ TEMPERATURAS");
        System.out.println("1. Rellenar temperaturas.");
        System.out.println("2. Mostrar las temperaturas.");
        System.out.println("3. Visualizar la temperatura media del mes.");
        System.out.println("4. Día o días más calurosos del mes.");
        System.out.println("5. Salir del programa");
        int opcion = entrada.nextInt();
        return opcion;
    }
    public static int[][] rellenarTemperaturas() {
        Scanner entrada = new Scanner(System.in);
        int[][] temperaturas = new int[4][7];
        int i, j;
        for(i = 0; i < temperaturas.length; i++) {
            System.out.println("Semana "+(i+1)+":");
            for(j = 0; j < temperaturas[0].length; j++) {
                System.out.println("Día "+(j+1)+":");
                temperaturas[i][j] = entrada.nextInt();
            }
        }
        return temperaturas;
    }
    public static void mostrarTemperaturas(int[][] temperaturas) {
        int i, j;
        for(i = 0; i < temperaturas.length; i++) {
            System.out.println("Semana "+(i+1)+":");
            for(j = 0; j < temperaturas[0].length; j++) {
                System.out.println("Día "+(j+1)+":");
                System.out.println(temperaturas[i][j]);
            }
        }
    }
    public static void mostrarMediaTemperaturas(int[][] temperaturas) {
        int suma = 0;
        int media;
        int i, j;
        for(i = 0; i < temperaturas.length; i++) {
            for(j = 0; j < temperaturas[0].length; j++) {
                suma = suma + temperaturas[i][j];
            }
        }
        media = suma / 28;
        System.out.println("La media de todas las temperaturas es de: "+media+"");
    }
    public static void mostrarDiaODiasConMasTemperatura(int[][] temperaturas) {
        String[] nombreDiasSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
        int mayor = temperaturas[0][0];
        int i, j;
        for(i = 0; i < temperaturas.length; i++) {
            for(j = 0; j < temperaturas[0].length; j++) {
                if(temperaturas[i][j] > mayor) {
                    mayor = temperaturas[i][j];
                }
            }
        }   
        System.out.println("El día o días más calurosos fueron:");
        for(i = 0; i < temperaturas.length; i++) {
            for(j = 0; j < temperaturas[0].length; j++) {
                if(temperaturas[i][j] == mayor) {
                    System.out.println("El "+nombreDiasSemana[j]+" de la Semana "+(i+1)+" con "+mayor+" grados.");
                }
            }
        }   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[][] temperaturas = new int[4][7];
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    temperaturas = rellenarTemperaturas();
                    break;
                case 2:
                    mostrarTemperaturas(temperaturas);
                    break;
                case 3:
                    mostrarMediaTemperaturas(temperaturas);
                    break;
                case 4:
                    mostrarDiaODiasConMasTemperatura(temperaturas);
                    break;
                case 5:
                    System.out.println("Te has salido del menú.");
                    break;
                default:
                    System.out.println("Introduce una opción válida.");
            }
        } while(opcion != 5);
    }
    
}
