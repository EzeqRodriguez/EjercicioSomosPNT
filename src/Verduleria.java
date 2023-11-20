public class Verduleria extends Productos {

    String unidad;

    public Verduleria(String nombre, int precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " +
                "Precio: $" + precio + " /// " +
                "Unidad de venta: " + unidad;
    }
}