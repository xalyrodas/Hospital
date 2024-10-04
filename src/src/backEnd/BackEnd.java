package backEnd;

import model.Doctor;
import services.bdDoctores;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnd {
    private bdDoctores bdDoctores;

    public BackEnd() {
        bdDoctores = new bdDoctores();
    }

    public HashMap<String, String> validarDatos(String correo, String contraseña) {
        HashMap<String, String> resultado = new HashMap<>();

        for (Doctor doctor : bdDoctores.getDoctores()) {
            if (doctor.getEmail().equals(correo) && doctor.getPasswordD().equals(contraseña)) {
                resultado.put("nombre", doctor.getNombre());
                resultado.put("especialidad", doctor.getEspecialidad());
                break;
            }
        }

        return resultado;
    }
}


