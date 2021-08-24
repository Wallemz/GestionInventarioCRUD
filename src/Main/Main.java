/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador;
import Logica.ConsultasDB;
import Logica.Logica;
import Logica.Producto;
import Vista.Ventana;

/**
 *
 * @author walex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // CREACIÓN DE INSTANCIAS
        Ventana miVentana = new Ventana(); // Creo la instancia Ventana
        
        Logica miLogica = new Logica();  // Creo la instancia Logica
        ConsultasDB miConsultaDB = new ConsultasDB();
        Producto producto = new Producto();
        
        Controlador miControl = new Controlador(miLogica, miVentana, miConsultaDB, producto); // Creo la instancia Controlador

        miVentana.setVisible(true); // Visible ventana principal
    }
    
}
