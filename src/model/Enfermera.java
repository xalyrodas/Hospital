package model;
import javax.swing.*;
import java.awt.*;

public class Enfermera extends JFrame {
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String segundoApellido;
    private int codigoPaciente;
    private int codigoDoctor;

    public Enfermera(String nombre, String segundoNombre, String apellido, String segundoApellido, int codigoPaciente, int codigoDoctor){
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.codigoPaciente = codigoPaciente;
        this.codigoDoctor = codigoDoctor;
    }

    public static void ventanaEnfermeras(){

        JPanel panelHeader, panelBody;
        JLabel titHospHeader, titPacientesHeader, titEnfermera1, titEnfermera2, nomEnf1, nomEnf2, nom2Enf1, nom2Enf2, apEnf1, apEnf2, ap2Enf1, ap2Enf2, codDocE1, codDocE2, cajNomE1,cajNomE2, caj2NomE1,caj2NomE2, cajApE1, cajApE2, cajAp2E1, cajAp2E2, cajCodPE1, cajCodPE2, cajCodDocE1, cajCodDocE2, codPE1, codPE2;


        JFrame ventanaEnf = new JFrame();
        ventanaEnf.setTitle("ENFERMERAS ASIGNADAS");
        ventanaEnf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaEnf.setSize(1800,1000);
        ventanaEnf.setLocationRelativeTo(null);

        panelHeader = new JPanel();
        panelHeader.setBackground(Color.lightGray);
        panelHeader.setBounds(0, 0, 1800, 185);
        panelHeader.setLayout(null);

        titHospHeader = new JLabel("Hospital XXX");
        titHospHeader.setBounds(620, 45, 600, 42);
        titHospHeader.setFont(new Font("Goudy Stout", Font.BOLD, 37));
        titHospHeader.setHorizontalAlignment(SwingConstants.CENTER);
        titHospHeader.setOpaque(true);

        titPacientesHeader = new JLabel("ENFERMERAS ASIGNADAS");
        titPacientesHeader.setBounds(596, 110, 650, 42);
        titPacientesHeader.setFont(new Font("Goudy Stout", Font.BOLD, 25));
        titPacientesHeader.setHorizontalAlignment(SwingConstants.CENTER);
        titPacientesHeader.setOpaque(true);

        panelBody = new JPanel();
        panelBody.setBounds(0,0,1800,800);
        panelBody.setLayout(null);

        // ENFERMERA 1

        titEnfermera1 = new JLabel("Enfermeras Asignadas: ");
        titEnfermera1.setBounds(60, 225, 900, 32);
        titEnfermera1.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        titEnfermera1.setHorizontalAlignment(SwingConstants.LEFT);
        titEnfermera1.setOpaque(true);

        // DATOS DE LOS PACIENTES

        codPE1 = new JLabel("Codigo Paciente:");
        codPE1.setBounds(60, 300, 175, 32);
        codPE1.setFont(new Font("Rockwell", Font.BOLD, 20));
        codPE1.setHorizontalAlignment(SwingConstants.LEFT);
        codPE1.setBackground(Color.LIGHT_GRAY);
        codPE1.setOpaque(true);

        nomEnf1 = new JLabel("Nombre");
        nomEnf1.setBounds(60, 375, 130, 32);
        nomEnf1.setFont(new Font("Rockwell", Font.BOLD, 20));
        nomEnf1.setHorizontalAlignment(SwingConstants.LEFT);
        nomEnf1.setBackground(Color.LIGHT_GRAY);
        nomEnf1.setOpaque(true);

        nom2Enf1 = new JLabel("Segundo Nombre");
        nom2Enf1.setBounds(208, 375, 182, 32);
        nom2Enf1.setFont(new Font("Rockwell", Font.BOLD, 20));
        nom2Enf1.setHorizontalAlignment(SwingConstants.LEFT);
        nom2Enf1.setBackground(Color.LIGHT_GRAY);
        nom2Enf1.setOpaque(true);

        apEnf1 = new JLabel("Apellido");
        apEnf1.setBounds(408, 375, 130, 32);
        apEnf1.setFont(new Font("Rockwell", Font.BOLD, 20));
        apEnf1.setHorizontalAlignment(SwingConstants.LEFT);
        apEnf1.setBackground(Color.LIGHT_GRAY);
        apEnf1.setOpaque(true);

        ap2Enf1 = new JLabel("Segundo Apellido");
        ap2Enf1.setBounds(555, 375, 182, 32);
        ap2Enf1.setFont(new Font("Rockwell", Font.BOLD, 20));
        ap2Enf1.setHorizontalAlignment(SwingConstants.LEFT);
        ap2Enf1.setBackground(Color.LIGHT_GRAY);
        ap2Enf1.setOpaque(true);

        codDocE1 = new JLabel("Codigo Doctor:");
        codDocE1.setBounds(60,495,158,32);
        codDocE1.setFont(new Font("Rockwell", Font.BOLD, 20));
        codDocE1.setHorizontalAlignment(SwingConstants.LEFT);
        codDocE1.setBackground(Color.LIGHT_GRAY);
        codDocE1.setOpaque(true);

        cajCodDocE1 = new JLabel("texto");
        cajCodDocE1.setBounds(225,495,220,32);
        cajCodDocE1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajCodDocE1.setHorizontalAlignment(SwingConstants.LEFT);
        cajCodDocE1.setBackground(Color.white);
        cajCodDocE1.setOpaque(true);



        cajCodPE1 = new JLabel("texto");
        cajCodPE1.setBounds(245, 300, 220, 32);
        cajCodPE1.setFont(new Font("Rockwell", Font.BOLD, 20));
        cajCodPE1.setHorizontalAlignment(SwingConstants.LEFT);
        cajCodPE1.setBackground(Color.white);
        cajCodPE1.setOpaque(true);

        cajNomE1 = new JLabel("texto");
        cajNomE1.setBounds(60,420,130,32);
        cajNomE1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajNomE1.setHorizontalAlignment(SwingConstants.LEFT);
        cajNomE1.setBackground(Color.white);
        cajNomE1.setOpaque(true);

        caj2NomE1 = new JLabel("texto");
        caj2NomE1.setBounds(208, 420, 182, 32);
        caj2NomE1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        caj2NomE1.setHorizontalAlignment(SwingConstants.LEFT);
        caj2NomE1.setBackground(Color.white);
        caj2NomE1.setOpaque(true);

        cajApE1 = new JLabel("texto");
        cajApE1.setBounds(408, 420, 130, 32);
        cajApE1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajApE1.setHorizontalAlignment(SwingConstants.LEFT);
        cajApE1.setBackground(Color.white);
        cajApE1.setOpaque(true);

        cajAp2E1 = new JLabel("texto");
        cajAp2E1.setBounds(555, 420, 182, 32);
        cajAp2E1.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajAp2E1.setHorizontalAlignment(SwingConstants.LEFT);
        cajAp2E1.setBackground(Color.white);
        cajAp2E1.setOpaque(true);


        // ENFERMERA 2

        titEnfermera2 = new JLabel("Enfermeras Asignadas: ");
        titEnfermera2.setBounds(900, 225, 900, 32);
        titEnfermera2.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        titEnfermera2.setHorizontalAlignment(SwingConstants.LEFT);
        titEnfermera2.setOpaque(true);

        // DATOS DE LOS PACIENTES

        codPE2 = new JLabel("Codigo Paciente:");
        codPE2.setBounds(900, 300, 175, 32);
        codPE2.setFont(new Font("Rockwell", Font.BOLD, 20));
        codPE2.setHorizontalAlignment(SwingConstants.LEFT);
        codPE2.setBackground(Color.LIGHT_GRAY);
        codPE2.setOpaque(true);

        nomEnf2 = new JLabel("Nombre");
        nomEnf2.setBounds(900, 375, 130, 32);
        nomEnf2.setFont(new Font("Rockwell", Font.BOLD, 20));
        nomEnf2.setHorizontalAlignment(SwingConstants.LEFT);
        nomEnf2.setBackground(Color.LIGHT_GRAY);
        nomEnf2.setOpaque(true);

        nom2Enf2 = new JLabel("Segundo Nombre");
        nom2Enf2.setBounds(1048, 375, 182, 32);
        nom2Enf2.setFont(new Font("Rockwell", Font.BOLD, 20));
        nom2Enf2.setHorizontalAlignment(SwingConstants.LEFT);
        nom2Enf2.setBackground(Color.LIGHT_GRAY);
        nom2Enf2.setOpaque(true);

        apEnf2 = new JLabel("Apellido");
        apEnf2.setBounds(1248, 375, 130, 32);
        apEnf2.setFont(new Font("Rockwell", Font.BOLD, 20));
        apEnf2.setHorizontalAlignment(SwingConstants.LEFT);
        apEnf2.setBackground(Color.LIGHT_GRAY);
        apEnf2.setOpaque(true);

        ap2Enf2 = new JLabel("Segundo Apellido");
        ap2Enf2.setBounds(1395, 375, 182, 32);
        ap2Enf2.setFont(new Font("Rockwell", Font.BOLD, 20));
        ap2Enf2.setHorizontalAlignment(SwingConstants.LEFT);
        ap2Enf2.setBackground(Color.LIGHT_GRAY);
        ap2Enf2.setOpaque(true);

        codDocE2 = new JLabel("Codigo Doctor:");
        codDocE2.setBounds(900,495,158,32);
        codDocE2.setFont(new Font("Rockwell", Font.BOLD, 20));
        codDocE2.setHorizontalAlignment(SwingConstants.LEFT);
        codDocE2.setBackground(Color.LIGHT_GRAY);
        codDocE2.setOpaque(true);

        cajCodDocE2 = new JLabel("texto");
        cajCodDocE2.setBounds(1070,495,220,32);
        cajCodDocE2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajCodDocE2.setHorizontalAlignment(SwingConstants.LEFT);
        cajCodDocE2.setBackground(Color.white);
        cajCodDocE2.setOpaque(true);



        cajCodPE2 = new JLabel("texto");
        cajCodPE2.setBounds(1085, 300, 220, 32);
        cajCodPE2.setFont(new Font("Rockwell", Font.BOLD, 20));
        cajCodPE2.setHorizontalAlignment(SwingConstants.LEFT);
        cajCodPE2.setBackground(Color.white);
        cajCodPE2.setOpaque(true);

        cajNomE2 = new JLabel("texto");
        cajNomE2.setBounds(900,420,130,32);
        cajNomE2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajNomE2.setHorizontalAlignment(SwingConstants.LEFT);
        cajNomE2.setBackground(Color.white);
        cajNomE2.setOpaque(true);

        caj2NomE2 = new JLabel("texto");
        caj2NomE2.setBounds(1048, 420, 182, 32);
        caj2NomE2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        caj2NomE2.setHorizontalAlignment(SwingConstants.LEFT);
        caj2NomE2.setBackground(Color.white);
        caj2NomE2.setOpaque(true);

        cajApE2 = new JLabel("texto");
        cajApE2.setBounds(1248, 420, 130, 32);
        cajApE2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajApE2.setHorizontalAlignment(SwingConstants.LEFT);
        cajApE2.setBackground(Color.white);
        cajApE2.setOpaque(true);

        cajAp2E2 = new JLabel("texto");
        cajAp2E2.setBounds(1395, 420, 182, 32);
        cajAp2E2.setFont(new Font("Bahnschrift", Font.BOLD, 23));
        cajAp2E2.setHorizontalAlignment(SwingConstants.LEFT);
        cajAp2E2.setBackground(Color.white);
        cajAp2E2.setOpaque(true);



        //AGREGACIONES

        panelBody.add(cajCodDocE2);
        panelBody.add(codDocE2);
        panelBody.add(cajAp2E2);
        panelBody.add(ap2Enf2);
        panelBody.add(cajApE2);
        panelBody.add(apEnf2);
        panelBody.add(caj2NomE2);
        panelBody.add(nom2Enf2);
        panelBody.add(nomEnf2);
        panelBody.add(cajNomE2);
        panelBody.add(cajCodPE2);
        panelBody.add(codPE2);
        panelBody.add(titEnfermera2);

        panelBody.add(cajCodDocE1);
        panelBody.add(codDocE1);
        panelBody.add(cajAp2E1);
        panelBody.add(ap2Enf1);
        panelBody.add(cajApE1);
        panelBody.add(apEnf1);
        panelBody.add(caj2NomE1);
        panelBody.add(nom2Enf1);
        panelBody.add(nomEnf1);
        panelBody.add(cajNomE1);
        panelBody.add(cajCodPE1);
        panelBody.add(codPE1);
        panelBody.add(titEnfermera1);

        panelHeader.add(titPacientesHeader);
        panelHeader.add(titHospHeader);

        ventanaEnf.add(panelHeader);
        ventanaEnf.add(panelBody);
        ventanaEnf.setVisible(true);

    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public int getCodigoDoctor() {
        return codigoDoctor;
    }

    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void setCodigoDoctor(int codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }
}

