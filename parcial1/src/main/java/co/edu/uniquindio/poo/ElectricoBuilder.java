package co.edu.uniquindio.poo;

public class ElectricoBuilder implements VehiculoBuilder{
    private Vehiculo vehiculo;

    @Override
    public void setMarca(Marca marca) {
        this.vehiculo.setMarca(marca);
    }

    @Override
    public void setPrecioDia(float precioDia) {
        this.vehiculo.setPrecioDia(precioDia);        
    }

    @Override
    public void setKilometraje(int kilometraje) {
        this.vehiculo.setKilometraje(kilometraje);
    }

    @Override
    public void setPlaca(String placa) {
        this.vehiculo.setPlaca(placa);
    }

    @Override
    public void setTipo(TipoVehiculo tipoVehiculo) {
        this.vehiculo.setTipo(tipoVehiculo);
    }

    @Override
    public void setReferencia(String referencia) {
        this.vehiculo.setReferencia(referencia);    
    }

    @Override
    public void setModelo(int modelo) {
        this.vehiculo.setModelo(modelo);
    }

    @Override
    public void setFoto(String foto) {
        this.vehiculo.setFoto(foto);
    }

    @Override
    public Vehiculo build() {
        return vehiculo;
    }
}
