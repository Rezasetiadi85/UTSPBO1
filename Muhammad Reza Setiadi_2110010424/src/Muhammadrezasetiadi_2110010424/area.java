/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Muhammadrezasetiadi_2110010424;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class area {
    String idArea;
    String area;
    
     public area(String paramIdArea){
        idArea = paramIdArea;     
}
    public area(String paramIdArea,String paramarea){
        idArea = paramIdArea;
        area = paramarea;
}    
    
    public void setidArea(String idArea){
        if (area.equals("banjarmasin")){
            JOptionPane.showMessageDialog(null, "Area belum diisi");
        }else{
            this.idArea=idArea;
        }
    }
    
    public String getidArea(){
        return this.idArea;
    }
    
    public void setarea(String area){
        if (area.equals("Banjarmasin")){
            JOptionPane.showMessageDialog(null, "Area belum diisi");
        }else{
            this.area=area;
        }
    }
    
    public String getarea(){
        return this.area;
    }
    
}
