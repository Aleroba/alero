package Planeta.planet;

public class Planet {
 String name=null;
 int cantidadSatelites=0;
 double masa=0.0;
 double volumen=0.0;
 int diametro=0;
 int distancia_Sol=0;
 private TipoPlaneta tipoPlaneta;
 boolean esObservable=false;

public enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO}

//metodo contructor

public Planet(String name, int cantidadSatelites, double masa, double volumen, int diametro, int distancia_Sol,
        TipoPlaneta tipoPlaneta, boolean esObservable) {
    this.name = name;
    this.cantidadSatelites = cantidadSatelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diametro = diametro;
    this.distancia_Sol = distancia_Sol;
    this.tipoPlaneta = tipoPlaneta;
    this.esObservable = esObservable;
}

//Metodos get y set 

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getCantidadSatelites() {
    return cantidadSatelites;
}

public void setCantidadSatelites(int cantidadSatelites) {
    this.cantidadSatelites = cantidadSatelites;
}

public double getMasa() {
    return masa;
}

public void setMasa(double masa) {
    this.masa = masa;
}

public double getVolumen() {
    return volumen;
}

public void setVolumen(double volumen) {
    this.volumen = volumen;
}

public int getDiametro() {
    return diametro;
}

public void setDiametro(int diametro) {
    this.diametro = diametro;
}

public int getDistancia_Sol() {
    return distancia_Sol;
}

public void setDistancia_Sol(int distancia_Sol) {
    this.distancia_Sol = distancia_Sol;
}

public TipoPlaneta getTipoPlaneta() {
    return tipoPlaneta;
}

public void setTipoPlaneta(TipoPlaneta tipoPlaneta) {
    this.tipoPlaneta = tipoPlaneta;
}

public boolean isEsObservable() {
    return esObservable;
}

public void setEsObservable(boolean esObservable) {
    this.esObservable = esObservable;
};

public void imprimir() {
    System.out.println("Nombre del planeta = " + name);
    System.out.println("Cantidad de satélites = " + cantidadSatelites);
    System.out.println("Masa del planeta = " + masa);
    System.out.println("Volumen del planeta = " + volumen);
    System.out.println("Diámetro del planeta = " + diametro);
    System.out.println("Distancia al sol = " + distancia_Sol);
    System.out.println("Tipo de planeta = " + tipoPlaneta);
    System.out.println("Es observable = " + esObservable);
}

/**
* Método que calcula y devuelve la densidad de un planeta
* @return La densidad calculada del planeta
*/
double calcularDensidad() {
    return masa/volumen;
}


/**
* Método que determina y devuelve si un planeta es exterior o no
* @return Valor booleano que indica si el planeta es exterior o no
*/
public boolean esPlanetaExterior(){
    float límite = (float) (149597870 * 3.4);
    /* Un planeta exterior está situado más allá del cinturón de
    asteroides */
    /* El cinturón se encuentra entre 2,1 y 3,4 UA (UA =
    149.597.870 Km) */
    if (distancia_Sol > límite) {
        return true;
    } else {
       return false;
    }
}

public static int suma (int a, int b){
    return a + b;
}

}

