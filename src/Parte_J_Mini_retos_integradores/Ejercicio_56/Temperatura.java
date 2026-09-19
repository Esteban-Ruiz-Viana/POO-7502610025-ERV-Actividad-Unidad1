package Parte_J_Mini_retos_integradores.Ejercicio_56;

// Ejercicio 56: Crea una clase Temperatura con valor en grados Celsius.
// Agrega método para convertir a Fahrenheit.

public class Temperatura {

    double valorCelsius;

    // Convierte el valor guardado (en Celsius) a Fahrenheit

    double convertirAFahrenheit() {

        return (valorCelsius * 9 / 5) + 32;

    }
}