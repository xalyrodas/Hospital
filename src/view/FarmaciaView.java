package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import model.Medicamento;

public class FarmaciaView {
    // Atributo privado para almacenar la lista de medicamentos
    private ArrayList<Medicamento> medicamentos;

    // Constructor que inicializa la lista de medicamentos desde DataFarmacia
    public FarmaciaView() {
        this.medicamentos = DataFarmacia.medicamentos(); // Obtiene la lista de medicamentos
    }

    // Método que crea y retorna un JPanel con la lista de medicamentos
    public JPanel panelMedicamentos() {
        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Agregar el título
        JLabel titulo = new JLabel("Listado de Medicamentos");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(10)); // Espacio vertical

        // Crear un panel para los encabezados de la tabla
        JPanel encabezadosPanel = new JPanel();
        encabezadosPanel.setLayout(new GridLayout(1, 4)); // 1 fila y 4 columnas

        // Agregar los títulos de la tabla sin usar un for
        JLabel labelNombre = new JLabel("NOMBRE");
        labelNombre.setFont(new Font("Arial", Font.BOLD, 14));
        labelNombre.setHorizontalAlignment(SwingConstants.CENTER);
        encabezadosPanel.add(labelNombre);

        JLabel labelFormaFarmaceutica = new JLabel("FORMA FARMACÉUTICA");
        labelFormaFarmaceutica.setFont(new Font("Arial", Font.BOLD, 14));
        labelFormaFarmaceutica.setHorizontalAlignment(SwingConstants.CENTER);
        encabezadosPanel.add(labelFormaFarmaceutica);

        JLabel labelDosis = new JLabel("DOSIS");
        labelDosis.setFont(new Font("Arial", Font.BOLD, 14));
        labelDosis.setHorizontalAlignment(SwingConstants.CENTER);
        encabezadosPanel.add(labelDosis);

        JLabel labelPrecio = new JLabel("PRECIO");
        labelPrecio.setFont(new Font("Arial", Font.BOLD, 14));
        labelPrecio.setHorizontalAlignment(SwingConstants.CENTER);
        encabezadosPanel.add(labelPrecio);

        // Agregar el panel de encabezados al panel principal
        panel.add(encabezadosPanel);
        panel.add(Box.createVerticalStrut(10)); // Espacio vertical

        // Agregar los datos de los medicamentos usando un iterador
        for (Medicamento medicamento : medicamentos) {
            JPanel filaPanel = new JPanel();
            filaPanel.setLayout(new GridLayout(1, 4)); // 1 fila y 4 columnas

            // Agregar los datos de cada medicamento en una fila
            filaPanel.add(new JLabel(medicamento.getNombre()));
            filaPanel.add(new JLabel(medicamento.getFormaFarmaceutica()));
            filaPanel.add(new JLabel(medicamento.getDosis()));
            filaPanel.add(new JLabel(String.format("$%.2f", medicamento.getPrecio())));

            // Agregar la fila al panel principal
            panel.add(filaPanel);
        }

        return panel;
    }
}
