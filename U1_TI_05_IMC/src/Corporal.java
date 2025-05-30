public class Corporal {
    private String nombre;
    private double altura;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularPeso() {
        return peso / (altura * altura);
    }

    public String calcularIMC() {
        if (calcularPeso() < 18){
                return "Usted es peso bajo";
            }
            else if (calcularPeso() > 18.5 || calcularPeso() < 24.9){
                return "Usted es peso saludable";
        } else if (calcularPeso() > 25 || calcularPeso() < 29.9){
                return "Usted tiene sobrepeso";
        }else if( calcularPeso() > 30){
                return "Usted tiene obesidad";
        }

        return "..";
    }

}
