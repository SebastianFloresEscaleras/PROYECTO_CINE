// Karla:)
package fis.poo.proyecto_cine.Modelo;

import java.util.ArrayList;

public class Factura {

    private Persona cliente;
    private Funcion funcion;
    private ArrayList<String> asientos;
    private double precioUnitario;

    public Factura(Persona cliente, Funcion funcion,
            ArrayList<String> asientos, double precioUnitario) {

        this.cliente = cliente;
        this.funcion = funcion;
        this.asientos = asientos;
        this.precioUnitario = precioUnitario;
    }

    public double calcularTotal() {
        return asientos.size() * precioUnitario;
    }

    public String generarFactura() {

        String factura = "";

        factura += "       POLI CINES        \n\n";

        factura += "Cliente: " + cliente.getNombre() + "\n";
        factura += "ID: " + cliente.getId() + "\n\n";

        factura += "Pelicula: "
                + funcion.getPelicula1().getNombre() + "\n";

        factura += "Duracion: "
                + funcion.getPelicula1().getMinutos()
                + " minutos\n";

        factura += "Horario: "
                + funcion.getHorario() + "\n";

        factura += "Sala: "
                + funcion.getSala1().getNumeroSala()
                + "\n\n";

        factura += "Asientos\n";

        for(String asiento : asientos){

            factura += asiento + "\n";

        }

        factura += "\nCantidad boletos: "
                + asientos.size();

        factura += "\nPrecio unitario: $"
                + precioUnitario;

        factura += "\n\nTOTAL: $"
                + calcularTotal();

        factura += "\n\nGracias por su compra.";

        return factura;

    }

}



