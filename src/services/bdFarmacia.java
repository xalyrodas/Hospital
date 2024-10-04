package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.medicamento;

public class bdFarmacia {
    private List<medicamento> medicamentos;

    // Hacemos el constructor público
    public bdFarmacia() {
        medicamentos = new ArrayList<>();
        listamedicamento();
    }

    private void listamedicamento() {
        List<medicamento> listamedicamentos = new ArrayList<>();

        listamedicamentos.add(new medicamento(
                "Medicamento 1", "Jarabe", "20ml", "Principio Activo 1",
                LocalDate.now().plusYears(2), 15.00, "Indicaciones 1", "Contraindicaciones 1"));
        listamedicamentos.add(new medicamento(
                "Medicamento 2", "Tableta", "10mg", "Principio Activo 2",
                LocalDate.now().plusYears(3), 20.00, "Indicaciones 2", "Contraindicaciones 2"));
        listamedicamentos.add(new medicamento(
                "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                LocalDate.now().plusYears(1), 25.00, "Indicaciones 3", "Contraindicaciones 3"));
        listamedicamentos.add(new medicamento(
                "Medicamento 4", "Crema", "15g", "Principio Activo 4",
                LocalDate.now().plusYears(4), 30.00, "Indicaciones 4", "Contraindicaciones 4"));
        listamedicamentos.add(new medicamento(
                "Medicamento 5", "Cápsula", "500mg", "Principio Activo 5",
                LocalDate.now().plusYears(5), 10.00, "Indicaciones 5", "Contraindicaciones 5"));
        listamedicamentos.add(new medicamento(
                "Medicamento 6", "Supositorio", "100mg", "Principio Activo 6",
                LocalDate.now().plusYears(2), 5.00, "Indicaciones 6", "Contraindicaciones 6"));
        listamedicamentos.add(new medicamento(
                "Medicamento 7", "Jarabe", "30ml", "Principio Activo 7",
                LocalDate.now().plusYears(3), 22.50, "Indicaciones 7", "Contraindicaciones 7"));
        listamedicamentos.add(new medicamento(
                "Medicamento 8", "Tableta", "25mg", "Principio Activo 8",
                LocalDate.now().plusYears(4), 18.75, "Indicaciones 8", "Contraindicaciones 8"));
        listamedicamentos.add(new medicamento(
                "Medicamento 9", "Inyección", "2ml", "Principio Activo 9",
                LocalDate.now().plusYears(1), 12.50, "Indicaciones 9", "Contraindicaciones 9"));
        listamedicamentos.add(new medicamento(
                "Medicamento 10", "Crema", "10g", "Principio Activo 10",
                LocalDate.now().plusYears(2), 27.00, "Indicaciones 10", "Contraindicaciones 10"));

        // Agregar otros 30 medicamentos para completar la lista
        for (int i = 11; i <= 40; i++) {
            listamedicamentos.add(new medicamento(
                    "Medicamento " + i, "Forma " + i, i + "mg/ml", "Principio Activo " + i,
                    LocalDate.now().plusYears(i % 5 + 1), i * 5.0, "Indicaciones " + i, "Contraindicaciones " + i));
        }

        // Asignar la lista de medicamentos a la lista de medicamentos
        medicamentos.addAll(listamedicamentos);
    }

    public List<medicamento> getMedicamentos() {
        return new ArrayList<>(medicamentos);
    }
}

