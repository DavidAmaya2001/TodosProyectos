package Estructura;

public class Felino extends Mamifero{
    private Float tamanoGarras;
    private Integer velocidad;

    //----------------------------------------//
    public Felino(){

    }
    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad){
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }
    //-----------------------------------------//

    public Float getTamanoGarras(){
        return tamanoGarras;
    }
    public Integer getVelocidad(){
        return velocidad;
    }

}
