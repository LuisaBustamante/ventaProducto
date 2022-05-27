import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecutar {

    private Pedido pedido[] = new Pedido[5];

    private int posicion = 0;

    private int numPedido = 1;

    private double totalPago = 0;

    public void agregarPedido() {

        if (pedido.length > posicion) {

            String nomCliente = JOptionPane.showInputDialog(null, "Digite el nombre del cliente");

            String cedula = JOptionPane.showInputDialog(null, "Digite la cedula del cliente");

            Cliente cliente = new Cliente(nomCliente, cedula);

            String metodoPago = "";

            String numeroTarjeta = "";

            boolean valido = true;

            do {
                metodoPago = JOptionPane.showInputDialog(null, "Digite metodo de pago (Efectivo o Tarjeta): ");

                if (metodoPago.equalsIgnoreCase("Efectivo")) {

                    valido = false;

                } else if (metodoPago.equalsIgnoreCase("Tarjeta")) {
                    numeroTarjeta = JOptionPane.showInputDialog(null, "Digite el numero de la Tarjeta: ");
                    valido = false;
                } else {

                    JOptionPane.showMessageDialog(null, "Metodo no existente");

                }

            } while (valido);

            Date fecha = new Date();

            int numProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos productos desea llevar"));

            Producto producto[] = new Producto[numProductos];

            int i = 0;

            while (i < numProductos) {

                Random aleatorio = new Random();

                int id = aleatorio.nextInt(100);

                String tipoProducto = JOptionPane.showInputDialog(null, "Producto " + (i + 1) + " Impresión o Camara");

                if (tipoProducto.equalsIgnoreCase("Impresion")) {

                    String color = JOptionPane.showInputDialog(null, "Si = si la foto es a color" + "\n No = si la foto no es a color");

                    int numFotos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Numero de fotos a imprimir"));

                    Foto foto[] = new Foto[numFotos];

                    for (int j = 0; j < numFotos; j++) {

                        String fichero = JOptionPane.showInputDialog(null, "Digite el nombre de la foto " + (j + 1));

                        foto[j] = new Foto(fichero);

                        JOptionPane.showMessageDialog(null, foto[j].toString());

                    }

                    double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio de la impresión: "));

                    producto[i] = new Impresion(color, foto, id);

                    producto[i].precio(precio);

                    totalPago += producto[i].getPrecio();

                    i++;

                } else if (tipoProducto.equalsIgnoreCase("Camara")) {

                    String marca = JOptionPane.showInputDialog(null, "Digite la marca de la camara");

                    String modelo = JOptionPane.showInputDialog(null, "Digite la modelo de la camara");

                    double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio de la Camara: "));

                    producto[i] = new Camara(marca, modelo, id);

                    producto[i].precio(precio);

                    totalPago += producto[i].getPrecio();

                    i++;

                } else {

                    JOptionPane.showMessageDialog(null, "Producto no existente");

                }

            }

            pedido[posicion] = new Pedido(numPedido, cliente, producto, fecha, metodoPago, totalPago);

            pedido[posicion].setNumeroTarjeta(numeroTarjeta);

            numPedido++;

            posicion++;

        } else {

            JOptionPane.showMessageDialog(null, "Tamaño alcanzado ");

        }

    }

    public void verPedido() {

        for (int i = 0; i < posicion; i++) {

            JOptionPane.showMessageDialog(null, pedido[i].toString());

        }

    }

    public static void main(String[] args) {

        Ejecutar main = new Ejecutar();

        int menu = 0;

        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar pedido "
                    + "\n 2. Visualizar pedidos"
                    + "\n 3. Salir"
                    + "\n" + "\n Digite la opcion"));

            switch (menu) {

                case 1: {

                    main.agregarPedido();

                }
                break;

                case 2: {

                    main.verPedido();

                }
                break;

                case 3: {

                    JOptionPane.showMessageDialog(null, "Sistema cerrado");

                }
                break;

                default: {

                    JOptionPane.showMessageDialog(null, "Opción no valida");

                }

            }

        } while (menu != 3);

    }
}
