package view;


import model.Pacientes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView extends JPanel {
    private ArrayList<Pacientes> listaPacientes;

    public PacienteView(ArrayList<Pacientes> listaPacientes) {
        this.listaPacientes = listaPacientes;
        initPanel();
    }

    private void initPanel() {
        setLayout(new BorderLayout());

        // Título del panel
        JLabel titulo = new JLabel("Listado de pacientes", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        // Panel para mostrar los pacientes
        JPanel panelPacientes = new JPanel();
        panelPacientes.setLayout(new GridLayout(listaPacientes.size() + 1, 5)); // +1 for the header

        // Encabezado de la tabla
        panelPacientes.add(new JLabel("Nombre", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Zona", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Email", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Enfermedad", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Teléfono", SwingConstants.CENTER));

        // Agregar los pacientes al panel
        for (Pacientes pacientes : listaPacientes) {
            panelPacientes.add(new JLabel(pacientes.getNombre(), SwingConstants.CENTER));
            panelPacientes.add(new JLabel(pacientes.getDireccion(), SwingConstants.CENTER));

            panelPacientes.add(new JLabel(pacientes.getTelefono(), SwingConstants.CENTER));
        }

        add(panelPacientes, BorderLayout.CENTER);

    }}