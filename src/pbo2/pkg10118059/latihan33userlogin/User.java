/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan33userlogin;

/**
 *
 * @author 
 * Nama     : Muhammad Rakha Firdaus
 * NIM      : 10118059
 * Kelas    : IF-2
 */
public class User {
    private String username = "RizkiAdam";
    private String password = "terbakselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        return username.equals(parUserName) && parPassword.equals(password); 
    }
    
    private void hasilLogin(boolean status, String parUserName){
        System.out.println("");
        
        if(status){
            System.out.println("******HALLO " + parUserName + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }    
    public void pengecekkanLogin(String parUserName, String parPassword){
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);   
    }
}
