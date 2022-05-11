/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.interfaces;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.controlador.DBHelper;
import mx.itson.entidades.Programa;

/**
 *
 * @author vinko
 */
public class DAOProgramaIMP implements DAOPrograma{
DBHelper db = new DBHelper();
    String TABLA = "nivelprograma";
 
      
         
    @Override
    public boolean agregar(Programa programa) {
        boolean resultado = false;
        try {
            if (db.connect()) {
                String query = "INSERT INTO `sutspes`.`nivelprograma` (`Nivel`, `nombreNivel`, `estadoPorcentaje`, `idNiño`) "
                        + " VALUES ('" + programa.getNivel()+ "', "
                        + " '" + programa.getNombrePrograma()+ "', "
                        + " '" + programa.getEstadoPorcentaje()+ "', "
                        + " '" + programa.getIdNiño()+ "') ";
                resultado = (boolean) db.execute(query, true);
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return resultado;
        
        
    }

    @Override
    public boolean editar(Programa c) {
       boolean resultado = false;
        try {
            if (db.connect()) {
                String query = "UPDATE `sutspes`.`nivelprograma` SET  "
                        + "`nombreCom` = '" + c.getNivel()+ "', "
                        + "`contraseña` = '" + c.getNombrePrograma()+ "', "
                        + "`nomImagen` = '" + c.getEstadoPorcentaje()+ "', "
                        + "`imagen` = '" + c.getIdNiño()+ "' "
                        + " WHERE (`Idnivel` = '" + c.getIdNivel()+ "') ";
                resultado = (boolean) db.execute(query, true);
            }

        } catch (Exception e){
            System.out.println(e);
          
        } finally {
            db.disconnect();
        }
        return resultado;
    }

    @Override
    public boolean eliminar(int id) {
       
    return false;
       
    }

    @Override
    public List<Programa> obtenerTodos() {
       List<Programa> Programas = new ArrayList();

        try {
            if (db.connect()) {
                String query = "SELECT * FROM sutspes." + TABLA;
                ResultSet rs = (ResultSet) db.execute(query, false);
                while (rs.next()) {
                    Programa programa = new Programa();
                    programa.setIdNivel(rs.getInt("Idnivel"));
                    programa.setNombreNivel(rs.getString("nombrNivel"));
                    programa.setEstadoPorcentaje(rs.getString("estadoPorcentaje"));
                    programa.setIdNiño(rs.getInt("IdNiño"));
                    
                    Programas.add(programa);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            db.disconnect();
        }

        return Programas;
        
    }

    @Override
    public Programa obtenerPorId(int id) {
        Programa programa = new Programa();
        try {
            if (db.connect()) {
                String query = "SELECT * FROM sutspes." + TABLA + " WHERE Idnivel = " + id;
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    programa.setIdNivel(rs.getInt("Idnivel"));
                    programa.setNivel(rs.getInt("Nivel"));
                    programa.setEstadoPorcentaje(rs.getString("estadoPorcentaje"));
                    programa.setIdNiño(rs.getInt("idNiño"));
                  
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.disconnect();
        }
        return programa;  
    
    }

    @Override
    public Programa obtenerPorUsuario(String user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Programa obtenerFoto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
