package Automovil.test;

import Automovil.auto.*;;
public class pruebaAutomovil {
  public static void main(String[] args) {
   Automovil miAuto = new Automovil("Toyota", 2023, 2.5, Automovil.TipoCombustible.GASOLINA, Automovil.TipoAutomovil.SUV, 5, 5, 200, Automovil.Color.ROJO);
       
        miAuto.acelerar(100);
        miAuto.mostrarAtributos();
        miAuto.acelerar(20);
        miAuto.mostrarAtributos();
        miAuto.desacelerar(50);
        miAuto.mostrarAtributos();
        miAuto.frenar();
        miAuto.mostrarAtributos();  
      
  }
}