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
public class reservasi{
    String idReservasi;
    String idProperti;
    String nama;
    String notlp;
    String alamat;
    String daritgl;
    String sampaitgl;
    String status;
    
    public reservasi(String paramIdReservasi){
        idReservasi = paramIdReservasi;     
}
    public reservasi(String paramIdReservasi,String paramIdProperti){
        idReservasi = paramIdReservasi;
        idProperti = paramIdProperti;
} 
    public reservasi(String paramIdReservasi,String paramIdProperti,String paramnama){
        idReservasi = paramIdReservasi;
        idProperti = paramIdProperti;
        nama = paramnama;
}
    public reservasi(String paramIdReservasi,String paramIdProperti,String paramnama,String paramnotlp){
        idReservasi = paramIdReservasi;
        idProperti = paramIdProperti;
        nama = paramnama;
        notlp = paramnotlp;
}
    public reservasi(String paramIdReservasi,String paramIdProperti,String paramnama,String paramnotlp,String paramalamat){
        idReservasi = paramIdReservasi;
        idProperti = paramIdProperti;
        nama = paramnama;
        notlp = paramnotlp;
        alamat = paramalamat;
}
    public reservasi(String paramIdReservasi,String paramIdProperti,String paramnama,String paramnotlp,String paramalamat,String paramdaritgl){
        idReservasi = paramIdReservasi;
        idProperti = paramIdProperti;
        nama = paramnama;
        notlp = paramnotlp;
        alamat = paramalamat;
        daritgl = paramdaritgl;
}
    public reservasi(String paramIdReservasi,String paramIdProperti,String paramnama,String paramnotlp,String paramalamat,String paramdaritgl,String paramsampaitgl){
        idReservasi = paramIdReservasi;
        idProperti = paramIdProperti;
        nama = paramnama;
        notlp = paramnotlp;
        alamat = paramalamat;
        daritgl = paramdaritgl;
        sampaitgl = paramsampaitgl;
}
    public reservasi(String paramIdReservasi,String paramIdProperti,String paramnama,String paramnotlp,String paramalamat,String paramdaritgl,String paramsampaitgl,String paramstatus){
        idReservasi = paramIdReservasi;
        idProperti = paramIdProperti;
        nama = paramnama;
        notlp = paramnotlp;
        alamat = paramalamat;
        daritgl = paramdaritgl;
        sampaitgl = paramsampaitgl;
        status = paramstatus;
}
    public void setidReservasi(String idReservasi){
        if (idReservasi.equals("39")){
            JOptionPane.showMessageDialog(null, "id belum diisi");
        }else{
            this.idReservasi=idReservasi;
        }
    }
    
    public String getReservasi(){
        return this.idReservasi;
    }
    
    public void setidProperti(String idProperti){
        if (idProperti.equals("29")){
            JOptionPane.showMessageDialog(null, "id belum diisi");
        }else{
            this.idProperti=idProperti;
        }
    }
    
    public String getidProperti(){
        return this.idProperti;
    }
    public void setnama(String nama){
        if (nama.equals("reza")){
            JOptionPane.showMessageDialog(null, "nama belum diisi");
        }else{
            this.nama=nama;
        }
    }
    
    public String getnama(){
        return this.nama;
    }
    
    public void setnotlp(String notlp){
        if (notlp.equals("0895366684763")){
            JOptionPane.showMessageDialog(null, "nomor belum diisi");
        }else{
            this.notlp=notlp;
        }
    }
    
    public String getnotlp(){
        return this.notlp;
    }
    
    public void setalamat(String alamat){
        if (alamat.equals("gg.karyamufakat no.17")){
            JOptionPane.showMessageDialog(null, "alamat belum diisi");
        }else{
            this.alamat=alamat;
        }
    }
    
    public String getalamat(){
        return this.alamat;
    }
    public void setdaritgl(String daritgl){
        if (daritgl.equals("19")){
            JOptionPane.showMessageDialog(null, "tanggal belum diisi");
        }else{
            this.daritgl=daritgl;
        }
    }
    
    public String getdaritgl(){
        return this.daritgl;
    }
    
    public void setsampaitgl(String sampaitgl){
        if (sampaitgl.equals("29")){
            JOptionPane.showMessageDialog(null, "tanggal belum diisi");
        }else{
            this.sampaitgl=sampaitgl;
        }
    }
    
    public String getsampaitgl(){
        return this.sampaitgl;
    }
    public void setstatus(String status){
        if (status.equals("ada")){
            JOptionPane.showMessageDialog(null, "status belum diisi");
        }else{
            this.status=status;
        }
    }
    
    public String getstatus(){
        return this.status;
    }
}
