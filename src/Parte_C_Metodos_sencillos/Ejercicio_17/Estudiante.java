package Parte_C_Metodos_sencillos.Ejercicio_17;


// Ejercicio 17: actualiza el semestre del estudiante


public class Estudiante {

    //Atributos

    String nombre;
    int codigo;
    int semestre;

    //Metodo

    void mostrarInfo() {

        System.out.println( "Nombre: " + nombre );
        System.out.println( "Codigo: " + codigo );
        System.out.println( "Semestre: " + semestre );

        }

        void cambiarSemestre(int nuevoSemestre ) {

            semestre = nuevoSemestre;

        }
}