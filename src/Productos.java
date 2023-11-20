public class Productos implements Comparable<Productos>{
    String nombre;
    int precio;


    public Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Productos producto) {
        return Integer.compare(this.precio, producto.precio);
    }
}