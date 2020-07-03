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
public class Bateria extends Parte{
    private int  Capacidad;
    private String material;

    public Bateria(int Capacidad, String material, String parte, int tiempo) {
        super(parte, tiempo);
        this.Capacidad = Capacidad;
        this.material = material;
    }

    public Bateria(int Capacidad, String material) {
        this.Capacidad = Capacidad;
        this.material = material;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bateria{" + "Capacidad=" + Capacidad + ", material=" + material + '}';
    }

   
    
    
}
