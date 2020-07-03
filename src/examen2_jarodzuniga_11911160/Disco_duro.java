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
public class Disco_duro extends Parte{
    private int Tamaño;
    private String marca;

    public Disco_duro(int Tamaño, String marca, String parte, int tiempo) {
        super(parte, tiempo);
        this.Tamaño = Tamaño;
        this.marca = marca;
    }

    public Disco_duro(int Tamaño, String marca) {
        this.Tamaño = Tamaño;
        this.marca = marca;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Disco_duro{" + "Tamaño=" + Tamaño + ", marca=" + marca + '}';
    }
    
    
}
