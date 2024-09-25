package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import model.Pacientes;


public class PacienteView {
    // Atributo privado para almacenar la lista de pacientes
    private ArrayList<Pacientes> pacientes;

    // Constructor que recibe un ArrayList de tipo Paciente
    public PacienteView(ArrayList<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }

    // Método que crea y retorna un JPanel con la lista de pacientes
    public JPanel panelPaciente() {
        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Agregar el título
        JLabel titulo = new JLabel("Listado de pacientes.");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(10)); // Espacio vertical

        // Crear el array de títulos de columna
        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};

        // Crear un panel para los encabezados de la tabla
        JPanel encabezadosPanel = new JPanel();
        encabezadosPanel.setLayout(new GridLayout(1, campos.length));

        // Agregar los títulos de la tabla
        for (String campo : campos) {
            JLabel labelCampo = new JLabel(campo);
            labelCampo.setFont(new Font("Arial", Font.BOLD, 14));
            labelCampo.setHorizontalAlignment(SwingConstants.CENTER);
            encabezadosPanel.add(labelCampo);
        }
        panel.add(encabezadosPanel);
        panel.add(Box.createVerticalStrut(10)); // Espacio vertical

        // Agregar los datos de los pacientes
        for (Pacientes paciente : pacientes) {
            JPanel filaPanel = new JPanel();
            filaPanel.setLayout(new GridLayout(1, campos.length));

            // Agregar los datos de cada paciente en una fila
            filaPanel.add(new JLabel(paciente.getNombre()));
            filaPanel.add(new JLabel(paciente.getFechaDeNacimiento()));
            filaPanel.add(new JLabel(paciente.getHorarioCita()));
            filaPanel.add(new JLabel(paciente.getMotivoVisita()));

            // Agregar la fila al panel principal
            panel.add(filaPanel);
        }

        return panel;
    }
}

