public class UsoThis {

    String marca;
    String modelo;
    int anio;

    public UsoThis(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public UsoThis(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // public UsoThis(String marca, String modelo) {
    //     this(marca, modelo, 2020);
    // }
    public UsoThis setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public static void main(String[] args) {
        UsoThis coche = new UsoThis("Cadillac", "ModeloZ");
        coche.setMarca("VW");
        System.out.println(coche.marca);
        System.out.println(coche.modelo);
    }
}
