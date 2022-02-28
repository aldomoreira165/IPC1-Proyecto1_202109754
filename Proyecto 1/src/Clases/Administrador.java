package Clases;

public class Administrador {

    public String id = "1";
    public String nombre = "admin";
    public String user = "admin";
    public String rol = "admin";
    public String password = "admin";

    private static Administrador instancia;

    public static Administrador getInstancia() {
        if (instancia == null) {
            instancia = new Administrador();
        }
        return instancia;
    }

}
