public abstract class Vehiculo {
    private String marca;

    public Vehiculo(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }

    private String placa;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
