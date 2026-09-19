package Parte_J_Mini_retos_integradores.Ejercicio_55;

// Ejercicio 55: Crea una clase Reloj con hora, minuto y segundo.
// Agrega método mostrarHora().

public class Reloj {

    int hora;
    int minuto;
    int segundo;

    void mostrarHora() {

        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);

    }
}
