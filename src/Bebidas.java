public class Bebidas extends Productos {

    double litros;


    public Bebidas(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " +
                "Litros: " + litros + " /// " +
                "Precio: $" + precio;
    }
}