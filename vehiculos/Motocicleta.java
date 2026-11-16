package vehiculos;

public class Motocicleta extends Vehiculo {

    private int cilindrado;

    public Motocicleta (String placa, String propietario, double horasEstacionado, int cilindrado){
        super(placa, propietario, horasEstacionado, cilindrado );
        this.cilindrado=cilindrado;
    }

    @Override
    public double calcularTarifa(){
        return horasFacturables()*0.75;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion()+ "Cilindrado: "+ cilindrado;
    }
}
