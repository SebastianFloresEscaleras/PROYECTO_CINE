/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Controlador;
import fis.poo.proyecto_cine.Modelo.Administrador;
import fis.poo.proyecto_cine.Modelo.Cliente;
import fis.poo.proyecto_cine.Modelo.Persona;

/**
 *
 * @author sebas
 */
public class Controlador {
    
    private Persona persona1;
    
    public void crearUsuario(String tipoUsuario){
        if(tipoUsuario.equals("Cliente")){
            persona1 = new Cliente(tipoUsuario, tipoUsuario, 0);
    }else if(tipoUsuario.equals("Administrador")){
            persona1 = new Administrador(tipoUsuario, tipoUsuario, 0);
        }}
    
    
}
