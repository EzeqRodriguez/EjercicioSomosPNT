import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Productos> articulosSuper = new ArrayList<>();

        articulosSuper.add(new Bebidas("Coca-Cola Zero", 20, 1.5));
        articulosSuper.add(new Bebidas("Coca-Cola", 18, 1.5));
        articulosSuper.add(new Cosmetica("Shampoo Sedal", 19, 500));
        articulosSuper.add(new Verduleria("Frutillas", 64, "kilo"));


        for(Productos articulo : articulosSuper) {
            System.out.println(articulo);
        }

        System.out.println("=================================");

        Collections.sort(articulosSuper);

        Productos productoBarato = articulosSuper.get(0);
        Productos productoCaro = articulosSuper.get(articulosSuper.size() - 1);


        System.out.println("Producto más caro: " + productoCaro.nombre);
        System.out.println("Producto más barato: " + productoBarato.nombre);
    }
}