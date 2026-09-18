package Parte_A_Reconocimiento_Clases.Ejercicio_4;


// Ejercicio 4: Define una clase CuentaBancaria con atributos numero, titular, saldo
// y un metodo mostrarCuenta().


public class CuentaBancaria {

    //Atributos

    String numero;
    String titular;
    double saldo;

    //Metodo

    void mostrarCuenta() {

        System.out.println( "Cuenta N°: " + numero );
        System.out.println( "Titular: " + titular );
        System.out.println( "Saldo: $" + saldo );


    }
}