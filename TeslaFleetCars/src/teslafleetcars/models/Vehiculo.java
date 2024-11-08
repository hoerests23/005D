
package teslafleetcars.models;

public abstract class Vehiculo implements ICalcularCosto{
    
    public String codigoVehiculo;
    public boolean requiereMantenimiento;

    public Vehiculo() {
    }

    public Vehiculo(String codigoVehiculo, boolean requiereMantenimiento) {
        this.codigoVehiculo = codigoVehiculo;
        this.requiereMantenimiento = requiereMantenimiento;
    }

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public boolean isRequiereMantenimiento() {
        return requiereMantenimiento;
    }

    public void setRequiereMantenimiento(boolean requiereMantenimiento) {
        this.requiereMantenimiento = requiereMantenimiento;
    }

    
    
    @Override
    public abstract String toString();

    
    
    
    
    
    public abstract void mostrarDatos();
    
    public abstract void agregarVehiculoEspecifico(String codigoN);
    
}
