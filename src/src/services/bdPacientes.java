package services;

import model.Pacientes;

import view.PacienteView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class bdPacientes {
    private ArrayList<Pacientes>pacientes;
    public  bdPacientes() {

       pacientes=new ArrayList<>();
        pacientes.add(new Pacientes("Carlos Pérez", "cperez@gmail.com", "555-1234", "Calle Luna 123", "15/03/1985", "10:00 AM", "Chequeo General", 2, "Dr. Gómez"));
        pacientes.add(new Pacientes("Lucía Hernández", "lucia.h@gmail.com", "555-5678", "Av. Sol 456", "22/07/1992", "11:00 AM", "Consulta por Dolor", 1, "Dra. Torres"));
        pacientes.add(new Pacientes("Andrés Martínez", "andres.m@gmail.com", "555-8765", "Calle Estrella 789", "10/10/1980", "02:00 PM", "Consulta por Lesión", 3, "Dr. Fernández"));
        pacientes.add(new Pacientes("Sofía Ruiz", "sofia.ruiz@correo.com", "555-3456", "Calle del Mar 321", "05/05/1995", "09:30 AM", "Chequeo Anual", 2, "Dr. Martínez"));
        pacientes.add(new Pacientes("Javier López", "javier.lopez@gmail.com", "555-9876", "Av. Libertad 654", "12/12/1988", "03:00 PM", "Consulta por Alergias", 4, "Dra. Morales"));
        pacientes.add(new Pacientes("Clara Torres", "clara.torres@correo.com", "555-4567", "Calle Primavera 456", "30/01/1993", "11:30 AM", "Control de Peso", 1, "Dr. Gómez"));
        pacientes.add(new Pacientes("Diego Sánchez", "diego.sanchez@gmail.com", "555-6789", "Calle Otoño 159", "18/08/1987", "04:00 PM", "Consulta por Estrés", 2, "Dra. Rodríguez"));
        pacientes.add(new Pacientes("Valentina Jiménez", "valentina.j@correo.com", "555-2468", "Av. Primavera 852", "25/11/1990", "10:15 AM", "Chequeo General", 5, "Dr. Hernández"));
        pacientes.add(new Pacientes("Fernando Gómez", "fernando.g@gmail.com", "555-1357", "Calle Norte 951", "20/06/1982", "01:30 PM", "Consulta por Cansancio", 3, "Dra. López"));
        pacientes.add(new Pacientes("Natalia Paredes", "natalia.p@correo.com", "555-8642", "Calle Verde 753", "09/09/1994", "12:45 PM", "Chequeo por Diabetes", 2, "Dr. Fernández"));
        pacientes.add(new Pacientes("Samuel Castro", "samuel.castro@gmail.com", "555-7531", "Calle Azul 258", "28/04/1983", "08:30 AM", "Consulta por Infección", 1, "Dra. Torres"));
        pacientes.add(new Pacientes("Isabella Silva", "isabella.s@correo.com", "555-3698", "Av. Sur 147", "13/02/1989", "03:30 PM", "Chequeo Cardiovascular", 4, "Dr. Martínez"));
        pacientes.add(new Pacientes("Lucas Rojas", "lucas.rojas@gmail.com", "555-2589", "Calle Nieve 654", "16/11/1991", "09:00 AM", "Consulta por Dolor de Cabeza", 2, "Dr. Gómez"));
        pacientes.add(new Pacientes("Camila Mendoza", "camila.m@correo.com", "555-1472", "Av. Oeste 369", "30/03/1995", "10:30 AM", "Chequeo de Salud", 3, "Dra. Morales"));
        pacientes.add(new Pacientes("Mateo Alvarado", "mateo.a@gmail.com", "555-7890", "Calle Sol 963", "22/06/1986", "02:30 PM", "Consulta por Resfriado", 1, "Dr. Fernández"));
        pacientes.add(new Pacientes("Gabriela Núñez", "gabriela.n@correo.com", "555-4560", "Calle Oasis 147", "19/12/1994", "11:15 AM", "Chequeo de Embarazo", 2, "Dra. Torres"));
        pacientes.add(new Pacientes("Ricardo Salas", "ricardo.s@correo.com", "555-7530", "Calle Invierno 258", "30/10/1981", "01:45 PM", "Consulta por Fatiga", 4, "Dr. Hernández"));
        pacientes.add(new Pacientes("Laura Villalobos", "laura.v@correo.com", "555-8523", "Calle Cielo 147", "11/04/1990", "09:50 AM", "Chequeo Dermatológico", 3, "Dra. López"));
        pacientes.add(new Pacientes("Ángel Cordero", "angel.c@correo.com", "555-4567", "Av. Mar 369", "29/09/1988", "12:00 PM", "Consulta por Náuseas", 1, "Dr. Gómez"));


    }
    public List<Pacientes> getPacientes(){
        return pacientes;
    }
}