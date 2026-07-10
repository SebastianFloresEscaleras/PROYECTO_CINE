package fis.poo.proyecto_cine.Modelo;

/**
 *
 * @author sebas
 */
public class Funcion {
    
    String idFuncion;
    String horario;
    //este estaDisponible nos avisa si aun hay cupos de la funcion
    boolean estaDisponible;
    Pelicula pelicula1;
    Sala sala1;
    
    
    public Funcion(String idFuncion, String horario, boolean estaDisponible, Pelicula pelicula1, Sala sala1){
        this.idFuncion = idFuncion;
        this.estaDisponible = estaDisponible;
        this.horario = horario;
        this.pelicula1 = pelicula1;
        this.sala1 = sala1;
    }
    
    //hago mi aporte (daya)
    public boolean hayDisponibilidad(){
        return sala1.hayAsientosDisponibles();
    }
    
    public void mostratInformacion(){
        System.out.println("Pelicula: " + pelicula1.getNombre());
        System.out.println("Horarios: " + horario);
        System.out.println("Sala: " + sala1.getNumeroSala());
    }
    
    
}
