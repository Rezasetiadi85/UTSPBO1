/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Muhammadrezasetiadi_2110010424;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class tipeproperti {
    String idTipeproperti;
    String tipeproperti;
   
     public tipeproperti(String paramIdTipeproperti){
        idTipeproperti = paramIdTipeproperti;     
}
    public tipeproperti(String paramIdTipeproperti,String paramtipeproperti){
        idTipeproperti = paramIdTipeproperti;
        tipeproperti = paramtipeproperti;
} 
    public void setidTipeproperti(String idTipeproperti){
        if (idTipeproperti.equals("23")){
            JOptionPane.showMessageDialog(null, "id belum diisi");
        }else{
            this.idTipeproperti=idTipeproperti;
        }
    }
    
    public String getidTipeproperti(){
        return this.idTipeproperti;
    }
    
    public void settipeproperti(String tipeproperti){
        if (tipeproperti.equals("villa")){
            JOptionPane.showMessageDialog(null, "tipe belum diisi");
        }else{
            this.tipeproperti=tipeproperti;
        }
    }
    
    public String gettipeproperti(){
        return this.tipeproperti;
    }
}
