package model;

public abstract class Producto implements IProducto{
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}

