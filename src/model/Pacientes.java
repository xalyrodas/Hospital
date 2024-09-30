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
import javax.swing.*;
import java.awt.*;

public class Pacientes extends JFrame {
    public JPanel panelHeader, panelBody;
    public JLabel titHospHeader, titPacientesHeader, titDatosPaciBody;
    public JLabel  titCodigoPa, nombrePa1, apellidoPa1, notPa1,cambTratPa1, titDatNombre, titApellido, titEdad, titSexo, titCambiosTrat, titNotas, seguimientoPaci, titPlanTrat;
    public JLabel codPa1, codPa2,codPa3,codPa4,codPa5, nombrePa2, cambTratPa2, apellidoPa2, notPa2, edadPa1, sexPaciente1,  seguimP1, nombrePa3, cambTratPa3, apellidoPa3, notPa3, nombrePa4, cambTratPa4, apellidoPa4, notPa4, nombrePa5, cambTratPa5, apellidoPa5, notPa5 ,  edadPa2, sexPaciente2,  seguimP2, edadPa3, sexPaciente3,  seguimP3, edadPa4, sexPaciente4,  seguimP4, edadPa5, sexPaciente5,  seguimP5, planTratP1, planTratP2,planTratP3,planTratP4,planTratP5;


    //    public JLabel
    public Pacientes() {

        // CONFIGURACION DE LA VENTANA
        this.setTitle("PACIENTES ASIGNADOS");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(1800, 1000);
        this.setLocationRelativeTo(null);

        // SECCION DEL HEADER
        panelHeader = new JPanel();
        panelHeader.setBackground(Color.lightGray);
        panelHeader.setBounds(0, 0, 1800, 185);
        panelHeader.setLayout(null);

        titHospHeader = new JLabel("Hospital XXX");
        titHospHeader.setBounds(620, 45, 600, 42);
        titHospHeader.setFont(new Font("Goudy Stout", Font.BOLD, 37));
        titHospHeader.setHorizontalAlignment(SwingConstants.CENTER);
        titHospHeader.setOpaque(true);

        titPacientesHeader = new JLabel("PACIENTES ASIGNADOS");
        titPacientesHeader.setBounds(620, 110, 600, 42);
        titPacientesHeader.setFont(new Font("Goudy Stout", Font.BOLD, 25));
        titPacientesHeader.setHorizontalAlignment(SwingConstants.CENTER);
        titPacientesHeader.setOpaque(true);

        // SECCION DEL BODY

        panelBody = new JPanel();
        panelBody.setBounds(0, 0, 1800, 800);
        panelBody.setLayout(null);

        // TITULOS DEL BODY

        titDatosPaciBody = new JLabel("Pacientes Asignados por Doctor: ");
        titDatosPaciBody.setBounds(60, 225, 900, 32);
        titDatosPaciBody.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        titDatosPaciBody.setHorizontalAlignment(SwingConstants.LEFT);
        titDatosPaciBody.setOpaque(true);

        // TITULOS DE LOS DATOS DEL PACIENTE

        titCodigoPa = new JLabel("Codigo Paciente");
        titCodigoPa.setBounds(60, 290, 170, 32);
        titCodigoPa.setFont(new Font("Rockwell", Font.BOLD, 20));
        titCodigoPa.setHorizontalAlignment(SwingConstants.LEFT);
        titCodigoPa.setBackground(Color.LIGHT_GRAY);
        titCodigoPa.setOpaque(true);

        titDatNombre = new JLabel("Nombre");
        titDatNombre.setBounds(238, 290, 130, 32);
        titDatNombre.setFont(new Font("Rockwell", Font.BOLD, 20));
        titDatNombre.setHorizontalAlignment(SwingConstants.LEFT);
        titDatNombre.setBackground(Color.LIGHT_GRAY);
        titDatNombre.setOpaque(true);

        titApellido = new JLabel("Apellido");
        titApellido.setBounds(376, 290, 130, 32);
        titApellido.setFont(new Font("Rockwell", Font.BOLD, 20));
        titApellido.setHorizontalAlignment(SwingConstants.LEFT);
        titApellido.setBackground(Color.LIGHT_GRAY);
        titApellido.setOpaque(true);

        titEdad = new JLabel("Edad");
        titEdad.setBounds(514, 290, 62, 32);
        titEdad.setFont(new Font("Rockwell", Font.BOLD, 20));
        titEdad.setHorizontalAlignment(SwingConstants.LEFT);
        titEdad.setBackground(Color.LIGHT_GRAY);
        titEdad.setOpaque(true);

        titSexo = new JLabel("Sexo");
        titSexo.setBounds(583, 290, 54, 32);
        titSexo.setFont(new Font("Rockwell", Font.BOLD, 20));
        titSexo.setHorizontalAlignment(SwingConstants.LEFT);
        titSexo.setBackground(Color.LIGHT_GRAY);
        titSexo.setOpaque(true);

        seguimientoPaci = new JLabel("Historial Clinico");
        seguimientoPaci.setBounds(644, 290, 250, 32);
        seguimientoPaci.setFont(new Font("Rockwell", Font.BOLD, 20));
        seguimientoPaci.setHorizontalAlignment(SwingConstants.LEFT);
        seguimientoPaci.setBackground(Color.lightGray);
        seguimientoPaci.setOpaque(true);

        titPlanTrat = new JLabel("Plan de tratamiento");
        titPlanTrat.setBounds(901, 290, 250, 32);
        titPlanTrat.setFont(new Font("Rockwell", Font.BOLD, 20));
        titPlanTrat.setHorizontalAlignment(SwingConstants.LEFT);
        titPlanTrat.setBackground(Color.lightGray);
        titPlanTrat.setOpaque(true);

        titNotas = new JLabel("Notas");
        titNotas.setBounds(1158, 290, 250, 32);
        titNotas.setFont(new Font("Rockwell", Font.BOLD, 20));
        titNotas.setHorizontalAlignment(SwingConstants.LEFT);
        titNotas.setBackground(Color.lightGray);
        titNotas.setOpaque(true);

        titCambiosTrat = new JLabel("Cambios en el tratamiento");
        titCambiosTrat.setBounds(1415, 290, 300, 32);
        titCambiosTrat.setFont(new Font("Rockwell", Font.BOLD, 20));
        titCambiosTrat.setHorizontalAlignment(SwingConstants.LEFT);
        titCambiosTrat.setBackground(Color.lightGray);
        titCambiosTrat.setOpaque(true);


        // NOMBRE Y DATOS DE LOS PACIENTES

        codPa1 = new JLabel("12345");
        codPa1.setBounds(60, 335, 170, 32);
        codPa1.setFont(new Font("Rockwell", Font.BOLD, 20));
        codPa1.setHorizontalAlignment(SwingConstants.LEFT);
        codPa1.setBackground(Color.white);
        codPa1.setOpaque(true);

        nombrePa1 = new JLabel("Aaron");
        nombrePa1.setBounds(238, 335, 130, 32);
        nombrePa1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        nombrePa1.setHorizontalAlignment(SwingConstants.LEFT);
        nombrePa1.setBackground(Color.white);
        nombrePa1.setOpaque(true);

        apellidoPa1 = new JLabel("Almendro");
        apellidoPa1.setBounds(376, 335, 130, 32);
        apellidoPa1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        apellidoPa1.setHorizontalAlignment(SwingConstants.LEFT);
        apellidoPa1.setBackground(Color.white);
        apellidoPa1.setOpaque(true);

        edadPa1 = new JLabel("45");
        edadPa1.setBounds(514, 335, 62, 32);
        edadPa1.setFont(new Font("Rockwell", Font.BOLD, 20));
        edadPa1.setHorizontalAlignment(SwingConstants.LEFT);//1098
        edadPa1.setBackground(Color.white);
        edadPa1.setOpaque(true);

        sexPaciente1 = new JLabel("M");
        sexPaciente1.setBounds(583, 335, 54, 32);
        sexPaciente1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        sexPaciente1.setHorizontalAlignment(SwingConstants.LEFT);
        sexPaciente1.setBackground(Color.white);
        sexPaciente1.setOpaque(true);

        planTratP1 = new JLabel("texto");
        planTratP1.setBounds(901, 335, 250, 32);
        planTratP1.setFont(new Font("Rockwell", Font.BOLD, 20));
        planTratP1.setHorizontalAlignment(SwingConstants.LEFT);
        planTratP1.setBackground(Color.white);
        planTratP1.setOpaque(true);

        seguimP1 = new JLabel("texto");
        seguimP1.setBounds(644, 335, 250, 32);
        seguimP1.setFont(new Font("Rockwell", Font.BOLD, 20));
        seguimP1.setHorizontalAlignment(SwingConstants.LEFT);
        seguimP1.setBackground(Color.white);
        seguimP1.setOpaque(true);

        notPa1 = new JLabel("texto");
        notPa1.setBounds(1158, 335, 250, 32);
        notPa1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        notPa1.setHorizontalAlignment(SwingConstants.LEFT);
        notPa1.setBackground(Color.white);
        notPa1.setOpaque(true);

        cambTratPa1 = new JLabel("texto");
        cambTratPa1.setBounds(1415, 335, 300, 32);
        cambTratPa1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cambTratPa1.setHorizontalAlignment(SwingConstants.LEFT);
        cambTratPa1.setBackground(Color.white);
        cambTratPa1.setOpaque(true);


        // PACIENTE 2

        codPa2 = new JLabel("6789");
        codPa2.setBounds(60, 380, 170, 32);
        codPa2.setFont(new Font("Rockwell", Font.BOLD, 20));
        codPa2.setHorizontalAlignment(SwingConstants.LEFT);
        codPa2.setBackground(Color.white);
        codPa2.setOpaque(true);

        nombrePa2 = new JLabel("Angela");
        nombrePa2.setBounds(238, 380, 130, 32);
        nombrePa2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        nombrePa2.setHorizontalAlignment(SwingConstants.LEFT);
        nombrePa2.setBackground(Color.white);
        nombrePa2.setOpaque(true);

        apellidoPa2 = new JLabel("Asturias");
        apellidoPa2.setBounds(376, 380, 130, 32);
        apellidoPa2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        apellidoPa2.setHorizontalAlignment(SwingConstants.LEFT);
        apellidoPa2.setBackground(Color.white);
        apellidoPa2.setOpaque(true);

        edadPa2 = new JLabel("20");
        edadPa2.setBounds(514, 380, 62, 32);
        edadPa2.setFont(new Font("Rockwell", Font.BOLD, 20));
        edadPa2.setHorizontalAlignment(SwingConstants.LEFT);
        edadPa2.setBackground(Color.white);
        edadPa2.setOpaque(true);

        sexPaciente2 = new JLabel("F");
        sexPaciente2.setBounds(583, 380, 54, 32);
        sexPaciente2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        sexPaciente2.setHorizontalAlignment(SwingConstants.LEFT);
        sexPaciente2.setBackground(Color.white);
        sexPaciente2.setOpaque(true);

        seguimP2 = new JLabel("texto");
        seguimP2.setBounds(644, 380, 250, 32);
        seguimP2.setFont(new Font("Rockwell", Font.BOLD, 20));
        seguimP2.setHorizontalAlignment(SwingConstants.LEFT);
        seguimP2.setBackground(Color.white);
        seguimP2.setOpaque(true);

        planTratP2 = new JLabel("texto");
        planTratP2.setBounds(901, 380, 250, 32);
        planTratP2.setFont(new Font("Rockwell", Font.BOLD, 20));
        planTratP2.setHorizontalAlignment(SwingConstants.LEFT);
        planTratP2.setBackground(Color.white);
        planTratP2.setOpaque(true);

        notPa2 = new JLabel("texto");
        notPa2.setBounds(1158, 380, 250, 32);
        notPa2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        notPa2.setHorizontalAlignment(SwingConstants.LEFT);
        notPa2.setBackground(Color.white);
        notPa2.setOpaque(true);

        cambTratPa2 = new JLabel("texto");
        cambTratPa2.setBounds(1415, 380, 300, 32);
        cambTratPa2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cambTratPa2.setHorizontalAlignment(SwingConstants.LEFT);
        cambTratPa2.setBackground(Color.white);
        cambTratPa2.setOpaque(true);

        // PACIENTE 3

        codPa3 = new JLabel("1011");
        codPa3.setBounds(60, 425, 170, 32);
        codPa3.setFont(new Font("Rockwell", Font.BOLD, 20));
        codPa3.setHorizontalAlignment(SwingConstants.LEFT);
        codPa3.setBackground(Color.white);
        codPa3.setOpaque(true);

        nombrePa3 = new JLabel("Zafiro");
        nombrePa3.setBounds(238, 425, 130, 32);
        nombrePa3.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        nombrePa3.setHorizontalAlignment(SwingConstants.LEFT);
        nombrePa3.setBackground(Color.white);
        nombrePa3.setOpaque(true);

        apellidoPa3 = new JLabel("Melendez");
        apellidoPa3.setBounds(376, 425, 130, 32);
        apellidoPa3.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        apellidoPa3.setHorizontalAlignment(SwingConstants.LEFT);
        apellidoPa3.setBackground(Color.white);
        apellidoPa3.setOpaque(true);


        edadPa3 = new JLabel("30");
        edadPa3.setBounds(514, 425, 62, 32);
        edadPa3.setFont(new Font("Rockwell", Font.BOLD, 20));
        edadPa3.setHorizontalAlignment(SwingConstants.LEFT);
        edadPa3.setBackground(Color.white);
        edadPa3.setOpaque(true);

        sexPaciente3 = new JLabel("F");
        sexPaciente3.setBounds(583, 425, 54, 32);
        sexPaciente3.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        sexPaciente3.setHorizontalAlignment(SwingConstants.LEFT);
        sexPaciente3.setBackground(Color.white);
        sexPaciente3.setOpaque(true);

        seguimP3 = new JLabel("texto");
        seguimP3.setBounds(644, 425, 250, 32);
        seguimP3.setFont(new Font("Rockwell", Font.BOLD, 20));
        seguimP3.setHorizontalAlignment(SwingConstants.LEFT);
        seguimP3.setBackground(Color.white);
        seguimP3.setOpaque(true);

        planTratP3 = new JLabel("texto");
        planTratP3.setBounds(901, 425, 250, 32);
        planTratP3.setFont(new Font("Rockwell", Font.BOLD, 20));
        planTratP3.setHorizontalAlignment(SwingConstants.LEFT);
        planTratP3.setBackground(Color.white);
        planTratP3.setOpaque(true);

        notPa3 = new JLabel("texto");
        notPa3.setBounds(1158, 425, 250, 32);
        notPa3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        notPa3.setHorizontalAlignment(SwingConstants.LEFT);
        notPa3.setBackground(Color.white);
        notPa3.setOpaque(true);

        cambTratPa3 = new JLabel("texto");
        cambTratPa3.setBounds(1415, 425, 300, 32);
        cambTratPa3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cambTratPa3.setHorizontalAlignment(SwingConstants.LEFT);
        cambTratPa3.setBackground(Color.white);
        cambTratPa3.setOpaque(true);

        // PACIENTE 4

        codPa4 = new JLabel("1213");
        codPa4.setBounds(60, 470, 170, 32);
        codPa4.setFont(new Font("Rockwell", Font.BOLD, 20));
        codPa4.setHorizontalAlignment(SwingConstants.LEFT);
        codPa4.setBackground(Color.white);
        codPa4.setOpaque(true);

        nombrePa4 = new JLabel("Enrique");
        nombrePa4.setBounds(238, 470, 130, 32);
        nombrePa4.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        nombrePa4.setHorizontalAlignment(SwingConstants.LEFT);
        nombrePa4.setBackground(Color.white);
        nombrePa4.setOpaque(true);

        apellidoPa4 = new JLabel("Trujillo");
        apellidoPa4.setBounds(376, 470, 130, 32);
        apellidoPa4.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        apellidoPa4.setHorizontalAlignment(SwingConstants.LEFT);
        apellidoPa4.setBackground(Color.white);
        apellidoPa4.setOpaque(true);

        edadPa4 = new JLabel("25");
        edadPa4.setBounds(514, 470, 62, 32);
        edadPa4.setFont(new Font("Rockwell", Font.BOLD, 20));
        edadPa4.setHorizontalAlignment(SwingConstants.LEFT);
        edadPa4.setBackground(Color.white);
        edadPa4.setOpaque(true);

        sexPaciente4 = new JLabel("M");
        sexPaciente4.setBounds(583, 470, 54, 32);
        sexPaciente4.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        sexPaciente4.setHorizontalAlignment(SwingConstants.LEFT);
        sexPaciente4.setBackground(Color.white);
        sexPaciente4.setOpaque(true);

        seguimP4 = new JLabel("texto");
        seguimP4.setBounds(644, 470, 250, 32);
        seguimP4.setFont(new Font("Rockwell", Font.BOLD, 20));
        seguimP4.setHorizontalAlignment(SwingConstants.LEFT);
        seguimP4.setBackground(Color.white);
        seguimP4.setOpaque(true);

        planTratP4 = new JLabel("texto");
        planTratP4.setBounds(901, 470, 250, 32);
        planTratP4.setFont(new Font("Rockwell", Font.BOLD, 20));
        planTratP4.setHorizontalAlignment(SwingConstants.LEFT);
        planTratP4.setBackground(Color.white);
        planTratP4.setOpaque(true);

        notPa4 = new JLabel("texto");
        notPa4.setBounds(1158, 470, 250, 32);
        notPa4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        notPa4.setHorizontalAlignment(SwingConstants.LEFT);
        notPa4.setBackground(Color.white);
        notPa4.setOpaque(true);

        cambTratPa4 = new JLabel("texto");
        cambTratPa4.setBounds(1415, 470, 300, 32);
        cambTratPa4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cambTratPa4.setHorizontalAlignment(SwingConstants.LEFT);
        cambTratPa4.setBackground(Color.white);
        cambTratPa4.setOpaque(true);

        // PACIENTE 5

        codPa5 = new JLabel("1314");
        codPa5.setBounds(60, 515, 170, 32);
        codPa5.setFont(new Font("Rockwell", Font.BOLD, 20));
        codPa5.setHorizontalAlignment(SwingConstants.LEFT);
        codPa5.setBackground(Color.white);
        codPa5.setOpaque(true);

        nombrePa5 = new JLabel("Tadeo");
        nombrePa5.setBounds(238, 515, 130, 32);
        nombrePa5.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        nombrePa5.setHorizontalAlignment(SwingConstants.LEFT);
        nombrePa5.setBackground(Color.white);
        nombrePa5.setOpaque(true);

        apellidoPa5 = new JLabel("Castañeda");
        apellidoPa5.setBounds(376, 515, 130, 32);
        apellidoPa5.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        apellidoPa5.setHorizontalAlignment(SwingConstants.LEFT);
        apellidoPa5.setBackground(Color.white);
        apellidoPa5.setOpaque(true);

        edadPa5 = new JLabel("25");
        edadPa5.setBounds(514, 515, 62, 32);
        edadPa5.setFont(new Font("Rockwell", Font.BOLD, 20));
        edadPa5.setHorizontalAlignment(SwingConstants.LEFT);
        edadPa5.setBackground(Color.white);
        edadPa5.setOpaque(true);

        sexPaciente5 = new JLabel("M");
        sexPaciente5.setBounds(583, 515, 54, 32);
        sexPaciente5.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        sexPaciente5.setHorizontalAlignment(SwingConstants.LEFT);
        sexPaciente5.setBackground(Color.white);
        sexPaciente5.setOpaque(true);

        seguimP5 = new JLabel("texto");
        seguimP5.setBounds(644, 515, 250, 32);
        seguimP5.setFont(new Font("Rockwell", Font.BOLD, 20));
        seguimP5.setHorizontalAlignment(SwingConstants.LEFT);
        seguimP5.setBackground(Color.white);
        seguimP5.setOpaque(true);

        planTratP5 = new JLabel("texto");
        planTratP5.setBounds(901, 515, 250, 32);
        planTratP5.setFont(new Font("Rockwell", Font.BOLD, 20));
        planTratP5.setHorizontalAlignment(SwingConstants.LEFT);
        planTratP5.setBackground(Color.white);
        planTratP5.setOpaque(true);

        notPa5 = new JLabel("texto");
        notPa5.setBounds(1158, 515, 250, 32);
        notPa5.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        notPa5.setHorizontalAlignment(SwingConstants.LEFT);
        notPa5.setBackground(Color.white);
        notPa5.setOpaque(true);

        cambTratPa5 = new JLabel("texto");
        cambTratPa5.setBounds(1415, 515, 300, 32);
        cambTratPa5.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cambTratPa5.setHorizontalAlignment(SwingConstants.LEFT);
        cambTratPa5.setBackground(Color.white);
        cambTratPa5.setOpaque(true);

        // AGREGACIONES AL BODY

        panelBody.add(seguimientoPaci);
        panelBody.add(titNotas);
        panelBody.add(titCambiosTrat);
        panelBody.add(titSexo);
        panelBody.add(titEdad);
        panelBody.add(titApellido);
        panelBody.add(titDatNombre);
        panelBody.add(titCodigoPa);

        panelBody.add(codPa5);
        panelBody.add(codPa4);
        panelBody.add(codPa3);
        panelBody.add(codPa2);
        panelBody.add(codPa1);
        panelBody.add(planTratP5);
        panelBody.add(planTratP4);
        panelBody.add(planTratP3);
        panelBody.add(planTratP2);
        panelBody.add(planTratP1);
        panelBody.add(seguimP5);
        panelBody.add(seguimP4);
        panelBody.add(seguimP3);
        panelBody.add(seguimP2);
        panelBody.add(sexPaciente5);
        panelBody.add(sexPaciente4);
        panelBody.add(sexPaciente3);
        panelBody.add(sexPaciente2);
        panelBody.add(edadPa5);
        panelBody.add(edadPa4);
        panelBody.add(edadPa3);
        panelBody.add(edadPa2);
        panelBody.add(seguimP1);
        panelBody.add(sexPaciente1);
        panelBody.add(edadPa1);

        panelBody.add(notPa5);
        panelBody.add(apellidoPa5);
        panelBody.add(cambTratPa5);
        panelBody.add(nombrePa5);
        panelBody.add(notPa4);
        panelBody.add(apellidoPa4);
        panelBody.add(cambTratPa4);
        panelBody.add(nombrePa4);
        panelBody.add(notPa3);
        panelBody.add(apellidoPa3);
        panelBody.add(cambTratPa3);
        panelBody.add(nombrePa3);
        panelBody.add(notPa2);
        panelBody.add(apellidoPa2);
        panelBody.add(cambTratPa2);
        panelBody.add(nombrePa2);

        panelBody.add(cambTratPa1);

        panelBody.add(notPa1);
        panelBody.add(apellidoPa1);
        panelBody.add(nombrePa1);
        panelBody.add(titPlanTrat);
        panelBody.add(titDatosPaciBody);

        // Agregaciones en el Header
        panelHeader.add(titPacientesHeader);
        panelHeader.add(titHospHeader);

        this.add(panelHeader);
        this.add(panelBody);
        this.setVisible(true);

    }
}
