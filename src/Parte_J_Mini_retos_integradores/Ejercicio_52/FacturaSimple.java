package Parte_J_Mini_retos_integradores.Ejercicio_52;


// Ejercicio 52: Crea una clase FacturaSimple con numero, cliente y valor.
// Agrega un metodo para aplicar un descuento del 10%.


public class FacturaSimple {

    String numero;
    String cliente;
    double valor;

    // Aplica un descuento del 10% sobre el valor actual

    void aplicarDescuento() {

        valor = valor - (valor * 0.10);

    }
}