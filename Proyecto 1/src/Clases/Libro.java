package Clases;

public class Libro {

    public int contador = -1;
    public String[] autor = new String[10];
    public String[] añoPublicacion = new String[10];
    public String[] isbn = new String[10];
    public String[] titulo = new String[10];
    public String[] edicion = new String[10];
    public String[] palabrasClave = new String[10];
    public String[] descripcion = new String[10];
    public String[] temas = new String[10];
    public String[] copias = new String[10];
    public String[] dispobles = new String[10];

    private static Libro instancia;

    public static Libro getInstancia() {
        if (instancia == null) {
            instancia = new Libro();
        }
        return instancia;
    }
;
}
