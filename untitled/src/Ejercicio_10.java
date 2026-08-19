import java.util.ArrayList;

public class Ejercicio_10 {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        agregarProducto(productos, "Cuaderno", 5000, 3);
        agregarProducto(productos, "Lapicero", 2000, 5);
        agregarProducto(productos, "Carpeta", 7000, 2);

        mostrarInventario(productos);

        double total = calcularValorTotalInventario(productos);

        System.out.println("Valor total del inventario: $" + total);
    }

    public static void agregarProducto(ArrayList<Producto> productos, String nombre, double precio, int cantidad) {
        Producto producto = new Producto(nombre, precio, cantidad);
        productos.add(producto);
    }

    public static double calcularValorTotalInventario(ArrayList<Producto> productos) {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total = total + (productos.get(i).precio * productos.get(i).cantidad);
        }

        return total;
    }

    public static void mostrarInventario(ArrayList<Producto> productos) {

        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto: " + productos.get(i).nombre);
            System.out.println("Precio: $" + productos.get(i).precio);
            System.out.println("Cantidad: " + productos.get(i).cantidad);
            System.out.println("--------------------");
        }
    }

}

class Producto {

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

}
