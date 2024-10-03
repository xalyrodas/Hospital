package view;

import model.Medicamento;
import java.time.LocalDate;
import java.util.ArrayList;

public class DataFarmacia {
    public static ArrayList<Medicamento> medicamentos;

    public DataFarmacia() {
        medicamentos = new ArrayList<>();
        // Añade tus medicamentos aquí como ya lo tienes.
        medicamentos.add(new Medicamento("Paracetamol", "Tableta", "500mg", "Paracetamol", LocalDate.of(2024, 5, 15), "L001", 12.50, "Dolor leve y fiebre", "Hipersensibilidad al paracetamol"));
        medicamentos.add(new Medicamento("Ibuprofeno", "Cápsula", "200mg", "Ibuprofeno", LocalDate.of(2025, 7, 22), "L002", 15.00, "Inflamación y fiebre", "Úlcera gástrica"));
        medicamentos.add(new Medicamento("Amoxicilina", "Suspensión", "250mg/5ml", "Amoxicilina", LocalDate.of(2024, 3, 10), "L003", 22.00, "Infecciones bacterianas", "Alergia a penicilinas"));
        medicamentos.add(new Medicamento("Metformina", "Tableta", "850mg", "Metformina", LocalDate.of(2026, 1, 5), "L004", 30.00, "Diabetes tipo 2", "Insuficiencia renal"));
        medicamentos.add(new Medicamento("Loratadina", "Tableta", "10mg", "Loratadina", LocalDate.of(2024, 11, 25), "L005", 18.00, "Alergias", "Embarazo"));
        medicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20mg", "Omeprazol", LocalDate.of(2025, 9, 12), "L006", 25.00, "Reflujo gastroesofágico", "Hipersensibilidad a omeprazol"));
        medicamentos.add(new Medicamento("Aspirina", "Tableta", "100mg", "Ácido acetilsalicílico", LocalDate.of(2023, 12, 30), "L007", 10.00, "Dolor leve", "Úlcera gástrica"));
        medicamentos.add(new Medicamento("Clonazepam", "Tableta", "2mg", "Clonazepam", LocalDate.of(2025, 6, 14), "L008", 35.00, "Trastornos de ansiedad", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Furosemida", "Tableta", "40mg", "Furosemida", LocalDate.of(2024, 10, 18), "L009", 20.00, "Hipertensión", "Deshidratación"));
        medicamentos.add(new Medicamento("Diclofenaco", "Tableta", "50mg", "Diclofenaco", LocalDate.of(2025, 4, 19), "L010", 17.50, "Dolor moderado", "Úlcera péptica"));

        medicamentos.add(new Medicamento("Cefalexina", "Cápsula", "500mg", "Cefalexina", LocalDate.of(2024, 8, 1), "L011", 40.00, "Infecciones bacterianas", "Alergia a cefalosporinas"));
        medicamentos.add(new Medicamento("Ciprofloxacino", "Tableta", "500mg", "Ciprofloxacino", LocalDate.of(2026, 2, 22), "L012", 45.00, "Infecciones urinarias", "Tendinitis"));
        medicamentos.add(new Medicamento("Azitromicina", "Suspensión", "200mg/5ml", "Azitromicina", LocalDate.of(2024, 5, 8), "L013", 50.00, "Infecciones respiratorias", "Hipersensibilidad"));
        medicamentos.add(new Medicamento("Dexametasona", "Tableta", "1.5mg", "Dexametasona", LocalDate.of(2025, 7, 29), "L014", 28.00, "Inflamación severa", "Infecciones sistémicas"));
        medicamentos.add(new Medicamento("Losartán", "Tableta", "50mg", "Losartán", LocalDate.of(2026, 9, 3), "L015", 32.00, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamento("Prednisona", "Tableta", "5mg", "Prednisona", LocalDate.of(2024, 3, 7), "L016", 23.00, "Trastornos autoinmunes", "Infecciones activas"));
        medicamentos.add(new Medicamento("Levotiroxina", "Tableta", "100mcg", "Levotiroxina", LocalDate.of(2025, 11, 5), "L017", 25.00, "Hipotiroidismo", "Insuficiencia suprarrenal"));
        medicamentos.add(new Medicamento("Claritromicina", "Tableta", "500mg", "Claritromicina", LocalDate.of(2024, 7, 28), "L018", 60.00, "Infecciones respiratorias", "Hepatopatías"));
        medicamentos.add(new Medicamento("Esomeprazol", "Cápsula", "40mg", "Esomeprazol", LocalDate.of(2025, 1, 19), "L019", 27.00, "Reflujo gastroesofágico", "Hipersensibilidad a esomeprazol"));
        medicamentos.add(new Medicamento("Atorvastatina", "Tableta", "20mg", "Atorvastatina", LocalDate.of(2026, 8, 15), "L020", 55.00, "Colesterol alto", "Insuficiencia hepática"));

        medicamentos.add(new Medicamento("Enalapril", "Tableta", "10mg", "Enalapril", LocalDate.of(2024, 6, 23), "L021", 30.00, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamento("Simvastatina", "Tableta", "40mg", "Simvastatina", LocalDate.of(2025, 9, 30), "L022", 50.00, "Colesterol alto", "Enfermedad hepática"));
        medicamentos.add(new Medicamento("Alprazolam", "Tableta", "0.5mg", "Alprazolam", LocalDate.of(2026, 4, 12), "L023", 37.00, "Ansiedad", "Depresión severa"));
        medicamentos.add(new Medicamento("Cetirizina", "Tableta", "10mg", "Cetirizina", LocalDate.of(2024, 12, 9), "L024", 20.00, "Alergias", "Insuficiencia renal"));
        medicamentos.add(new Medicamento("Metoprolol", "Tableta", "50mg", "Metoprolol", LocalDate.of(2025, 3, 2), "L025", 28.00, "Hipertensión", "Bradicardia"));
        medicamentos.add(new Medicamento("Amlodipino", "Tableta", "5mg", "Amlodipino", LocalDate.of(2024, 8, 22), "L026", 35.00, "Hipertensión", "Shock cardiogénico"));
        medicamentos.add(new Medicamento("Fluconazol", "Cápsula", "150mg", "Fluconazol", LocalDate.of(2026, 2, 10), "L027", 60.00, "Infecciones fúngicas", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Salbutamol", "Inhalador", "100mcg", "Salbutamol", LocalDate.of(2025, 6, 30), "L028", 45.00, "Asma", "Alergia a salbutamol"));
        medicamentos.add(new Medicamento("Benzonatato", "Cápsula", "100mg", "Benzonatato", LocalDate.of(2024, 11, 18), "L029", 32.00, "Tos seca", "Alergia a anestésicos locales"));
        medicamentos.add(new Medicamento("Nitrofurantoína", "Cápsula", "100mg", "Nitrofurantoína", LocalDate.of(2026, 5, 4), "L030", 40.00, "Infecciones urinarias", "Insuficiencia renal"));

        medicamentos.add(new Medicamento("Simvastatina", "Tableta", "20mg", "Simvastatina", LocalDate.of(2025, 3, 11), "L021", 50.00, "Colesterol alto", "Enfermedades hepáticas"));
        medicamentos.add(new Medicamento("Enalapril", "Tableta", "10mg", "Enalapril", LocalDate.of(2024, 9, 25), "L022", 30.00, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamento("Amlodipino", "Tableta", "5mg", "Amlodipino", LocalDate.of(2025, 6, 9), "L023", 40.00, "Hipertensión", "Shock cardiogénico"));
        medicamentos.add(new Medicamento("Warfarina", "Tableta", "5mg", "Warfarina", LocalDate.of(2024, 12, 13), "L024", 60.00, "Prevención de coágulos", "Hemorragia activa"));
        medicamentos.add(new Medicamento("Alprazolam", "Tableta", "0.5mg", "Alprazolam", LocalDate.of(2026, 4, 21), "L025", 75.00, "Ansiedad", "Insuficiencia respiratoria"));
        medicamentos.add(new Medicamento("Ranitidina", "Tableta", "150mg", "Ranitidina", LocalDate.of(2023, 11, 30), "L026", 20.00, "Reflujo ácido", "Porfiria aguda"));
        medicamentos.add(new Medicamento("Salbutamol", "Inhalador", "100mcg", "Salbutamol", LocalDate.of(2025, 10, 17), "L027", 80.00, "Asma", "Alergia al salbutamol"));
        medicamentos.add(new Medicamento("Metronidazol", "Tableta", "500mg", "Metronidazol", LocalDate.of(2026, 5, 4), "L028", 38.00, "Infecciones bacterianas", "Insuficiencia hepática"));
        medicamentos.add(new Medicamento("Fluconazol", "Tableta", "150mg", "Fluconazol", LocalDate.of(2025, 12, 7), "L029", 45.00, "Infecciones fúngicas", "Embarazo"));
        medicamentos.add(new Medicamento("Tramadol", "Tableta", "50mg", "Tramadol", LocalDate.of(2024, 2, 16), "L030", 65.00, "Dolor moderado a severo", "Insuficiencia respiratoria"));


    }

    public static ArrayList<Medicamento> medicamentos() {
        return medicamentos; // Retornar la lista de medicamentos
    }
}