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
public class properti {
    String idProperti;
    String properti;
    String alamat;
    String area;
    String dapur;
    String deskripsi;
    String harga;
    String kamarmandi;
    String lokasi;
    String photo1;
    String photo2;
    String photo3; 
    
    public properti(String paramIdProperti){
        idProperti = paramIdProperti;
}
    public properti(String paramIdProperti,String paramproperti){
        idProperti = paramIdProperti;
        properti = paramproperti;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur,String paramdeskripsi){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
        deskripsi = paramdeskripsi;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur,String paramdeskripsi,String paramharga){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
        deskripsi = paramdeskripsi;
        harga = paramharga;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur,String paramdeskripsi,String paramharga,String paramkamarmandi){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
        deskripsi = paramdeskripsi;
        harga = paramharga;
        kamarmandi = paramkamarmandi;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur,String paramdeskripsi,String paramharga,String paramkamarmandi,String paramlokasi){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
        deskripsi = paramdeskripsi;
        harga = paramharga;
        kamarmandi = paramkamarmandi;
        lokasi = paramlokasi;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur,String paramdeskripsi,String paramharga,String paramkamarmandi,String paramlokasi,String paramphoto1){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
        deskripsi = paramdeskripsi;
        harga = paramharga;
        kamarmandi = paramkamarmandi;
        lokasi = paramlokasi;
        photo1 = paramphoto1;
}
    public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur,String paramdeskripsi,String paramharga,String paramkamarmandi,String paramlokasi,String paramphoto1,String paramphoto2){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
        deskripsi = paramdeskripsi;
        harga = paramharga;
        kamarmandi = paramkamarmandi;
        lokasi = paramlokasi;
        photo1 = paramphoto1;
        photo2 = paramphoto2;
}
   public properti(String paramIdProperti,String paramproperti,String paramalamat,String paramarea,String paramdapur,String paramdeskripsi,String paramharga,String paramkamarmandi,String paramlokasi,String paramphoto1,String paramphoto2,String paramphoto3){
        idProperti = paramIdProperti;
        properti = paramproperti;
        alamat = paramalamat;
        area = paramarea;
        dapur = paramdapur;
        deskripsi = paramdeskripsi;
        harga = paramharga;
        kamarmandi = paramkamarmandi;
        lokasi = paramlokasi;
        photo1 = paramphoto1;
        photo2 = paramphoto2;
        photo3 = paramphoto3;
}
   public void setidProperti(String idProperti){
        if (idProperti.equals("40")){
            JOptionPane.showMessageDialog(null, "id belum diisi");
        }else{
            this.idProperti=idProperti;
        }
    }
    
    public String getProperti(){
        return this.idProperti;
    }
    
    public void setproperti(String properti){
        if (properti.equals("villa")){
            JOptionPane.showMessageDialog(null, "nama belum diisi");
        }else{
            this.properti=properti;
        }
    }
    
    public String getproperti(){
        return this.properti;
    }
    
    public void setalamat(String alamat){
        if (alamat.equals("gg.karya mufakat no.17")){
            JOptionPane.showMessageDialog(null, "alamat belum diisi");
        }else{
            this.alamat=alamat;
        }
    }
    
    public String getalamat(){
        return this.alamat;
    }
    
    public void setarea(String area){
        if (area.equals("BANJARMASIN")){
            JOptionPane.showMessageDialog(null, "area belum diisi");
        }else{
            this.area=area;
        }
    }
    
    public String getarea(){
        return this.area;
    }
    
    public void setdapur(String dapur){
        if (dapur.equals("vip")){
            JOptionPane.showMessageDialog(null, "dapur belum diisi");
        }else{
            this.dapur=dapur;
        }
    }
    
    public String getdapur(){
        return this.dapur;
    }
    
    public void setdeskripsi(String deskripsi){
        if (deskripsi.equals("selamat memasuki jasa parawisata")){
            JOptionPane.showMessageDialog(null, "deskripsi belum diisi");
        }else{
            this.deskripsi=deskripsi;
        }
    }
    
    public String getdeskripsi(){
        return this.deskripsi;
    }
    
    public void harga(String harga){
        if (harga.equals("200")){
            JOptionPane.showMessageDialog(null, "harga belum diisi");
        }else{
            this.harga=harga;
        }
    }
    
    public String getharga(){
        return this.harga;
    }
    public void setkamarmandi(String kamarmandi){
        if (kamarmandi.equals("vip")){
            JOptionPane.showMessageDialog(null, "kamar mandi belum diisi");
        }else{
            this.kamarmandi=kamarmandi;
        }
    }
    
    public String getkamarmandi(){
        return this.kamarmandi;
    }
    public void setlokasi(String lokasi){
        if (lokasi.equals("jl.pramuka")){
            JOptionPane.showMessageDialog(null, "alamat belum diisi");
        }else{
            this.lokasi=lokasi;
        }
    }
    
    public String getlokasi(){
        return this.lokasi;
    }
    
    public void setphoto1(String photo1){
        if (photo1.equals("photo1")){
            JOptionPane.showMessageDialog(null, "photo belum diisi");
        }else{
            this.photo1=photo1;
        }
    }
    
    public String getphoto1(){
        return this.photo1;
    }
    public void setphoto2(String photo2){
        if (photo2.equals("photo2")){
            JOptionPane.showMessageDialog(null, "photo belum diisi");
        }else{
            this.photo2=photo2;
        }
    }
    
    public String getphoto2(){
        return this.photo2;
    }
    
    public void setphoto3(String photo3){
        if (photo3.equals("photo3")){
            JOptionPane.showMessageDialog(null, "photo belum diisi");
        }else{
            this.photo3=photo3;
        }
    }
    
    public String getphoto3(){
        return this.photo3;
    }
}