package Parte_L_Ejercicios_de_consolidacion_final.Ejercicio_69;

    public class PerfilAcademico {

        public String universidad;
        public String programa;
        public int semestre;

        public void avanzarSemestre() {

            semestre = semestre + 1;

        }

        public void mostrarInfo() {

            System.out.println("Universidad: " + universidad);
            System.out.println("Programa: " + programa);
            System.out.println("Semestre: " + semestre);

    }
}
