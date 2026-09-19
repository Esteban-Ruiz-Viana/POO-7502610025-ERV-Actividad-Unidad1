package Parte_I_EJercicios_de_lectura_y_correcion.Ejercicio_45;

// Ejercicio 45 :Corrige una clase donde el programador haya puesto el método fuera de la clase.

public class Vehiculo {

        // 1. Ejemplo Incorrecto (el metodo quedaba fuera de la clase):

//         public class Vehiculo {

//             String marca;

//         }

//         void mostrarMarca() {          // <- fuera de la clase

//             System.out.println(marca);

//         }


        // 2. Explicacion del error

        // Mensaje del compilador: "class, interface, enum, or record expected"
        // Sucede debido a que en Java todo metodo debe ir dentro de una clase.
        //  Al cerrar la clase con "}", el compilador solo espera otra clase, no un metodo suelto.

        // 3. Codigo Correcto

        String marca;

        void mostrarMarca() {

            System.out.println(marca);

        }

        public static void main(String[] args) {

            Vehiculo v1 = new Vehiculo();
            v1.marca = "Mazda";
            v1.mostrarMarca();

        }
}