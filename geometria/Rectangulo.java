package geometria;

import Figura_geometrica.Figura_geometrica;

public class Rectangulo extends Figura_geometrica {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
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
        return base * altura;
    }

    @Override
    public double Calcular_perimetro() {
        return 2 * (base + altura);
    }
}


