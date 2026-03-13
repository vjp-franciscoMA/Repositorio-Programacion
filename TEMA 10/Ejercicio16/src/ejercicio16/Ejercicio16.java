/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {
    public static int menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. MENÚ DE ADMINISTRACIÓN.");
        System.out.println("2. MENÚ DE COMPRA.");
        System.out.println("3. Salir.");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static int menuAdministracion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Introducir productos en la lista.");
        System.out.println("2. Visualizar la lista de productos.");
        System.out.println("3. Eliminar productos de la lista.");
        System.out.println("4. Volver al menú principal.");
        int opcion2 = entrada.nextInt();
        entrada.nextLine();
        return opcion2;
    }
    
    public static int menuCompra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Comprar productos.");
        System.out.println("2. Volver al menú principal.");
        int opcion3 = entrada.nextInt();
        entrada.nextLine();
        return opcion3;
    }
    
    public static void introducirProductosLista(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la cantidad de productos:");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        for(int i = 0; i < cantidad; i++) {
            System.out.println("PRODUCTO "+(i+1)+"");
            System.out.print("Introduce el nombre del producto:");
            String nombre = entrada.nextLine();
            System.out.print("Introduce el precio del producto:");
            float precio = entrada.nextFloat();
            entrada.nextLine();
            System.out.print("Introduce el stock del producto:");
            int stock = entrada.nextInt();
            entrada.nextLine();
            
            productos.add(new Producto(nombre, precio, stock));
        }
    }
    
    public static void visualizarProductos(ArrayList<Producto> productos) {
        for(int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
    }
    
    public static void eliminarProductos(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Introduce el nombre del producto que quieras borrar");
            String nombreProducto = entrada.nextLine();

            boolean encontrado = false;

            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
                    productos.remove(i);
                    System.out.println("Se ha eliminado el producto correctamente.");
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se ha encontrado ningún producto.");
            }
            System.out.println("¿Quieres borrar otro producto?");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));
    }
    
    public static void comprarProductos(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);
        String continuar;
        double total = 0;
        do {
        for(int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
        for(int i = 0; i < productos.size(); i++) {
            System.out.println("Pulse "+(i+1)+" para comprar el producto "+productos.get(i).getNombre()+", cuyo precio es "+productos.get(i).getPrecio()+" y cuyo stock es "+productos.get(i).getStock()+".");
        }
        int opcion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Has elegido comprar el producto "+productos.get(opcion - 1).getNombre()+"");
        System.out.println("Elige cuántas unidades quieres comprar.");
        int unidades = entrada.nextInt();
        entrada.nextLine();
        if(unidades <= productos.get(opcion - 1).getStock()) {
            total = total + unidades * productos.get(opcion - 1).getPrecio();
            productos.get(opcion - 1).setStock(productos.get(opcion - 1).getStock() - unidades);
        }
        else {
            System.out.println("No hay suficiente stock del producto.");
        }
        System.out.println("¿Quieres comprar otro producto?");
        continuar = entrada.nextLine();
        } while(continuar.equalsIgnoreCase("Si"));
        System.out.println("Total compra: "+total+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        int opcion = 0;
        do {
            try {
            opcion = menuPrincipal();
            switch(opcion) {
                case 1: 
                    int opcion2 = 0;
                    do {
                        try {
                        opcion2 = menuAdministracion();
                        switch(opcion2) {
                            case 1:
                                introducirProductosLista(productos);
                                break;
                            case 2:
                                visualizarProductos(productos);
                                break;
                            case 3:
                                eliminarProductos(productos);
                                break;
                            case 4:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Introduce una opción entre 1 y 4.");
                        }
                        } catch(InputMismatchException e) {
                            System.out.println("Introduce un número entero entre 1 y 4.");
                        }
                    } while(opcion2 != 4);
                    break;
                case 2:
                    int opcion3 = 0;
                    do {
                        try {
                            opcion3 = menuCompra();
                            switch (opcion3) {
                                case 1:
                                    comprarProductos(productos);
                                    break;
                                case 2:
                                    System.out.println("Volviendo al menú principal...");
                                    break;
                                default:
                                    System.out.println("Introduce una opción entre 1 y 2.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce un número entero entre 1 y 2.");
                        }
                    } while (opcion3 != 2);
                    break;
                case 3:
                    System.out.println("Te has salido del menú.");
                    break;
                default:
                    System.out.println("Introduce una opción entre 1 y 3.");
            }
            } catch(InputMismatchException e) {
                System.out.println("Introduce un número entero entre 1 y 3.");
            }
        } while(opcion != 3);
    }
    
}
