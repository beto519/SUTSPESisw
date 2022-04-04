/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entidades;

/**
 *
 * @author vinko
 */
public class Terapeuta {
    
    private int idTerapeuta;
    private String Nombre;
    private String Area;
    private String Email;
    private String pasword;

    public int getIdTerapeuta() {
        return idTerapeuta;
    }

    public void setIdTerapeuta(int idTerapeuta) {
        this.idTerapeuta = idTerapeuta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
}
