/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.interfaces;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.controlador.DBHelper;
import mx.itson.entidades.Alumno;

/**
 *
 * @author vinko
 */
public class DAOAlumnoIMP implements DAOAlumno {
    
    DBHelper DB = new DBHelper();
    
    
    public boolean agregar(Alumno ga) {
        boolean rs = false;
        try{
          if (DB.connect()) {
                String query = "INSERT INTO `sutspes`.`niños`(nombreCompleto, edad, nivelActual, nombreTutor, telefono, imagen,porcentaje)"
                        + " VALUES (" +
                        "'" + ga.getNombre() + "', " + 
                        "'" + ga.getEdad() + "', " +
                        "'" + ga.getNivel() + "', " +
                        "'" + ga.getNombreTutor() + "', " +
                        "'" + ga.getTelefono() + "', " +
                        "'" + ga.getNomImagen() + "', " +
                         "'" + ga.getImagen() + "', " +
                        "'" + ga.getPorcentaje()+ "')";
                rs = (boolean) DB.execute(query, true);
          }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DB.disconnect();
        }
        return rs;
    }
    

    public boolean editar(Alumno niño) {
        boolean rs = false;
        
        try {
            if(DB.connect()){
                String query = "UPDATE `sutspes`.`niños` SET "
                      + " `porcentaje` = '" + niño.getPorcentaje()+ "' "
                        + "WHERE idNiño =" + niño.getIdAlumno();
                        

                        
                        
                rs = (boolean) DB.execute(query, true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            DB.disconnect();
        }
        
        return rs;
    }

    public boolean eliminar(int id) {
        boolean rs = false;
        
        try {
            if(DB.connect()){
            String query = "DELETE FROM `sutspes`.`niños` WHERE idNiño ="+id;
            
            rs = (boolean) DB.execute(query, true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            DB.disconnect();
        }
        
        return rs;
    }

    public List<Alumno> obtenerTodos() {
        List<Alumno> alumnos = new ArrayList();
    
        try {
            if(DB.connect()){
            String query = "SELECT * FROM `sutspes`.`niños`";
            ResultSet rs = (ResultSet)DB.execute(query, false);
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idNiño"));
                alumno.setNombre(rs.getString("nombreCom"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setNivel(rs.getString("nivelActual"));
                alumno.setNombreTutor(rs.getString("nombreTutor"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setImagen(rs.getString("imagen"));
                alumno.setPorcentaje(rs.getDouble("porcentaje"));
                alumnos.add(alumno);
            }
            }
        } catch (Exception eX) {
            eX.printStackTrace();
        }finally{
            DB.disconnect();
        }
        return alumnos;
    }
    
    public Alumno obtenerPorId(int id) {
        Alumno alumno = new Alumno();
        
        try {
            if(DB.connect()){
            String query = "SELECT * FROM `sutspes`.`niños` WHERE idNiño = "+id;
            ResultSet rs = (ResultSet)DB.execute(query, false);
            while(rs.next()){
                alumno.setIdAlumno(rs.getInt("idNiño"));
                alumno.setNombre(rs.getString("nombreCom"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setNivel(rs.getString("nivelActual"));
                alumno.setNombreTutor(rs.getString("nombreTutor"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setImagen(rs.getString("imagen"));
                   alumno.setPorcentaje(rs.getDouble("porcentaje"));
            }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            DB.disconnect();
        }
        return alumno;
        
    }
    
    
    
        public List<Alumno> ObtenerNiñosCompletado(){
        List<Alumno> alumnos = new ArrayList();
        
        try {
            if(DB.connect()){
           double     porcentaje = 100;
            String query = "SELECT * FROM `sutspes`.`niños` WHERE porcentaje = "+porcentaje;
            ResultSet rs = (ResultSet)DB.execute(query, false);
            while(rs.next()){
                 Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idNiño"));
                alumno.setNombre(rs.getString("nombreCom"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setNivel(rs.getString("nivelActual"));
                alumno.setNombreTutor(rs.getString("nombreTutor"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setImagen(rs.getString("imagen"));
                   alumno.setPorcentaje(rs.getDouble("porcentaje"));
                      alumnos.add(alumno);
            }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            DB.disconnect();
        }
        return alumnos;
        
    }
        
        
          public List<Alumno> NiñosNoCompletado(){
      
         List<Alumno> alumnos = new ArrayList();
        try {
            if(DB.connect()){
              double  porcentaje = 100.0;
            String query = "SELECT * FROM `sutspes`.`niños` WHERE porcentaje != "+porcentaje;
            ResultSet rs = (ResultSet)DB.execute(query, false);
            while(rs.next()){
                  Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idNiño"));
                alumno.setNombre(rs.getString("nombreCom"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setNivel(rs.getString("nivelActual"));
                alumno.setNombreTutor(rs.getString("nombreTutor"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setImagen(rs.getString("imagen"));
                   alumno.setPorcentaje(rs.getDouble("porcentaje"));
                    alumnos.add(alumno);
            }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            DB.disconnect();
        }
        return alumnos;
        
    }
    
}
