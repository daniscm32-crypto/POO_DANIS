package esfot;

import java.util.*;

public class Main {

    // DEBER: ingresar personas hasta que el usuario presione 0
    public static void ingresarPersonas(List<Persona> lista) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n1. Ingresar persona");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextLine().trim();

            if (opcion.equals("1")) {
                try {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = Integer.parseInt(sc.nextLine().trim());

                    System.out.print("Estatura (ej. 1.70): ");
                    // replace por si escriben coma en vez de punto
                    float estatura = Float.parseFloat(sc.nextLine().trim().replace(",", "."));

                    lista.add(new Persona(nombre, edad, estatura));
                    System.out.println("Persona agregada.");
                } catch (NumberFormatException e) {
                    System.out.println("Dato numérico inválido. La persona no fue agregada.");
                }
            } else if (!opcion.equals("0")) {
                System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("0"));
    }

    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Sebastian Tobar", 21, 1.73f);

        // ---------- LIST ----------
        System.out.println("List");

        List<Persona> lista = new ArrayList<>();
        lista.add(persona);
        lista.add(persona1);
        lista.add(persona2);

        lista.add(new Persona("Piedra", 45, 1.50f));
        lista.add(new Persona("Vero", 38, 1.40f));
        lista.add(new Persona("Rasta", 34, 1.50f));
        lista.add(new Persona("Juancho", 18, 1.70f));
        lista.add(new Persona("Nicky", 78, 1.80f));
        lista.add(new Persona("Mateo", 12, 1.90f));
        lista.add(new Persona("Daya", 6, 1.0f));
        lista.add(new Persona("Mia", 5, 1.0f));

        persona.setNombre("David");
        persona.setEdad(59);
        persona.setEstatura(2f);

        System.out.println("Listado de personas");
        for (Persona p : lista) {
            System.out.println(p.toString());
        }

        lista.get(0).setEdad(18);
        lista.get(0).imprimirDatos();
        lista.get(1).setEdad(18);
        lista.get(1).imprimirDatos();
        lista.get(2).setEdad(18);
        lista.get(2).imprimirDatos();
        lista.get(3).imprimirDatos();
        lista.get(4).imprimirDatos();

        // ---------- SET ----------
        System.out.println("Set");

        Set<String> nombres = new HashSet<>();
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        nombres.add("Michael"); // repetido: no se agrega
        System.out.println("Nombres únicos (sin orden garantizado): ");
        System.out.println(nombres);

        Set<Persona> nombres2 = new HashSet<>();
        nombres2.add(new Persona("Ana", 25, 1.59f));
        nombres2.add(new Persona("Pepe", 25, 1.59f));
        nombres2.add(new Persona("Vero", 25, 1.59f));
        nombres2.add(new Persona("Vero", 25, 1.59f)); // duplicado: no se agrega
        nombres2.add(new Persona("Vero", 25, 1.59f)); // duplicado: no se agrega
        System.out.println("Personas únicas:");
        for (Persona p : nombres2) {
            System.out.println(p);
        }

        // ---------- MAP ----------
        System.out.println("Map");

        Map<String, Persona> codigounico = new HashMap<>();
        codigounico.put("e01", persona);
        codigounico.put("e02", persona1);
        codigounico.put("e03", persona2);
        codigounico.put("e04", lista.get(4));

        System.out.println("Codigo unico e03: " + codigounico.get("e03").toString());
        System.out.println("Codigo unico e02: " + codigounico.get("e02").toString());

        // Se revisa antes de usar la clave para evitar NullPointerException
        if (codigounico.containsKey("e10")) {
            System.out.println("Codigo unico e10: " + codigounico.get("e10").toString());
        } else {
            System.out.println("Codigo unico e10: no existe");
        }
        System.out.println("Contiene e10: " + codigounico.containsKey("e10"));

        // ---------- DEBER ----------
        System.out.println("\n--- DEBER ---");
        List<Persona> listaDeber = new ArrayList<>();
        ingresarPersonas(listaDeber);

        System.out.println("\nPersonas ingresadas:");
        for (Persona p : listaDeber) {
            System.out.println(p);
        }


    }
}


