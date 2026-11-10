package geometria;

import Figura_geometrica.Figura_geometrica;

public class Cuadrado extends Figura_geometrica {

    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0)
            System.out.println("Lado incorrecto");
        else
            this.lado = lado;
    }

    @Override
    public double Calcular_area() {
        return lado * lado;
    }

    @Override
    public double Calcular_perimetro() {
        return 4 * lado;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\n--- DATOS DEL CUADRADO ---");
        super.imprimirDatos();
        System.out.println("Lado: " + lado);
        }
    }

