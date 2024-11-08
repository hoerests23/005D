
package teslafleetcars.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministrarVehiculo {
    
    List<Vehiculo> listaVehiculos = new ArrayList<>();
    Scanner teclado = new Scanner (System.in);
        
    public String validadCodigoVehiculo(){
        String nuevoCodigo;
            System.out.println("Ingrese un codigo al vehiculo: ");
            nuevoCodigo=teclado.next();
            for (Vehiculo vehiculos : listaVehiculos){
                if(vehiculos.getCodigoVehiculo().equals(nuevoCodigo)){
                    System.out.println("Codigo existente.");
            }
             
            }  
        return nuevoCodigo;
    } 
    
    public void listarVehiculosDisponibles(){
        for(Vehiculo vehiculos : listaVehiculos){
            System.out.println(vehiculos);
        }
    }
    
    public int cantidadTotalVehiculos(){
        return listaVehiculos.size();
    }
    
    //agregar vehiculos
    
    public void agregarVehiculo(Vehiculo parVehiculo){
        listaVehiculos.add(parVehiculo);
    }
        
    

}

/**metodoAdministrar
    public void agregarMetVehiculo(){
        boolean bucle=false;
        
        for(Vehiculo vehiculos : listaVehiculos){
            
            do {
                System.out.println("Ingresa Codigo del vehiculo: ");
                String ingresarId= teclado.next();
                if (validadCodigoVehiculo(ingresarId)){
                    vehiculos.setCodigoVehiculo(ingresarId);
                    System.out.println("Codigo ingresado. ");
                    bucle=true;
                }
                else{
                    System.out.println("Codigo ingresado del Vehiculo ya existe.");
                }
            }while(bucle==false);
            System.out.println("");
            
    
        }
        return ;
    } 
    */