package model;

public class IPhone extends Electronico {
    private String modelo;
    private String color;

    public IPhone(String fabricante, String modelo, String color, int precio) {
        super(fabricante, precio);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta(int precio) {
        return getPrecio() + (getPrecio() * IVA);
    }
}