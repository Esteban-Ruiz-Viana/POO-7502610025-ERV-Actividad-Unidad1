package Parte_H_Ejercicios_argumentativos_con_codigo.Ejercicio_42;


// Ejercicio 42: Crear una clase Curso y dos objetos,
// y explicar por qué pertenecen a la misma clase aunque sus datos sean distintos.

// Explicacion:
// curso1 y curso2 pertenecen a la misma clase porque fueron creados con
// Curso y tienen los mismos atributos y métodos. Sus datos son distintos,
// pero ambos siguen la misma estructura.

public class Ejercicio_42 {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.nombre = "Programación Orientada a Objetos";
        curso1.creditos = 3;


        Curso curso2 = new Curso();
        curso2.nombre = "Bases de Datos";
        curso2.creditos = 4;


        curso1.mostrarInfo();
        System.out.println();
        curso2.mostrarInfo();

    }
}
