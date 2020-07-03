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
public class Parte {
    private String parte;
    private int tiempo;

    public Parte(String parte, int tiempo) {
        this.parte = parte;
        this.tiempo = tiempo;
    }

    public Parte() {
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "parte=" + parte + ", tiempo=" + tiempo + '}';
    }
    
    
}
