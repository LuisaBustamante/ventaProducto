
import java.util.Date;
import javax.swing.JOptionPane;

public class Pedido {

    private int numPedido;
    private Cliente cliente;
    private Producto producto[];
    private Date fecha;
    private String metodoPago;
    private String numeroTarjeta;
    private double totalPago;

    public Pedido(int numPedido, Cliente cliente, Producto[] producto, Date fecha, String metodoPago, double totalPago) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.numeroTarjeta = "";
        this.totalPago = totalPago;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String mostrarPago() {

        if (metodoPago.equalsIgnoreCase("Efectivo")) {

            return "Efectivo";

        } else {

            return "Tarjeta de Credito" + "\n \t Numero Tarjeta: " + numeroTarjeta;

        }

    }

    public String mostrar() {

        String productos = " ";

        for (int i = 0; i < producto.length; i++) {

            productos += producto[i];

        }

        return productos;

    }

    @Override
    public String toString() {
        return cliente.toString() + "\n Pedido No: " + numPedido + "\n \t Fecha: " + fecha + "\n \t Metodo de Pago: " + mostrarPago() + "\n \t Producto: " + mostrar() + "\n Total a pagar: " + totalPago;
    }

}
