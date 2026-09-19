package Parte_I_EJercicios_de_lectura_y_correcion.Ejercicio_50;

// Ejercicio 50: Corrige un programa donde se intenta usar un metodo
// de instancia sin haber creado un objeto en main.

public class Mascota {

    // 1. Ejemplo Incorrecto (no se creaba un objeto con new):

//     public static void main(String[] args) {
//
//         mostrarMascota();      // <- se intenta llamar al metodo sin un objeto
//
//     }

    // 2. Explicacion del error
    // Mensaje del compilador: "non-static method mostrarMascota() cannot be
    // referenced from a static context"
    //
    // Esto sucede porque mostrarMascota() es un metodo de instancia y main()
    // es un metodo static. Para llamar a mostrarMascota(), primero se debe
    // crear un objeto de la clase Mascota.

    // 3. Codigo Correcto

    String nombre;

    void mostrarMascota() {

        System.out.println("Nombre: " + nombre);

    }

    public static void main(String[] args) {

        Mascota mascota1 = new Mascota(); // se construye el objeto
        mascota1.nombre = "Firulais";

        mascota1.mostrarMascota();

    }
}