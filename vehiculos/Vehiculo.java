package vehiculos;

public class Vehiculo {

    private String placa;
    private String propietario;
    private double horasEstacionado;


    public Vehiculo(String placa, String propietario, double horasEstacionado) {
        this.placa = placa;
        this.propietario=propietario;
        setHorasEstacionado(horasEstacionado);
    }

    public String getPlaca() {
        return placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public double getHorasEstacionado() {
        return horasEstacionado;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setHorasEstacionado(double horasEstacionado) {
        this.horasEstacionado = horasEstacionado;
    }

    public int horasFacturables(){
        return (int) Math.ceil(horasEstacionado);
    }

    public double calcularTarifa(){
      return horasFacturables() * 1.50;
    }

    public void mostrarInformacion(){
    System.out.println("Placa: "+ placa+
            " | Propietario: "+ propietario+
            " | Horas estacionado: "+ horasEstacionado);
    }
}
