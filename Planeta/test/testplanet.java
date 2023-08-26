package Planeta.test;
import Planeta.planet.*;;
public class testplanet {
    public static void main(String[] args) {
        Planet p1 = new Planet("Tierra",1,5.9736E24,1.08321E12,12742,150000000,Planet.TipoPlaneta.TERRESTRE,true);
        p1.imprimir();
        System.out.println("Es planeta exterior = " +p1.esPlanetaExterior());
    }
}
