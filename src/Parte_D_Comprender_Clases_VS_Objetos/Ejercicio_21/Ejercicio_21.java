package Parte_D_Comprender_Clases_VS_Objetos.Ejercicio_21;


// Ejercicio 21: Construye un ejemplo en el que dos objetos tengan
// el mismo valor en un atributo y distinto en los demás


public class Ejercicio_21 {

    public static void main (String[] args) {

            //Estudiante 1

            Estudiante est1 = new Estudiante();
            est1.nombre = "Esteban";
            est1.codigo = 75010;
            est1.semestre = 2;

            //Estudiante 2

            Estudiante est2 = new Estudiante();
            est2.nombre = "Luis";
            est2.codigo = 75010;
            est2.semestre = 4;

            //Imprimir en pantalla

            est1.mostrarInfo();
            System.out.println();
            est2.mostrarInfo();

    }
}




