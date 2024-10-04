package services;
import model.Doctor;

import java.util.ArrayList;

public class bdDoctores {


    public static ArrayList listaDoctores(){

        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add("daniel.ortiz@hospital.com", new Doctor("Daniel", "Ortiz", "juan.perez@hospital.com", "12", "Cardiología"));


        return doctores;
    }


}
