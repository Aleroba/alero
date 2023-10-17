package sistemaPeaje;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Peaje peaje = new Peaje("Peaje la rivera", "Valle del cauca");
       Persona persona1 = new Persona("Juan", "Perez", "123456789", new Date());
       Persona persona2 = new Persona("Maria", "Gomez", "987654321", new Date());

        // Crear vehículos
       Carro carro1 = new Carro("ABC123");
       Carro carro2 = new Carro("DEF456");
       Moto moto1 = new Moto("GHI789");
       Camion camion1 = new Camion("JKL012", 3);
       
       camion1.imprimir();
       System.out.println("Numero de ejes = " + camion1.getNumeroEjes());
      
     }
}
