/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gocorp.logika;

import java.util.Scanner;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class DefinisiLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Benarkah, Wahai Anak Muda??");        
        if (keyboard.next().equalsIgnoreCase("benar")){
            System.out.println("Benar");
        } else if (keyboard.next().equalsIgnoreCase("tidak"))
        { System.out.println("Tidak");
        }
        else {  System.out.println("Invalid");
        
    }
    
}
}   
