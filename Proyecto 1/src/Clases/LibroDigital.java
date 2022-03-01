package Clases;

public class LibroDigital {

    public int contador = -1;
    public String[] isbn = new String[10];
    public String[] autor = new String[10];
    public String[] añoPublicacion = new String[10];
    public String[] titulo = new String[10];
    public String[] edicion = new String[10];
    public String[] palabrasClave = new String[10];
    public String[] descripcion = new String[10];
    public String[] temas = new String[10];
    public String[] tamaño = new String[10];

    private static LibroDigital instancia;

    public static LibroDigital getInstancia() {
        if (instancia == null) {
            instancia = new LibroDigital();
        }
        return instancia;
    }
;
}
