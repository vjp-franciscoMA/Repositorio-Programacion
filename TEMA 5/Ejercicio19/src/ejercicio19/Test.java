package ejercicio19;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Me he ayudado en esta parte de la IA
        Scanner entrada = new Scanner(System.in);

        // Empleado 1
        System.out.println("Empleado 1");
        System.out.print("Nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas1 = entrada.nextInt();
        System.out.print("Tarifa por hora: ");
        double tarifa1 = entrada.nextDouble();
        entrada.nextLine(); // Limpio el buffer
        Empleado empleado1 = new Empleado(nombre1, horas1, tarifa1);

        // Empleado 2
        System.out.println("Empleado 2");
        System.out.print("Nombre: ");
        String nombre2 = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas2 = entrada.nextInt();
        System.out.print("Tarifa por hora: ");
        double tarifa2 = entrada.nextDouble();
        entrada.nextLine(); // Limpio el buffer
        Empleado empleado2 = new Empleado(nombre2, horas2, tarifa2);

        // Empleado 3
        System.out.println("Empleado 3");
        System.out.print("Nombre: ");
        String nombre3 = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas3 = entrada.nextInt();
        System.out.print("Tarifa por hora: ");
        double tarifa3 = entrada.nextDouble();
        entrada.nextLine(); // Limpio el buffer
        Empleado empleado3 = new Empleado(nombre3, horas3, tarifa3);

        // Muestro los sueldos brutos
        System.out.println(empleado1.getNombre() + " tiene un sueldo bruto de " + empleado1.calcularSueldoBruto() + " euros.");
        System.out.println(empleado2.getNombre() + " tiene un sueldo bruto de " + empleado2.calcularSueldoBruto() + " euros.");
        System.out.println(empleado3.getNombre() + " tiene un sueldo bruto de " + empleado3.calcularSueldoBruto() + " euros.");
    }
}
