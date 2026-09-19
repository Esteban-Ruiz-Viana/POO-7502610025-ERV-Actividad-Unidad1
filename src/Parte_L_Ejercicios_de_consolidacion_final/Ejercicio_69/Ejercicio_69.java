package Parte_L_Ejercicios_de_consolidacion_final.Ejercicio_69;

//Ejercicio 69: Para cada una de las clases anteriores,
// crea al menos cinco objetos diferentes.

public class Ejercicio_69 {

    public static void main(String[] args) {

        // 5 objetos de PerfilAcademico

        // 1 Perfil Academico

        PerfilAcademico p1 = new PerfilAcademico();
        p1.universidad = "Universidad de Cartagena";
        p1.programa = "Ingeniería de Software";
        p1.semestre = 2;

        // 2 Perfil Academico

        PerfilAcademico p2 = new PerfilAcademico();
        p2.universidad = "Universidad de Cartagena";
        p2.programa = "Ingeniería Civil";
        p2.semestre = 5;

        // 3 Perfil Academico

        PerfilAcademico p3 = new PerfilAcademico();
        p3.universidad = "Universidad Tecnológica de Bolívar";
        p3.programa = "Ingeniería de Sistemas";
        p3.semestre = 3;

        // 4 Perfil Academico

        PerfilAcademico p4 = new PerfilAcademico();
        p4.universidad = "Universidad de Cartagena";
        p4.programa = "Medicina";
        p4.semestre = 8;

        // 5 Perfil Academico

        PerfilAcademico p5 = new PerfilAcademico();
        p5.universidad = "Universidad del Norte";
        p5.programa = "Ingeniería Industrial";
        p5.semestre = 1;

        //Imprimir en Pantalla cada uno de los Perfiles

        System.out.println("\n=== PERFILES ACADEMICOS ===");

        p1.mostrarInfo();
        System.out.println();

        p2.mostrarInfo();
        System.out.println();

        p3.mostrarInfo();
        System.out.println();

        p4.mostrarInfo();
        System.out.println();

        p5.mostrarInfo();


        // 5 objetos de BloqueRutina

        // Rutina 1

        BloqueRutina b1 = new BloqueRutina();
        b1.dia = "Lunes";
        b1.horaInicio = "6:20";
        b1.horaFin = "6:40";
        b1.actividad = "Meditación";

        // Rutina 2

        BloqueRutina b2 = new BloqueRutina();
        b2.dia = "Lunes";
        b2.horaInicio = "8:00";
        b2.horaFin = "9:00";
        b2.actividad = "Lectura";

        // Rutina 3

        BloqueRutina b3 = new BloqueRutina();
        b3.dia = "Lunes";
        b3.horaInicio = "9:10";
        b3.horaFin = "12:00";
        b3.actividad = "Trabajos Universidad";

        // Rutina 4

        BloqueRutina b4 = new BloqueRutina();
        b4.dia = "Lunes";
        b4.horaInicio = "2:30";
        b4.horaFin = "4:00";
        b4.actividad = "Gimnasio";

        // Rutina 5

        BloqueRutina b5 = new BloqueRutina();
        b5.dia = "Lunes";
        b5.horaInicio = "6:30";
        b5.horaFin = "7:00";
        b5.actividad = "Cena";

        //Imprimir en pantalla Bloque rutina

        System.out.println("\n=== BLOQUES DE RUTINA ===");

        b1.mostrarBloque();
        System.out.println();

        b2.mostrarBloque();
        System.out.println();

        b3.mostrarBloque();
        System.out.println();

        b4.mostrarBloque();
        System.out.println();

        b5.mostrarBloque();


        // 5 objetos de ClienteSpotify

        //Cliente 1

        ClienteSpotify c1 = new ClienteSpotify();
        c1.nombreCliente = "Cliente 1";
        c1.fechaVencimiento = "2026-10-05";
        c1.valorMensual = 8000;
        c1.registrarPago();

        //Cliente 2

        ClienteSpotify c2 = new ClienteSpotify();
        c2.nombreCliente = "Cliente 2";
        c2.fechaVencimiento = "2026-10-05";
        c2.valorMensual = 8000;

        //Cliente 3

        ClienteSpotify c3 = new ClienteSpotify();
        c3.nombreCliente = "Cliente 3";
        c3.fechaVencimiento = "2026-11-12";
        c3.valorMensual = 8000;
        c3.registrarPago();

        //Cliente 4

        ClienteSpotify c4 = new ClienteSpotify();
        c4.nombreCliente = "Cliente 4";
        c4.fechaVencimiento = "2026-11-12";
        c4.valorMensual = 8000;

        //Cliente 5

        ClienteSpotify c5 = new ClienteSpotify();
        c5.nombreCliente = "Cliente 5";
        c5.fechaVencimiento = "2026-09-30";
        c5.valorMensual = 8000;
        c5.registrarPago();

        //Imprimir en pantalla informacion clientes

        System.out.println("\n=== CLIENTES DE SPOTIFY ===");

        c1.mostrarInfo();
        System.out.println();

        c2.mostrarInfo();
        System.out.println();

        c3.mostrarInfo();
        System.out.println();

        c4.mostrarInfo();
        System.out.println();

        c5.mostrarInfo();
    }
}