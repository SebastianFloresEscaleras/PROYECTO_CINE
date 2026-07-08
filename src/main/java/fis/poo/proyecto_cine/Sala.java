
package fis.poo.proyecto_cine;

import java.util.ArrayList;

/**
 *
 * @author Jostin
 */
public class Sala{
    private int numeroSala;
    private boolean estaDisponible;
    private ArrayList<Asiento> listaAsiento;

    public Sala(int numeroSala, boolean estaDisponible, ArrayList<Asiento> listaAsiento) {
        this.numeroSala = numeroSala;
        this.estaDisponible = estaDisponible;
        this.listaAsiento = new ArrayList<>();
            for(int i=0; i<10; i++){
                int posicion=i;
                Asiento nuevoAsiento=new Asiento(posicion,true);
                this.listaAsiento.add(nuevoAsiento);
        }
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

    public ArrayList<Asiento> getListaAsiento() {
        return listaAsiento;
    }

    public void setListaAsiento(ArrayList<Asiento> listaAsiento) {
        this.listaAsiento = listaAsiento;
    }
    
}
