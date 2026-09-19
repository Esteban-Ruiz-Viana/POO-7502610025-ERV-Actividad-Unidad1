package Parte_J_Mini_retos_integradores.Ejercicio_51;


// Ejercicio 51: Crea una clase Rectangulo con base y altura.
// Agrega metodos para calcular el area, calcular el perimetro
// y mostrar los resultados.


public class Rectangulo {

    double base;
    double altura;

    double calcularArea() {

        return base * altura;

    }

    double calcularPerimetro() {

        return 2 * (base + altura);

    }

    void mostrarResultados() {

        System.out.println( "Base: " + base );
        System.out.println( "Altura: " + altura );
        System.out.println( "Área: " + calcularArea() );
        System.out.println( "Perímetro: " + calcularPerimetro() );

    }
}