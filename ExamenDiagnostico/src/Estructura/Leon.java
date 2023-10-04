package Estructura;

public class Leon extends Felino{
    private Integer numManada;
    private Float potenciaRugidoDecibel;
    //-------------------------------------//
    public Leon(){
    }
    public Leon (String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugidoDecibel){
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }
    //------------------------------------//

    public Integer getNumManada(){
        return numManada;
    }
    public Float getPotenciaRugidoDecibel(){
        return potenciaRugidoDecibel;
    }

    public String Comer(){
        return "Su alimentación se basa en Venaditos";
    }
    public String Dormir(){
        return "Duerme en la sabana";
    }
    public String Correr(){
        return "Su velocidad es: " + getVelocidad();
    }
    public String Comunicarse(){
        return "Se comunican a traves de rugidos";
    }

    public String Leon(){
        return  "Su habitat es: " + getHabitat() + "\n" +
                "Su altura es: " + getAltura() + "\n" +
                "Tamaño de largo: " + getLargo() + "\n" +
                "Su peso es: " + getPeso() + "\n" +
                "Su nombre Cientifico es: " + getNombreCientifico() + "\n" +
                "El tamaño de ss garras es: " + getTamanoGarras() + "\n" +
                "Su velocidad maxima es: " + getVelocidad() + "\n" +
                "Su numero de manada: " + getNumManada() + "\n" +
                "Su potencia de rugido es: " + getPotenciaRugidoDecibel() + "\n" +
                Comer() + "\n" +
                Dormir() + "\n" +
                Correr() + "\n" +
                Comunicarse();

    }
}
