/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciación de objetos normales
        Perros perro = new Perros("Rex", 5, 20);
        Lobos lobo = new Lobos("Lobo1", 7, 35);
        Leones leon = new Leones("Simba", 8, 190);
        Gatos gato = new Gatos("Misu", 3, 4);

        System.out.println("Objetos normales");
        System.out.println(perro);
        perro.sonido();
        perro.alimentacion();
        perro.habitat();
        perro.nombreCientifico();

        System.out.println(lobo);
        lobo.sonido();
        lobo.alimentacion();
        lobo.habitat();
        lobo.nombreCientifico();

        System.out.println(leon);
        leon.sonido();
        leon.alimentacion();
        leon.habitat();
        leon.nombreCientifico();

        System.out.println(gato);
        gato.sonido();
        gato.alimentacion();
        gato.habitat();
        gato.nombreCientifico();

        // Polimorfismo: objetos a partir de la superclase
        System.out.println("Polimorfismo");
        Animal a1 = new Perros();
        Animal a2 = new Lobos();
        Animal a3 = new Leones();
        Animal a4 = new Gatos();

        a1.sonido();
        a2.sonido();
        a3.sonido();
        a4.sonido();
    }
    
}
