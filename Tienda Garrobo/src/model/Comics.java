package model;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public String getPersonaje() {
        return personaje;
    }

    public Comics(Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta(){
        return getPrecio() + (getPrecio()*IVA);
    }

}
