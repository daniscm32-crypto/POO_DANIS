
package esfot;

import persona.Persona;

public class Main {

    public static void main(String[] args) {

        // OBJETO PERSONA
        Persona persona = new Persona(
                "David", 25, 1.75f
        );

        System.out.println("----- PERSONA -----");
        persona.imprimirDatos();


        // OBJETO ESTUDIANTE
        Estudiante estudiante = new Estudiante(
                "Carlos", 20, 1.70f, 18.5, 50
        );

        System.out.println("\n----- ESTUDIANTE -----");
        estudiante.imprimirDatos();


        // OBJETO PASANTE
        Pasante pasante = new Pasante(
                "Daniel", 22, 1.80f,
                19.0, 75, "ESFOT"
        );

        System.out.println("\n----- PASANTE -----");
        pasante.imprimirDatos();


        // PROBAR SETTERS
        System.out.println("\n----- MODIFICAR DATOS -----");

        estudiante.setPromedio(19.5);
        estudiante.setPorcentajeBeca(80);

        estudiante.imprimirPromedio();
        estudiante.imprimirPorcentajeBeca();
    }
}

