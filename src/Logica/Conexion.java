/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author walex
 */
public class Conexion {
    private final String nombre_base_datos = "listaproductosdb";
    private final String usuario = "postgres";
    private final String contrasenya = "052894";
    private final String la_url_completa = "jdbc:postgresql://localhost:5432/" +nombre_base_datos;
    private Connection la_conexion=  null;
    
    
    public Connection getConexion()
    {
        try{
            System.out.println("Conectando a la db postgresql ");
            Class.forName("org.postgresql.Driver");
            la_conexion = DriverManager.getConnection(this.la_url_completa, this.usuario, this.contrasenya);
        } 
        catch(SQLException sql_error)
        {
            System.err.println("Error sql "+sql_error.getMessage());
        } catch (ClassNotFoundException ex) {
           System.err.println("Error clase no encontrada excepción\n"+ex.getMessage());
        }
        return la_conexion;
    }
}
