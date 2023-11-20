public class Cosmetica extends Productos {

    int contenido;


    public Cosmetica(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " +
                "Contenido: " + contenido + "ml /// " +
                "Precio: $" + precio;
    }
}