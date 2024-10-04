package controller;

import backEnd.BackEnd;
import model.Medicamento;
import model.Pacientes;
import services.bdPacientes;
import view.DataFarmacia;
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
        String contrasena = loginView.getPasswordLabel();

        BackEnd consultaLogin = new BackEnd();
        HashMap<String, String> datosDoctor = consultaLogin.validarDatos(correo,contrasena);

        if (datosDoctor.containsKey("Error")) {
            System.out.println(datosDoctor.get("Error"));
        } else {
            loginView.dispose();

            ArrayList<Pacientes> listaPacientes = bdPacientes.listaPacientes();
            ArrayList<Medicamento> listaMedicamentos = DataFarmacia.medicamentos();

            new DoctorView(datosDoctor, listaPacientes, listaMedicamentos);
        }
    }
}

