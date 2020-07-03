/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jarodzuniga_11911160;

/**
 *
 * @author Jhon Zuniga
 */
public class Procesador extends Parte{
    private int nucleos;
    private String Velocidad;

    public Procesador() {
    }

    public Procesador(int nucleos, String Velocidad, String parte, int tiempo) {
        super(parte, tiempo);
        this.nucleos = nucleos;
        this.Velocidad = Velocidad;
    }

    public Procesador(int nucleos, String Velocidad) {
        this.nucleos = nucleos;
        this.Velocidad = Velocidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(String Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    
}
