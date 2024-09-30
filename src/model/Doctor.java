package model;

import javax.swing.*;
import java.awt.*;

public class Doctor {
    private String nombre;
    private String apellido;
    private String especialidad;
    private int numeroLcencia;
    private String password;
    private String email;
    private String usuario;


    //    public JLabel
    public Doctor(){
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.numeroLcencia = numeroLcencia;
        this.email = email;
        this.password = password;
        this.usuario = usuario;
    }

    public Doctor(String s, String aLmendro, String pediatra, int i, String patitas123, String mail, String almendro) {
    }

    public static void ventanaDoctor() {

        JPanel panelHeader, panelBody;
        JLabel titHospHeader, titDocHeader, titDatosDocBody;
        JLabel datNombreBody, datNombreBody2, datNombreBody3, datNombreBody4 , titDatNombre, titDatNombre2, titDatNombre3, titDatNombre4, datUserDoc;
        JLabel datSex, datCodigoDoc, datEdad, datEspecialidad, datNumeroCol, datEmail, datSexIng, datCodDocIng, datEdadIng, datEspIng, datNumColIng, datEmailIng, datUserDocIng;
        JLabel titPacientesVD, titEnfermerasVD;

        JButton btnIngPacientes, btnIngEnfermeras;

        JFrame ventanaDoc = new JFrame();
        ventanaDoc.setTitle("Doctores");
        ventanaDoc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaDoc.setSize(1800,1000);
        ventanaDoc.setLocationRelativeTo(null);

        // HEADER

        panelHeader = new JPanel();
        panelHeader.setBackground(Color.lightGray);
        panelHeader.setBounds(0,0,1800,185);
        panelHeader.setLayout(null);

        titHospHeader = new JLabel("Hospital XXX");
        titHospHeader.setBounds(620,45, 600,42);
        titHospHeader.setFont(new Font("Goudy Stout", Font.BOLD, 37));
        titHospHeader.setHorizontalAlignment(SwingConstants.CENTER);
        titHospHeader.setOpaque(true);


        titDocHeader = new JLabel("Doctores");
        titDocHeader.setBounds(620,110, 600,42);
        titDocHeader.setFont(new Font("Goudy Stout", Font.BOLD, 25));
        titDocHeader.setHorizontalAlignment(SwingConstants.CENTER);
        titDocHeader.setOpaque(true);


        // BODY-------------------------------

        panelBody = new JPanel();
        panelBody.setBounds(0,0,1800,800);
        panelBody.setLayout(null);

        // etiquetas

        titDatosDocBody = new JLabel("Datos del Doctor:");
        titDatosDocBody.setBounds(100 ,225, 300, 32);
        titDatosDocBody.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        titDatosDocBody.setHorizontalAlignment(SwingConstants.LEFT);
        titDatosDocBody.setOpaque(true);

        // Datos que van en la cajita del Nombre
        datNombreBody = new JLabel("Aaron");
        datNombreBody.setBounds(115,290,220,32);
        datNombreBody.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        datNombreBody.setHorizontalAlignment(SwingConstants.LEFT);
        datNombreBody.setBackground(Color.white);
        datNombreBody.setOpaque(true);

        datNombreBody2 = new JLabel("Almendro");
        datNombreBody2.setBounds(360,290,220,32);
        datNombreBody2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        datNombreBody2.setHorizontalAlignment(SwingConstants.LEFT);
        datNombreBody2.setBackground(Color.white);
        datNombreBody2.setOpaque(true);

        datNombreBody3 = new JLabel("Alvarez");
        datNombreBody3.setBounds(605,290,220,32);
        datNombreBody3.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        datNombreBody3.setHorizontalAlignment(SwingConstants.LEFT);
        datNombreBody3.setBackground(Color.white);
        datNombreBody3.setOpaque(true);

        datNombreBody4 = new JLabel("Gutierrez");
        datNombreBody4.setBounds(850,290,220,32);
        datNombreBody4.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        datNombreBody4.setHorizontalAlignment(SwingConstants.LEFT);
        datNombreBody4.setBackground(Color.white);
        datNombreBody4.setOpaque(true);

        // titulos de los datos del nombre
        titDatNombre = new JLabel("Nombre");
        titDatNombre.setBounds(115,335,220,32);
        titDatNombre.setFont(new Font("Rockwell", Font.BOLD, 20));
        titDatNombre.setHorizontalAlignment(SwingConstants.LEFT);
        titDatNombre.setBackground(Color.LIGHT_GRAY);
        titDatNombre.setOpaque(true);

        titDatNombre2 = new JLabel("Segundo Nombre");
        titDatNombre2.setBounds(360,335,220,32);
        titDatNombre2.setFont(new Font("Rockwell", Font.BOLD, 20));
        titDatNombre2.setHorizontalAlignment(SwingConstants.LEFT);
        titDatNombre2.setBackground(Color.LIGHT_GRAY);
        titDatNombre2.setOpaque(true);

        titDatNombre3 = new JLabel("Apellido");
        titDatNombre3.setBounds(605,335,220,32);
        titDatNombre3.setFont(new Font("Rockwell", Font.BOLD, 20));
        titDatNombre3.setHorizontalAlignment(SwingConstants.LEFT);
        titDatNombre3.setBackground(Color.LIGHT_GRAY);
        titDatNombre3.setOpaque(true);

        titDatNombre4 = new JLabel("Segundo Apellido");
        titDatNombre4.setBounds(850,335,220,32);
        titDatNombre4.setFont(new Font("Rockwell", Font.BOLD, 20));
        titDatNombre4.setHorizontalAlignment(SwingConstants.LEFT);
        titDatNombre4.setBackground(Color.LIGHT_GRAY);
        titDatNombre4.setOpaque(true);

        // Datos que van despues del dato del nombre

        datSex = new JLabel("Sexo:");
        datSex.setBounds(115,406,215,32);
        datSex.setFont(new Font("Rockwell", Font.BOLD, 23));
        datSex.setHorizontalAlignment(SwingConstants.LEFT);
        datSex.setBackground(Color.LIGHT_GRAY);
        datSex.setOpaque(true);

        datCodigoDoc = new JLabel("Codigo Doctor:");
        datCodigoDoc.setBounds(115,445,215,32);
        datCodigoDoc.setFont(new Font("Rockwell", Font.BOLD, 23));
        datCodigoDoc.setHorizontalAlignment(SwingConstants.LEFT);
        datCodigoDoc.setBackground(Color.LIGHT_GRAY);
        datCodigoDoc.setOpaque(true);

        datEdad = new JLabel("Edad:");
        datEdad.setBounds(115,484,215,32);
        datEdad.setFont(new Font("Rockwell", Font.BOLD, 23));
        datEdad.setHorizontalAlignment(SwingConstants.LEFT);
        datEdad.setBackground(Color.LIGHT_GRAY);
        datEdad.setOpaque(true);

        datEspecialidad = new JLabel("Especialidad:");
        datEspecialidad.setBounds(115,523,215,32);
        datEspecialidad.setFont(new Font("Rockwell", Font.BOLD, 23));
        datEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
        datEspecialidad.setBackground(Color.LIGHT_GRAY);
        datEspecialidad.setOpaque(true);

        datNumeroCol = new JLabel("Numero Colegiado:");
        datNumeroCol.setBounds(115,562,230,32);
        datNumeroCol.setFont(new Font("Rockwell", Font.BOLD, 23));
        datNumeroCol.setHorizontalAlignment(SwingConstants.LEFT);
        datNumeroCol.setBackground(Color.LIGHT_GRAY);
        datNumeroCol.setOpaque(true);

        datEmail = new JLabel("Email:");
        datEmail.setBounds(645,484,110,32);
        datEmail.setFont(new Font("Rockwell", Font.BOLD, 23));
        datEmail.setHorizontalAlignment(SwingConstants.LEFT);
        datEmail.setBackground(Color.LIGHT_GRAY);
        datEmail.setOpaque(true);

        datUserDoc = new JLabel("User:");
        datUserDoc.setBounds(1470,200,80,32);
        datUserDoc.setFont(new Font("Rockwell", Font.BOLD, 23));
        datUserDoc.setHorizontalAlignment(SwingConstants.LEFT);
        datUserDoc.setBackground(Color.LIGHT_GRAY);
        datUserDoc.setOpaque(true);

        datNumeroCol = new JLabel("Numero Colegiado:");
        datNumeroCol.setBounds(115,562,230,32);
        datNumeroCol.setFont(new Font("Rockwell", Font.BOLD, 23));
        datNumeroCol.setHorizontalAlignment(SwingConstants.LEFT);
        datNumeroCol.setBackground(Color.LIGHT_GRAY);
        datNumeroCol.setOpaque(true);


        datSexIng = new JLabel("texto");
        datSexIng.setBounds(360,406,215,32);
        datSexIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datSexIng.setHorizontalAlignment(SwingConstants.LEFT);
        datSexIng.setBackground(Color.white);
        datSexIng.setOpaque(true);

        datCodDocIng = new JLabel("texto");
        datCodDocIng.setBounds(360,445,215,32);
        datCodDocIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datCodDocIng.setHorizontalAlignment(SwingConstants.LEFT);
        datCodDocIng.setBackground(Color.white);
        datCodDocIng.setOpaque(true);

        datEdadIng = new JLabel("texto");
        datEdadIng.setBounds(360,484,215,32);
        datEdadIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datEdadIng.setHorizontalAlignment(SwingConstants.LEFT);
        datEdadIng.setBackground(Color.white);
        datEdadIng.setOpaque(true);

        datEspIng = new JLabel("texto");
        datEspIng.setBounds(360,523,215,32);
        datEspIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datEspIng.setHorizontalAlignment(SwingConstants.LEFT);
        datEspIng.setBackground(Color.white);
        datEspIng.setOpaque(true);

        datNumColIng = new JLabel("texto");
        datNumColIng.setBounds(360,562,215,32);
        datNumColIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datNumColIng.setHorizontalAlignment(SwingConstants.LEFT);
        datNumColIng.setBackground(Color.white);
        datNumColIng.setOpaque(true);

        datEmailIng = new JLabel("texto");
        datEmailIng.setBounds(770,484,215,32);
        datEmailIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datEmailIng.setHorizontalAlignment(SwingConstants.LEFT);
//        datEmailIng.setBackground(Color.white);
        datEmailIng.setOpaque(true);

        datUserDocIng = new JLabel("texto");
        datUserDocIng.setBounds(1470,250,235,40);
        datUserDocIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datUserDocIng.setHorizontalAlignment(SwingConstants.LEFT);
        datUserDocIng.setBackground(Color.white);
        datUserDocIng.setOpaque(true);

        //BOTONES Y TITULOS

        titPacientesVD = new JLabel("Pacientes:");
        titPacientesVD.setBounds(219 ,650, 300, 32);
        titPacientesVD.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        titPacientesVD.setHorizontalAlignment(SwingConstants.LEFT);
//        titPacientesVD.setBackground(Color.CYAN);
        titPacientesVD.setOpaque(true);

        titEnfermerasVD = new JLabel("Enfermeras Asignadas:");
        titEnfermerasVD.setBounds(960 ,650, 450, 32);
        titEnfermerasVD.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        titEnfermerasVD.setHorizontalAlignment(SwingConstants.LEFT);
//        titEnfermerasVD.setBackground(Color.CYAN);
        titEnfermerasVD.setOpaque(true);

        //BOTONES

        btnIngPacientes = new JButton("Detalle");
        btnIngPacientes.setBounds(385,720, 200,80);
        btnIngPacientes.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        btnIngEnfermeras = new JButton("Detalle");
        btnIngEnfermeras.setBounds(1180,720, 200,80);
        btnIngEnfermeras.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        // Accion del boton
        btnIngPacientes.addActionListener(e -> {
            Pacientes pacientes = new Pacientes();
        });

        btnIngEnfermeras.addActionListener(e -> {
            Enfermera.ventanaEnfermeras();
        });


        // Agregaciones en el Body

        panelBody.add(btnIngEnfermeras);
        panelBody.add(btnIngPacientes);
        panelBody.add(titEnfermerasVD);
        panelBody.add(titPacientesVD);

        panelBody.add(datUserDocIng);
        panelBody.add(datEmailIng);
        panelBody.add(datNumColIng);
        panelBody.add(datEspIng);
        panelBody.add(datEdadIng);
        panelBody.add(datCodDocIng);
        panelBody.add(datSexIng);

        panelBody.add(datUserDoc);
        panelBody.add(datEmail);
        panelBody.add(datNumeroCol);
        panelBody.add(datEspecialidad);
        panelBody.add(datEdad);
        panelBody.add(datCodigoDoc);
        panelBody.add(datSex);

        panelBody.add(titDatNombre4);
        panelBody.add(titDatNombre3);
        panelBody.add(titDatNombre3);
        panelBody.add(titDatNombre2);
        panelBody.add(titDatNombre);

        panelBody.add(datNombreBody4);
        panelBody.add(datNombreBody3);
        panelBody.add(datNombreBody2);
        panelBody.add(datNombreBody);
        panelBody.add(titDatosDocBody);

        // Agregaciones en el Header
        panelHeader.add(titDocHeader);
        panelHeader.add(titHospHeader);

        ventanaDoc.add(panelHeader);
        ventanaDoc.add(panelBody);
        ventanaDoc.setVisible(true);
    }

    //GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getNumeroLcencia() {
        return numeroLcencia;
    }

    public String getPasswordD() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsuario() {
        return usuario;
    }

    //SETTERS


    public void setNombre(String nombreD) {
        this.nombre = nombreD;
    }

    public void setEspecialidad(String especialidadD) {
        this.especialidad = especialidadD;
    }

    public void setNumeroLcencia(int numeroLcencia) {
        this.numeroLcencia = numeroLcencia;
    }

    public void setPassword(String passwordD) {
        this.password = passwordD;
    }

    public void setEmail(String emailD) {
        this.email = emailD;
    }
}


