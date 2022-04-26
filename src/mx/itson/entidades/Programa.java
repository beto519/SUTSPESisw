/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entidades;

/**
 *
 * @author vinko
 */
public class Programa {
    
    private int idNivel;
    private int Nivel;
    private String nombreNivel;
    private String estadoPorcentaje;
    private int idNiño;
    private String NombrePrograma;

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombrePrograma() {
        return NombrePrograma;
    }

    public void setNombrePrograma(String NombrePrograma) {
        this.NombrePrograma = NombrePrograma;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public String getEstadoPorcentaje() {
        return estadoPorcentaje;
    }

    public void setEstadoPorcentaje(String estadoPorcentaje) {
        this.estadoPorcentaje = estadoPorcentaje;
    }

    public int getIdNiño() {
        return idNiño;
    }

    public void setIdNiño(int idNiño) {
        this.idNiño = idNiño;
    }
}
