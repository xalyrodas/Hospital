package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class LoginView extends JFrame {

    private JLabel passwordLabel;
    private JLabel emailField;
    private JButton loginButton;

    public LoginView() {
        setTitle("Formulario de Inicio de Sesión");
        setSize(400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);


        JLabel emailLabel = new JLabel("Nombre/Correo:");
        emailLabel.setBounds(20, 300, 120, 30);
        add(emailLabel);

        JTextField emailField = new JTextField(20);
        emailField.setBounds(150, 300, 200, 30);
        add(emailField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(20, 350, 120, 30);
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 350, 200, 30);
        add(passwordField);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(150, 400, 150, 30);

    setVisible(true);
    }
public String getCorreo(){
        return emailField.getText();
}
public String getContra(){
        return new String(passwordLabel.getText());
}
public void evento(EventListener elister){
        loginButton.addActionListener((ActionListener) elister);
}
}

