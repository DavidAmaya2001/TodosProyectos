package model;

public abstract class Producto implements IProducto{
    private int precio;

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
}
