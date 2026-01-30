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
    
    public static Dia[] rellenarTemperaturas() {
        Dia[] dias = new Dia[30];
        int i;
        String[] diasSemana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"}; 
        for(i = 0; i < dias.length; i++) {
            int diaSemanaAleatorio = (int)(Math.random() * 7);
            String nombreDia = diasSemana[diaSemanaAleatorio];
            int temperatura = (int)(Math.random() * (45 - 0 + 1) + 0);
            dias[i] = new Dia(nombreDia,temperatura);
        }
        return dias;
    }
    
    public static void mostrarTemperaturas(Dia[] dias) {
        int i;
        for(i = 0; i < dias.length; i++) {
            System.out.println(""+dias[i].getNombreDia()+" día "+(i+1)+": "+dias[i].getTemperatura()+" grados.");
        }
    }
    
    public static void mediaTemperatura(Dia[] dias) {
        int i;
        int suma = 0;
        int media;
        for(i = 0; i < dias.length; i++) {
            suma = suma + dias[i].getTemperatura();
        }
        media = suma / dias.length;
        System.out.println("La temperatura media del mes es de: "+media+"");
    }
    
    public static void mostrarDiaoDiasMasCalurosos(Dia[] dias) {
        int i;
        int mayor  = dias[0].getTemperatura();
        for(i = 0; i < dias.length; i++) {
            if(dias[i].getTemperatura() > mayor) {
                mayor = dias[i].getTemperatura();
            }
        }
        for(i = 0; i < dias.length; i ++) {
            if(dias[i].getTemperatura() == mayor) {
                System.out.println("El "+dias[i].getNombreDia()+" día "+(i+1)+" con "+mayor+"");
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dia[] dias = new Dia[30];
        int opcion;
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    dias = rellenarTemperaturas();
                    break;
                case 2:
                    mostrarTemperaturas(dias);
                    break;
                case 3:
                    mediaTemperatura(dias);
                    break;
                case 4:
                    mostrarDiaoDiasMasCalurosos(dias);
                    break;
                case 5:
                    System.out.println("Te has aalido del programa.");
                    break;
                default:
                    System.out.println("ERROR. Introduce un número correcto.");
            }
            
        } while(opcion != 5);
    }
    
}
