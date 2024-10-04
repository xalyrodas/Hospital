package model;

import java.time.LocalDate;

public class medicamento {
    private String nombre, formaActivo, dosis, principioactivo, indicaciones, contradicciones;
    private LocalDate fechacaducidad;
    private double precio;
public medicamento(String nombre,String formaActivo,String dosis,String principioactivo,LocalDate fechacaducidad,double precio,String indicaciones,String contradicciones){
    this.contradicciones=contradicciones;
    this.dosis=dosis;
    this.fechacaducidad=fechacaducidad;
    this.precio=precio;
    this.indicaciones=indicaciones;
    this.formaActivo=formaActivo;
    this.nombre=nombre;
    this.principioactivo=principioactivo;
}
    public String getNombre(){return nombre;}

    public void setNombre(String nombre){this.nombre=nombre;}

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getPrincipioActivo() {
        return principioactivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioactivo= principioActivo;
    }

    public LocalDate getFechaCaducidad() {
        return fechacaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechacaducidad = fechaCaducidad;
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
        return contradicciones;
    }

    public void setContraindicaciones(String contraindicaciones){this.contradicciones=contraindicaciones;}
}