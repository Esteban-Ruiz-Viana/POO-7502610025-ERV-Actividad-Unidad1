package Parte_J_Mini_retos_integradores.Ejercicio_54;


// Ejercicio 54: Crea una clase Semaforo con color actual.
// Agrega método para cambiar entre rojo, amarillo y verde.


public class Semaforo {

    String colorActual;

    // Cambia al siguiente color del ciclo: rojo -> verde -> amarillo -> rojo

    void cambiarColor() {

        if (colorActual.equals("rojo")) {

            colorActual = "verde";

        } else if (colorActual.equals("verde")) {

            colorActual = "amarillo";

        } else {

            colorActual = "rojo";
        }
    }
}

