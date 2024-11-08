
package teslafleetcars.models;

import java.util.Scanner;

public class BicicletaElectrica extends Vehiculo{
    
    public String tipoFrenos;
    public double capacidadBateriaKilometros;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String tipoFrenos, double capacidadBateriaKilometros, String codigoVehiculo, boolean requiereMantenimiento) {
        super(codigoVehiculo, requiereMantenimiento);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriaKilometros = capacidadBateriaKilometros;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public double getCapacidadBateriaKilometros() {
        return capacidadBateriaKilometros;
    }

    public void setCapacidadBateriaKilometros(double capacidadBateriaKilometros) {
        this.capacidadBateriaKilometros = capacidadBateriaKilometros;
    }

    @Override
    public String toString() {
        return "Codigo del vehiculo: " + codigoVehiculo +  ", Requiere mantenimiento: " + requiereMantenimiento + ", Tipo de frenos: " + tipoFrenos + ", Capacidad de la bateria en kilometros: " + capacidadBateriaKilometros + '}';
    }

    
    
    @Override
    public void mostrarDatos() {
        System.out.println("Tipo de frenos: " + this.tipoFrenos);
        System.out.println("Capacidad de la bateria en kilometros: " + this.capacidadBateriaKilometros);
    }
    
    
    Scanner teclado = new Scanner(System.in);
    
    @Override
    public double calcularCostoFinal() {
        System.out.println("Ingresa uso en horas para ver costos de Auto: ");
        int usoHoras=teclado.nextInt();
        
        double costo = usoHoras*VALOR_HORA_ALQUILER;
        if(capacidadBateriaKilometros<=20){
            costo *=0.95;
        }
        return costo;

    }

    @Override
    public void agregarVehiculoEspecifico(String codigoN) {
        this.codigoVehiculo = codigoN;
        System.out.println("Ingresa si el vehiculo requiere mantenimiento (True o False): ");
        
        this.requiereMantenimiento=teclado.nextBoolean();
        
        System.out.println("Ingresa el tipo de frenos: ");
        this.tipoFrenos = teclado.next();
        
        System.out.println("Ingresa la capacidad de la bateria en kilometros: ");
        this.capacidadBateriaKilometros = teclado.nextDouble();
    }
    
    
    
    
}
