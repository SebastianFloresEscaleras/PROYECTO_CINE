/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Modelo;

/**
 *
 * @author sebas
 */
public abstract class Persona {
    
    private String nombre;
    private String id;
    int tipoCliente;
    
    
    public Persona(String nombre, String id, int tipoCliente){
        this.nombre = nombre;
        this.id = id;
        this.tipoCliente = tipoCliente;
        
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setid(String id){
        this.id = id;
    }
    
    public void settipoCliente(int tipoCliente){
        this.tipoCliente = tipoCliente;
    }
    
    
    
    
}
