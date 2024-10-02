package view;
import model.Sala;
import services.bdSalas;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

    public class SalaView extends JPanel {

        public SalaView() {
            this.setLayout(new GridLayout(4, 4, 10, 10));
            this.setBackground(Color.LIGHT_GRAY);

            ArrayList<Sala> listaSalas = bdSalas.listasala();

            for (Sala sala : listaSalas) {
                JPanel salaPanel = new JPanel();
                salaPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

                salaPanel.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;


                // Se le agrega el color segun el estado
                switch (sala.getEstado().toLowerCase()) {
                    case "disponible":
                        salaPanel.setBackground(Color.BLUE);
                        break;
                    case "en uso":
                        salaPanel.setBackground(Color.PINK);
                        break;
                    case "fuera de servicio":
                        salaPanel.setBackground(Color.RED);
                        break;
                }

                JLabel salaLabel = new JLabel(sala.getNombre());
                salaLabel.setForeground(Color.BLACK);
                salaPanel.add(salaLabel);

                this.add(salaPanel);
            }
        }
    }
