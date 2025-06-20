public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("A001", "Lápiz", 10);
        Producto p2 = new Producto("A002", "Borrador", 5);
        Producto p3 = new Producto("A003", "Cuaderno", 8);
        Producto p4 = new Producto("A004", "Regla", 3);
        System.out.println("Agregando productos al inventario");
        System.out.println("primer producto " + inventario.agregarProducto(p1));
        System.out.println("Total de articulos: " + inventario.totalItems());

        System.out.println("segundo producto " + inventario.agregarProducto(p2));
        System.out.println("Total de articulos: " + inventario.totalItems());

        System.out.println("tercer producto " + inventario.agregarProducto(p3));
        System.out.println("Total de articulos: " + inventario.totalItems());

        System.out.println("intentar agrgar el cuarto producto" + inventario.agregarProducto(p4));
        System.out.println("Total de articulos: " + inventario.totalItems());

        }
    }