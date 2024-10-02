package controller;

import backEnd.BackEnd;
import model.Pacientes;
import services.bdPacientes;
import view.DoctorView;
import view.LoginView;

import java.util.ArrayList;
import java.util.HashMap;

public class LogingController {
    private LoginView loginView;

    public LogingController(LoginView loginView){
        this.loginView=loginView;
        this.loginView.addLoginListener(e -> iniciarSecion());
    }

    private void iniciarSecion() {
        String correo = loginView.getCorreo();
        String contraseña = loginView.getPasswordLabel();

        BackEnd consultaLogin = new BackEnd();
        HashMap<String, String> datosDoctor = consultaLogin.validarDatos(correo,contraseña);

        if (datosDoctor.containsKey("Error")) {
            System.out.println(datosDoctor.get("Error"));
        } else {
            loginView.dispose();

            ArrayList<Pacientes> listaPacientes = bdPacientes.listaPacientes();

            new DoctorView(datosDoctor, listaPacientes);
        }
    }
}

