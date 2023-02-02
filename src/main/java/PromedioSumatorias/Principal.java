/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioSumatorias;

/**
 *
 * @author luzsd
 */
public class Principal {
    
    public static void main(String[] args){
        Concesionaria con= new Concesionaria("FakeCar");
        
        con.agregarAuto(new Auto("ABC123", "AZUL", 2000));
        con.agregarAuto(new Auto("QWE234", "VERDE", 4000));
        con.agregarAuto(new Auto("ASD456", "ROJO", 6009));
        con.agregarAuto(new Auto("ZXC890", "MARRON",5000 ));
        
        System.out.println("kilometros totales recorridos: " + con.sumatoriaKmsRecorridos());
        System.out.println("Cantidad de autos: "+con.cantAutos());
        System.out.println("Promedio de kms recorridos: "+con.promedioKmsRecorridos());
        
    }
    
}
