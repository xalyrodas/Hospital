package model;

import java.time.LocalDate;

public class Medicamento {

    //Atributos
    private String nombre;
    private String formaFarmaceutica;
    private String dosis;
    private String principioActivo;
    private LocalDate fechaCaducidad;
    private String numeroLote;
    private double precio;
    private String indicaciones;
    private String contraindicaciones;

    //constructor
    public Medicamento(String nombre,String formaFarmaceutica, String dosis, String principioActivo,LocalDate fechaCaducidad,
                       String numeroLote, double precio, String indicaciones, String contraindicaciones) {
        this.nombre = nombre;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.principioActivo = principioActivo;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.precio = precio;
        this.contraindicaciones = contraindicaciones;
    }

        // Métodos Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getFormaFarmaceutica() {
            return formaFarmaceutica;
        }

        public void setFormaFarmaceutica(String formaFarmaceutica) {
            this.formaFarmaceutica = formaFarmaceutica;
        }

        public String getDosis() {
            return dosis;
        }

        public void setDosis(String dosis) {
            this.dosis = dosis;
        }

        public String getPrincipioActivo() {
            return principioActivo;
        }

        public void setPrincipioActivo(String principioActivo) {
            this.principioActivo = principioActivo;
        }

        public LocalDate getFechaCaducidad() {
            return fechaCaducidad;
        }

        public void setFechaCaducidad(LocalDate fechaCaducidad) {
            this.fechaCaducidad = fechaCaducidad;
        }

        public String getNumeroLote() {
            return numeroLote;
        }

        public void setNumeroLote(String numeroLote) {
            this.numeroLote = numeroLote;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getIndicaciones() {
            return indicaciones;
        }

        public void setIndicaciones(String indicaciones) {
            this.indicaciones = indicaciones;
        }

        public String getContraindicaciones() {
            return contraindicaciones;
        }

        public void setContraindicaciones(String contraindicaciones) {
            this.contraindicaciones = contraindicaciones;
        }

        // Método toString
        @Override
        public String toString() {
            return "Medicamento{" +
                    "nombre='" + nombre + '\'' +
                    ", formaFarmaceutica='" + formaFarmaceutica + '\'' +
                    ", dosis='" + dosis + '\'' +
                    ", principioActivo='" + principioActivo + '\'' +
                    ", fechaCaducidad=" + fechaCaducidad +
                    ", numeroLote='" + numeroLote + '\'' +
                    ", precio=" + precio +
                    ", indicaciones='" + indicaciones + '\'' +
                    ", contraindicaciones='" + contraindicaciones + '\'' +
                    '}';
        }
    }


