package Parte_C_Metodos_sencillos.Ejercicio_13;


// Ejercicio 13: aumenta el saldo con el valor consignado


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

    void consignar(double valor) {
        saldo = saldo + valor;

   }
}