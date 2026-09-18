package Parte_F_Varias_formas_de_construir_objetos.Ejercicio_30;


// Ejercicio 30: Crea tres objetos de Estudiante, uno con
// cada forma de construcción.


public class Ejercicio_30 {

    public static void main (String[] args) {

            // Con constructor vacio

            Estudiante est1 = new Estudiante();
            est1.nombre = "Ana";
            est1.codigo = 1001;
            est1.semestre = 2;

            // Con constructor de nombre y codigo

            Estudiante est2 = new Estudiante("Luis", 1058);

            // Con constructor de nombre, codigo y semestre

            Estudiante est3 = new Estudiante("Marta", 1102, 4);

            //Imprimir en pantalla

            est1.mostrarInfo();
            System.out.println();
            est2.mostrarInfo();
            System.out.println();
            est3.mostrarInfo();

    }
}