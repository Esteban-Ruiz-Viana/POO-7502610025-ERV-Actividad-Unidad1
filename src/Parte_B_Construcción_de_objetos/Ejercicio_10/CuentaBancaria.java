package Parte_B_Construcción_de_objetos.Ejercicio_10;

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