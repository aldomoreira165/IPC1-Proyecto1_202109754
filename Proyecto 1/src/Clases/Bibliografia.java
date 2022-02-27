package Clases;

public class Bibliografia {

public int contador = -1;
public String[] autor = new String[10];
public String[] año = new String[10];
public String[] titulo = new String[10];
public String[] descripcion = new String[10];
public String[] palabras = new String[10];
public String[] edicion = new String[10];
public String[] temas = new String[10];
public String[] copias = new String[10];
public String[] area = new String[10];
public String[] categoria = new String[10];
public String[] isbn = new String[10];
public String[] tipo = new String[10];

private static Bibliografia instancia;

public static Bibliografia getInstancia() {
        if (instancia == null) {
            instancia = new Bibliografia();
        }
        return instancia;
    };

    
}
