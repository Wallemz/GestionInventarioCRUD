/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author walex
 */
public class ConsultasDB extends Conexion{
    public boolean registrar(Producto producto) {
        PreparedStatement preparar_statement_insert = null;
        Connection con = getConexion();
        String sql = "INSERT INTO productos(nombre, categoria, cantidad, precio) VALUES(?,?,?,?)";
        try {
            preparar_statement_insert = con.prepareStatement(sql);
            preparar_statement_insert.setString(1, producto.getNombre());
            preparar_statement_insert.setString(2, producto.getCategoria());
            preparar_statement_insert.setInt(3, producto.getCantidad());
            preparar_statement_insert.setDouble(4, producto.getPrecio());
            preparar_statement_insert.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public ArrayList <ArrayList<String>> consultar(){
        ArrayList <ArrayList<String>> out = new ArrayList<>();
        PreparedStatement preparar_statement_get = null; // Variable para la preparación
        Connection con = getConexion(); // Establezco conexión con la DB
        String sql = "SELECT * FROM productos ORDER BY id asc"; // Preparo el Query
        try{
            preparar_statement_get = con.prepareStatement(sql); // Preparo envio de datos
            System.out.println(sql);
            ResultSet datos = preparar_statement_get.executeQuery(); // Ejecuto el Query y el resultado lo guardo en un objeto
            while(datos.next()){
                ArrayList <String> unDato = new ArrayList<>(); // Lista para guardar los datos
                unDato.add(Integer.toString(datos.getInt("id")));
                unDato.add(datos.getString("nombre"));
                unDato.add(datos.getString("categoria"));
                unDato.add(Integer.toString(datos.getInt("cantidad")));
                unDato.add(Double.toString(datos.getDouble("precio")));

                out.add(unDato);
                
            }
            System.out.println(out);
            return  out;
        }
        catch(SQLException e){
            System.err.print(e);
            return null;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
                System.err.print(e);
            }
        }
    }
    
    public boolean actualizar(Producto producto) {
        PreparedStatement preparar_statement_update = null;
        Connection con = getConexion();

        String sql = "UPDATE productos "
                + "SET categoria=?, "
                + "cantidad=?, "
                + "precio=? "
                + "WHERE nombre=?";
        System.out.println(sql);
        try {
            preparar_statement_update = con.prepareStatement(sql);
            preparar_statement_update.setString(1, producto.getCategoria());
            preparar_statement_update.setInt(2, producto.getCantidad());
            preparar_statement_update.setDouble(3, producto.getPrecio());
            preparar_statement_update.setString(4, producto.getNombre());
            preparar_statement_update.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    public boolean eliminar(Producto producto) {
        PreparedStatement preparar_statement_delete = null;
        Connection con = getConexion();

        String sql = "DELETE FROM productos WHERE nombre=?";
        System.out.println(sql);
        try {
            preparar_statement_delete = con.prepareStatement(sql);
            preparar_statement_delete.setString(1, producto.getNombre());
            preparar_statement_delete.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
