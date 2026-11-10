package geometria;

import Figura_geometrica.Figura_geometrica;

public class Triangulo extends Figura_geometrica{

    private double base;
    private double altura;
    private double lado1;
    private double lado2;


    public Triangulo(String color, double base, double altura, double lado1, double lado2 ){

        super(color);
        this.base=base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0)
            System.out.println("Base incorrecta");
        else
            this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0)
            System.out.println("Altura incorrecta");
        else
            this.altura = altura;
    }

    @Override
    public double Calcular_area() {
        return (base * altura) / 2;
    }

    @Override
    public double Calcular_perimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\n--- DATOS DEL TRIANGULO ---");
        super.imprimirDatos();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
    }
}
