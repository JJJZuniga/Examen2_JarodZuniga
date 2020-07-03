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
public class RAM  extends Parte{
    private String marca;
    private int  Tamaño;

    public RAM() {
    }

    public RAM(String marca, int Tamaño, String parte, int tiempo) {
        super(parte, tiempo);
        this.marca = marca;
        this.Tamaño = Tamaño;
    }

    public RAM(String marca, int Tamaño) {
        this.marca = marca;
        this.Tamaño = Tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return "RAM{" + "marca=" + marca + ", Tama\u00f1o=" + Tamaño + '}';
    }
    

}
