package model;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(Date fechaPublicacion, String autor, String titulo, String editorial, int precio) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        getPrecioVenta(precio);
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta(int precio){
        return getPrecio() + (getPrecio()*IVA);
    }
}
