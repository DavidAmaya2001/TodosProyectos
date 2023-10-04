package model;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(String fabricante, int pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
    }

    public TvLcd(int pulgada) {
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta(){
        return getPrecio() + (getPrecio()*IVA);
    }
}
