
package esfot;

public class Pasante extends Estudiante {

    private String empresa;

    public Pasante() {
    }

    public Pasante(String nombre, int edad, float estatura,
                   double promedio, double porcentajeBeca,
                   String empresa) {

        super(nombre, edad, estatura, promedio, porcentajeBeca);

        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void imprimirEmpresa() {
        System.out.println("Empresa: " + empresa);
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        imprimirEmpresa();
    }
}
