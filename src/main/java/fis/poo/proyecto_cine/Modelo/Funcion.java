/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Modelo;

/**
 *
 * @author sebas
 */
public class Funcion {
    
    String idFuncion;
    String horario;
    //este estaDisponible nos avisa si aun hay cupos de la funcion
    boolean estaDisponible;
    Pelicula pelicula1;
    Sala sala1;
    
    
    public Funcion(String idFuncion, String horario, boolean estaDisponible, Pelicula pelicula1, Sala sala1){
        this.idFuncion = idFuncion;
        this.estaDisponible = estaDisponible;
        this.horario = horario;
        this.pelicula1 = pelicula1;
        this.sala1 = sala1;
        
    
    }
    
    
    
}
