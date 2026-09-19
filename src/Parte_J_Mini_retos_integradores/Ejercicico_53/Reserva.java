package Parte_J_Mini_retos_integradores.Ejercicico_53;

// Ejercicio 53: Crea una clase Reserva con nombreCliente, fecha y activa.
// Agrega metodos para confirmar y cancelar la reserva.

public class Reserva {

        String nombreCliente;
        String fecha;
        boolean activa;

        void confirmar() {

            activa = true;

        }

        void cancelar() {

            activa = false;

        }
}