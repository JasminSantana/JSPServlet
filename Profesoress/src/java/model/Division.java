/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USUARIO
 */
public class Division {
    private int idDivision;
    private String nombre;
    private String abreviatura;
    private String activo;
    private int unidadAcademica;
    private String area;

    public Division(int idDivision, String nombre, String abreviatura, String activo, int unidadAcademica, String area) {
        this.idDivision = idDivision;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.activo = activo;
        this.unidadAcademica = unidadAcademica;
        this.area = area;
    }

   
    public Division() {
         this(0, "", "", "",0,"");
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public int getUnidadAcademica() {
        return unidadAcademica;
    }

    public void setUnidadAcademica(int unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Division{" + "idDivision=" + idDivision + ", nombre=" + nombre + ", abreviatura=" + abreviatura + ", activo=" + activo + ", unidadAcademica=" + unidadAcademica + ", area=" + area + '}';
    }

    
    
}
