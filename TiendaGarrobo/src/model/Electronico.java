package model;

public abstract class Electronico extends Producto implements IElectronico{
    private String fabricante;

    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }
    public String getFabricante() {
        return fabricante;
    }

}