/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioSumatorias;

import java.util.ArrayList;

/**
 *
 * @author luzsd
 */
public class Concesionaria {
    private String nombre;
    private ArrayList<Auto> autos;
    
    public Concesionaria(String nombre){
        this.nombre=nombre;
        this.autos=new ArrayList<>();
    }
    public void agregarAuto(Auto a){
        this.autos.add(a);
    }
    
    public int sumatoriaKmsRecorridos(){
        int acumulador=0;
        for(Auto a: autos){
            acumulador=acumulador+a.getKmsRecorridos();
        }
        return acumulador;
    }
    
    public int cantAutos(){
        return autos.size();
    }
    
    public double promedioKmsRecorridos(){
        double promedio=0;
        if(cantAutos()>0){
            promedio= (double)sumatoriaKmsRecorridos()/cantAutos();        
        }
        return promedio;
    }
}
