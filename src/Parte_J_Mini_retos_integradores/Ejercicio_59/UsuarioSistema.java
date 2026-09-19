package Parte_J_Mini_retos_integradores.Ejercicio_59;


// Ejercicio 59: Crea una clase UsuarioSistema con nombreUsuario,
// clave y activo. Agrega métodos para activar y desactivar.


public class UsuarioSistema {

    String nombreUsuario;
    String clave;
    boolean activo;

    void activar() {

        activo = true;

    }

    void desactivar() {

        activo = false;

    }
}