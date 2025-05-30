import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Corporal corporal = new Corporal();

        System.out.println("Ingrese su nombre ");
        corporal.setNombre(sc.nextLine());
        System.out.println("Ingrese su peso ");
        corporal.setPeso(sc.nextDouble());
        System.out.println("Ingrese su altura ");
        corporal.setAltura(sc.nextDouble());
        corporal.calcularPeso();
        corporal.calcularIMC();
        System.out.println("Usted tiene una masa corporal de: " + df.format(corporal.calcularPeso()));
        System.out.println(corporal.calcularIMC());

    }
}