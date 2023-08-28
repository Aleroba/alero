package GeometricFigures.figures;

public class Rectangle {
   private  double altura;
   private double base;
 
 public Rectangle(double altura, double base) {
         this.altura = altura;
         this.base = base;
     }
public  double calcularArea(){
     return  (altura*base);
     }
     
public  double CalcularPerimetro(){
     return  ((2*altura)+(2*base));
     }
}
