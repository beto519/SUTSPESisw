/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.interfaces;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import mx.itson.controlador.DBHelper;
import mx.itson.entidades.Terapeuta;
import mx.itson.vistas.MostrarTerapeuta;
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
                String query = "INSERT INTO `sutspes`.`terapeuta` (`nombreCom`, `Area`, `email`, `usuario`, `contraseña`, `imagen`) "
                        + " VALUES ('" + terapeuta.getNombre() + "', "
                        + " '" + terapeuta.getPuesto()+ "', "
                        + " '" + terapeuta.getCorreo()+ "', "
                        + " '" + terapeuta.getCodigoUsuario()+ "', "
                        +("MD5('")+(terapeuta.getContraseña())+("'),")
                        + " '" + terapeuta.getImagen()+ "') ";
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
                String query = "UPDATE `sutspes`.`terapeuta` SET  "
                        + "`nombreCom` = '" + terapeuta.getNombre() + "', "
                        + "`Area` = '" + terapeuta.getPuesto()+ "', "
                        + "`email` = '" + terapeuta.getCorreo()+ "', "
                        + "`usuario` = '" + terapeuta.getCodigoUsuario()+ "', "
                        + "`contraseña` = '" + terapeuta.getContraseña()+ "', "
                        + "`imagen` = '" + terapeuta.getImagen()+ "' "
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
                String query = "DELETE FROM `sutspes`.`terapeuta` WHERE (`IdTerap` = '" + id + "');";
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
                String query = "SELECT * FROM sutspes." + TABLA;
                ResultSet rs = (ResultSet) db.execute(query, false);
                while (rs.next()) {
                    Terapeuta terapeuta = new Terapeuta();
                    terapeuta.setId(rs.getInt("IdTerap"));
                    terapeuta.setNombre(rs.getString("nombreCom"));
                    terapeuta.setPuesto(rs.getString("Area"));
                    terapeuta.setCorreo(rs.getString("email"));
                    terapeuta.setCodigoUsuario(rs.getString("usuario"));
                    terapeuta.setContraseña(rs.getString("contraseña"));
                    terapeuta.setImagen(rs.getString("imagen"));
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
                String query = "SELECT * FROM sutspes." + TABLA + " WHERE IdTerap = " + id;
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    empleado.setId(rs.getInt("IdTerap"));
                    empleado.setNombre(rs.getString("nombreCom"));
                    empleado.setPuesto(rs.getString("Area"));
                    empleado.setCorreo(rs.getString("email"));
                    empleado.setCodigoUsuario(rs.getString("usuario"));
                    empleado.setContraseña(rs.getString("contraseña"));
                    empleado.setImagen(rs.getString("imagen"));
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.disconnect();
        }
        return empleado;  
    }

 
 @Override
    public Terapeuta obtenerPorUsuario(String user) {
              Terapeuta empleado = new Terapeuta();
        try {
            if (db.connect()) {
                String query = "SELECT * FROM sutspes." + TABLA + " WHERE usuario = " + user;
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    empleado.setId(rs.getInt("IdTerap"));
                    empleado.setNombre(rs.getString("nombreCom"));
                    empleado.setPuesto(rs.getString("Area"));
                    empleado.setCorreo(rs.getString("email"));
                    empleado.setCodigoUsuario(rs.getString("usuario"));
                    empleado.setContraseña(rs.getString("contraseña"));
                }
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return empleado;  
    }

    @Override
    public Terapeuta obtenerFoto(int id) {
         Terapeuta empleado = new Terapeuta();
         MostrarTerapeuta mt = new MostrarTerapeuta();
        try {
            if (db.connect()) {
                String query = "SELECT * FROM sutspes.terapeuta WHERE IdTerap = " + id;
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    //leer Binario
                    Blob blob = rs.getBlob(8);
                    //pasar el binario a imagen
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    //lee la imagen
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ImageIcon icono = new ImageIcon(img);
                    Icon imagen = new ImageIcon(icono.getImage().getScaledInstance(mt.lbl_imagen.getWidth(), mt.lbl_imagen.getHeight(), Image.SCALE_DEFAULT));
                    mt.lbl_imagen.setIcon(imagen);
                }
            }
        } catch (Exception e) {
        } finally {
            db.disconnect();
        }
        return empleado;  
    }
   

  



}
