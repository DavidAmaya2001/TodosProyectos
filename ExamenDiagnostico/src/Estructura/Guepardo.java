package Estructura;

public class Guepardo extends Felino{

    //-------------------------------------//
    public Guepardo(){
    }
    public Guepardo (String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad){
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }
    //------------------------------------//


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

    public String Guepardo(){
        return  "Su habitat es: " + getHabitat() + "\n" +
                "Su altura es: " + getAltura() + "\n" +
                "Tamaño de largo: " + getLargo() + "\n" +
                "Su peso es: " + getPeso() + "\n" +
                "Su nombre Cientifico es: " + getNombreCientifico() + "\n" +
                "El tamaño de ss garras es: " + getTamanoGarras() + "\n" +
                "Su velocidad maxima es: " + getVelocidad() + "\n" +
                Comer() + "\n" +
                Dormir() + "\n" +
                Correr() + "\n" +
                Comunicarse();

    }
}
