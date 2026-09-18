package Parte_E_Constructores_commit.Ejercicio_27;


// Ejercicio 27: Crear un constructor para CuentaBancaria
// que reciba el número, titular y saldo inicial de la cuenta.


public class CuentaBancaria {

    //Atributos

    String numero;
    String titular;
    double saldo;

    //Constructor con parametros

    CuentaBancaria(String numero, String titular, double saldo) {

        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;

    }


    //Metodo

    void mostrarCuenta() {

        System.out.println( "Cuenta N°: " + numero );
        System.out.println( "Titular: " + titular );
        System.out.println( "Saldo: $" + saldo );

    }

    void consignar(double valor) {
        saldo = saldo + valor;

   }

   void retirar(double valor) {

        if (valor  <= saldo) {
            saldo = saldo - valor;

            } else {

            System.out.println( "Saldo insuficiente para retirar $" + valor );

        }
   }
}