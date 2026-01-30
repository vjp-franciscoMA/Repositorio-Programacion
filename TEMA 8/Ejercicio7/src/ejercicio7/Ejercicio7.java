/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio7 {
    public static Dia[] array() {
        Dia[] dias = new Dia[30];
        return dias;
    }
    
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("1. Rellenar temperaturas");
        System.out.println("2. Mostrar temperaturas");
        System.out.println("3. Visualizar temperatura media del mes");
        System.out.println("4. Día o días más calurosos del mes.");
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void rellenarTemperaturas(Dia[] dias) {
        int i;
        String[] diasSemana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"}; 
        for(i = 0; i < dias.length; i++) {
            int diaSemanaAleatorio = (int)(Math.random() * 7);
            String nombreDia = diasSemana[diaSemanaAleatorio];
            int temperatura = (int)(Math.random() * (40 - 0 + 1) + 0);
            dias[i] = new Dia(nombreDia,temperatura);
        }
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
                    
            }
            
        } while(opcion != 5);
    }
    
}
