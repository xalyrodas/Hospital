import javax.swing.*;
import java.awt.*;

public class Loging  extends JFrame {

    public Loging(){

        //miventana
        JFrame miVentana = new JFrame("ALYSON");
        miVentana.setSize(1800, 1000);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLUE);
        mainPanel.setLayout(new GridLayout(1, 2));

        JPanel l1panel = new JPanel();
        l1panel.setBackground(Color.BLACK);

        JPanel l2panel = new JPanel();
        l2panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel userLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        l2panel.add(userLabel, gbc);

        JTextField userText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        l2panel.add(userText, gbc);

        JLabel passwordLabel = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        l2panel.add(passwordLabel, gbc);

        JPasswordField passwordText = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        l2panel.add(passwordText, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        l2panel.add(loginButton, gbc);

        mainPanel.add(l1panel);
        mainPanel.add(l2panel);

        miVentana.add(mainPanel);
        miVentana.setVisible(true);
    }
}

