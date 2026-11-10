package geometria;

import Figura_geometrica.Figura_geometrica;

public class circulo  extends Figura_geometrica {


    private double radio;

    public circulo(String color, double radio){

        super(color);
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio<0) System.out.println("Radio incorrecto ");
        else this.radio = radio;
    }

    @Override
    public double Calcular_area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double Calcular_perimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\n--- DATOS DEL CIRCULO ---");
        super.imprimirDatos();
        System.out.println("Radio: " + radio);
    }


}
