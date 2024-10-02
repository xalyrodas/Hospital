package services;


import model.Doctor;

import java.util.ArrayList;

public class bdDoctores {


    public static ArrayList listaDoctores(){

        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor("Jose", "Garcia", "Doctor General", 2, "jose@gmail.com", "jose123", "joseGar"));


        return doctores;
    }


}
