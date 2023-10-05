import model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyy");

        //------------------------------ Instancia de objetos ----------------------------------//
        IPhone telefono1 = new IPhone("SAMSUNG", "Samsung Galaxy ZFlip2", "Verde", 1000);
        IPhone telefono2 = new IPhone("APPLE","Iphone 13 Pro max", "Blanco", 1400);
        TvLcd televisor1 = new TvLcd("LG",44,800);
        TvLcd televisor2 = new TvLcd("Xiaomi",56,1200);
        Date FechaLibrito1 = formato.parse("12-05-1995");
        Libro librito1 = new Libro(FechaLibrito1, "Salarrue", "Lluvia de Tilin", "Santillana", 55);
        Date FechaLibrito2 = formato.parse("08-22-2015");
        Libro librito2 = new Libro(FechaLibrito2, "Dross", "Mi Libro, Luna de Plutón","Planeta Publishing", 30);
        Date FechaComic1 = formato.parse("22-01-1975");
        Comics comic1 =new Comics(FechaComic1, "Nelson Candela", "Opresion de Nelson Candela", "Revo", "Nelson Candela", 40);


        //------------------- Instanciando el arreglo con los objetos ---------------------------//
        Producto[] producto = new Producto[8];
        producto[1] = telefono1;
        producto[2] = telefono2;
        producto[3] = televisor1;
        producto[4] = televisor2;
        producto[5] = librito1;
        producto[6] = librito2;
        producto[7] = comic1;


        for(Producto item: producto){
            if(item instanceof IPhone){
                System.out.println("\n//------------ Dispositivo ------------//");
                System.out.println("Fabricante del dispositivo: " + ((IPhone) item).getFabricante());
                System.out.println("Modelo del dispositivo: " + ((IPhone) item).getModelo());
                System.out.println("Color del dispositivo: " + ((IPhone) item).getColor());
                System.out.println("Precio sin impuestos: " + item.getPrecio());
                System.out.println("Precio de venta (+IVA): " + item.getPrecioVenta(item.getPrecio()) + "\n");
            }
            else if(item instanceof TvLcd){
                System.out.println("//------------- Televisor -------------//");
                System.out.println("Fabricante del televisor: " + ((TvLcd) item).getFabricante());
                System.out.println("Pulgadas del televisor: " + ((TvLcd) item).getPulgada());
                System.out.println("Precio sin impuestos: " + item.getPrecio());
                System.out.println("Precio de venta (+IVA): " + item.getPrecioVenta(item.getPrecio()) + "\n");
            }
            else if(item instanceof Libro){
                if(item instanceof Comics){
                    System.out.println("//--------------- Comics --------------//");
                    System.out.println("Fecha de publicación: " + ((Comics) item).getFechaPublicacion());
                    System.out.println("Autor del libro: " + ((Comics) item).getAutor());
                    System.out.println("Titulo del libro: " + ((Comics) item).getTitulo());
                    System.out.println("Editorial correspondiente: " + ((Comics) item).getEditorial());
                    System.out.println("Personaje del libro: " + ((Comics) item).getPersonaje());
                    System.out.println("Precio sin impuestos: " + item.getPrecio());
                    System.out.println("Precio de venta (+IVA): " + item.getPrecioVenta(item.getPrecio()) + "\n");
                }
                else{
                    System.out.println("//-------------- Libros ---------------//");
                    System.out.println("Fecha de publicación: " + ((Libro) item).getFechaPublicacion());
                    System.out.println("Autor del libro: " + ((Libro) item).getAutor());
                    System.out.println("Titulo del libro: " + ((Libro) item).getTitulo());
                    System.out.println("Editorial correspondiente: " + ((Libro) item).getEditorial());
                    System.out.println("Precio sin impuestos: " + item.getPrecio());
                    System.out.println("Precio de venta (+IVA): " + item.getPrecioVenta(item.getPrecio()) + "\n");
                }
            }
            else{
                System.out.print("\n");
            }
        }

    }
}