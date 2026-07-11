
package fis.poo.proyecto_cine.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jostin
 */
public class Sala{
    
    private int numeroSala;
    private boolean estaDisponible = true;
    private Asiento[] listaAsiento = {new Asiento("A1", estaDisponible),new Asiento("A2", estaDisponible),new Asiento("A3", estaDisponible),new Asiento("B1", estaDisponible),new Asiento("B2", estaDisponible),new Asiento("B3", estaDisponible),new Asiento("C1", estaDisponible),new Asiento("C2", estaDisponible),new Asiento("C3", estaDisponible)};
    private ArrayList<String> listaClaves = new ArrayList<>();
    private ArrayList<Boolean> listaBooleanos = new ArrayList<>();
    
    public Sala(int numeroSala, boolean estaDisponible) {
        this.numeroSala = numeroSala;
        this.estaDisponible = estaDisponible;            
    }
    
    /*
    public void comprarAsiento(String clave){
        for(Asiento a: listaAsiento){
            this.listaClaves.add(a.getPosicionAsiento());
        }
        for(Asiento a: listaAsiento){
            this.listaBooleanos.add(a.getdisponible());
        }
        
        for(String r: listaClaves){
            if(r.equals(clave)){
                for(){
                    
                }
            }
        }
    }
    */
    

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }  
    
    
    //le hago un aporte (daya)
    
    public Asiento[] getListaAsiento(){
        return listaAsiento;
    }
    public Asiento buscarAsiento(String posicion){
        for(Asiento asiento : listaAsiento){
            if (asiento.getPosicionAsiento().equals(posicion)){
                return asiento;
            }
        }
        return null;
    }
    
    
    public void reservarAsiento(String posicion){
        Asiento asiento = buscarAsiento(posicion);
        if(asiento != null && asiento.isDisponible()){
            asiento.ocuparAsiento();
        for(Asiento a: listaAsiento){
            if(a.getPosicionAsiento().equals(posicion)){
                a.setDisponible(false);
            }
        } 
        }else{
            for(Asiento a: listaAsiento){
            if(a.getPosicionAsiento().equals(posicion)){
                a.setDisponible(true);
        }
    }
        }
    }
    
   
    
    public boolean hayAsientosDisponibles(){
        for(Asiento asiento : listaAsiento){
            if(asiento.isDisponible()){
                return true;
            }
        }
        return false;
    }
    
    
    public void mostrarAsiento(){
        for(Asiento asiento : listaAsiento){
            System.out.println(asiento);
        }
    }
    
    
    public String toString(){
        return "Sala: "+Integer.toString(this.numeroSala) ;
    }
    
    
    
}
