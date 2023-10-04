package Estructura;

public class Mamifero {
    private String habitat;
    private Float altura;
    private Float largo;
    private Float peso;
    private String nombreCientifico;

    //------------------------------//

    public Mamifero (){

    }
    public Mamifero(String habitat, Float altura, Float largo, Float peso, String nombreCientifico){
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    //------------------------------//

    public String getHabitat(){
        return habitat;
    }
    public Float getAltura(){
        return altura;
    }
    public Float getLargo(){
        return largo;
    }
    public Float getPeso(){
        return peso;
    }
    public String getNombreCientifico(){
        return nombreCientifico;
    }

}
