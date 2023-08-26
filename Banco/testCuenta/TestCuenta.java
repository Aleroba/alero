package Banco.testCuenta;

import Banco.CuentaBancaria.CuentaBancaria;

public class TestCuenta{
public static void main(String[] args) {
  CuentaBancaria cuenta = new CuentaBancaria("Juan", "Perez", "123456789", "Cuenta de ahorros");
        cuenta.imprimirDatos();

        cuenta.consignar(1000);
        cuenta.retirar(500);

        cuenta.imprimirDatos();
    }  
}

