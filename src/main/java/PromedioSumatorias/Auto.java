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
public class Auto {
    
    private String patente;
    private String color;
    private int kmsRecorridos;

    public Auto(String patente, String color, int kmsRecorridos) {
        this.patente = patente;
        this.color = color;
        this.kmsRecorridos = kmsRecorridos;
    }

    public int getKmsRecorridos() {
        return kmsRecorridos;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", kmsRecorridos=" + kmsRecorridos + '}';
    }
    
    
}
