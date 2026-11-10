
package esfot;

import persona.Persona;

public class Estudiante extends Persona {

    private double promedio;
    private double porcentajeBeca;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, float estatura,
                      double promedio, double porcentajeBeca) {

        super(nombre, edad, estatura);

        this.promedio = promedio;
        this.porcentajeBeca = porcentajeBeca;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double valor) {
        if (valor >= 0 && valor <= 20) {
            this.promedio = valor;
        } else {
            System.out.println("Valor incorrecto");
        }
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        } else {
            System.out.println("Porcentaje incorrecto");
        }
    }

    public void imprimirPromedio() {
        System.out.println("Promedio: " + promedio);
    }

    public void imprimirPorcentajeBeca() {
        System.out.println("Porcentaje de beca: " + porcentajeBeca + "%");
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        imprimirPromedio();
        imprimirPorcentajeBeca();
    }
}

