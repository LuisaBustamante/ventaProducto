
public class Camara extends Producto {

    private String marca;
    private String modelo;

    public Camara(String marca, String modelo, int numero) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void precio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + "\n \t Camara: " + "\n \t Marca: " + marca + "\n \t Modelo: " + modelo + "\n \t Precio: " + precio;
    }

}
