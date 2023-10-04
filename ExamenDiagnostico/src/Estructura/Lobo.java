package Estructura;

public class Lobo extends Canino{

    private Integer numCamada;
    private String  especieLobo;

    public Lobo (String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos,Integer numCamada, String especieLobo){
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }
}
