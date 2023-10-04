import model.Comics;
import model.IPhone;
import model.Producto;
import model.TvLcd;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("============ DISPOSITIVOS ==============");
        IPhone telefono1 = new IPhone("SAMSUNG", "Samsung Galaxy ZFlip2", "Verde");
        telefono1.setPrecio(1200);

        TvLcd televisor1 = new TvLcd("LG",44);
        televisor1.setPrecio(800);

        Producto[] producto = new Producto[5];
        producto[1] = telefono1;
        producto[2] = televisor1;

        for(Producto item: producto){
            if(item instanceof TvLcd){
                System.out.println("Impresion");
            }
        }

    }
}