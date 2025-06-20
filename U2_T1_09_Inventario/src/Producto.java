public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad) {
        setCodigo(codigo);
        this.nombre = nombre;
        setCantidad(cantidad);
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Necesita agregar una cantidad mayor que 0");
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Ncesetia agragr una cantidad mayor que 0");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}