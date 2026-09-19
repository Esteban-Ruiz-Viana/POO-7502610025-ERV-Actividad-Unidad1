package Parte_J_Mini_retos_integradores.Ejercicio_57;

// Ejercicio 57: Crea una clase NotaAcademica con asignatura,
// nota1, nota2 y nota3. Agrega método para calcular definitiva.

public class NotaAcademica {

    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    // Calcula la nota definitiva como el promedio simple de las 3 notas

    double calcularDefinitiva() {

        return (nota1 + nota2 + nota3) / 3;

    }
}