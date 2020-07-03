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
public class Teclado extends Parte{
    private String Material , Color;

    public Teclado(String Material, String Color, String parte, int tiempo) {
        super(parte, tiempo);
        this.Material = Material;
        this.Color = Color;
    }

    public Teclado(String Material, String Color) {
        this.Material = Material;
        this.Color = Color;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "Material=" + Material + ", Color=" + Color + '}';
    }
    
}
