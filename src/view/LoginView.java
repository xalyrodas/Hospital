package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    private JTextField emailField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;

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

        this.emailField = new JTextField(20);
        emailField.setBounds(150, 300, 200, 30); // x, y, width, height
        add(emailField);

        this.passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(20, 350, 120, 30); // x, y, width, height
        add(passwordLabel);

        this.passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 350, 200, 30); // x, y, width, height
        add(passwordField);

        this.loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(150, 400, 150, 30); // x, y, width, height
        add(loginButton);

    setVisible(true);
    }
    public String getCorreo(){
        return emailField.getText();
    }

    public String getPasswordLabel() {
        return passwordLabel.getText();
    }

    public void addLoginListener(ActionListener Listener) {
        loginButton.addActionListener(Listener);
    }
}

