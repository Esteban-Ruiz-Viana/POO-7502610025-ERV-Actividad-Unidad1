package Parte_K_Ejercicios_de_diseno_antes_del_codigo.Ejercicio_61;

// Ejercicio 61: Planificar la clase Docente antes de programarla,
// definiendo sus atributos, métodos y posibles objetos reales.


// Diseña antes del codigo:

// Atributos: nombre, especialidad, añosExperiencia.

// Métodos: dictarClase(), calificarEstudiante(double nota), mostrarInfo().

// Objetos reales que podrian construirse: un docente de matematicas con
// 10 años de experiencia, un docente de programacion recien contratado,
// un docente de historia proximo a jubilarse.

public class Docente {


    String nombre;
    String especialidad;
    int aniosExperiencia;

    void dictarClase() {

        System.out.println(nombre + " está dictando una clase de " + especialidad);

    }

    void calificarEstudiante(double nota) {

        System.out.println(nombre + " asignó la nota: " + nota);

    }

    void mostrarInfo() {

        System.out.println( "Nombre: " + nombre );
        System.out.println( "Especialidad: " + especialidad );
        System.out.println( "Años de experiencia: " + aniosExperiencia );

    }
}