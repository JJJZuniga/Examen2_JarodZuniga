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
public class Pantalla extends Parte{
    private String Táctil,Tipo;

    public Pantalla() {
    }

    public Pantalla(String Táctil, String Tipo, String parte, int tiempo) {
        super(parte, tiempo);
        this.Táctil = Táctil;
        this.Tipo = Tipo;
    }

    public Pantalla(String Táctil, String Tipo) {
        this.Táctil = Táctil;
        this.Tipo = Tipo;
    }

    public String getTáctil() {
        return Táctil;
    }

    public void setTáctil(String Táctil) {
        this.Táctil = Táctil;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "T\u00e1ctil=" + Táctil + ", Tipo=" + Tipo + '}';
    }
    
}
