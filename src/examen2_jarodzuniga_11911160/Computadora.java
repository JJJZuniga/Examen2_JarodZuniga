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
public class Computadora {

    private String numero_de_nerie, año, color, material, ram, disco_duro,
            bateria, teclado, pantalla, Procesador;

    public Computadora() {
    }

    public Computadora(String numero_de_nerie, String año, String color, String material, String ram, String disco_duro, String bateria, String teclado, String pantalla, String Procesador) {
        this.numero_de_nerie = numero_de_nerie;
        this.año = año;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disco_duro = disco_duro;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.Procesador = Procesador;
    }

    public String getNumero_de_nerie() {
        return numero_de_nerie;
    }

    public void setNumero_de_nerie(String numero_de_nerie) {
        this.numero_de_nerie = numero_de_nerie;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(String disco_duro) {
        this.disco_duro = disco_duro;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    @Override
    public String toString() {
        return  "numero_de_nerie=" + numero_de_nerie + ", a\u00f1o=" + año + ", color=" + color + ", material=" + material + ", ram=" + ram + ", disco_duro=" + disco_duro + ", bateria=" + bateria + ", teclado=" + teclado + ", pantalla=" + pantalla + ", Procesador=" + Procesador;
    }
    
    
    
}
