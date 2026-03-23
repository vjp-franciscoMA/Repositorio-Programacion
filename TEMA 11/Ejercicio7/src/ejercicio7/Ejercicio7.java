/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir campaña.");
        System.out.println("2. Añadir donación.");
        System.out.println("3. Mostrar campañas con donaciones.");
        System.out.println("4. Mostrar campaña por nombre.");
        System.out.println("5. Mostrar total dinero recaudado.");
        System.out.println("6. Mostrar mayor donación.");
        System.out.println("7. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void añadirCampaña(ArrayList<Campania> campañas) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre de la campaña:");
        String nombre = entrada.nextLine();
        campañas.add(new Campania(nombre));
    }
    
    public static void añadirDonacion(ArrayList<Campania> campañas) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿En qué campaña quieres añadir la donación?:");
        String nombre = entrada.nextLine();
        
        int i = 0;
        boolean encontrado = false;
        
        while(i < campañas.size() && !encontrado) {
            if(campañas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.print("Introduce tu nombre:");
                String donante = entrada.nextLine();
                System.out.print("Introduce la cantidad a donar:");
                double cantidad = entrada.nextDouble();
                entrada.nextLine();
                
                campañas.get(i).getDonaciones().add(new Donacion(donante, cantidad));
            }
            else {
                i++;
            }
        }
        
        if(!encontrado) {
            System.out.println("No se ha encontrado la campaña.");
        }
    }
    
    public static void mostrarCampañasConDonaciones(ArrayList<Campania> campañas) {
        for(int i = 0; i < campañas.size(); i++) {
            System.out.println("CAMPAÑA "+campañas.get(i).getNombre()+"");
            for(Donacion d : campañas.get(i).getDonaciones()) {
                System.out.println(d);
            }
        }
    }
    
    public static void mostrarCampañaPorNombre(ArrayList<Campania> campañas) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre de la campaña para ver sus donaciones:");
        String campaña = entrada.nextLine();
        
        int i = 0;
        boolean encontrado = false;
        
        while(i < campañas.size() && !encontrado) {
            if(campañas.get(i).getNombre().equalsIgnoreCase(campaña)) {
                encontrado = true;
                System.out.println("Nombre campaña: "+campañas.get(i).getNombre()+"");
                for(Donacion d : campañas.get(i).getDonaciones()) {
                    System.out.println(d);
                }
            }
            else {
                i++;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Campania> campañas = new ArrayList<>();
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    añadirCampaña(campañas);
                    break;
                case 2:
                    añadirDonacion(campañas);
                    break;
                case 3:
                    mostrarCampañasConDonaciones(campañas);
                    break;
                case 4:
                    mostrarCampañaPorNombre(campañas);
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce un número válido entre 1 y 7.");
            }
        } while (opcion != 7);
    }
    
}
