package Parte_D_Comprender_Clases_VS_Objetos.Ejercicio_19;

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