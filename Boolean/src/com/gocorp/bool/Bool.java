/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gocorp.bool;

/**
 *
 * @author digo
 */
import java.util.Scanner;
public class Bool {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        boolean nilai; 
        int     angka;
        
        System.out.print("Masukkan prakiraan angka: ");
        angka = keyboard.nextInt();
        
        nilai = angka >= 9;
        
        System.out.print("Apakah prakiraan anda? ");
        System.out.println(nilai);
        
    }
    
}
