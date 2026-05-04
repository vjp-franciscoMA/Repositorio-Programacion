/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {
    public static final String FICHERO = "bebidas.obj";
    
    public static int menu() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1. Introducir bebidas.");
        System.out.println("2. Comprar productos.");
        System.out.println("3. Salir.");
        
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        return opcion;
    }
    
    public static void introduccionBebidas() throws InputMismatchException, FileNotFoundException, ClassNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        String seguir;

        try (
                FileOutputStream fos = new FileOutputStream(FICHERO); 
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            do {
                System.out.print("Por favor, introduzca el nombre de la bebida: ");
                String bebida = entrada.nextLine();
                
                System.out.print("Por favor, introduzca el precio de la bebida: ");
                float precio = entrada.nextFloat();
                entrada.nextLine();
                
                System.out.print("Por favor, introduzca el stock de la bebida: ");
                int stock = entrada.nextInt();
                entrada.nextLine();

                oos.writeObject(new Bebida(bebida, precio, stock));
                
                System.out.print("¿Quieres introducir otra bebida?(Si/No): ");
                seguir = entrada.nextLine();
            } while(seguir.equalsIgnoreCase("Si"));
           }
    }
    
    public static void comprarProductos() throws FileNotFoundException, ClassNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Bebida> lista = new ArrayList<>();

        float total = 0;
        String seguir;

        try (
                FileInputStream fis = new FileInputStream(FICHERO); 
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Bebida bebida;

            while (true) {
                bebida = (Bebida) ois.readObject();
                lista.add(bebida);
            }
        } catch(EOFException e) {
            System.out.println("Fin del fichero.");
        } 

        do {
            System.out.println("LISTA DE PRODUCTOS:");

            for (int i = 0; i < lista.size(); i++) {
                System.out.println(""+(i+1)+": "+lista.get(i).getNombre()+", "+lista.get(i).getPrecio()+", "+lista.get(i).getStock()+"");
            }

            System.out.print("Seleccione un producto: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion < 1 || opcion > lista.size()) {
                System.out.println("Producto no válido.");
            } else {
                Bebida bebidaSeleccionada = lista.get(opcion - 1);

                System.out.print("¿Cuántas unidades desea?: ");
                int unidades = entrada.nextInt();
                entrada.nextLine();

                if (unidades > bebidaSeleccionada.getStock()) {

                    System.out.println("No hay suficiente stock.");
                    System.out.println("Solo quedan "+bebidaSeleccionada.getStock()+" unidades.");

                } else {
                    bebidaSeleccionada.setStock(bebidaSeleccionada.getStock() - unidades);
                    total = total + (unidades * bebidaSeleccionada.getPrecio());
                    System.out.println("Producto añadido correctamente.");
                }
            }

            System.out.print("¿Desea comprar otro producto?(Si/No): ");
            seguir = entrada.nextLine();

        } while (seguir.equalsIgnoreCase("Si"));

        try (
                FileOutputStream fos = new FileOutputStream(FICHERO); 
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for (int i = 0; i < lista.size(); i++) {
                oos.writeObject(lista.get(i));
            }
        }

        System.out.println("Importe total de la compra: "+total+" €");
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
                    introduccionBebidas();
                    break;
                case 2:
                    comprarProductos();
                    break;
                case 3:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 3.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un tipo de dato correcto.");
            } catch(ClassNotFoundException e) {
                System.out.println("Clase no encontrada.");
            } catch(IOException e) {
                System.out.println("Ha ocurrido un error en la lectura o escritura del fichero.");
            } catch(Exception e) {
                System.out.println("Ha ocurrido un error desconocido.");
            }
        } while(opcion != 3);
    }
    
}
