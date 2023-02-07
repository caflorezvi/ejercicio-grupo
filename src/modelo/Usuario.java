package modelo;

public class Usuario{

    private String cedula, nombre, email;
    private int anioNacimiento;

    public Usuario(String cedula, String nombre, String email, int anioNacimiento){
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.anioNacimiento = anioNacimiento;
    }

}