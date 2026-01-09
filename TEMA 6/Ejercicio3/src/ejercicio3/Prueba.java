/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author fmont
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAR FIGURAS Y PROBAR MÉTODOS
        Circulo circulo = new Circulo(8, "Azul");
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        Rectangulo rectangulo = new Rectangulo(2, 8, "Rojo");
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
        Cuadrado cuadrado = new Cuadrado(4, "Verde");
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        
        Triangulo triangulo = new Triangulo(4, 8);
        System.out.println(triangulo.hipotenusa());
        triangulo.tipoTriangulo();
        
        // POLIMORFISMO
        FiguraGeometrica f1 = new Circulo(8, "Azul");
        f1.calcularArea();
        f1.calcularPerimetro();
        
        FiguraGeometrica f2 = new Rectangulo(2, 8, "Rojo");
        f2.calcularArea();
        f2.calcularPerimetro();
        
        FiguraGeometrica f3 = new Cuadrado(4, "Verde");
        f3.calcularArea();
        f3.calcularPerimetro();
        
        TrianguloRectangulo t1 = new Triangulo(4,8);
        System.out.println(t1.hipotenusa());
        t1.tipoTriangulo();
    }
    
}
