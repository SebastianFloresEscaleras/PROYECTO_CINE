/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Modelo;
import java.util.ArrayList;

/**
 *
 * @author MASTER (daya)
 */
public class SeleccionAsientos {
    private ArrayList<String> listaAsientos;
    
    public ArrayList<String> getListaAsientos(){
        return listaAsientos;
    }

    public SeleccionAsientos() {
        listaAsientos = new ArrayList<>();
    }
    
    public void cambiarSeleccion(String asiento){ //este va a seleccionar o deseeccionar ojito
        if(listaAsientos.contains(asiento)){
            listaAsientos.remove(asiento);
        }else{
            listaAsientos.add(asiento);
        }
    }
    public String mostrarAsientos(){
        String texto="";
        for(String asiento : listaAsientos){
            texto += asiento + "   ";
        }
        return texto;
    }
    
}
