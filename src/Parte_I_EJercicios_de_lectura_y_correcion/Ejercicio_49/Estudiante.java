package Parte_I_EJercicios_de_lectura_y_correcion.Ejercicio_49;

// Ejercicio 49 :Corrige un ejemplo donde un objeto intenta acceder a atributos
// de otro (objeto) sin referencia adecuada.

public class Estudiante {

    // 1. Ejemplo Incorrecto (atributo usado sin indicar el objeto):

//     Estudiante est1 = new Estudiante();

//     est1.nombre = "Ana";

//     System.out.println(nombre);       <- falta indicar el objeto

    // 2. Explicacion del error

    // Mensaje del compilador: "cannot find symbol" (variable nombre)

    // Sucede porque "nombre" es un atributo de cada objeto, no una variable suelta.
    // Hay que escribir "est1.nombre".

    // 3. Codigo correcto

    String nombre;

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();

        est1.nombre = "Ana";
        est2.nombre = "Luis";

        System.out.println(est1.nombre); // referencia correcta al objeto
        System.out.println(est2.nombre);

    }
}