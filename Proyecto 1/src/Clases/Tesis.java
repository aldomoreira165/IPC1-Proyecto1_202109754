package Clases;

public class Tesis {

    public int contador = -1;
    public String[] isbn = new String[10];
    public String[] autor = new String[10];
    public String[] añoPublicacion = new String[10];
    public String[] titulo = new String[10];
    public String[] palabrasClave = new String[10];
    public String[] area = new String[10];
    public String[] temas = new String[10];
    public String[] descripcion = new String[10];
    public String[] edicion = new String[10];
    public String[] copias = new String[10];
    public String[] dispobles = new String[10];

    private static Tesis instancia;

    public static Tesis getInstancia() {
        if (instancia == null) {
            instancia = new Tesis();
        }
        return instancia;
    }
;
}
