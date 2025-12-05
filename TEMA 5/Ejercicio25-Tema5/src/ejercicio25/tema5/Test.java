/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25.tema5;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Test {
    public static void controlarCapacidadDisco(Ordenador ordenador, Scanner entrada) {
        while(ordenador.getCapacidadDisco() % 5 != 0) {
            System.out.println("ERROR. Introduce una capacidad que sea múltiplo de 5.");
            ordenador.setCapacidadDisco(entrada.nextInt());
        }
    }
    public static void listaProcesador(Ordenador ordenador, Scanner entrada) {
        System.out.println("Elige un procesador:");
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel Core");
        ordenador.setModeloProcesador(entrada.nextLine());
        entrada.nextLine();
    }
    public static void controlarPrecio(Ordenador ordenador, Scanner entrada) {
        while(ordenador.getPrecio() <= 0) {
            System.out.println("ERROR. El precio tiene que ser mayor a 0.");
            ordenador.setPrecio(entrada.nextInt());
        }
    }
    public static void controlarTamanoMonitor(Servidor servidor, Scanner entrada) {
        while(servidor.getTamanoMonitor() <= 14) {
            System.out.println("ERROR. El tamaño del monitor tiene que ser mayor a 14.");
            servidor.setTamanoMonitor(entrada.nextInt());
        }
        entrada.nextLine();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Servidor servidor1 = new Servidor(15, "Logi", "Logi", 50, 60, "Logi", "Ryzen", 200);
        Portatil portatil = new Portatil("Logi", 50, 80, 15, 50, "Logi", "Logi", 60);
        
        Servidor servidor2 = new Servidor();
        System.out.println("Introduce el tamaño del monitor.");
        servidor2.setTamanoMonitor(entrada.nextInt());
        controlarTamanoMonitor(servidor2, entrada);
        System.out.println(servidor2.getTamanoMonitor());
        
        
        
        
    }
    
}
