
package teslafleetcars.models;

import java.util.Scanner;


public class Moto extends Vehiculo {
    
    public double capacidadBateria;
    public int disponeAsistenciaModoEco;

    public Moto() {
    }

    public Moto(double capacidadBateria, int disponeAsistenciaModoEco) {
        this.capacidadBateria = capacidadBateria;
        this.disponeAsistenciaModoEco = disponeAsistenciaModoEco;
    }

    public Moto(double capacidadBateria, int disponeAsistenciaModoEco, String codigoVehiculo, boolean requiereMantenimiento) {
        super(codigoVehiculo, requiereMantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.disponeAsistenciaModoEco = disponeAsistenciaModoEco;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getDisponeAsistenciaModoEco() {
        return disponeAsistenciaModoEco;
    }

    public void setDisponeAsistenciaModoEco(int disponeAsistenciaModoEco) {
        this.disponeAsistenciaModoEco = disponeAsistenciaModoEco;
    }

    @Override
    public String toString() {
        return "Codigo del vehiculo: " + codigoVehiculo +  ", Requiere mantenimiento: " + requiereMantenimiento + ", Capacidad de bateria: " + capacidadBateria + ", Uso de asistencia modo Eco en horas: " + disponeAsistenciaModoEco;
    }

    
    
    @Override
    public void mostrarDatos() {
        System.out.println("Capacidad de bateria: " + this.capacidadBateria);
        System.out.println("Tiempo en horas de uso modo Eco: " + this.disponeAsistenciaModoEco);
    }

    Scanner teclado = new Scanner(System.in);
    @Override
    public double calcularCostoFinal() {
        System.out.println("Ingresa uso en horas para ver costos de Auto: ");
        int usoHoras=teclado.nextInt();
        
        double costo = usoHoras*VALOR_HORA_ALQUILER;
        if(disponeAsistenciaModoEco>=(usoHoras/2)){
            costo *=1.08;
        }
        return costo;
    }
    

    @Override
    public void agregarVehiculoEspecifico(String codigoN) {
        this.codigoVehiculo = codigoN;
        System.out.println("Ingresa si el vehiculo requiere mantenimiento (True o False): ");
        
        this.requiereMantenimiento=teclado.nextBoolean();
        
        System.out.println("Ingresa la capacidad de la bateria: ");
        this.capacidadBateria = teclado.nextInt();
        
        System.out.println("Ingresa el uso en horas de la asistencia en modo Eco (0 si no fue usada): ");
        this.disponeAsistenciaModoEco=teclado.nextInt();
    }
    
    
}
    
    
    
    

