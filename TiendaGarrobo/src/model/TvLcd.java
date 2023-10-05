package model;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(String fabricante, int pulgada, int precio) {
        super(fabricante, precio);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta(int precio){
        return getPrecio() + (getPrecio()*IVA);
    }
}
