/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author alumno
 */
public class Ejercicio8 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir ciudad.");
        System.out.println("2. Mostrar todas las ciudades junto con sus sedes.");
        System.out.println("3. Mostrar nombre de las sedes cuyos ingresos anuales son superiores a la media.");
        System.out.println("4. Buscar por nombre de sede.");
        System.out.println("5. Añadir sede");
        System.out.println("6. Mostrar sedes ordenadas de mayor a menor número de ingresos anuales.");
        System.out.println("7. Salir del programa.");
        
        int opcion = entrada.nextInt();
        entrada.nextLine();
        return opcion;
    }
    
    public static void añadirCiudad(ArrayList<Ciudad> ciudades) {
        Scanner entrada = new Scanner(System.in);
        String seguir;
        
        System.out.print("Introduce el nombre de la ciudad:");
        String ciudad = entrada.nextLine();
        
        Ciudad c = new Ciudad(ciudad);
        
        do {
            System.out.print("Introduce el nombre de la sede:");
            String sede = entrada.nextLine();
            System.out.print("Introduce los ingresos de la sede:");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();
            c.getSedes().add(new Sede(sede,ingresos));
            
            System.out.println("¿Quieres añadir más sedes?(Si/No)");
            seguir = entrada.nextLine();
        } while(seguir.equalsIgnoreCase("Si"));
                
        ciudades.add(c);
    }
    
    public static void mostrarCiudadesConSedes(ArrayList<Ciudad> ciudades) {
        for(int i = 0; i < ciudades.size(); i++) {
            System.out.println("Ciudad: "+ciudades.get(i).getNombre()+"");
            for(Sede s : ciudades.get(i).getSedes()) {
                System.out.println(s.toString());
            }
        }
    }
    
    public static void mostrarSedesConIngresosSuperioresALaMedia(ArrayList<Ciudad> ciudades) {
        double suma = 0;
        int sedes = 0;
        double media;
        
        for(int i = 0; i < ciudades.size(); i++) {
             for(Sede s : ciudades.get(i).getSedes()) {
                 suma = suma + s.getIngresos();
                 sedes++;
             }
         }
        media = suma / sedes;
        
        for(int i = 0; i < ciudades.size(); i++) {
            for(Sede s : ciudades.get(i).getSedes()) {
                if(s.getIngresos() > media) {
                    System.out.println(s.toString());
                }
            }
        }
    }
    
    public static void buscarPorNombreSede(ArrayList<Ciudad> ciudades) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre de la sede a buscar:");
        String sede = entrada.nextLine();
        
        int i = 0;
        boolean encontrado = false;
        
        while(i < ciudades.size() && !encontrado) {
            for(Sede s : ciudades.get(i).getSedes()) {
                if(s.getNombre().equalsIgnoreCase(sede)) {
                    encontrado = true;
                    
                    System.out.println(s.toString());
                }
            }
            i++;
        }
        
        if(!encontrado) {
            System.out.println("No se ha encontrado la sede.");
        }
    }
    
    public static void añadirSede(ArrayList<Ciudad> ciudades) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre de la ciudad en el que quieres añadir una sede:");
        String ciudad = entrada.nextLine();
        
        int i = 0;
        boolean encontrado = false;
        
        while(i < ciudades.size() && !encontrado) {
            if(ciudades.get(i).getNombre().equalsIgnoreCase(ciudad)) {
                encontrado = true;
                
                System.out.print("Introduce el nombre de la sede:");
                String sede = entrada.nextLine();
                System.out.print("Introduce los ingresos de la sede:");
                double ingresos = entrada.nextDouble();
                entrada.nextLine();
                
                ciudades.get(i).getSedes().add(new Sede(sede, ingresos));
            }
            i++;
        }
        
        if(!encontrado) {
            System.out.println("No se ha encontrado el nombre de la ciudad.");
        }
    }
    
    public static void mostrarSedesOrdenadas(ArrayList<Ciudad> ciudades) {
        TreeSet<Sede> ordenadas = new TreeSet<>();

        for(Ciudad c : ciudades) {
            for(Sede s : c.getSedes()) {
                ordenadas.add(s);
            }
        }

        System.out.println("Sedes ordenadas por ingresos de mayor a menor:");
        for(Sede s : ordenadas) {
            System.out.println(s.toString());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        int opcion = 0;
        
        do {
            try {
            opcion = menu();
            switch(opcion) {
                case 1:
                    añadirCiudad(ciudades);
                    break;
                case 2:
                    mostrarCiudadesConSedes(ciudades);
                    break;
                case 3:
                    mostrarSedesConIngresosSuperioresALaMedia(ciudades);
                    break;
                case 4:
                    buscarPorNombreSede(ciudades);
                    break;
                case 5:
                    añadirSede(ciudades);
                    break;
                case 6:
                    mostrarSedesOrdenadas(ciudades);
                    break;
                case 7:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 7.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un número entero entre 1 y 7.");
            }
        } while(opcion != 7);
    }
    
}
