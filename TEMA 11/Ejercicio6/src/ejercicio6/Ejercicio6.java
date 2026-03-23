/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author alumno
 */
public class Ejercicio6 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir donación.");
        System.out.println("2. Mostrar donaciones.");
        System.out.println("3. Mostrar donaciones por nombre de donante.");
        System.out.println("4. Mostrar número de donaciones.");
        System.out.println("5. Mostrar total dinero recaudado.");
        System.out.println("6. Ordenar donaciones.");
        System.out.println("7. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void añadirDonaciones(Campania campaña) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre:");
        String nombre = entrada.nextLine();
        System.out.print("Introduce la cantidad a donar:");
        double cantidad = entrada.nextInt();
        campaña.getDonaciones().add(new Donacion(nombre, cantidad));
    }
    
    public static void mostrarDonaciones(Campania campaña) {
        for(Donacion d: campaña.getDonaciones()) {
            System.out.println(d);
        }
    }
    
    public static void mostrarDonacionPorNombreDeDonante(Campania campaña) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un nombre para ver sus donaciones:");
        String nombre = entrada.nextLine();
        boolean encontrado = false;
        for(Donacion d: campaña.getDonaciones()) {
            if(d.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println(d);
            }
        }
        if(!encontrado) {
            System.out.println("No se han encontrado donaciones con ese nombre.");
        }
    }
    
    public static void mostrarNumeroDeDonaciones(Campania campaña) {
        System.out.println(campaña.getDonaciones().size());
    }
    
    public static void mostrarTotalDinero(Campania campaña) {
        double total = 0;
        for(Donacion d : campaña.getDonaciones()) {
            total = total + d.getCantidad();
        }
        System.out.println("Total dinero: "+total+"");
    }
    
    public static void ordenarDonaciones(Campania campaña) {
        TreeSet<Donacion> ordenadas = new TreeSet<>(campaña.getDonaciones());

        System.out.println("Donaciones ordenadas de mayor a menor:");
        for (Donacion d : ordenadas) {
            System.out.println("Donante: "+d.getNombre()+", Cantidad: "+d.getCantidad()+"");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Campania campaña = new Campania("Coronavirus");
        int opcion;
        
        do{
            opcion = menu();
            switch(opcion) {
                case 1:
                    añadirDonaciones(campaña);
                    break;
                case 2:
                    mostrarDonaciones(campaña);
                    break;
                case 3:
                    mostrarDonacionPorNombreDeDonante(campaña);
                    break;
                case 4:
                    mostrarNumeroDeDonaciones(campaña);
                    break;
                case 5:
                    mostrarTotalDinero(campaña);
                    break;
                case 6:
                    ordenarDonaciones(campaña);
                    break;
                case 7:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce un número válido entre 1 y 7.");
            }
        } while(opcion != 7);
    }
    
}
