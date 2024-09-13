package sistemaVentas;

public class Orden {
    private final int idOrden;
    private int[] productos = new int[5];

    public void agregarProducto(Producto producto) {
        productos[0] = producto;
    }
}
