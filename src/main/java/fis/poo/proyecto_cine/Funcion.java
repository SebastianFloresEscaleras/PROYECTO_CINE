package fis.poo.proyecto_cine;

/**
 *
 * @author MASTER dayis
 */
public class Funcion {
    
    private String idFuncion; 
    //private Pelicula pelicula;
    private Sala sala1;
    private String hora;
    private boolean disponibilidad;
    
    public Funcion (){
    }

    public Funcion(String idFuncion, /*Pelicula pelicula,*/ Sala sala1, String hora, boolean disponibilidad) {
        this.idFuncion = idFuncion;
        //this.pelicula = pelicula;
        this.sala1 = sala1;
        this.hora = hora;
        this.disponibilidad = disponibilidad;
    }

    public String getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(String idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /*public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }*/

    public Sala getSala1() {
        return sala1;
    }

    public void setSala1(Sala sala1) {
        this.sala1 = sala1;
    }

    @Override
    public String toString() {
        return "Funcion{" + "idFuncion=" + idFuncion + ", hora=" + hora + ", disponibilidad=" + disponibilidad + '}';
    }
}
