/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan33userlogin;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Muhammad Rakha Firdaus
 * NIM      : 10118059
 * Kelas    : IF-2
 */
public class Latihan33Login {
    private static String usName, passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        User user = new User();
        
        System.out.print("Masukkan Username : ");
        usName = input.next();
        
        System.out.print("Masukkan Password : ");
        passWord = input.next();
        
        user.pengecekkanLogin(usName, passWord);
        
        
        
    }
    
}
