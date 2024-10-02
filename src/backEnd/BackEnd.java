package backEnd;

import model.Doctor;
import services.bdDoctores;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnd {
    private ArrayList<Doctor> doctors;

    public BackEnd(){
        this.doctors = bdDoctores.listaDoctores();
    }

    public HashMap<String, String> validarDatos(String correo, String contraseña) {
        HashMap<String, String> resultado = new HashMap<>();

        for (Doctor doctor : doctors) {
            if (doctor.getEmail().equalsIgnoreCase(correo)) {
                if (doctor.getPasswordD().equalsIgnoreCase(contraseña)) {
                    resultado.put("Nombre", doctor.getNombre());
                    resultado.put("Especialidad", doctor.getEspecialidad());
                    resultado.put("Edad", doctor.getUsuario());
                    return resultado;
                } else {
                    resultado.put("Error", "Contraseña incorrecta");
                    return resultado;
                }
            }
        }

        resultado.put("Error", "Usuario Incorrecto");
        return resultado;
    }

}

