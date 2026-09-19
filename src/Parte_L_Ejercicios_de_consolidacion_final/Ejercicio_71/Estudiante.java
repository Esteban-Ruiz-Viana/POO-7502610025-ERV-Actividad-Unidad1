package Parte_L_Ejercicios_de_consolidacion_final.Ejercicio_71;

// Ejercicio 71: Reescribe uno de tus primeros ejercicios(Ejercicio 1), pero
// ahora usando constructor con parámetros.

public class Estudiante {

    //Atributos

    String nombre;
    int codigo;
    int semestre;

    //Constructor con parametros

    Estudiante(String nombre, int codigo, int semestre) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;

    }


    //Metodo

    void mostrarInfo() {

        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Semestre: "+semestre);

        }
}