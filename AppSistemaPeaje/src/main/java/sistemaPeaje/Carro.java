/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaPeaje;

public class Carro extends Vehiculo {
    // Atributo estático que identifica el valor de peaje a pagar por un carro
    public static int valorPeaje = 10000;
    /**
    * Constructor de la clase Carro
    * @param placa Parámetro que define la placa de un carro
    */
   public Carro(String placa) {
        super(placa); // Invoca al constructor de la clase padre
    }
    /**
    * Método que devuelve el valor del peaje para un carro
    * @return El valor del peaje para un carro
    */
    public int getValorPeaje() {
        return valorPeaje;
    }
    /**
    * Método que establece el valor del peaje para un carro
    * @param Parámetro que define el valor del peaje para un carro
    */
   public  static void setValorPeaje(int valorPeaje) {
        valorPeaje = valorPeaje;
    }

    /**
    * Método que muestra en pantalla la placa y el valor del peaje de un
    * carro
    */
    public void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}


