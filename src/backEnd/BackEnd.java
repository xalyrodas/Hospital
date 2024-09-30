package backEnd;

import model.Doctor;
import services.bdDoctores;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnd {
    public static String validarDatos(String user, String password){

//       System.out.println("XX"+user);
//       System.out.println("ZXX"+password);


        bdDoctores bdDoctores = null;
        ArrayList<Doctor> doctores = bdDoctores.listaDoctores();

        for (Doctor infoDoc : doctores){

            if (infoDoc.getEmail().equalsIgnoreCase(user)){

//               System.out.println("HOLA");

                HashMap<String, String> datosDoctor = new HashMap<>();
                datosDoctor.put(user, infoDoc.getPasswordD());
                System.out.println("DOCTOR "+datosDoctor);
            } else {
//               System.out.println("Usuario no existe");
            }

        }

        return user;
    }

}

