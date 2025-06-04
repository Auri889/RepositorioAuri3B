import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Safeuser safeuser = new Safeuser();
System.out.println("Digite su usuario: ");
safeuser.setNombreusuario(sc.next());
System.out.println("Digite su contraseña: ");
safeuser.setPassword(sc.next());
safeuser.validarPassword();



    }
}