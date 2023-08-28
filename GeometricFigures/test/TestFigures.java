package GeometricFigures.test;

import GeometricFigures.figures.Circle;
import GeometricFigures.figures.Rectangle;
import GeometricFigures.figures.Square;
import GeometricFigures.figures.Triangle;

public class TestFigures{
public static void main(String[] args) {
        
        Circle figura1 = new Circle(2);
        System.out.println("Area del circulo:\n" + figura1.calcularArea() +"m");
        System.out.println("Perimetro del circulo:\n" + figura1.calcularPerimetro() + "cm");
        
        Square figura2 = new Square(3);
        System.out.println("Area del cuadrado:\n"+ figura2.calcularArea() );
        System.out.println("Perimetro del cuadrado:\n"+ figura2.CalcularPerimetro());
        
        Rectangle figura3= new Rectangle(2, 1);
        System.out.println("Area del rectangulo:\n"+ figura3.calcularArea());
        System.out.println("Area del rectangulo:\n"+ figura3.CalcularPerimetro());
        
        Triangle figura4= new Triangle(5, 3, 0);
        System.out.println("Valor de la hipotenusa:\n"+ figura4.calcularHipotenusa());
        System.out.println("Area del traingulo:\n"+ figura4.calcularArea());
        System.out.println("Perimetro del triangulo:\n"+ figura4.calcularPerimetro());
    }
}