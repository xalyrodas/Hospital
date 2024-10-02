package services;
import model.Sala;

import java.util.ArrayList;

public class bdSalas {
        public static ArrayList listasala(){
            ArrayList<Sala> salas = new ArrayList<>();
            salas.add(new Sala("Sala de Emergencias", "Disponible"));
            salas.add(new Sala("Sala de Operaciones 1", "En Uso"));
            salas.add(new Sala("Sala de Operaciones 2", "Fuera de Servicio"));
            salas.add(new Sala("Sala de Cuidados Intensivos", "En Uso"));
            salas.add(new Sala("Sala de Recuperación", "Disponible"));
            salas.add(new Sala("Sala de Maternidad", "Fuera de Servicio"));
            salas.add(new Sala("Sala de Neonatología", "En Uso"));
            salas.add(new Sala("Sala de Radiología", "Disponible"));
            salas.add(new Sala("Sala de Quimioterapia", "En Uso"));
            salas.add(new Sala("Sala de Consulta Externa", "Fuera de Servicio"));
            salas.add(new Sala("Sala de Terapia Física", "Disponible"));
            salas.add(new Sala("Sala de Endoscopia", "Fuera de Servicio"));

            return salas;
        }

    }
    


