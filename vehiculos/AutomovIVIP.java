package vehiculos;

public class AutomovIVIP extends Automovil{

    private double descuentoPorcentaje;

    public AutomovIVIP(String placa, String propietario, double horasEstacionado, boolean cubierto, double descuentoPorcentaje){
        super(placa, propietario, horasEstacionado,cubierto);

        this.descuentoPorcentaje=descuentoPorcentaje;
    }

    public AutomovIVIP(String placa, String propietario, double horasEstacionado, boolean cubierto){
        this(placa,propietario,horasEstacionado,cubierto,20.0);
    }


    public double calcularDescuento(){
     return super.calcularTarifa()*descuentoPorcentaje/100;
    }

    @Override
    public double calcularTarifa(){
        return  super.calcularTarifa()-calcularDescuento();
    }
}
