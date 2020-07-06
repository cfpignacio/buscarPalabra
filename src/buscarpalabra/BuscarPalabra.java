/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarpalabra;
import javax.swing.*;
/**
 *
 * @author Notebook
 */
public class BuscarPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] nombres = {"IGNACIO","FEDERICO","JOSE","PABLO"};
        
        String nombreB = JOptionPane.showInputDialog("Ingrese un nombre para buscar en nuestro arreglo");
        
        // Pasar el nombre que ingreso el usuario a MAY
        String nombreM = nombreB.toUpperCase();
        
        Boolean encontrado = false;
        
        //Agregar bucle si lo encontro que termine el programa y si no que lo vuelva a pedir.
        
        for(String nom: nombres){
            
            // Buscar el nombre en MAY
            if(nom.equals(nombreM)){
                encontrado = true;
            }
        
        }
        
        
        if(encontrado){
            System.out.println("El nombre que ingreso se encuentra en nuestro arreglo " + nombreB);
        }else{
            System.out.println("El nombre que ingreso NO SE ENCUENTRA en nuestro arreglo " + nombreB);
        }
        
        
    }
    
}
