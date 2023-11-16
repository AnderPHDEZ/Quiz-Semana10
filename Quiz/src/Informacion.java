/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author ander
 */
public class Informacion {
    
    public void setData(Pastor[] pastor){
        for(int x=0; x<pastor.length; x++){
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del los pastores "+(x+1));
            String nombre = JOptionPane.showInputDialog(null,"Escriba el nombre:");
            pastor[x]=new pastor(nombre);
        }
    }
    
    
    public void printData(Pastor[] pastor){
        
        String result ="";
        for (int i = 0; i < pastor.length; i++) {
            result+= pastor[i].toString() + "\n" ;
        }
        JOptionPane.showMessageDialog(null, result);
      
    }

    
}
