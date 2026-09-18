package Parte_C_Metodos_sencillos.Ejercicio_14;


// Ejercicio 14: retira solo si hay saldo suficiente


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

   void retirar(double valor) {

        if (valor  <= saldo) {
            saldo = saldo - valor;

            } else {

            System.out.println( "Saldo insuficiente para retirar $" + valor );

        }
   }
}