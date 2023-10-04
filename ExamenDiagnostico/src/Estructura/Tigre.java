package Estructura;

import org.w3c.dom.ls.LSOutput;

public class Tigre extends Felino{
    private String especieTigre;
    //-------------------------------------//
    public Tigre(){
    }
    public Tigre (String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String especieTigre){
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }
    //------------------------------------//

    public String getEspecieTigre(){
        return especieTigre;
    }

    public String Comer(){
        return "Su alimentación se basa en Ocelotes";
    }
    public String Dormir(){
        return "Duerme en las Praderas";
    }
    public String Correr(){
        return "Su velocidad es: "+getVelocidad();
    }
    public String Comunicarse(){
        return "Se comunican a traves de ronroneos";
    }

    public String Tigre(){
        return  "Su habitat es: " + getHabitat() + "\n" +
                "Su altura es: " + getAltura() + "\n" +
                "Tamaño de largo: " + getLargo() + "\n" +
                "Su peso es: " + getPeso() + "\n" +
                "Su nombre Cientifico es: " + getNombreCientifico() + "\n" +
                "El tamaño de ss garras es: " + getTamanoGarras() + "\n" +
                "Su velocidad maxima es: " + getVelocidad() + "\n" +
                "La especie de tigre es: " + getEspecieTigre() + "\n" +
                Comer() + "\n" +
                Dormir() + "\n" +
                Correr() + "\n" +
                Comunicarse();

    }
}
