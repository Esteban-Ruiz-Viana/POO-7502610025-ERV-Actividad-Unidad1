package Parte_E_Constructores_commit.Ejercicio_28;


// Ejercicio 28: Crea tres cuentas usando ese constructor.


public class Ejercicio_28 {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("98765", "Pedro", 200000);
        CuentaBancaria cuenta2 = new CuentaBancaria("11223", "Marta", 500000);
        CuentaBancaria cuenta3 = new CuentaBancaria("44556", "Laura", 150000);

        //Imprimir valores

        System.out.println("Cuenta 1:");
        cuenta1.mostrarCuenta();

        System.out.println("\nCuenta 2:");
        cuenta2.mostrarCuenta();

        System.out.println("\nCuenta 3:");
        cuenta3.mostrarCuenta();

    }
}
