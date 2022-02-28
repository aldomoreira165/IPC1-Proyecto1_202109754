package Clases;

public class Usuario {

    public int contador = -1;
    public String[] id = new String[10];
    public String[] nombre = new String[10];
    public String[] apellido = new String[10];
    public String[] user = new String[10];
    public String[] rol = new String[10];
    public String[] password = new String[10];
    public boolean usuarioConInstanciado = false;

    private static Usuario instancia;

    public static Usuario getInstancia() {
        if (instancia == null) {
            instancia = new Usuario();
        }
        return instancia;
    }
}   