package view;

import model.medicamento;
import services.bdFarmacia;
import services.bdPacientes;
import services.bdSalas;
import model.Pacientes;
import model.Sala;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DoctorView extends JFrame {
    private bdPacientes pc;
    private JLabel nombreDoctorLabel;
    private JLabel especialidadLabel;
    private ArrayList<Sala> listasalas;
    private ArrayList<medicamento> listamedicamentos;
    private int[] pantalla = {1300, 800};
    private JPanel panelCentro; // Panel central para cambiar dinámicamente

    public DoctorView(String nombreDoctor, String especialidad, bdPacientes pc) {
        // Configuración básica del JFrame
        setTitle("Hospital Santa Catalina - Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel Header
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        // JLabel para el nombre del hospital
        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setHorizontalAlignment(SwingConstants.LEFT);
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Información del doctor
        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new GridLayout(2, 1));
        doctorInfoPanel.setBackground(Color.DARK_GRAY);

        // Etiquetas para el nombre y especialidad del doctor
        nombreDoctorLabel = new JLabel("Nombre del doctor: " + nombreDoctor);
        nombreDoctorLabel.setForeground(Color.WHITE);
        especialidadLabel = new JLabel("Especialidad: " + especialidad);
        especialidadLabel.setForeground(Color.WHITE);

        // Inicializar salas y medicamentos
        bdSalas bdSalas = new bdSalas();
        listasalas = bdSalas.getListasalas();

        bdFarmacia datafarmacia = new bdFarmacia();
        listamedicamentos = (ArrayList<medicamento>) datafarmacia.getMedicamentos();

        doctorInfoPanel.add(nombreDoctorLabel);
        doctorInfoPanel.add(especialidadLabel);
        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        // Añadir el menú lateral
        add(componentesMenuLateral(), BorderLayout.WEST);

        panelCentro = new JPanel(new BorderLayout());
        add(panelCentro, BorderLayout.CENTER);

        // Mostrar pacientes al inicio
        mostrarPacientes(pc);
    }

    private JPanel componentesMenuLateral() {
        JPanel menu = new JPanel();
        menu.setPreferredSize(new Dimension(250, pantalla[1]));
        menu.setBackground(Color.DARK_GRAY);
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS)); // Cambiado a BoxLayout

        // Crear un JPanel para los botones y establecer un espaciado fijo
        JPanel opciones = new JPanel();
        opciones.setLayout(new BoxLayout(opciones, BoxLayout.Y_AXIS)); // Cambiado a BoxLayout

        // Agregamos las opciones del menú con sus acciones
        opciones.add(op("Consultas del día", e -> System.out.println("Consultas del día")));
        opciones.add(op("Salas", e -> mostrarSalas()));
        opciones.add(op("Farmacia", e -> mostrarmedicamentos()));
        opciones.add(op("Pacientes registrados", e -> System.out.println("Pacientes registrados")));
        opciones.add(op("Citar en otra área", e -> System.out.println("Citar en otra área")));

        // Agregar un espaciado entre los botones
        for (Component component : opciones.getComponents()) {
            component.getAlignmentY(); // Centrar los botones
            opciones.add(Box.createRigidArea(new Dimension(0, 7))); // Espacio entre los botones
        }

        menu.add(opciones);
        return menu;
    }

    private JButton op(String texto, java.awt.event.ActionListener actionListener) {
        JButton boton = new JButton(texto);
        boton.addActionListener(actionListener);
        boton.setPreferredSize(new Dimension(200, 30)); // Ajustar tamaño preferido
        boton.setMaximumSize(new Dimension(200, 30)); // Evitar que el tamaño máximo sea mayor
        return boton;
    }

    private void mostrarPacientes(bdPacientes pc) {
        ArrayList<Pacientes> listaPacientes = new ArrayList<>(pc.getPacientes());
        PacienteView panelPacientes = new PacienteView(listaPacientes);

        panelCentro.removeAll();
        panelCentro.add(panelPacientes, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    // Método para mostrar las salas y también imprimir sus detalles
    private void mostrarSalas() {
        // Crear el panel de las salas
        SalaView panelSalas = new SalaView(listasalas);

        System.out.println("=== Detalles de las salas ===");
        for (Sala sala : listasalas) {
            System.out.println("Sala Nombre: " + sala.getNombre());
            System.out.println("Estado de la sala: " + sala.getEstado());
            System.out.println("----------------------------");
        }

        panelCentro.removeAll();
        panelCentro.add(panelSalas, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    private void mostrarmedicamentos() {
        JPanel panelMedicamentos = new JPanel();
        panelMedicamentos.setLayout(new GridLayout(0, 7, 10, 10));

        // Añadir títulos de las columnas
        panelMedicamentos.add(new JLabel("Nombre"));
        panelMedicamentos.add(new JLabel("Dosis"));
        panelMedicamentos.add(new JLabel("Número de Lote"));
        panelMedicamentos.add(new JLabel("Principio Activo"));
        panelMedicamentos.add(new JLabel("Forma Farmacéutica"));
        panelMedicamentos.add(new JLabel("Indicaciones"));
        panelMedicamentos.add(new JLabel("Fecha de Caducidad"));

        // Ahora añadimos los datos de cada medicamento
        for (medicamento med : listamedicamentos) {
            panelMedicamentos.add(new JLabel(med.getNombre()));
            panelMedicamentos.add(new JLabel(med.getDosis()));
            panelMedicamentos.add(new JLabel(med.getPrincipioActivo()));
            panelMedicamentos.add(new JLabel(med.getIndicaciones()));
            panelMedicamentos.add(new JLabel(med.getFechaCaducidad().toString())); // Si es de tipo Date o LocalDate
        }

        panelCentro.removeAll();
        panelCentro.add(panelMedicamentos, BorderLayout.CENTER);

        revalidate();
        repaint();
    }
}
