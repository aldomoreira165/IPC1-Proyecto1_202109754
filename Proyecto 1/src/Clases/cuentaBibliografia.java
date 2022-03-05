package Clases;

public class cuentaBibliografia {

    public int contador = -1;
    public String[] isbn = new String[10];
    public String[] titulo = new String[10];
    public String[] tipo = new String[10];
    private static cuentaBibliografia instancia;

    public static cuentaBibliografia getInstancia() {
        if (instancia == null) {
            instancia = new cuentaBibliografia();
        }
        return instancia;
    }

}
