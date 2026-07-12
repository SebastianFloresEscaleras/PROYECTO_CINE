/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Controlador;
import fis.poo.proyecto_cine.Modelo.Administrador;
import fis.poo.proyecto_cine.Modelo.Asiento;
import fis.poo.proyecto_cine.Modelo.Cliente;
import fis.poo.proyecto_cine.Modelo.Funcion;
import fis.poo.proyecto_cine.Modelo.Pelicula;
import fis.poo.proyecto_cine.Modelo.Persona;
import fis.poo.proyecto_cine.Modelo.Sala;
import fis.poo.proyecto_cine.Modelo.SeleccionAsientos;
import fis.poo.proyecto_cine.Modelo.Validador;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Controlador {
    
    //aqui guardo el tipo de persona y sus datos, o por lo menos el contenedor cuando ya existe el objeto solo me queda modificar sus atributos
    
    private Persona persona1;
    private ArrayList<Funcion> listaFunciones = new ArrayList<>();
    private Funcion FuncionElegida;
    private Funcion nuevaFuncion; // Esta variable va a guardar la función que el administrador cree
    //amigos en sala tenemos la sala disponible y como esta en composicion ya se instancian los asientos tambien
    Sala sala1 = new Sala(1, true);
    private SeleccionAsientos seleccion1 = new SeleccionAsientos();
    
    Pelicula peli1 = new Pelicula("Forest gump", 120);
    Pelicula peli2 = new Pelicula("Wachacalote", 120);
    Pelicula peli3 = new Pelicula("Rumaro", 120);


    
    public Controlador(){
        this.listaFunciones.add(new Funcion("1", "7-9", true, peli1 , sala1));
        this.listaFunciones.add(new Funcion("2", "9-11", true, peli2 , sala1));
        this.listaFunciones.add(new Funcion("3", "11-13", true, peli3 , sala1));
        
    }
    
    //los que esten false significa que fueron escogidos
    public void estadoAsiento(String a){ // este nos va a servir para hacer BoletaAsiento
        for(Asiento rt: sala1.getListaAsiento()){
            if(rt.getPosicionAsiento().equals(a)){
                
                if(rt.getdisponible()==true){
                    rt.setDisponible(false);
                }else{
                rt.setDisponible(true);
                }
            }
        }
    }
    
    //necesito algo para devolver el estado de un asiento pasando la posicion
    
    
    
    
    public Funcion getFuncion(int q){
        Funcion a = listaFunciones.get(q);
        return a;
    }
    
    
        
    
    public void crearUsuario(String tipoUsuario){
        if(tipoUsuario.equals("Cliente")){
            persona1 = new Cliente(tipoUsuario, tipoUsuario, 0);
    }else if(tipoUsuario.equals("Administrador")){
            persona1 = new Administrador(tipoUsuario, tipoUsuario, 0);
        }}
    
    //pantallaUsuario validacion 1
    public boolean validarCampos(String nombre, String id, int eleccion){
        
        if(nombre == null){return false;};
        if(id == null){return false;};
        if(eleccion == 0){return false;};
        
        return true;
        
    }
    
    public void setFuncionElegida(Funcion a){
    this.FuncionElegida = a;
    }
    
    public Funcion getFuncionElegida(){
        return FuncionElegida;
    }
    Validador validadorAdmin = new Validador(new java.util.ArrayList<>(), false);
    //nuevos metodos para la pantalla de validar administrador
    public boolean validarAdministrador(String codigo) {
    Administrador administradorTemp = new Administrador("Admin", codigo, 1);
    
    return validadorAdmin.validarAdmision(administradorTemp);
    }

    public boolean tieneAcceso() {
    return validadorAdmin.isTieneAcceso();
    }
    
    //dede aqui nuevo codigo para MetodoAdministrador (daya)
    
    public void crearNuevaFuncion(String idFuncion, String nombrePelicula, int duracion, int numeroSala, String horario){
        Pelicula peliculaNueva = new Pelicula(nombrePelicula, duracion);
        Sala salaNueva = new Sala(numeroSala, true);
        
        nuevaFuncion = new Funcion(idFuncion, horario,true,peliculaNueva,salaNueva);
    }

    public Funcion getNuevaFuncion() {
        return nuevaFuncion;
    }
    
    public boolean existeNuevaFuncion(){ //veridica si ADMIN ya creo una funcion antes de reemplazar una
        return nuevaFuncion != null;
    }
    
    public void reemplazarFuncion(int posicion){ // este sirve para los botnoes MODIFICAR
        if(nuevaFuncion != null){
            listaFunciones.set(posicion, nuevaFuncion);
            nuevaFuncion = null;
        }
    }

    public ArrayList<Funcion> getListaFunciones() {
        return listaFunciones;
    }
    
    //dede aqui nuevo codigo para EleccionAsientos (daya)
    public void seleccionAsientos(String asiento){
        seleccion1.cambiarSeleccion(asiento);
    }
    public String getTextoAsientos(){
        return seleccion1.mostrarAsientos();
    }
    public boolean hayAsientosSeleccionados(){
        return !seleccion1.getListaAsientos().isEmpty();
    }
    public boolean asientoDisponible(String posicion){ // va s buscar un asiento
        for(Asiento asiento : sala1.getListaAsiento()){
            if(asiento.getPosicionAsiento().equals(posicion)){
                return asiento.isDisponible();
            }
        }
        return false;
    }
     
}
