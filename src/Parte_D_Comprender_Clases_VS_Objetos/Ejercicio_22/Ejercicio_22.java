package Parte_D_Comprender_Clases_VS_Objetos.Ejercicio_22;


// Ejercicio 22: Crea una clase Libro y cuatro objetos distintos. Luego redacta una
// conclusión corta sobre por qué la clase es plantilla y los objetos son casos concretos.


public class Ejercicio_22 {

    static void main(String[]args ) {

            //Libro 1

            Libro libro1 = new Libro();
            libro1.titulo = "Cien Años de Soledad";
            libro1.autor = "Gabriel García Márquez";
            libro1.paginas = 496;

            //Libro 2

            Libro libro2 = new Libro();
            libro2.titulo = "El Principito";
            libro2.autor = "Antoine de Saint-Exupéry";
            libro2.paginas = 124;

            //Libro 3

            Libro libro3 = new Libro();
            libro3.titulo = "La metamorfosis";
            libro3.autor = "Franz Kafka";
            libro3.paginas = 100;

            //Libro 4

            Libro libro4 = new Libro();
            libro4.titulo = "El fotógrafo de cristales";
            libro4.autor = "Albeiro Echavarría";
            libro4.paginas = 232;


            //Imprimir en Pantalla

            libro1.mostrarInfo();
            System.out.println();

            libro2.mostrarInfo();
            System.out.println();

            libro3.mostrarInfo();
            System.out.println();

            libro4.mostrarInfo();


// Conclusion corta:
// La clase Libro sirve como una plantilla que indica que datos tendra un libro.
// Los objetos libro1, libro2, libro3 y libro4 son libros diferentes creados
// a partir de esa plantilla. Todos tienen titulo, autor y paginas, pero sus
// datos son diferentes.

//CASOS CONCRETOS:
// Cada uno tiene datos reales y distintos, aunque los cuatro
// fueron fabricados con el mismo molde.
// Por eso la clase se escribe una sola vez, y a partir de ella
// se pueden crear tantos objetos como se necesiten.

    }
}
