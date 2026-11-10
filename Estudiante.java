
package esfot;

public class Estudiante extends Persona {

    // Atributo propio de Estudiante
    private double promedio;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con los atributos de Persona y el promedio
    public Estudiante(String nombre, int edad, float estatura, double promedio) {
        super(nombre, edad, estatura);
        this.promedio = promedio;
    }

    // Getter
    public double getPromedio() {
        return promedio;
    }

    // Setter
    public void setPromedio(double valor) {
        if (valor >= 0 && valor <= 20) {
            this.promedio = valor;
        } else {
            System.out.println("Valor incorrecto");
        }
    }

    // Método propio de Estudiante
    public void imprimirPromedio() {
        System.out.println("Promedio: " + promedio);
    }

}
