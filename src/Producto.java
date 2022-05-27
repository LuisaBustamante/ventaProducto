
public class Producto {

    private int numero;
    public double precio;

    public Producto(int numero) {
        this.numero = numero;
        this.precio = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void precio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\n \t id: " + numero;
    }
}
