/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Controlador.Controlador;
import Vista.Ventana;
import java.util.ArrayList;

/**
 *
 * @author walex
 */
public class Logica {

   // ArrayList <ArrayList<String>> datos = new ArrayList<>(); // Lista para guardar los datos

    
    public void llenarTabla(ArrayList <ArrayList<String>> datos, Ventana miVentana)
    {
        //Limpiar Tabla
        miVentana.modelo.getDataVector().removeAllElements();
        miVentana.modelo.fireTableDataChanged();  
        
        // DATOS
        for (int i = 0; i < datos.size(); i++) 
        {
            int fila = datos.get(i).size();
            String filaFinal []= new String[5];
            for (int j = 0; j < fila; j++) 
            {
                filaFinal[j] = (String) (datos.get(i).get(j));
            }
            miVentana.modelo.addRow(filaFinal);
        }
    }
}
