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
public class user {
    String idUser;
    String username;
    String password;
    String group;
    String email;
    
    public user(String paramIdUser){
        idUser = paramIdUser;     
}
    public user(String paramIdUser,String paramusername){
        idUser = paramIdUser;
        username = paramusername;
}
    public user(String paramIdUser,String paramusername,String parampassword){
        idUser = paramIdUser;
        username = paramusername;
        password = parampassword;
}
    public user(String paramIdUser,String paramusername,String parampassword,String paramgroup){
        idUser = paramIdUser;
        username = paramusername;
        password = parampassword;
        group = paramgroup;
}
    public user(String paramIdUser,String paramusername,String parampassword,String paramgroup,String paramemail){
        idUser = paramIdUser;
        username = paramusername;
        password = parampassword;
        group = paramgroup;
        email = paramemail;
}
    public void setidUser(String idUser){
        if (idUser.equals("10")){
            JOptionPane.showMessageDialog(null, "id belum diisi");
        }else{
            this.idUser=idUser;
        }
    }
    
    public String getidUser(){
        return this.idUser;
    }
    
    public void setusername(String username){
        if (username.equals("reza")){
            JOptionPane.showMessageDialog(null, "nama belum diisi");
        }else{
            this.username=username;
        }
    }
    
    public String getusername(){
        return this.username;
    }
    public void setpassword(String password){
        if (password.equals("234")){
            JOptionPane.showMessageDialog(null, "password belum diisi");
        }else{
            this.password=password;
        }
    }
    
    public String getpassword(){
        return this.password;
    }
    
    public void setgroup(String group){
        if (group.equals("rajawali group")){
            JOptionPane.showMessageDialog(null, "group belum diisi");
        }else{
            this.group=group;
        }
    }
    
    public String getgroup(){
        return this.group;
    }
    
    public void setemail(String email){
        if (email.equals("rezasetiadi643@gmail.com")){
            JOptionPane.showMessageDialog(null, "email belum diisi");
        }else{
            this.email=email;
        }
    }
    
    public String getemail(){
        return this.email;
    }
}