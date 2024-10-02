package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import model.Pacientes;
import model.Sala;
import view.SalaView;
import view.PacienteView;
import services.bdPacientes;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};
    private JPanel salasViewPanel;
    private JPanel pacientes;
  //  private ArrayList<Pacientes>pacientes;

    public DoctorView(HashMap<String, String> datosDoctor, ArrayList<Pacientes>pacientes) {
        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
      //  this.pacientes=pacientes;

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
        add(componentesLateral(), BorderLayout.WEST);

        // Crear y agregar el panel de pacientes

       // PacienteView pacientes = new PacienteView(Pacientes) ;
        salasViewPanel = new SalaView();
       // this.add(pacientes);
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
        menu.add(op("Farmacia"), gbc);
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


                this.remove(pacientes);
                this.add(salasViewPanel, BorderLayout.CENTER);

                // Actualizar la ventana para reflejar los cambios
                this.revalidate();
                this.repaint();
            }
        });
        return op;
    }



    }


