/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11y12;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio11y12 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Mostrar muebles por precio");
        System.out.println("4. Salir");
        int opcion = entrada.nextInt();
        return opcion;
    }
    public static Mueble[] rellenarMuebles() {
        Scanner entrada = new Scanner(System.in);
        Mueble[] muebles = new Mueble[4];
        int i;
        for(i = 0; i < muebles.length; i++) {
            System.out.println("Introduce el precio del mueble "+(i+1)+"");
            double precio = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Introduce la descricpión del mueble "+(i+1)+"");
            String descripcion = entrada.nextLine();
            muebles[i] = new Mueble(precio, descripcion);
        }
        return muebles;
    } 
    public static void mostrarMuebles(Mueble[] muebles) {
        int i;
        for(i = 0; i < muebles.length; i++) {
            System.out.println(muebles[i]);
        }
    }
    public static void mostrarMueblesporPrecio(Mueble[] muebles) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Introduce un precio para mostrarte los muebles con ese precio o con uno inferior:");
        double precio2 = entrada.nextDouble();
        entrada.nextLine();
        for(i = 0; i < muebles.length; i++) {
            if(muebles[i].getPrecio() <= precio2) {
            System.out.println(muebles[i]);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Mueble[] muebles = new Mueble[4];
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    muebles = rellenarMuebles();
                    break;
                case 2:
                    mostrarMuebles(muebles);
                    break;
                case 3:
                    mostrarMueblesporPrecio(muebles);
                    break;
                case 4:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("ERROR. Introduce un número válido.");
            }
        } while(opcion != 4);
    }
    
}
