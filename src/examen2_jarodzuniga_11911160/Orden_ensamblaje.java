/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jarodzuniga_11911160;

import java.util.ArrayList;

/**
 *
 * @author Jhon Zuniga
 */
public class Orden_ensamblaje {
    private ArrayList tech;
    private ArrayList comp;

    public Orden_ensamblaje() {
    }

    public Orden_ensamblaje(ArrayList tech, ArrayList comp) {
        this.tech = tech;
        this.comp = comp;
    }

    public ArrayList getTech() {
        return tech;
    }

    public void setTech(ArrayList tech) {
        this.tech = tech;
    }

    public ArrayList getComp() {
        return comp;
    }

    public void setComp(ArrayList comp) {
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Orden_ensamblaje{" + "tech=" + tech + ", comp=" + comp + '}';
    }
    
    
    
}
