package Parte_I_EJercicios_de_lectura_y_correcion.Ejercicio_46;

// Ejercicio 46 : Corrige una clase donde falte el nombre de la clase.

public class Persona {

    // 1. Ejemplo incorrecto (faltaba el nombre de la clase):

//     public class {

//         String nombre;
//         int edad;

//     }

    // 2. EXPLICACION DEL ERROR
    // Mensaje del compilador: "<identifier> expected"
    // Esto se debe a que despues de "class", Java siempre espera un nombre.
    // Sin nombre, no sabe como se llama la clase ni con que archivo asociarla.

    // 3. Codigo correcto

    String nombre;
    int edad;

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.nombre = "Ana";
        p1.edad = 20;
        System.out.println( p1.nombre + " - " + p1.edad + " años" );

    }
}

