package Parte_L_Ejercicios_de_consolidacion_final.Ejercicio_69;

public class ClienteSpotify {

        public String nombreCliente;
        public String fechaVencimiento;
        public double valorMensual;
        public boolean pagoAlDia;

        public void registrarPago() {

            pagoAlDia = true;

        }

        public void avisarVencimiento() {

            System.out.println( "Recordatorio: La cuenta de " + nombreCliente + " vence el " + fechaVencimiento );

        }

        public void mostrarInfo() {

            System.out.println("Cliente: " + nombreCliente);
            System.out.println("Vence: " + fechaVencimiento);
            System.out.println("Valor mensual: $" + valorMensual);
            System.out.println("Pago al día: " + pagoAlDia);

        }
}

