/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaPeaje;

public class Moto extends Vehiculo {
    // Atributo estático que identifica el valor de peaje a pagar por una moto
    public static int valorPeaje = 5000;
    /**
    * Constructor de la clase Moto
    * @param placa Parámetro que define la placa de una moto
    */
    public Moto(String placa) {
        super(placa); // Invoca al constructor de la clase padre
    }
    /**
    * Método que devuelve el valor del peaje para una moto
    * @return El valor del peaje para una moto
    */
    public int getValorPeaje() {
        return valorPeaje;
    }
    /**
    * Método que establece el valor del peaje para una moto
    * @param Parámetro que define el valor del peaje para una moto
    */
    public static void setValorPeaje(int valorPeaje) {
        valorPeaje = valorPeaje;
    }
    /**
    * Método que muestra en pantalla la placa y el valor del peaje de
    * una moto
    */
    public void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}
