/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blitz.belajardua.array;

import java.util.Arrays;

/**
 *
 * @author Digo Pratama
 */
public class BelajarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nilai = new int[10]; //buat array dengan tipe data integer
        
        nilai[0] = 1; //isi data pada indeks 0
        nilai[1] = 2; //isi data pada indeks 1
        nilai[7] = 9; //isi data pada indeks 7
        
        //System.out.println(""+nilai[7]); //printout nilai array indeks 7
        //System.out.println(""+nilai[0]); //printout nilai array indeks 0
        //System.out.println(""+nilai[1]); //printout nilai array indeks 1*/
        
        String[] nama = {"Teknokrat", "Sang", "Penakluk"};
        int panjangArray = nilai.length;
        
        //System.out.println(""+nama[0]); //printout nilai array indeks 0
        //System.out.println(""+nama[1]); //printout nilai array indeks 1
        //System.out.println(""+nama[2]); //printout nilai array indeks 2
        
        //System.out.println(""+Arrays.toString(nilai));
        //System.out.println("Panjang Array : "+panjangArray);
        
        boolean[] bool = new boolean[5];
        
        bool[0] = true;
        bool[2] = 7 < 8;
        bool[1] = false;
        bool[4] = true;
        
        System.out.println(""+Arrays.toString(bool));
        System.out.println(""+bool[2]);
    }
    
}
