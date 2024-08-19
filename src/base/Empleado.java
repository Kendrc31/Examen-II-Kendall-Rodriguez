package base;


import java.time.LocalDate;


/**
 *
 * @author Kendall Rodríguez
 */
public class Empleado {
    private int cedula;
    private String nombre;
    private String apellidos;
    private char genero;
    private LocalDate fechaNac;
    private String email;
    private double salario;
    private double porcComision;

    public Empleado(int cedula, String nombre, String apellidos, char genero, LocalDate fechaNac, String email, double salario, double porcComision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.email = email;
        this.salario = salario;
        this.porcComision = porcComision;
    }
    
    
    public Empleado(){
        this.cedula = 0;
        this.nombre = "";
        this.apellidos = "";
        this.genero = 0;
        this.fechaNac = null;
        this.email = "";
        this.salario = 0;
        this.porcComision = 0;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(double porcComision) {
        this.porcComision = porcComision;
    }
    
    
}
