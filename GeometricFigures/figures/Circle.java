package GeometricFigures.figures;

public class Circle {
    
    private double radio;
    
  public Circle(double radio) {
            this.radio = radio;
        }
        
       public  double calcularArea(){
        return  (Math.PI*(radio*radio));
        }
        
       public  double calcularPerimetro(){
        return  (2*(Math.PI)*radio);
        }
    
    }

