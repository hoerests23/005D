
package teslafleetcars;

import java.util.Scanner;
import teslafleetcars.models.*;

public class TeslaFleetCars {


    public static void main(String[] args) {
        
        int opc=0;
        int opcC=0;
        Scanner teclado = new Scanner (System.in);
        AdministrarVehiculo aux = new AdministrarVehiculo();
        
        Auto autoP= new Auto();
        Moto motoP= new Moto();
        BicicletaElectrica biciP= new BicicletaElectrica();
        
        //AÑADIR CONTADOR PARA CADA AGREGAR VEHICULO PARA ESTABLECER EL MAXIMO DE VEHICULOS CREADOS
        
        
        do { 
            System.out.println("- - - MENU TESLA FLEETS - - -");
            System.out.println("");
            System.out.println("[1] Agregar Auto. ");
            System.out.println("[2] Agregar Moto. ");
            System.out.println("[3] Agregar Bicicleta Electrica. ");
            System.out.println("[4] Listar vehiculos agregados. ");
            System.out.println("[5] Mostrar cantidad de vehiculos. ");
            System.out.println("[6] Calcular costo total de cada vehiculo. ");
            System.out.println("[9] SALIR. ");

            opc = teclado.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Auto");
                    System.out.println("");
                    Auto autoNuevo = new Auto();

                    String codigoV=aux.validadCodigoVehiculo();
                    
                    autoNuevo.agregarVehiculoEspecifico(codigoV);
                    
                    aux.agregarVehiculo(autoNuevo);
                    aux.listarVehiculosDisponibles();
                    break;
                    
                case 2:
                    System.out.println("Moto");
                    System.out.println("");
                    Moto motoNueva = new Moto();

                    codigoV=aux.validadCodigoVehiculo();
                    
                    motoNueva.agregarVehiculoEspecifico(codigoV);
                    
                    aux.agregarVehiculo(motoNueva);
                    aux.listarVehiculosDisponibles();
                    break;
                    
                case 3:
                    System.out.println("Bicicleta Electrica");
                    System.out.println("");
                    BicicletaElectrica biciNueva = new BicicletaElectrica();

                    codigoV=aux.validadCodigoVehiculo();
                    
                    biciNueva.agregarVehiculoEspecifico(codigoV);
                    
                    aux.agregarVehiculo(biciNueva);
                    aux.listarVehiculosDisponibles();
                    break;
                    
                case 4:
                    aux.listarVehiculosDisponibles();
                    break;
                    
                case 5:
                    aux.cantidadTotalVehiculos();
                    break;
                    
                case 6:
                    System.out.println("Elige vehiculo para calcular su costo total: ");
                    System.out.println("[1] Auto");
                    System.out.println("[2] Moto");
                    System.out.println("[3] Bicicleta electroncia");
                    System.out.println("");
                    opcC=teclado.nextInt();
                    switch(opc){
                    
                        case 1:
                            autoP.calcularCostoFinal();
                            break; 
                            
                        case 2:
                            autoP.calcularCostoFinal();
                            break; 
                            
                        case 3:
                            autoP.calcularCostoFinal();
                            break;
                            
                        default:
                            System.out.println("Opcion invalida.");
                    }

                default:
                    System.out.println("Opcion invalida. ");
                    
            }
        }while(opc!=9);
    
    
    
    }      
}

    

