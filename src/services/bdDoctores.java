package services;

import model.Doctor;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class bdDoctores {
    private List<Doctor> doctores;
    public  bdDoctores(){
        doctores=new ArrayList<>();
        doctores.add(new Doctor("alyson","Rodas","cardiologa",2,"adgmail.com","1234","userj"));
    }

    public List<Doctor> getDoctores() {
        return doctores;
    }
}
