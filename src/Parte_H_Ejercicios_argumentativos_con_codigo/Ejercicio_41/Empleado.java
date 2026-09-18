package Parte_H_Ejercicios_argumentativos_con_codigo.Ejercicio_41;


// Ejercicio 41: Crea una clase Empleado y explica por que era mejor
// modelarla con clase y objetos que con variables sueltas
// (programacion estructurada/procedural).


public class Empleado {

        String nombre;
        String cargo;
        double salario;

        void mostrarInfo() {

            System.out.println( "Nombre: " + nombre );
            System.out.println( "Cargo: " + cargo );
            System.out.println( "Salario: $" + salario );

        }
}

// Parrafo explicativo:
// Es mejor usar una clase porque permite agrupar los datos de cada empleado
// y sus métodos en un solo objeto. Así es más fácil trabajar con varios
// empleados y evitar tener muchas variables separadas.