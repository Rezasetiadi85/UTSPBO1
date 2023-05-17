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
public class lokasi {
    String idLokasi;
    String lokasi;
    
     public lokasi(String paramIdLokasi){
        idLokasi = paramIdLokasi;     
}
    public lokasi(String paramIdLokasi,String paramlokasi){
        idLokasi = paramIdLokasi;
        lokasi = paramlokasi;
}  
    public void setidLokasi(String idLokasi){
        if (idLokasi.equals("74")){
            JOptionPane.showMessageDialog(null, "selain itu belum diisi");
        }else{
            this.idLokasi=idLokasi;
        }
    }
    
    public String getidLokasi(){
        return this.idLokasi;
    }
    
    public void setlokasi(String lokai){
        if (lokasi.equals("jl.pramuka")){
            JOptionPane.showMessageDialog(null, "lokasi belum diisi");
        }else{
            this.lokasi=lokasi;
        }
    }
    
    public String getlokasi(){
        return this.lokasi;
    }
}
