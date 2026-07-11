
package fis.poo.proyecto_cine.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jostin
 */
public class Validador implements InterfazValidador{
    private ArrayList<String> codigosAdministradores;
    private boolean tieneAcceso;

    public Validador(ArrayList<String> listaAdministradores, boolean tieneAcceso) {
        this.codigosAdministradores = listaAdministradores;
        this.tieneAcceso = false;
        this.codigosAdministradores.add("012345");
        this.codigosAdministradores.add("012346");
        this.codigosAdministradores.add("012347");
    }
    @Override 
    public boolean validarAdmision(Administrador administrador){
        if(this.codigosAdministradores.contains(administrador.getId())){
            this.tieneAcceso=true;
        }else{
            this.tieneAcceso=false;
        }
        return this.tieneAcceso;
    }
    public ArrayList<String> getListaAdministradores() {
        return codigosAdministradores;
    }

    public void setListaAdministradores(ArrayList<String> listaAdministradores) {
        this.codigosAdministradores = listaAdministradores;
    }

    public boolean isTieneAcceso() {
        return tieneAcceso;
    }

    public void setTieneAcceso(boolean tieneAcceso) {
        this.tieneAcceso = tieneAcceso;
    }
    
    
}
