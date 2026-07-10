/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Modelo;

/**
 *
 * @author sebas
 */
public class Pelicula {
    
    private String nombre;
    private int minutos;
    
    public Pelicula(String nombre, int minutos){
        this.nombre = nombre;
        this.minutos = minutos;
    }
    
    //mi aporte (daya)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
}
