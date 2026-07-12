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
    //faltaban los getters setters mi gente
    public String getIdFuncion(){
    return idFuncion;
    }

    public String getHorario() {
        return horario;
    }

    public Pelicula getPelicula1() {
        return pelicula1;
    }
    public Sala getSala1() {
        return sala1;
    }

    public boolean hayDisponibilidad() {
        return sala1.hayAsientosDisponibles();
    }
    
    public void mostratInformacion(){
        System.out.println("Pelicula: " + pelicula1.getNombre());
        System.out.println("Horarios: " + horario);
        System.out.println("Sala: " + sala1.getNumeroSala());
    }
    
    public String devolverString(){
        return " Id Funcion:"+this.idFuncion + " Horario:" +" "+this.horario + " " +this.pelicula1.toString() +" " +this.sala1.toString();
    }

}
