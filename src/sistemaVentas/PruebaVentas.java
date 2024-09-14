package sistemaVentas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Venta ***");
        var camisa1 = new Producto("Camisa", 50.00);
        System.out.println(camisa1);
        var pantalon1 = new Producto("Pantalon",100.00);
        System.out.println(pantalon1);
    }
}
