/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.figurasgeometricas;

abstract class FigurasGeometricas { 
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public static void main(String[] args) {
        //clase main 
       Circulo c = new Circulo(5);
       Rectangulo r =new Rectangulo(4,6);
       Cuadrado o = new Cuadrado(4);
       TrianguloRectangulo t= new TrianguloRectangulo(3,4); 
       
       //Circulo
        System.out.println("Circulo");
        System.out.println("Radio"+c.radio());
        System.out.println("Área"+c.calcularArea());
        System.out.println("Perímetro"+c.calcularPerimetro());
       //Rectángulo
        System.out.println("Rectángulo");
        System.out.println("Base"+r.base()+"Altura"+r.altura());
        System.out.println("Área"+r.calcularArea());
        System.out.println("Perímetro"+r.calcularPerimetro());
      //Cuadrado
        System.out.println("Cuadrado");
        System.out.println("Lado"+o.lado());
        System.out.println("Área"+o.calcularArea());
        System.out.println("Perímetro"+o.calcularPerimetro());
      //Triangulo Rectángulo
        System.out.println("Triangulo Rectángulo");
        System.out.println("Base"+t.base()+"Altura"+t.altura());
        System.out.println("Área"+t.calcularArea());
        System.out.println("Perímetro"+t.calcularPerimetro());
        System.out.println("Hipotenusa"+t.calcularHipotenusa());
        System.out.println("Tipo"+t.tipoTriangulo());
    }
}
