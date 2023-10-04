import Estructura.Guepardo;
import Estructura.Tigre;
import Estructura.Leon;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String type = "";
        boolean repeat = true;
        Scanner readline = new Scanner(System.in);

        System.out.println("\n======================================");
        System.out.println("\t\t ANIMAL PLANET DATA");
        System.out.println("======================================");
        do{
            System.out.println("\n\t1. Ver listado de Mamiferos");
            System.out.println("\t2. Ver listado de Caninos");
            System.out.println("\t3. Salir del programa.");
            type = readline.nextLine();
            switch(type){
                case "1":
                    Felino();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    break;
            }
        }while(repeat);
    }

    static public String Felino(){
        String animal = "";
        boolean repeat = false;
        int option;
        Scanner readline = new Scanner(System.in);


        Tigre objTigre = new Tigre("Sabana Africana",1.20F,2.25F,120F,"no me acuerdo",20F,90,"Tigre Albino");
        Leon objLeon = new Leon("Sabana Africana",1.20F,2.25F,120F,"no me acuerdo",20F,90,12,230F);
        Guepardo objGuepardo = new Guepardo("Sabana Africana",1.20F,2.25F,120F,"no me acuerdo",20F,90);

        do{
            System.out.println("======================================");
            System.out.println("\t\t Listdo e animales");
            System.out.println("======================================");
            System.out.println("\t1. Tigre");
            System.out.println("\t2. Leon");
            System.out.println("\t3. Guepardo");
            System.out.println("\t4. Regresar...");
            System.out.println("======================================\n");

            animal = readline.nextLine();
            switch(animal){
                case "1":
                    System.out.println(objTigre.Tigre());
                    break;
                case "2":
                    System.out.println(objLeon.Leon());
                    break;
                case "3":
                    System.out.println(objGuepardo.Guepardo());
                    break;
                case "4":
                    System.out.println("Regresando al menu anterior... ");
                    break;
                default:
                    System.out.println("Dato ingresado erroneo");
                    break;
            }

        }while(repeat);
        return "Hola";
    }

    static public String Canino(){
        boolean repeat = false;
        int option;
        Scanner readline = new Scanner(System.in);


        do{
            System.out.println("======================================");
            System.out.println("\t\t Listdo e animales");
            System.out.println("======================================");
            System.out.println("\t1. Lobo");
            System.out.println("\t2. Perro");
            System.out.println("\t3. Regresar...");
            System.out.println("======================================\n");

            option = readline.nextInt();
            switch(option){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Regresando al menu anterior... ");
                    break;
                default:
                    System.out.println("Dato ingresado erroneo");
                    break;
            }

        }while(repeat);
        return "Hola";
    }
}