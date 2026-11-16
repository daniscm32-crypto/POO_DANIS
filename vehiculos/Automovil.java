package vehiculos;

public class Automovil extends Vehiculo {

    private  boolean cubierto;

    public Automovil(String placa, String propietario, double horasEstacionado, boolean cubierto){
        super(placa, propietario, horasEstacionado);
        this.cubierto=cubierto;
    }

    @Override
    public double calcularTarifa(){
        double tarifa = super.calcularTarifa();
        if (cubierto){
            tarifa+=2.00;
        }

        return tarifa;
    }



}
