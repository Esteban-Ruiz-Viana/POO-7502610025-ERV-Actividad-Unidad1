package Parte_F_Varias_formas_de_construir_objetos.Ejercicio_29;


// Ejercicio 29: Crear tres constructores para Estudiante:
// uno vacío, uno con nombre y código,
// y otro con nombre, código y semestre.


public class Estudiante {

    //Atributos

    String nombre;
    int codigo;
    int semestre;

    // Constructor vacio

    Estudiante() {}


    // Constructor con nombre y codigo.
    // this() para reutilizar el de abajo y no repetir codigo

    Estudiante(String nombre, int codigo) {

        this(nombre, codigo, 1);

    }

    // Constructor con nombre, codigo y semestre

    Estudiante(String nombre, int codigo, int semestre) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;

    }


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