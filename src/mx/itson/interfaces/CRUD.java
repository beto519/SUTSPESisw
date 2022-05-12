/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.itson.interfaces;

import java.util.List;

/**
 *
 * @author vinko
 */
public interface CRUD<C> {
    
    public boolean agregar(C c);
    public boolean editar(C c);
    public boolean eliminar(int id);
    public List<C> obtenerTodos();
    public C obtenerPorId(int id);
    public C obtenerPorUsuario(String user, String password);
    public C obtenerFoto(int id);
}
