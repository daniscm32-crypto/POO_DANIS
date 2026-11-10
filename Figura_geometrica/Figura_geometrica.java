package Figura_geometrica;

import java.util.Objects;

public class Figura_geometrica{

    private String color;

    public String getColor(String color) {
        return color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figura_geometrica(String color) {
        this.color = color;
    }

    public double Calcular_area() {
        return 0;
    }

    public double Calcular_perimetro() {
        return 0;
    }

    public void imprimirDatos() {
        System.out.println("Color de la figura: " + getColor());
        System.out.println("Área: " + Calcular_area());
        System.out.println("Perímetro: " + Calcular_perimetro());
    }
}