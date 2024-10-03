package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import model.Medicamento;
import model.Pacientes;
import view.SalaView;
import view.FarmaciaView;
import services.bdPacientes;

import static view.DataFarmacia.medicamentos;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};
    private JPanel salasViewPanel;
    private JPanel farmaciaViewPanel;

    public DoctorView(HashMap<String, String> datosDoctor, ArrayList<Pacientes> pacientes, ArrayList<Medicamento> listaMedicamentos) {
        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
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
        add(componentesLateral(), BorderLayout.WEST);

        salasViewPanel = new SalaView();

        // Crear y agregar el panel de farmacia
        FarmaciaView farmaciaView = new FarmaciaView(); // Llamar a la lista de medicamentos
        farmaciaViewPanel = farmaciaView.panelMedicamentos(); // Instanciar FarmaciaView y llamar a panelMedicamentos

        // Agregar inicialmente el panel de salas al JFrame
        add(salasViewPanel, BorderLayout.CENTER);

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

        menu.add(op("Consultas Del Día"), gbc);
        menu.add(op("Salas"), gbc);
        menu.add(op("Farmacia"), gbc); // Agregar opción de Farmacia
        menu.add(op("Pacientes registrados"), gbc);
        menu.add(op("Citar en otra area"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            System.out.println(texto);
            if (texto.equals("Salas")) {
                this.remove(farmaciaViewPanel); // Remover panel de farmacia
                this.add(salasViewPanel, BorderLayout.CENTER);
            } else if (texto.equals("Farmacia")) {
                this.remove(salasViewPanel); // Remover panel de salas
                this.add(farmaciaViewPanel, BorderLayout.CENTER); // Mostrar panel de farmacia
            }

            this.revalidate();
            this.repaint();
        });
        return op;
    }
}