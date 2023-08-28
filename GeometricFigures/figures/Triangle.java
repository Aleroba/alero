package GeometricFigures.figures;

public class Triangle {
    private double altura;
    private double base;
    private double H;

    public Triangle(double altura, double base, double H) {
        this.altura = altura;
        this.base = base;
        this.H = H;
    }

    public double calcularHipotenusa(){
    if(H==0){
       H=Math.sqrt(Math.pow(altura,2)+Math.pow(base,2));
       return H;
    } else{
            this.H=calcularHipotenusa();

            return H;
            }
            
    }

   public  double calcularArea(){
    return  (base*altura)/2;
    }
   
   public  double calcularPerimetro(){
    return (base+altura+H); 
    } 
}
