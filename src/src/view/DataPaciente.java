package view;
import java.util.ArrayList;
import java.util.List;
import model.Pacientes;

public class DataPaciente {
    private List<Pacientes> pacientes;

    public DataPaciente() {
        ArrayList<Pacientes> pacientes = new ArrayList<>();

        pacientes.add(new Pacientes("Valentín Ruiz", "valentin.ruiz@mail.com", "555-1111", "Calle Estrella 100",
                "12/01/1987", "09:00 AM", "Chequeo General", 2, "Dr. Morales"));
        pacientes.add(new Pacientes("Samantha Ortiz", "samantha.ortiz@gmail.com", "555-2222", "Av. Sol 200",
                "15/03/1991", "10:00 AM", "Consulta por Dolor", 1, "Dra. López"));
        pacientes.add(new Pacientes("Federico Torres", "federico.torres@yahoo.com", "555-3333", "Calle Luna 300",
                "22/05/1975", "11:00 AM", "Chequeo General", 3, "Dr. Ramírez"));
        pacientes.add(new Pacientes("Paola González", "paola.gonzalez@hotmail.com", "555-4444", "Calle Mar 400",
                "30/07/1985", "12:00 PM", "Consulta por Dolor", 2, "Dra. Sánchez"));
        pacientes.add(new Pacientes("Ricardo Hernández", "ricardo.hernandez@gmail.com", "555-5555", "Av. Río 500",
                "18/09/1980", "01:00 PM", "Chequeo General", 1, "Dr. Morales"));
        pacientes.add(new Pacientes("Gabriela Jiménez", "gabriela.jimenez@outlook.com", "555-6666", "Calle Nube 600",
                "20/11/1993", "02:00 PM", "Consulta por Dolor", 4, "Dra. López"));
        pacientes.add(new Pacientes("Cristian Ramírez", "cristian.ramirez@gmail.com", "555-7777", "Calle Viento 700",
                "07/02/1992", "03:00 PM", "Examen de Laboratorio", 3, "Dr. Ramírez"));
        pacientes.add(new Pacientes("Teresa Castro", "teresa.castro@gmail.com", "555-8888", "Av. Brisa 800",
                "25/04/1986", "04:00 PM", "Chequeo General", 1, "Dra. Sánchez"));
        pacientes.add(new Pacientes("Nicolás Silva", "nicolas.silva@hotmail.com", "555-9999", "Calle Tormenta 900",
                "05/08/1971", "08:30 AM", "Consulta por Dolor", 2, "Dr. Morales"));
        pacientes.add(new Pacientes("Camila López", "camila.lopez@gmail.com", "555-0000", "Av. Flor 101",
                "17/06/1995", "09:30 AM", "Chequeo General", 1, "Dra. López"));
        pacientes.add(new Pacientes("Javier Ortega", "javier.ortega@gmail.com", "555-1212", "Calle Maravilla 202",
                "03/09/1984", "10:30 AM", "Consulta por Dolor", 3, "Dr. Ramírez"));
        pacientes.add(new Pacientes("Lucía Salazar", "lucia.salazar@yahoo.com", "555-2323", "Av. Arena 303",
                "14/12/1990", "11:15 AM", "Chequeo General", 2, "Dra. Sánchez"));
        pacientes.add(new Pacientes("Matías Delgado", "matias.delgado@hotmail.com", "555-3434", "Calle Cielo 404",
                "29/10/1988", "12:45 PM", "Examen de Laboratorio", 4, "Dr. Morales"));
        pacientes.add(new Pacientes("Natalia Reyes", "natalia.reyes@gmail.com", "555-4545", "Av. Lago 505",
                "20/01/1994", "01:30 PM", "Consulta por Dolor", 1, "Dra. López"));
        pacientes.add(new Pacientes("Hugo Paredes", "hugo.paredes@gmail.com", "555-5656", "Calle Montaña 606",
                "09/07/1982", "03:15 PM", "Chequeo General", 3, "Dr. Ramírez"));
        pacientes.add(new Pacientes("Sandra Méndez", "sandra.mendez@outlook.com", "555-6767", "Calle Loma 707",
                "13/04/1996", "04:30 PM", "Consulta por Dolor", 2, "Dra. Sánchez"));
        pacientes.add(new Pacientes("Diego Romero", "diego.romero@gmail.com", "555-7878", "Av. Viento 808",
                "27/11/1991", "01:45 PM", "Chequeo General", 1, "Dr. Morales"));
        pacientes.add(new Pacientes("Marisol Castro", "marisol.castro@gmail.com", "555-8989", "Calle Sol 909",
                "24/02/1989", "11:45 AM", "Consulta por Dolor", 4, "Dra. López"));
        pacientes.add(new Pacientes("Sergio Martín", "sergio.martin@gmail.com", "555-9090", "Av. Arcoíris 111",
                "08/10/1976", "02:45 PM", "Examen de Laboratorio", 2, "Dr. Ramírez"));
        pacientes.add(new Pacientes("Elena Ríos", "elena.rios@hotmail.com", "555-1213", "Calle Verde 121",
                "16/05/1983", "04:45 PM", "Chequeo General", 1, "Dra. Sánchez"));
    }
        public List<Pacientes> getPacientes() {
        return pacientes;
    }
}
