package services;
import model.Sala;

import java.util.ArrayList;


public class bdSalas {
    private ArrayList<Sala> listasalas;

    public bdSalas() {
        listasalas = new ArrayList<>();
        listasalas.add(new Sala("quirofano", "En uso"));
        listasalas.add(new Sala("pediatria", "Disponible"));
        listasalas.add(new Sala("emergencias", "Fuera de servicio"));
        listasalas.add(new Sala("urgencias", "En uso"));
        listasalas.add(new Sala("sala de espera", "Disponible"));
        listasalas.add(new Sala("ginecologia", "Fuera de servicio"));
        listasalas.add(new Sala("odontologia", "En uso"));
        listasalas.add(new Sala("sala de espera", "Disponible"));
        listasalas.add(new Sala("neoruologia", "Fuera de servicio"));
        listasalas.add(new Sala("morge", "Disponible"));
        listasalas.add(new Sala("camillas", "En uso"));
        listasalas.add(new Sala("pre operacion", "Disponible"));
    }

    public ArrayList<Sala> getListasalas() {
        return listasalas;
    }
}
    


