package co.edu.uniquindio.poo;

public interface VehiculoBuilder {
    public abstract void setMarca(Marca marca);
    
    public abstract void setPrecioDia(float precioDia);
    
    public abstract void setKilometraje(int kilometraje);
    
    public abstract void setPlaca(String placa);
    
    public abstract void setTipo(TipoVehiculo tipoVehiculo);
    
    public abstract void setReferencia(String referencia);
    
    public abstract void setModelo(int modelo);
    
    public abstract void setFoto(String foto);
    
    public abstract Vehiculo build();
}
