/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Aparcar.");
        System.out.println("2. Mostrar dársenas libres.");
        System.out.println("3. Buscar autobús.");
        System.out.println("4. Buscar conductor.");
        System.out.println("5. Retornar posición.");
        System.out.println("6. Salir del programa.");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        return opcion;
    }
    
    public static void aparcar(Autobus[] estacion) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la matrícula del autobús:");
        String matricula = entrada.nextLine();
        Autobus bus = new Autobus(matricula);
        
        System.out.print("Introduce el número de conductores:");
        int numero = entrada.nextInt();
        entrada.nextLine();
        
        for(int i = 0; i < numero; i++) {
            System.out.println("CONDUCTOR "+(i+1)+"");
            System.out.print("Introduce el DNI del conductor:");
            String dni = entrada.nextLine();
            System.out.print("Introduce el nombre del conductor:");
            String nombre = entrada.nextLine();
            bus.getConductores().put(dni, new Conductor(dni, nombre));
        }
        
        System.out.print("Introduce en qué posición quieres aparcar el autobus:");
        int posicion = entrada.nextInt();
        entrada.nextLine();

        while (estacion[posicion] != null) {
            System.out.println("La posición está ocupada. Elige otra.");
            posicion = entrada.nextInt();
            entrada.nextLine();
        }
        
        estacion[posicion] = bus;
    }
    
    public static void mostrarDarsenasLibres(Autobus[] estacion) {
        for(int i = 0; i < estacion.length; i++) {
            if(estacion[i] == null) {
                System.out.println("["+i+"]");
            }
        }
    }
    
    public static void buscarAutobus(Autobus[] estacion) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la matrícula a buscar:");
        String matricula = entrada.nextLine();

        int i = 0;
        boolean encontrado = false;

        while (i < estacion.length && !encontrado) {
            if (estacion[i] != null && estacion[i].getMatricula().equals(matricula)) {
                encontrado = true;

                System.out.println("Posición: "+i+"");
                System.out.println("Matrícula: "+estacion[i].getMatricula()+"");

                for (Map.Entry<String, Conductor> entry : estacion[i].getConductores().entrySet()) {
                    System.out.println("DNI: "+entry.getValue().getDni()+", Nombre: "+entry.getValue().getNombre()+"");
                }
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ningún autobús con esa matrícula.");
        }
    }
    
    public static void buscarConductor(Autobus[] estacion) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el DNI del conductor a buscar:");
        String dni = entrada.nextLine();

        int i = 0;
        boolean encontrado = false;

        while (i < estacion.length && !encontrado) {
            if (estacion[i] != null) {

                for (Map.Entry<String, Conductor> entry : estacion[i].getConductores().entrySet()) {

                    if (entry.getValue().getDni().equals(dni)) {
                        encontrado = true;

                        System.out.println("DNI: "+entry.getValue().getDni()+"");
                        System.out.println("Nombre: "+entry.getValue().getNombre()+"");
                        System.out.println("Matrícula del autobús: "+estacion[i].getMatricula()+"");
                    }
                }
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ningún conductor con ese DNI.");
        }
    }
    
    // El método del apartado 5 no lo he entendido muy bien.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autobus[] estacion = new Autobus[6];
        int opcion;
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    aparcar(estacion);
                    break;
                case 2:
                    mostrarDarsenasLibres(estacion);
                    break;
                case 3:
                    buscarAutobus(estacion);
                    break;
                case 4:
                    buscarConductor(estacion);
                    break;
                case 5:
                    // El método del apartado 5 no lo he entendido muy bien.
                    break;
                case 6:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce un número entre 1 y 6.");
            }
        } while(opcion != 6);
    }
    
}
