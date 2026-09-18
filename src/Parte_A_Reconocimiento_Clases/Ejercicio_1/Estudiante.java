package Parte_A_Reconocimiento_Clases.Ejercicio_1;


//Ejercicio 1: Definir una clase Estudiante con atributos nombre, codigo, semestre
//y un metodo mostrarInfo().


public class Estudiante {

    //Atributos

    String nombre;
    int codigo;
    int semestre;

    //Metodo

    void mostrarInfo() {

        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Semestre: "+semestre);

        }
}