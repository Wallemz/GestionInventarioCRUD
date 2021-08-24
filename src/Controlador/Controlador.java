/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.ConsultasDB;
import Logica.Logica;
import Logica.Producto;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author walex
 */
public class Controlador implements ActionListener{ // Esucha que ocurre con los elementos declarados
    
    private final Logica miLogica;
    private final Ventana miVentana;
    private final ConsultasDB miConsultaDB;
    private Producto producto;

    public Controlador(Logica miLogica, Ventana miVentana, ConsultasDB miConsultaDB, Producto producto) {
        this.miLogica = miLogica;
        this.miVentana = miVentana;
        this.miConsultaDB = miConsultaDB;
        this.producto = producto;
        
        // Agregar los eventos a escuchar
        miVentana.btnGuardar.addActionListener(this);
        miVentana.btnConsultar.addActionListener(this);
        miVentana.btnActualizar.addActionListener(this);
        miVentana.btnEliminar.addActionListener(this);
    }
    

    public void setProducto(String nombre, String categoria, int cantidad, double precio) {
        this.producto = new Producto(nombre, categoria, cantidad, precio);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //////////////////////////////////////////////////////////////
        ////////////////////////   GUARDAR   /////////////////////////
        //////////////////////////////////////////////////////////////
        if(e.getSource() == miVentana.btnGuardar) {
            if("".equals(miVentana.txtFNombre.getText())
                    ||" ".equals(miVentana.cmbxCategoria.getSelectedItem().toString())
                    ||"".equals(miVentana.txtFCantidad.getText())
                    ||"".equals(miVentana.txtFPrecio.getText())){
                JOptionPane.showMessageDialog(null, "Hay datos vacios.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                // Seteo de datos
                setProducto(miVentana.txtFNombre.getText().toUpperCase(),
                        miVentana.cmbxCategoria.getSelectedItem().toString(),
                        Integer.parseInt(miVentana.txtFCantidad.getText()),
                        Integer.parseInt(miVentana.txtFPrecio.getText()));

                 // Enviar datos a la DB
                 if(miConsultaDB.registrar(producto)){
                     JOptionPane.showMessageDialog(null, "¡Registro almacenado exitosamente!", "INFO", JOptionPane.INFORMATION_MESSAGE);
                     limpiarGUI1();
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "¡Error al guardar los datos!\n*Revise que lo campos sean correctos\n*Posiblemente ya existe el registro del producto ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
                 }
            }
            
        }
        
        //////////////////////////////////////////////////////////////
        ///////////////////////   CONSULTAR   ////////////////////////
        //////////////////////////////////////////////////////////////
        if(e.getSource() == miVentana.btnConsultar){
            // Enviar datos a la DB
            miLogica.llenarTabla(miConsultaDB.consultar(), miVentana);
        }
        
        
        //////////////////////////////////////////////////////////////
        ///////////////////////   ACTUALIZAR   ///////////////////////
        //////////////////////////////////////////////////////////////
        if(e.getSource() == miVentana.btnActualizar){
            if(!verificarCambios()){
                JOptionPane.showMessageDialog(null, "No hay datos para modificar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                miConsultaDB.actualizar(producto);
                limpiarGUI2();
                miLogica.llenarTabla(miConsultaDB.consultar(), miVentana);
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        
        //////////////////////////////////////////////////////////////
        ////////////////////////   ELIMINAR   ////////////////////////
        //////////////////////////////////////////////////////////////
        if(e.getSource() == miVentana.btnEliminar){
            if("".equals(miVentana.txtFNombre2.getText())){
                JOptionPane.showMessageDialog(null, "No ha seleccionado un dato para elminar.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, 
                        "¿Está seguro que desea elminar este registro?\n"+miVentana.txtFNombre2.getText(),
                        "Warning",dialogButton); 
                if(dialogResult == JOptionPane.YES_OPTION){ 
                    producto.setNombre(miVentana.txtFNombre2.getText());
                    miConsultaDB.eliminar(producto);
                    limpiarGUI2();
                    miLogica.llenarTabla(miConsultaDB.consultar(), miVentana);
                    JOptionPane.showMessageDialog(null, "Registro elminado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
                else{}
            }
        }
    }
    
    private boolean verificarCambios(){
        String datosActuales [] = {"","","","",""};
        String datosModificados[] = {"","","","",""};
        int cantDatos = miVentana.tblDatos.getColumnCount();
        for(int i=0; i<miVentana.tblDatos.getRowCount();i++){
            if(miVentana.tblDatos.isRowSelected(i)){
                String dato [] = {"","","","",""};
                for(int j=0; j<cantDatos; j++){
                    dato [j] = miVentana.tblDatos.getValueAt(i, j).toString();
                    datosActuales[j] = dato[j];
                }
            }
        }
        
        datosModificados [0] = miVentana.txtFID.getText();
        datosModificados [1] = miVentana.txtFNombre2.getText();
        datosModificados [2] = (String) miVentana.cmbxCategoria2.getSelectedItem();
        datosModificados [3] = miVentana.txtFCantidad2.getText();
        datosModificados [4] = miVentana.txtFPrecio2.getText();
        
        for(int a=0; a<5; a++){
            System.out.println(datosModificados[a] + ", " + datosActuales[a]);
        }
        
        if("".equals(datosModificados[1]) && "".equals(datosActuales[1]))
        {return false;}
        else if(!datosModificados[1].equals(datosActuales[1])
            || !datosModificados[2].equals(datosActuales[2])
            || !datosModificados[3].equals(datosActuales[3])
            || !datosModificados[4].equals(datosActuales[4])){
            producto.setNombre(datosModificados[1]);
            producto.setCategoria(datosModificados[2]);
            producto.setCantidad(Integer.parseInt(datosModificados[3]));
            producto.setPrecio(Double.parseDouble(datosModificados[4]));
            return true;
        }
        else{return false;}
    }
    
    public void limpiarGUI1(){
        miVentana.txtFNombre.setText("");
        miVentana.cmbxCategoria.setSelectedIndex(0);
        miVentana.txtFCantidad.setText("");
        miVentana.txtFPrecio.setText("");
    }
    public void limpiarGUI2(){
        miVentana.txtFID.setText("");
        miVentana.txtFNombre2.setText("");
        miVentana.cmbxCategoria2.setSelectedIndex(0);
        miVentana.txtFCantidad2.setText("");
        miVentana.txtFPrecio2.setText("");
    }
}
