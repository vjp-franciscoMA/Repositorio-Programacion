/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocorelink;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoCorelink {
    // Constantes de los nombres de los ficheros.
    public static final String FICHERO = "datos_empleados.txt";
    public static final String FICHERO2 = "sospechosos_zona_cero.txt";
    public static final String FICHERO3 = "04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt";
    public static final String FICHERO4 = "claves.txt";
    
    /**
     * Método que muestra el menú y pide una opción al usuario
     * @return opcion
     */
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Leer fichero con todos los empleados.");
        System.out.println("2. Escribir fichero con todos los empleados de la Zona Cero.");
        System.out.println("3. Leer fichero con claves.");
        System.out.println("4. Escribir fichero con claves.");
        System.out.println("5. Salir.");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    /**
     * Método que lee el fichero de los empleados
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void leerFicheroDatosEmpleados() throws FileNotFoundException, IOException {
        try(
                FileReader fr = new FileReader(FICHERO);
                BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    
    /**
     * Método para escribir los datos de los empleados de la zona cero y almacenarlos en un fichero
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void escribirFicheroDatosEmpleadosZonaCero() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del empleado:");
        String nombre = entrada.nextLine();
        
        System.out.print("Introduce el teléfono del empleado:");
        int telefono = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce la ubicación del empleado:");
        String ubicacion = entrada.nextLine();
        
        System.out.print("Introduce el rol del empleado:");
        String rol = entrada.nextLine();
        
        try(
                FileWriter fw = new FileWriter(FICHERO2, true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(""+nombre+";"+telefono+";"+ubicacion+";"+rol+"");
        }
    }
    
    /**
     * Método para leer el fichero donde se encuentran las claves
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void leerFicheroClaves() throws FileNotFoundException, IOException {
        try(
                FileReader fr = new FileReader(FICHERO3);
                BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    
    /**
     * Método para escribir las claves encontradas y almacenarlas en un fichero
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void escribirFicheroClaves() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la primera clave:");
        int clave1 = entrada.nextInt();
        
        System.out.print("Introduce la segunda clave:");
        int clave2 = entrada.nextInt();
        
        System.out.print("Introduce la tercera clave:");
        int clave3 = entrada.nextInt();
        
        try(
                FileWriter fw = new FileWriter(FICHERO4, true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(clave1);
            pw.println(clave2);
            pw.println(clave3);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            try {
            opcion = menu();
            switch(opcion) {
                case 1:
                    leerFicheroDatosEmpleados();
                    break;
                case 2:
                    escribirFicheroDatosEmpleadosZonaCero(); // Escribo los empleados de la zona cero y los almaceno en el fichero.
                    break;
                case 3:
                    leerFicheroClaves();
                    break;
                case 4:
                    escribirFicheroClaves();
                    break;
                case 5:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 3.");
            }
            } catch(FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero.");
            }
            catch(IOException e) {
                System.out.println("Ha ocurrido un error en la lectura o escritura del fichero.");
            }
            catch(Exception e) {
                System.out.println("Ha ocurrido un error desconocido.");
            }
        } while(opcion != 5);
    }
    
}
