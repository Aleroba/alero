package GeometricFigures.figures;

public class Square {
  private double lado;

    public Square(double lado) {
        this.lado = lado;
    }
   public double calcularArea(){
    return  (Math.pow(lado,2));
    }
    
   public  double CalcularPerimetro(){
    return  (lado*4);
    }

}