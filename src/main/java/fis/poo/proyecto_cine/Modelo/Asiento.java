/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.proyecto_cine.Modelo;

/**
 *
 * @author sebas
 */
public class Asiento {
    
    String posicionAsiento;
    boolean disponible;

    public Asiento(String posicionAsiento, boolean disponible) {
        this.posicionAsiento = posicionAsiento;
        this.disponible = disponible;
    }
   // holi voy a modificar este codigo (daya)

    public String getPosicionAsiento() {
        return posicionAsiento;
    }

    public void setPosicionAsiento(String posicionAsiento) {
        this.posicionAsiento = posicionAsiento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void ocuparAsiento(){
        disponible = false;
    }
    
    public void liberarAsiento(){
        disponible = true;
    }

    @Override
    public String toString() {
        return "Asiento en la posicion: " + posicionAsiento + ", disponible=" + disponible + '}';
    } 
    
}
