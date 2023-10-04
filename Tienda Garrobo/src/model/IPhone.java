package model;

public class IPhone extends Electronico {
    private String modelo;
    private String color;

    public IPhone(String fabricante, String modelo, String color) {
        super(fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public IPhone(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() + (getPrecio() * IVA);
    }
}
