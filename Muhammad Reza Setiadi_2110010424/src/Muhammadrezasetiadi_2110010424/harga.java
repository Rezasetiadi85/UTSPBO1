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
public class harga {
    String idHarga;
    String harga;
    
     public harga(String paramIdHarga){
        idHarga = paramIdHarga;     
}
    public harga(String paramIdHarga,String paramharga){
        idHarga = paramIdHarga;
        harga = paramharga;
}
    public void setidHarga(String idHarga){
        if (idHarga.equals("34")){
            JOptionPane.showMessageDialog(null, "harga belum diisi");
        }else{
            this.idHarga=idHarga;
        }
    }
    
    public String getidHarga(){
        return this.idHarga;
}
    
public void setharga(String harga){
        if (harga.equals("100.000")){
            JOptionPane.showMessageDialog(null, "harga belum diisi");
        }else{
            this.harga=harga;
        }
    }
    
    public String getharga(){
        return this.harga;
    }
    
}
