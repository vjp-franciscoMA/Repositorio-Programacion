/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6 {
    public static Empleados[] empleados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuántos empleados desea introducir?");
        int numeroEmpleados = entrada.nextInt();
        entrada.nextLine();
        Empleados[] empleados = new Empleados[numeroEmpleados];
        
        int i;
        for(i = 0; i < empleados.length; i++) {
            System.out.println("EMPLEADO "+(i+1)+"");
            System.out.println("Introduzca el nombre del empleado:");
            String nombreEmpleado = entrada.nextLine();
            System.out.println("¿Cuántas horas trabajó este mes?");
            int horas = entrada.nextInt();
            entrada.nextLine();
            System.out.println("¿Cuál es su tarifa por hora de trabajo?");
            int tarifa = entrada.nextInt();
            entrada.nextLine();
            empleados[i] = new Empleados(nombreEmpleado,horas,tarifa);
            System.out.println("EMPLEADO "+(i+1)+" ALMACENADO CON ÉXITO");
        }
        return empleados;
    }
    
    public static void sueldoEmpleados(Empleados[] empleados) {
        System.out.println("SUELDO BRUTO DE LOS EMPLEADOS");
        int i;
        for(i = 0; i < empleados.length; i++) {
            int sueldo = 0;
            if(sueldo <= 40) {
                sueldo = empleados[i].getHoras() * empleados[i].getTarifa();
            }
            else {
                int horasExtra = empleados[i].getHoras() - 40;
                sueldo = 40 * empleados[i].getTarifa() + (int)(horasExtra * empleados[i].getTarifa() * 1.5);
            }
            System.out.println(""+empleados[i].getNombre()+" trabajo "+empleados[i].getHoras()+" horas, cobra "+empleados[i].getTarifa()+" euros la hora por lo que le corresponde un sueldo de "+sueldo+" euros.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados[] empleados = empleados();
        sueldoEmpleados(empleados);
    }
    
}
