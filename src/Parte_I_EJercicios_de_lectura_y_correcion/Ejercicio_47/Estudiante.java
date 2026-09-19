package Parte_I_EJercicios_de_lectura_y_correcion.Ejercicio_47;

// Ejercicio 47: Corrige un programa donde se intenta usar un objeto sin haberlo creado.

public class Estudiante {

    // 1. Ejemplo Incorrecto (el objeto se usaba sin haberlo creado):

    // Estudiante est1;
    // est1.nombre = "Ana";        // <- el objeto no existe todavia

    // 2. Explicacion del error
    // Mensaje del compilador: "variable est1 might not have been initialized"
    // Esto es deibo a que declarar la variable no crea el objeto, falta
    // " est1 = new Estudiante(); " antes de usarla.

    // 3. Codigo Correcto

    String nombre;

    void mostrarInfo() {

        System.out.println("Nombre: " + nombre);

    }

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante();
        est1.nombre = "Ana";
        est1.mostrarInfo();

    }
}