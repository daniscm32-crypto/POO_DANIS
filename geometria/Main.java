
package geometria;

import Figura_geometrica.Figura_geometrica;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

            System.out.println(" AREAS Y PERIMETROS DE FIGURAS");

            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.println("4. Rectangulo");
            System.out.println("0. Salir");

            System.out.print("Seleccione una figura: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            Figura_geometrica figura = null;

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el color: ");
                    String colorC = teclado.nextLine();

                    System.out.print("Ingrese el radio: ");
                    double radio = teclado.nextDouble();

                    if (radio <= 0) {
                        System.out.println("El radio debe ser mayor que cero.");
                        break;
                    }

                    figura = new circulo(colorC, radio);

                    break;

                case 2:

                   System.out.print("Ingrese el color: ");
                    String colorCu = teclado.nextLine();

                    System.out.print("Ingrese el lado: ");
                    double lado = teclado.nextDouble();

                    if (lado <= 0) {
                        System.out.println("El lado debe ser mayor que cero.");
                        break;
                    }

                    figura = new Cuadrado(colorCu, lado);

                    break;

                case 3:

                    System.out.print("Ingrese el color: ");
                    String colorT = teclado.nextLine();

                    System.out.print("Ingrese la base: ");
                    double baseT = teclado.nextDouble();

                    System.out.print("Ingrese la altura: ");
                    double alturaT = teclado.nextDouble();

                    System.out.print("Ingrese el lado 1: ");
                    double lado1 = teclado.nextDouble();

                    System.out.print("Ingrese el lado 2: ");
                    double lado2 = teclado.nextDouble();

                    if (baseT <= 0 || alturaT <= 0 ||
                            lado1 <= 0 || lado2 <= 0 ||
                            lado1 + lado2 <= baseT ||
                            lado1 + baseT <= lado2 ||
                            lado2 + baseT <= lado1) {

                        System.out.println("Los datos del triangulo son incorrectos.");
                        break;
                    }

                    figura = new Triangulo(
                            colorT, baseT, alturaT, lado1, lado2
                    );

                    break;

                case 4:

                    System.out.print("Ingrese el color: ");
                    String colorR = teclado.nextLine();

                    System.out.print("Ingrese la base: ");
                    double baseR = teclado.nextDouble();

                    System.out.print("Ingrese la altura: ");
                    double alturaR = teclado.nextDouble();

                    if (baseR <= 0 || alturaR <= 0) {
                        System.out.println("Las medidas deben ser mayores que cero.");
                        break;
                    }

                    figura = new Rectangulo(colorR, baseR, alturaR);

                    break;

                case 0:

                    System.out.println("\nSaliendo del programa...");
                    break;

                default:

                    System.out.println("Opcion incorrecta.");
                    break;
            }

            if (figura != null) {
                System.out.println(" RESULTADOS DE LA FIGURA");
                figura.imprimirDatos();
            }

        } while (opcion != 0);
    }
}
