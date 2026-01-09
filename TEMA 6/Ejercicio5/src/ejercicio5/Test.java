/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author fmont
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIA DE OBJETOS
        Ornitorrinco ornitorrinco = new Ornitorrinco(5, "Perri", "Macho", "Azul", 8);
        System.out.println(ornitorrinco.toString());
        System.out.println(ornitorrinco.obtenerMensajeOviparo());
        ornitorrinco.ponerHuevo();
        ornitorrinco.incubarHuevo();
        ornitorrinco.mostrarNumHuevos();
        
        Murcielago murcielago = new Murcielago(20.5, "Bat", "Macho", "Negro", 10);
        System.out.println(murcielago.toString());
        System.out.println(murcielago.obtenerMensajeVolador());
        murcielago.aumentarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        
        // POLIMORFISMO
        Oviparo oviparo = new Ornitorrinco(5, "Perri", "Macho", "Azul", 8);
        System.out.println(oviparo.toString());
        System.out.println(oviparo.obtenerMensajeOviparo());
        oviparo.ponerHuevo();
        oviparo.incubarHuevo();
        oviparo.mostrarNumHuevos();
        
        Volador volador = new Murcielago(20.5, "Bat", "Macho", "Negro", 10);
        System.out.println(volador.toString());
        System.out.println(volador.obtenerMensajeVolador());
        volador.aumentarAlturaVuelo();
        volador.bajarAlturaVuelo();
        volador.mostrarAlturaVuelo();
        
    }
    
}
