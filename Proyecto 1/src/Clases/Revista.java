package Clases;

public class Revista {

    public int contador = -1;
    public String[] isbn = new String[10];
    public String[] autor = new String[10];
    public String[] añoPublicacion = new String[10];
    public String[] titulo = new String[10];
    public String[] edicion = new String[10];
    public String[] descripcion = new String[10];
    public String[] categoria = new String[10];
    public String[] ejemplares = new String[10];
    public String[] temas = new String[10];
    public String[] palabrasClave = new String[10];
    public Integer[] copias = new Integer[10];
    public Integer[] dispobles = new Integer[10];

    private static Revista instancia;

    public static Revista getInstancia() {
        if (instancia == null) {
            instancia = new Revista();
        }
        return instancia;
    }
;
}
