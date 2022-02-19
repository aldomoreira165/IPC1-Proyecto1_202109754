package Clases;

public class    Usuario {
    private int contador;
    private String id;
    private String nombre;
    private String apellido;
    private String user;
    private String rol;
    private String password;

    public Usuario() {
    }

    public Usuario(String id, String nombre, String apellido, String user, String rol, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.rol = rol;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }       

    public String getRol() {
        return rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }



}   