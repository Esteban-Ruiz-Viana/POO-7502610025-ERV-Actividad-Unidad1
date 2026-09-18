package Parte_B_Construcción_de_objetos.Ejercicio_10;


// Ejercicio 10: Crea dos objetos de CuentaBancaria y muestra como cada
// uno conserva sus propios valores.


public class Ejercicio_10 {

    public static void main(String[] args) {

        //Cuenta 1

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = "98765";
        cuenta1.titular = "Pedro";
        cuenta1.saldo = 200000;

        //Cuenta 2

        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numero = "11223";
        cuenta2.titular = "Marta";
        cuenta2.saldo = 500000;

        //Imprimir valores

        System.out.println("Cuenta 1:");
        cuenta1.mostrarCuenta();

        System.out.println("\nCuenta 2:");
        cuenta2.mostrarCuenta();

        //Se modifica el saldo de cuenta 2 y se comprueba que cuenta 1 mantiene su propio saldo.

        cuenta2.saldo = 450000;
        System.out.println("\nSaldo de cuenta 2 despues de un retiro: $" + cuenta2.saldo);
        System.out.println("Saldo de cuenta 1 (no cambio): $" + cuenta1.saldo);

    }
}
