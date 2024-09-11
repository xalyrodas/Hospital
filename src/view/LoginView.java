package view;
import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    public LoginView() {
        setTitle("Formulario de Inicio de Sesión");
        setSize(400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setLayout(null); // Deshabilita el layout manager predeterminado

        // Crear y configurar los componentes
        JLabel emailLabel = new JLabel("Nombre/Correo:");
        emailLabel.setBounds(20, 300, 120, 30); // x, y, width, height
        add(emailLabel);

        JTextField emailField = new JTextField(20);
        emailField.setBounds(150, 300, 200, 30); // x, y, width, height
        add(emailField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(20, 350, 120, 30); // x, y, width, height
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 350, 200, 30); // x, y, width, height
        add(passwordField);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(150, 400, 150, 30); // x, y, width, height
        add(loginButton);

    setVisible(true);
    }

}

