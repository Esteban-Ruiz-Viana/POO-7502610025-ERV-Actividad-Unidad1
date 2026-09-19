package Parte_L_Ejercicios_de_consolidacion_final.Ejercicio_66;

// Ejercicio 66: clase libre relacionada con mi contexto academico.
// Basada en mi propio perfil: Universidad de Cartagena,
// Ingenieria de Software, 2do semestre.

    public class PerfilAcademico {

        String universidad;
        String programa;
        int semestre;

        void avanzarSemestre() {

            semestre = semestre + 1;

        }

        void mostrarInfo() {

            System.out.println("Universidad: " + universidad);
            System.out.println("Programa: " + programa);
            System.out.println("Semestre: " + semestre);

    }
}
