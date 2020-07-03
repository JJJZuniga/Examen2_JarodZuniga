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
public class Tecnico {
    private String Nombre, Edad, Genero;
    private int exitos;

    public Tecnico() {
    }

    public Tecnico(String Nombre, String Edad, String Genero, int exitos) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.exitos = exitos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getExitos() {
        return exitos;
    }

    public void setExitos(int exitos) {
        this.exitos = exitos;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Edad=" + Edad + ", Genero=" + Genero + ", exitos=" + exitos ;
    }
    
}
