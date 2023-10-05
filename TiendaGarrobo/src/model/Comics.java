package model;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public String getPersonaje() {
        return personaje;
    }

    public Comics(Date fechaPublicacion, String autor, String titulo, String editorial, String personaje, int precio) {
        super(fechaPublicacion, autor, titulo, editorial, precio);
        this.personaje = personaje;
        getPrecioVenta(precio);
    }

}
