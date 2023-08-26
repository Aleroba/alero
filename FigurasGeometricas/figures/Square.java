package FigurasGeometricas.figures;

public class Square {
   private double base;
   private double altura;

    public Square(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculatePerimeter(double base, double altura){
        return (2*base)+(2*altura);
    }
  
    public double calculateArea(double b, double a){
        a=altura;
        b=base;
        return b*a;
    }
}
