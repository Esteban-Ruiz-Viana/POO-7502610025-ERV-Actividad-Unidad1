package Parte_L_Ejercicios_de_consolidacion_final.Ejercicio_68;

// Ejercicio 68: clase libre relacionada con un negocio.
// Elegi modelar un cliente de mi negocio de gestion de cuentas de Spotify.

public class ClienteSpotify {

        String nombreCliente;
        String fechaVencimiento;
        double valorMensual;
        boolean pagoAlDia;

        void registrarPago() {

            pagoAlDia = true;

        }

        void avisarVencimiento() {

            System.out.println( "Recordatorio: La cuenta de " + nombreCliente + " vence el " + fechaVencimiento );

        }

        void mostrarInfo() {

            System.out.println("Cliente: " + nombreCliente);
            System.out.println("Vence: " + fechaVencimiento);
            System.out.println("Valor mensual: $" + valorMensual);
            System.out.println("Pago al día: " + pagoAlDia);

        }
}

