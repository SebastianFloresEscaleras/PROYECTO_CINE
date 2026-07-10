/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Controlador;
import fis.poo.proyecto_cine.Modelo.Administrador;
import fis.poo.proyecto_cine.Modelo.Cliente;
import fis.poo.proyecto_cine.Modelo.Funcion;
import fis.poo.proyecto_cine.Modelo.Pelicula;
import fis.poo.proyecto_cine.Modelo.Persona;
import fis.poo.proyecto_cine.Modelo.Sala;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Controlador {
    
    //aqui guardo el tipo de persona y sus datos, o por lo menos el contenedor cuando ya existe el objeto solo me queda modificar sus atributos
    
    private Persona persona1;
    ArrayList<Funcion> listaFunciones = new ArrayList<>();
    
    Sala sala1 = new Sala(1, true);
    
    Pelicula peli1 = new Pelicula("Forest gump", 120);
    Pelicula peli2 = new Pelicula("Wachacalote", 120);
    Pelicula peli3 = new Pelicula("Rumaro", 120);


    
    public Controlador(){
        listaFunciones.add(new Funcion("1", "7-9", true, peli1 , sala1));
        listaFunciones.add(new Funcion("2", "9-11", true, peli2 , sala1));
        listaFunciones.add(new Funcion("3", "11-13", true, peli3 , sala1));
        
    }
    
    
        
    
    public void crearUsuario(String tipoUsuario){
        if(tipoUsuario.equals("Cliente")){
            persona1 = new Cliente(tipoUsuario, tipoUsuario, 0);
    }else if(tipoUsuario.equals("Administrador")){
            persona1 = new Administrador(tipoUsuario, tipoUsuario, 0);
        }}
    
    public boolean validarCampos(String nombre, String id, int eleccion){
        
        if(nombre == null){return false;};
        if(id == null){return false;};
        if(eleccion == 0){return false;};
        
        return true;
        
    }
    
    
    
}
