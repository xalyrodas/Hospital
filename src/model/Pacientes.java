package model;

public class Pacientes {
    // Atributos
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String fechaDeNacimiento;
    private String horarioCita;
    private String motivoVisita;
    private int numeroConsultas;
    private String doctor;

    // Constructor
    public Pacientes(String nombre, String correo, String telefono, String direccion,
                     String fechaDeNacimiento, String horarioCita, String motivoVisita,
                     int numeroConsultas, String doctor) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.horarioCita = horarioCita;
        this.motivoVisita = motivoVisita;
        this.numeroConsultas = numeroConsultas;
        this.doctor = doctor;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getHorarioCita() {
        return horarioCita;
    }

    public void setHorarioCita(String horarioCita) {
        this.horarioCita = horarioCita;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public int getNumeroConsultas() {
        return numeroConsultas;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        this.numeroConsultas = numeroConsultas;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pacientes {" +
                "Nombre='" + nombre + '\'' +
                ", Correo='" + correo + '\'' +
                ", Telefono='" + telefono + '\'' +
                ", Dirección='" + direccion + '\'' +
                ", Fecha de Nacimiento='" + fechaDeNacimiento + '\'' +
                ", Horario Cita='" + horarioCita + '\'' +
                ", Motivo Visita='" + motivoVisita + '\'' +
                ", Número Consultas=" + numeroConsultas +
                ", Doctor='" + doctor + '\'' +
                '}';
    }
}
