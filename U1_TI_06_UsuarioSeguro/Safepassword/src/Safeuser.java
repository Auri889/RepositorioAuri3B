import java.sql.SQLOutput;

public class Safeuser {
    //Atributos
    private String Nombreusuario;
    private String password;


//Setters
public void setNombreusuario(String nombreusuario) {
    if (!nombreusuario.isEmpty() && !nombreusuario.equals("")) {
        Nombreusuario = nombreusuario;
    }

}

    public void setPassword(String password) {
    if (!password.isEmpty() && !password.equals("") && password.length() >= 8) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {

            }
        }

    }
        this.password = password;
    }


    public boolean validarPassword() {

}





}