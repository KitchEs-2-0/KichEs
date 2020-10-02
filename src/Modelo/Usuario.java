
package Modelo;

public class Usuario {
    private String nombre;
    private String apellido;
    private String edad;
    private String Usuario;
    private String password;
    private String password1;

    public Usuario(String nombre, String apellido, String edad, String Usuario, String password, String password1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Usuario = Usuario;
        this.password = password;
        this.password1 = password1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
