package sistemaVentas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private Double precio;
    private static int contadorProductos = 0;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++Producto.contadorProductos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Producto { " + "\n    IdProducto :" + this.idProducto + "\n    Nombre: " + this.nombre +
            "\n    Precio: " + this.precio + "\n    }";
    }
}
