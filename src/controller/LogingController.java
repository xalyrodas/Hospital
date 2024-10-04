package controller;

import backEnd.BackEnd;
import services.bdPacientes;
import view.DoctorView;
import view.LoginView;

import java.util.HashMap;

public class LogingController {
    private LoginView loginview;
    private BackEnd backEnd;
    private bdPacientes bdPacientes;

    public LogingController(LoginView loginview, BackEnd backEnd) {
        this.loginview=loginview;
        this.backEnd = backEnd;
        this.bdPacientes = new bdPacientes();
        initController();
    }

    public void initController() {
        loginview.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    public void iniciarsesion() {
        String usuario = loginview.getEmailField().getText();
        String contraseña = new String(loginview.getPasswordField().getPassword());

        HashMap<String, String> resultado = backEnd.validarDatos(usuario, contraseña);

        if (!resultado.isEmpty()) {
            String nombreDoctor = resultado.get("nombre");
            String especialidad = resultado.get("especialidad");

            // Crear y mostrar la vista del doctor
            DoctorView doctorView = new DoctorView(nombreDoctor, especialidad, bdPacientes);
            doctorView.setVisible(true);
        }
    }
}

