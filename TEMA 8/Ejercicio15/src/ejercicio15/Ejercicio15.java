/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {
    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ASOCIACIÓN NOS GUSTA EL CINE");
        System.out.println("1. Rellenar las películas junto con los socios que han acudido a verla.");
        System.out.println("2. Mostrar las películas y los socios que la han visto.");
        System.out.println("3. Mostrar la película más rentable.");
        System.out.println("4. Mostrar la película menos rentable.");
        System.out.println("5. Pedir el nombre de una película y mostrar el beneficio neto y toda la información de los socios que han asistido a verla.");
        System.out.println("6. Contar el número de socios que han abonado una cantidad mayor a la pedida por pantalla.");
        System.out.println("7. Salir del programa.");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        return opcion;
    }
    public static Pelicula[] rellenarPeliculasYSocios() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de películas:");
        int numeroPeliculas = entrada.nextInt();
        entrada.nextLine();
        Pelicula[] peliculas = new Pelicula[numeroPeliculas];
        
        for(int i = 0; i < peliculas.length; i++) {
            System.out.println("Introduce el título de la película "+(i+1)+":");
            String tituloPelicula = entrada.nextLine();
            System.out.println("Introduce el coste de licencia de la película "+(i+1)+":");
            double costeLicenciaPelicula = entrada.nextDouble();
            entrada.nextLine();
            
            Socio[] socios = new Socio[4];
            
            for(int j = 0; j < socios.length; j++) {
                System.out.println("Introduce el nombre del socio "+(j+1)+":");
                String nombreSocio = entrada.nextLine();
                System.out.println("Introduce la cantidad abonada del socio "+(j+1)+"");
                double abonadoSocio = entrada.nextDouble();
                entrada.nextLine();
                socios[j] = new Socio(nombreSocio, abonadoSocio);
            }
            peliculas[i] = new Pelicula(tituloPelicula, costeLicenciaPelicula, socios);
        }
        return peliculas;
    }
    public static void mostrarPeliculasYSocios(Pelicula[] peliculas) {
        for(int i = 0; i < peliculas.length; i++) {
            System.out.println("Título: "+peliculas[i].getTitulo()+"");
            System.out.println("Coste Licencia: "+peliculas[i].getCosteLicencia()+"");
            
            Socio[] socios = peliculas[i].getSocios();
            
            for(int j = 0; j < socios.length; j++) {
                System.out.println("Nombre: "+socios[j].getNombre()+"");
                System.out.println("Abonado: "+socios[j].getAbonado()+"");
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Pelicula[] peliculas = null;
        do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    peliculas = rellenarPeliculasYSocios();
                    break;
                case 2:
                    mostrarPeliculasYSocios(peliculas);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Te has salido del programa.");
                    break;
                default:
                    System.out.println("ERROR. Introduce un número entero válido.");
            }
        } while(opcion != 7);
    }
    
}
