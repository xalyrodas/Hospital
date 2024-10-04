package view;

import model.Sala;
import services.bdSalas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SalaView extends JPanel {
    private ArrayList<Sala> listaSalas;

    // Constructor de la clase SalaView
    SalaView(ArrayList<Sala> listaSalas) {
        this.listaSalas = listaSalas;
        inicioPanel();
    }

    // Método para inicializar el panel
    public void inicioPanel() {
        // Establecer el diseño del panel
        setLayout(new GridLayout(4, 4));

        // Crear paneles para cada sala
        for (Sala sala : listaSalas) {
            JPanel panelSalas = crearPanelSalas(sala.getNombre(), sala.getEstado());
            add(panelSalas);
        }

        // Actualizar la interfaz
        revalidate();
        repaint();
    }

    // Método para crear el panel de cada sala
    public JPanel crearPanelSalas(String nombre, String estado) {
        JPanel panelSalas = new JPanel();
        panelSalas.setLayout(new BorderLayout());

        // Etiqueta para el nombre de la sala
        JLabel nombresalasLabel = new JLabel(nombre, SwingConstants.CENTER);
        panelSalas.add(nombresalasLabel, BorderLayout.CENTER);

        // Imprimir el estado para depuración
        System.out.println("Sala: " + nombre + ", Estado: " + estado);

        // Ajustar el color de fondo según el estado
        switch (estado) {
            case "en uso":
                panelSalas.setBackground(Color.BLUE);
                break;
            case "fuera de servicio":
                panelSalas.setBackground(Color.CYAN);
                break;
            case "disponibles": // Asegúrate de que este texto coincida exactamente
                panelSalas.setBackground(Color.GRAY);
                break;
            default:
                panelSalas.setBackground(Color.LIGHT_GRAY); // Color por defecto
                break;
        }

        // Establecer borde rojo
        panelSalas.setBorder(BorderFactory.createLineBorder(Color.RED));
        return panelSalas;
    }
}
