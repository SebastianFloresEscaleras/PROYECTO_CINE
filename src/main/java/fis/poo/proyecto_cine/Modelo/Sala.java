
package fis.poo.proyecto_cine.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jostin
 */
public class Sala{
    
    private int numeroSala;
    private boolean estaDisponible = true;
    private Asiento[] listaAsiento = {new Asiento("A1", estaDisponible),new Asiento("A2", estaDisponible),new Asiento("A3", estaDisponible),new Asiento("A4", estaDisponible),new Asiento("A5", estaDisponible),new Asiento("A6", estaDisponible),new Asiento("A7", estaDisponible),new Asiento("A8", estaDisponible),new Asiento("A9", estaDisponible) };

    public Sala(int numeroSala, boolean estaDisponible) {
        this.numeroSala = numeroSala;
        this.estaDisponible = estaDisponible;            
    }

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
}
