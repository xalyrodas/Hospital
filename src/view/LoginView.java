package view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginbutton;

    public LoginView(){
        setTitle("login");
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.white);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Etiqueta de correo
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel emailLabel = new JLabel("Correo:");
        formPanel.add(emailLabel, gbc);

        // Campo de texto de correo
        gbc.gridx = 1;
        emailField = new JTextField(20);
        formPanel.add(emailField, gbc);

        // Etiqueta de contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passwordLabel = new JLabel("Contraseña:");
        formPanel.add(passwordLabel, gbc);

        // Campo de texto de contraseña
        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        formPanel.add(passwordField, gbc);

        // Panel separado para el botón
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);

        loginbutton = new JButton("Iniciar Sesión");
        buttonPanel.add(loginbutton);

        // Añadir los paneles al JFrame
        add(formPanel, BorderLayout.CENTER);   // Panel con los campos de texto
        add(buttonPanel, BorderLayout.SOUTH);  // Panel con el botón
    }

    public JButton getLoginButton() {
        return loginbutton;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}
