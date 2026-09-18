package Parte_B_Construcción_de_objetos.Ejercicio_9;


// Ejercicio 9: Crea un objeto de Mascota y cambia dos veces su edad
// para observar la diferencia en el estado.


public class Ejercicio_9 {

    public static void main(String[] args) {

        //Mascota

        Mascota mascota = new Mascota();
        mascota.nombre = "Firulais";
        mascota.especie = "Perro";
        mascota.edad = 3;

        System.out.println("Estado inicial:");
        mascota.mostrarMascota();

        // Primer cambio de edad

        mascota.edad = 4;
        System.out.println("\nDespues del primer cumpleaños:");
        mascota.mostrarMascota();

        // Segundo cambio de edad

        mascota.edad = 5;
        System.out.println("\nDespues del segundo cumpleaños:");
        mascota.mostrarMascota();

    }
}
