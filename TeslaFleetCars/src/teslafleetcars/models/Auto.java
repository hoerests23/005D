
package teslafleetcars.models;

import java.util.Scanner;

public class Auto extends Vehiculo {
    
    public int cantidadPasajerosMax;
    public boolean disponeAutopilot;

    public Auto() {
    }

    public Auto(int cantidadPasajerosMax, boolean disponeAutopilot) {
        this.cantidadPasajerosMax = cantidadPasajerosMax;
        this.disponeAutopilot = disponeAutopilot;
    }

    public Auto(int cantidadPasajerosMax, boolean disponeAutopilot, String codigoVehiculo, boolean requiereMantenimiento) {
        super(codigoVehiculo, requiereMantenimiento);
        this.cantidadPasajerosMax = cantidadPasajerosMax;
        this.disponeAutopilot = disponeAutopilot;
    }

    public int getCantidadPasajerosMax() {
        return cantidadPasajerosMax;
    }

    public void setCantidadPasajerosMax(int cantidadPasajerosMax) {
        this.cantidadPasajerosMax = cantidadPasajerosMax;
    }

    public boolean isDisponeAutopilot() {
        return disponeAutopilot;
    }

    public void setDisponeAutopilot(boolean disponeAutopilot) {
        this.disponeAutopilot = disponeAutopilot;
    }

    @Override
    public String toString() {
        return "Codigo del vehiculo: " + codigoVehiculo +  ", Requiere mantenimiento: " + requiereMantenimiento + ", Cantidad de pasajeros max: " + cantidadPasajerosMax + ", Dispone de autopilot: " + disponeAutopilot;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cantidad de pasajeros que puede llevar: " + this.cantidadPasajerosMax);
        System.out.println("Dispone de modo Autopilot: " + this.disponeAutopilot);
    }

    Scanner teclado = new Scanner(System.in);
    @Override
    public double calcularCostoFinal() {
        
        System.out.println("Ingresa uso en horas para ver costos de Auto: ");
        int usoHoras=teclado.nextInt();
        
        double costo = usoHoras*VALOR_HORA_ALQUILER;
        if(disponeAutopilot==true){
            costo *=1.10;
        }
        return costo;
    }
    
    
    
    @Override
    public void agregarVehiculoEspecifico(String codigoN) {
        
        this.codigoVehiculo = codigoN;
        System.out.println("Ingresa si el vehiculo requiere mantenimiento (True o False): ");
        
        this.requiereMantenimiento=teclado.nextBoolean();
        
        System.out.println("Ingresa la cantidad de pasajeros maximos: ");
        this.cantidadPasajerosMax = teclado.nextInt();
        
        System.out.println("Ingresa si el vehiculo disponde de autopilot (True o False): ");
        this.disponeAutopilot=teclado.nextBoolean();
    }
    

    
    
}
