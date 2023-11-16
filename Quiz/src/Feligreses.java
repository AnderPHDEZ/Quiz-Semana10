/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class Feligreses {
    
    public String nombre_feligreses;
    public int cedula_feligreses;

    public Feligreses(String nombre_feligreses, int cedula_feligreses) {
        this.nombre_feligreses = nombre_feligreses;
        this.cedula_feligreses = cedula_feligreses;
        
    }

    public String getNombre_feligreses() {
        return nombre_feligreses;
    }

    public void setNombre_feligreses(String nombre_feligreses) {
        this.nombre_feligreses = nombre_feligreses;
    }

    public int getCedula_feligreses() {
        return cedula_feligreses;
    }

    public void setCedula_feligreses(int cedula_feligreses) {
        this.cedula_feligreses = cedula_feligreses;
    }
    
    public void setData(feligreses[] feligreses){
        for(int x=0; x<feligreses.length; x++){
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de los feligreses "+(x+1));
            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cedula:"));
            String nombre = JOptionPane.showInputDialog(null,"Escriba el nombre:");
            feligreses[x]=new feligreses(cedula,nombre);
        }
    
    
}
