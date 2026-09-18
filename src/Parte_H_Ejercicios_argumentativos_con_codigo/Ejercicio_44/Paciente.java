package Parte_H_Ejercicios_argumentativos_con_codigo.Ejercicio_44;


//Implementa una clase Paciente y explica por qué “crear un paciente”
// e “instanciar la clase Paciente” se relacionan pero no son
// exactamente la misma idea pedagógica.

// Explicacion:
// Instanciar es crear un objeto usando new Paciente().
// Crear un paciente significa tener un objeto con sus datos, como nombre,
// identificación y diagnostico, listo para usar en el programa.


public class Paciente {

        String nombre;
        String identificacion;
        String diagnostico;

        void mostrarInfo() {

            System.out.println( "Nombre: " + nombre );
            System.out.println( "Identificación: " + identificacion );
            System.out.println( "Diagnóstico: " + diagnostico );

        }
}

