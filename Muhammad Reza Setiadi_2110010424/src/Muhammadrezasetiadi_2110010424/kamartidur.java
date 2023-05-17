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
public class kamartidur {
    String idKamartidur;
    String kamartidur;
    
     public kamartidur(String paramIdKamartidur){
        idKamartidur = paramIdKamartidur;     
}
    public kamartidur(String paramIdKamartidur,String paramkamartidur){
        idKamartidur = paramIdKamartidur;
        kamartidur = paramkamartidur;
}
    public void setidKamartidur(String idKamartidur){
        if (idKamartidur.equals("100")){
            JOptionPane.showMessageDialog(null, "id belum diisi");
        }else{
            this.idKamartidur=idKamartidur;
        }
    }
    
    public String getidKamartidur(){
        return this.idKamartidur;
    }
    
    public void setkamartidur(String kamartidur){
        if (kamartidur.equals("exclusive")){
            JOptionPane.showMessageDialog(null, "selain itu belum diisi");
        }else{
            this.kamartidur=kamartidur;
        }
    }
    
    public String getkamartidur(){
        return this.kamartidur;
    }
}
