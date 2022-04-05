/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.interfaces;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.controlador.DBHelper;
import mx.itson.entidades.Terapeuta;
/**
 *
 * @author lopez
 */
public class DAOTerapeutaIMP implements DAOTerapeuta {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lopez
 */

    DBHelper db = new DBHelper();
    String TABLA = "terapeuta";
    
    
    
    @Override
    public boolean agregar(Terapeuta terapeuta) {
        boolean resultado = false;
        try {
            if (db.connect()) {
                String query = "INSERT INTO `bxopxuzsnsc4au7ggfnf`.`terapeuta` (`nombreCom`, `Area`, `email`, `usuario`, `contraseña`) "
                        + " VALUES ('" + terapeuta.getNombre() + "', "
                        + " '" + terapeuta.getPuesto()+ "', "
                        + " '" + terapeuta.getCorreo()+ "', "
                        + " '" + terapeuta.getCodigoUsuario()+ "', "
                        + " '" + terapeuta.getContraseña()+ "') ";
                resultado = (boolean) db.execute(query, true);
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return resultado;
    }

    @Override
    public boolean editar(Terapeuta terapeuta) {
        boolean resultado = false;
        try {
            if (db.connect()) {
                String query = "UPDATE `bxopxuzsnsc4au7ggfnf`.`terapeuta` SET  "
                        + "`nombreCom` = '" + terapeuta.getNombre() + "',  "
                        + "`Area` = '" + terapeuta.getPuesto()+ "',  "
                        + "`email` = '" + terapeuta.getCorreo()+ "',  "
                        + "`usuario` = '" + terapeuta.getCodigoUsuario()+ "', "
                        + " `contraseña` = '" + terapeuta.getContraseña()+ "' "
                        + " WHERE (`IdTerap` = '" + terapeuta.getId() + "') ";
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
        boolean resultado = false;

        try {
            if (db.connect()) {
                String query = "DELETE FROM `bxopxuzsnsc4au7ggfnf`.`terapeuta` WHERE (`IdTerap` = '" + id + "');";
                resultado = (boolean) db.execute(query, true);
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return resultado;
    }

    @Override
    public List<Terapeuta> obtenerTodos() {
        List<Terapeuta> terapeutas = new ArrayList();

        try {
            if (db.connect()) {
                String query = "SELECT * FROM " + TABLA;
                ResultSet rs = (ResultSet) db.execute(query, false);
                while (rs.next()) {
                    Terapeuta terapeuta = new Terapeuta();
                    terapeuta.setId(rs.getInt("IdTerap"));
                    terapeuta.setNombre(rs.getString("nombreCom"));
                    terapeuta.setPuesto(rs.getString("Area"));
                    terapeuta.setCorreo(rs.getString("email"));
                    terapeuta.setCodigoUsuario(rs.getString("usuario"));
                    terapeuta.setContraseña(rs.getString("contraseña"));
                    terapeutas.add(terapeuta);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            db.disconnect();
        }

        return terapeutas;

    }

    @Override
    public Terapeuta obtenerPorId(int id) {
              Terapeuta empleado = new Terapeuta();
        try {
            if (db.connect()) {
                String query = "SELECT * FROM " + TABLA + " WHERE IdTerap = " + id;
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    empleado.setId(rs.getInt("IdTerap"));
                    empleado.setNombre(rs.getString("nombreCom"));
                    empleado.setPuesto(rs.getString("Area"));
                    empleado.setCorreo(rs.getString("email"));
                    empleado.setContraseña(rs.getString("usuario"));
                    empleado.setCodigoUsuario(rs.getString("contraseña"));
                }
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return empleado;  
    }

 

   

  



}
