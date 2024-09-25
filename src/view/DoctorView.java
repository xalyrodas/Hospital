package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import model.Pacientes;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    public DoctorView() {
        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el panel de encabezado
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
        userPanel.setBackground(Color.DARK_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.YELLOW);
        logoPanel.setPreferredSize(new Dimension(100, 100));
        userPanel.add(logoPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JLabel doctorNameLabel = new JLabel("Alyson Rodas");
        doctorNameLabel.setForeground(Color.WHITE);
        userPanel.add(doctorNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JLabel doctorSpecialtyLabel = new JLabel("Doctor General");
        doctorSpecialtyLabel.setForeground(Color.WHITE);
        userPanel.add(doctorSpecialtyLabel, gbc);

        headerPanel.add(userPanel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        // Crear y agregar el panel de pacientes
        agregarPanelPacientes();

        setVisible(true);
    }
    private JPanel componentesLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantalla[1]));
        menuPanel.setBackground(Color.DARK_GRAY);

        JPanel menu = new JPanel();
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        menu.add(op("Opcion 1"), gbc);
        menu.add(op("Opcion 2"), gbc);
        menu.add(op("Opcion 3"), gbc);
        menu.add(op("Opcion 4"), gbc);
        menu.add(op("Opcion 5"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }
    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            System.out.println(texto);
        });
        return op;
    }

    private void agregarPanelPacientes() {
        // Crear una lista de pacientes de ejemplo
        ArrayList<Pacientes> pacientes = new ArrayList<>();
        pacientes.add(new Pacientes("Carlos Pérez", "cperez@gmail.com", "555-1234", "Calle Luna 123", "15/03/1985", "10:00 AM", "Chequeo General", 2, "Dr. Gómez"));
        pacientes.add(new Pacientes("Lucía Hernández", "lucia.h@gmail.com", "555-5678", "Av. Sol 456", "22/07/1992", "11:00 AM", "Consulta por Dolor", 1, "Dra. Torres"));
        pacientes.add(new Pacientes("Andrés Martínez", "andres.m@gmail.com", "555-8765", "Calle Estrella 789", "10/10/1980", "02:00 PM", "Consulta por Lesión", 3, "Dr. Fernández"));
        pacientes.add(new Pacientes("Sofía Ruiz", "sofia.ruiz@correo.com", "555-3456", "Calle del Mar 321", "05/05/1995", "09:30 AM", "Chequeo Anual", 2, "Dr. Martínez"));
        pacientes.add(new Pacientes("Javier López", "javier.lopez@gmail.com", "555-9876", "Av. Libertad 654", "12/12/1988", "03:00 PM", "Consulta por Alergias", 4, "Dra. Morales"));
        pacientes.add(new Pacientes("Clara Torres", "clara.torres@correo.com", "555-4567", "Calle Primavera 456", "30/01/1993", "11:30 AM", "Control de Peso", 1, "Dr. Gómez"));
        pacientes.add(new Pacientes("Diego Sánchez", "diego.sanchez@gmail.com", "555-6789", "Calle Otoño 159", "18/08/1987", "04:00 PM", "Consulta por Estrés", 2, "Dra. Rodríguez"));
        pacientes.add(new Pacientes("Valentina Jiménez", "valentina.j@correo.com", "555-2468", "Av. Primavera 852", "25/11/1990", "10:15 AM", "Chequeo General", 5, "Dr. Hernández"));
        pacientes.add(new Pacientes("Fernando Gómez", "fernando.g@gmail.com", "555-1357", "Calle Norte 951", "20/06/1982", "01:30 PM", "Consulta por Cansancio", 3, "Dra. López"));
        pacientes.add(new Pacientes("Natalia Paredes", "natalia.p@correo.com", "555-8642", "Calle Verde 753", "09/09/1994", "12:45 PM", "Chequeo por Diabetes", 2, "Dr. Fernández"));
        pacientes.add(new Pacientes("Samuel Castro", "samuel.castro@gmail.com", "555-7531", "Calle Azul 258", "28/04/1983", "08:30 AM", "Consulta por Infección", 1, "Dra. Torres"));
        pacientes.add(new Pacientes("Isabella Silva", "isabella.s@correo.com", "555-3698", "Av. Sur 147", "13/02/1989", "03:30 PM", "Chequeo Cardiovascular", 4, "Dr. Martínez"));
        pacientes.add(new Pacientes("Lucas Rojas", "lucas.rojas@gmail.com", "555-2589", "Calle Nieve 654", "16/11/1991", "09:00 AM", "Consulta por Dolor de Cabeza", 2, "Dr. Gómez"));
        pacientes.add(new Pacientes("Camila Mendoza", "camila.m@correo.com", "555-1472", "Av. Oeste 369", "30/03/1995", "10:30 AM", "Chequeo de Salud", 3, "Dra. Morales"));
        pacientes.add(new Pacientes("Mateo Alvarado", "mateo.a@gmail.com", "555-7890", "Calle Sol 963", "22/06/1986", "02:30 PM", "Consulta por Resfriado", 1, "Dr. Fernández"));
        pacientes.add(new Pacientes("Gabriela Núñez", "gabriela.n@correo.com", "555-4560", "Calle Oasis 147", "19/12/1994", "11:15 AM", "Chequeo de Embarazo", 2, "Dra. Torres"));
        pacientes.add(new Pacientes("Ricardo Salas", "ricardo.s@correo.com", "555-7530", "Calle Invierno 258", "30/10/1981", "01:45 PM", "Consulta por Fatiga", 4, "Dr. Hernández"));
        pacientes.add(new Pacientes("Laura Villalobos", "laura.v@correo.com", "555-8523", "Calle Cielo 147", "11/04/1990", "09:50 AM", "Chequeo Dermatológico", 3, "Dra. López"));
        pacientes.add(new Pacientes("Ángel Cordero", "angel.c@correo.com", "555-4567", "Av. Mar 369", "29/09/1988", "12:00 PM", "Consulta por Náuseas", 1, "Dr. Gómez"));


        // Agrega más pacientes según sea necesario...

        // Crear una instancia de PacienteView y agregar su panel
        PacienteView pacienteView = new PacienteView(pacientes);
        JPanel panelPacientes = pacienteView.panelPaciente();

        // Agregar el panel de pacientes a la parte central del JFrame
        add(panelPacientes, BorderLayout.CENTER);
    }
}