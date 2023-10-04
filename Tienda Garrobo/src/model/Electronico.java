package model;

public abstract class Electronico extends Producto implements IElectronico{
    private String fabricante = "Samsung";

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getFabricante() {
        return fabricante;
    }

    public Electronico() {
    }
}
