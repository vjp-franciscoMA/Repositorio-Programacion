/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio6 {
    public final static int MESES = 12;
    
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Introducir ventas.");
        System.out.println("2. Mostrar ventas.");
        System.out.println("3. Mostrar ventás al revés.");
        System.out.println("4. Mostrar suma total de ventas.");
        System.out.println("5. Mostrar ventas totales de meses que contengan la letra a.");
        System.out.println("6. Mostrar meses con más ventas");
        System.out.println("7. Salir.");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static ArrayList<Integer> rellenarVentas() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> ventas = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};        
        for(int i = 0; i < MESES; i++) {
            System.out.println("Introduce las ventas de "+meses[i]+"");
            int ventas2 = entrada.nextInt();
            entrada.nextLine();
            ventas.add(ventas2);
        }
        return ventas;
    }
    
    public static void mostrarVentas(ArrayList<Integer> ventas) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = 0; i < MESES; i++) {
            System.out.println(""+meses[i]+":");
            System.out.println(ventas.get(i));
            System.out.println("");
        }
    }
    
    public static void mostrarVentasAlReves(ArrayList<Integer> ventas) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = MESES - 1; i >= 0; i--) {
            System.out.println(""+meses[i]+":");
            System.out.println(ventas.get(i));
            System.out.println("");
        }
    }
    
    public static void sumaVentas(ArrayList<Integer> ventas) {
        int suma = 0;
        for(int i = 0; i < MESES; i++) {
            suma = suma + ventas.get(i);
        }
        System.out.println("La suma total de ventas es de "+suma+"");
    }
    
    public static void ventasMesesA(ArrayList<Integer> ventas) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for(int i = 0; i < MESES; i++) {
            if(meses[i].toLowerCase().contains("a")) {
                System.out.println(""+meses[i]+":");
                System.out.println(ventas.get(i));
                System.out.println("");
            }
        }
    }
    
    public static void mesesConMasVentas(ArrayList<Integer> ventas) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int mayor = ventas.get(0);
        for(int i = 0; i < MESES; i++) {
            if(ventas.get(i) > mayor) {
                mayor = ventas.get(i);
            }
        }
        for(int i = 0; i < MESES; i++) {
            if(ventas.get(i) == mayor) {
                System.out.println("" + meses[i] + ":");
                System.out.println(ventas.get(i));
                System.out.println("");
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Integer> ventas = new ArrayList<>();
        do {
            try {
            opcion = menu();
            switch(opcion) {
                case 1 -> ventas = rellenarVentas();
                case 2 -> mostrarVentas(ventas);
                case 3 -> mostrarVentasAlReves(ventas);
                case 4 -> sumaVentas(ventas);
                case 5 -> ventasMesesA(ventas);
                case 6 -> mesesConMasVentas(ventas);
                case 7 -> System.out.println("Te has salido del programa.");
                default -> System.out.println("ERROR. Introduce una opción válida.");
           
            }
            } catch(InputMismatchException e) {
                System.out.println("ERROR. Introduzca un número entero entre 1 y 7.");
            }
        } while(opcion != 7);
    }
    
}
