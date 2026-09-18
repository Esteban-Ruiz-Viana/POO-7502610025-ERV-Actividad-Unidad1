package Parte_D_Comprender_Clases_VS_Objetos.Ejercicio_20;


// Ejercicio 20: Crea tres objetos de una misma clase y explica
// por escrito que comparten y en qué se diferencian.


public class Ejercicio_20 {

    public static void main (String[] args) {

            //Estudiante 1

            Estudiante est1 = new Estudiante();
            est1.nombre = "Esteban";
            est1.codigo = 75026;
            est1.semestre = 2;

            //Estudiante 2

            Estudiante est2 = new Estudiante();
            est2.nombre = "Luis";
            est2.codigo = 75010;
            est2.semestre = 4;

            //Estudiante 3

            Estudiante est3 = new Estudiante();
            est3.nombre = "Marta";
            est3.codigo = 75030;
            est3.semestre = 1;

            //Imprimir en pantalla

            est1.mostrarInfo();
            System.out.println();
            est2.mostrarInfo();
            System.out.println();
            est3.mostrarInfo();


//¿Que comparten?
// Los tres objetos pertenecen a la misma clase, por lo que tienen
// las mismas caracteristicas: nombre, codigo y semestre.
// También pueden utilizar el metodo mostrarInfo().
//
// ¿En que se diferencian?
// Cada objeto tiene sus propios datos. est1 representa a Esteban,
// est2 representa a Luis y est3 representa a Marta.
// Aunque los tres tienen la misma estructura, sus valores son diferentes
// y cada objeto es independiente de los demás.

    }
}




