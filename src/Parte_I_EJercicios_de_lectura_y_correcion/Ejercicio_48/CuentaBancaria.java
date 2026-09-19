package Parte_I_EJercicios_de_lectura_y_correcion.Ejercicio_48;

// Ejercicio 48: Corrige un programa donde se confunden atributos con variables locales del método.

public class CuentaBancaria {

    // 1. Ejemplo equivocado (variable local tapando al atributo):

//     void consignar(double valor) {

//         double saldo = saldo + valor;        <- se usa antes de existir

//     }

    // 2. Explicacion error
    // Mensaje del compilador: "variable saldo might not have been initialized"
    // Sucede debido a que "double saldo" declara una variable nueva local, distinta del
    // atributo, y se intenta usar antes de darle un valor.

    // 3. Codigo correcto

    String titular;
    double saldo;

    void consignar(double valor) {

        saldo = saldo + valor;   // Se utiliza el atributo saldo de la clase.

    }

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria();
        c1.saldo = 100000;
        c1.consignar(50000);

        System.out.println("Saldo final: " + c1.saldo);

    }
}