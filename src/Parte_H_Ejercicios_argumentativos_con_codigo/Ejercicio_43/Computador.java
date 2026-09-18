package Parte_H_Ejercicios_argumentativos_con_codigo.Ejercicio_43;


// Ejercicio 43: Construye una clase Computador y explica cuál sería la
// diferencia entre el plano conceptual del computador y una máquina concreta
// creada a partir de ese plano.

// Explicacion:
// La clase Computador es el plano conceptual que define sus caracteristicas.
// El objeto creado con new Computador() es una maquina concreta con valores propios.


public class Computador {

    String marca;
    int ramGB;
    String procesador;


    void mostrarFichaTecnica() {

        System.out.println("Marca: " + marca);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Procesador: " + procesador);

    }
}

