package Parte_D_Comprender_Clases_VS_Objetos.Ejercicio_19;


// Ejercicio 19: Explicar por que Estudiante es una clase y est1 es un objeto"


public class Ejercicio_19 {

    public static void main(String[] args) {

// ¿Por qué "Estudiante" es una clase?
// Debido a que "Estudiante" es el molde o modelo que define como sera un estudiante.
// Indica que tendra un nombre, un codigo y un semestre, ademas de poder
// mostrar su informacion. La clase por sí sola no representa a un estudiante específico.


    Estudiante est1 = new Estudiante();
    est1.nombre = "Esteban";
    est1.codigo = 75026;
    est1.semestre = 2;


// ¿Por qué "est1" es un objeto?
// Gracias a que "est1" es un estudiante especifico creado a partir de la clase
// "Estudiante" usando "new". Tiene sus propios datos, como el nombre,
// el codigo y el semestre. "Estudiante" es el molde y "est1" es el objeto creado.

    est1.mostrarInfo();

    }
}
