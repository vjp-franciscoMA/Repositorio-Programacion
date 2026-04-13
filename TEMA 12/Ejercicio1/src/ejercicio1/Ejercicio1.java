/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Añadir contactos a la agenda.");
        System.out.println("2. Visualizar la lista de contactos.");
        System.out.println("3. Eliminar contactos de la lista.");
        System.out.println("4. Mostrar todos los contactos ordenados por su edad.");
        System.out.println("5. Salir del programa.");
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void añadirContacto(ArrayList<Contacto> contactos) throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre:");
        String nombre = entrada.nextLine();
        
        System.out.print("Introduce la edad:");
        int edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Introduce el número de teléfono:");
        String numero = entrada.nextLine();
        
        contactos.add(new Contacto(nombre, edad, numero));
    }
    
    public static void visualizarListaContactos(ArrayList<Contacto> contactos) {
        for(int i = 0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i).toString());
        }
    }
    
    public static void eliminarContactos(ArrayList<Contacto> contactos) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de teléfono del contacto a eliminar:");
        String telefono = entrada.nextLine();
        
        int i = 0;
        boolean encontrado = false;
        
        while(i < contactos.size() && !encontrado) {
            if(contactos.get(i).getNumeroMovil().equals(telefono)) {
                encontrado = true;
                contactos.remove(i);
            }
            i++;
        }
        
        if(!encontrado) {
            System.out.println("No se ha encontrado un contacto con ese número de teléfono.");
        }
    }
    
    public static void mostrarContactosOrdenados(ArrayList<Contacto> contactos) {
        Set<Contacto> ordenadas = new TreeSet<>(contactos);
        for(Contacto c : ordenadas) {
            System.out.println(c.toString());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<>();
        int opcion = 0;
        do {
            try {
            opcion = menu();
            switch(opcion) {
                case 1:
                    añadirContacto(contactos);
                    break;
                case 2:
                    visualizarListaContactos(contactos);
                    break;
                case 3:
                    eliminarContactos(contactos);
                    break;
                case 4:
                    mostrarContactosOrdenados(contactos);
                    break;
                case 5:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 5.");
            }
            } catch(InputMismatchException e) {
                System.out.println("ERROR. No se puede introducir letras.");
            }
        } while(opcion != 5);
    }
    
}
