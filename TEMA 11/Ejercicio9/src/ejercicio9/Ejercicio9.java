/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author alumno
 */
public class Ejercicio9 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Realizar sorteo.");
        System.out.println("2. Repetir sorteo.");
        System.out.println("3. Mostrar sorteos del mes actual.");
        System.out.println("4. Mostrar sorteo dada una fecha.");
        System.out.println("5. Realizar sorteo por fecha.");
        System.out.println("6. Mostrar todos los sorteos.");
        System.out.println("7. Salir.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void realizarSorteo(Map<LocalDate,Sorteo> sorteos) {
        Sorteo s = new Sorteo();
        sorteos.put(s.getFecha(), s);
        System.out.println("Sorteo realizado.");
    }
    
    public static void repetirSorteo(Map<LocalDate,Sorteo> sorteos) {
        if(sorteos.containsKey(LocalDate.now())) {
            sorteos.remove(LocalDate.now());
            System.out.println("Sorteo borrado.");
        }
        Sorteo s = new Sorteo();
        sorteos.put(s.getFecha(), s);
        System.out.println("Se ha generado un nuevo sorteo.");
    }
    
    public static void mostrarSorteosDelMesActual(Map<LocalDate,Sorteo> sorteos) {
        boolean encontrado = false;
        for(Map.Entry<LocalDate,Sorteo> entry : sorteos.entrySet()) {
            if(entry.getKey().getMonthValue() == LocalDate.now().getMonthValue()) {
                encontrado = true;
                System.out.println(entry);
            }
        }
        if(!encontrado) {
            System.out.println("No se han encontrado sorteos del mes actual.");
        }
    }
    
    public static void mostrarSorteosDadaUnaFecha(Map<LocalDate,Sorteo> sorteos) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el año del sorteo:");
        int año = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce el mes del sorteo:");
        int mes = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce el día del sorteo:");
        int dia = entrada.nextInt();
        entrada.nextLine();
                
        boolean encontrado = false;
        
        for(Map.Entry<LocalDate,Sorteo> entry : sorteos.entrySet()) {
            if(entry.getKey().equals(LocalDate.of(año, mes, dia))) {
                encontrado = true;
                System.out.println(entry);
            }
        }
    }
    
    public static void realizarSorteoPorFecha(Map<LocalDate, Sorteo> sorteos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el año donde crear el sorteo");
        int año = entrada.nextInt();
        System.out.println("Introduce el mes");
        int mes = entrada.nextInt();
        System.out.println("Introduce el día");
        int dia = entrada.nextInt();

        LocalDate fecha = LocalDate.of(año, mes, dia);

        if (!sorteos.containsKey(fecha)) {
            Sorteo s = new Sorteo();
            s.setFecha(fecha);
            sorteos.put(fecha, s);
        } else {
            System.out.println("Ya hay un sorteo en la fecha introducida.");
        }
    }

    public static void mostrarTodosLosSorteos(Map<LocalDate, Sorteo> sorteos) {
        for (Map.Entry<LocalDate, Sorteo> entry : sorteos.entrySet()) {
            System.out.println(entry);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<LocalDate,Sorteo> sorteos = new TreeMap<>();
        int opcion;
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    realizarSorteo(sorteos);
                    break;
                case 2:
                    repetirSorteo(sorteos);
                    break;
                case 3:
                    mostrarSorteosDelMesActual(sorteos);
                    break;
                case 4:
                    mostrarSorteosDadaUnaFecha(sorteos);
                    break;
                case 5:
                    realizarSorteoPorFecha(sorteos);
                    break;
                case 6:
                    mostrarTodosLosSorteos(sorteos);
                    break;
                case 7:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción válida entre 1 y 7.");
            }
        } while(opcion != 7);
    }
    
}
