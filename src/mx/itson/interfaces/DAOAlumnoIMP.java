/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.interfaces;

import java.util.List;
import mx.itson.controlador.DBHelper;
import mx.itson.entidades.Alumno;

/**
 *
 * @author vinko
 */
public class DAOAlumnoIMP implements DAOAlumno {
    
    DBHelper DB = new DBHelper();
    
    
    @Override
    public boolean agregar(Alumno ga) {
        boolean rs = false;
        try{
          if (DB.connect()) {
                String query = "INSERT INTO `Alumno`(Nombre, Nivel, Edad) VALUES ("
                        + "'" + ga.getNombre() + "'," + 
                        "" + ga.getNombre()+ "," +
                        "'" + ga.getNivel()+ "')";
                        
               
                rs = (boolean) DB.execute(query, true);
          }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DB.disconnect();
        }
        return rs;
    }
    

    @Override
    public boolean editar(Alumno c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno obtenerPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
