/*
 * Copyright (C) 2015 Digo Pratama
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package id.co.blitz.belajardua.perulangan;

import java.util.Scanner;

/**
 *
 * @author Digo Pratama
 */
public class BelajarPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] nilai = new String[10];
       
       Scanner papan = new Scanner(System.in);
       
       //nilai[0] = 1; //isi data pada indeks 0
       //nilai[1] = 2; //isi data pada indeks 1
       //nilai[7] = 9; //isi data pada indeks 7
       
       for (int x = 0; x < 10; x++){
           System.out.print("Maaukkan Nilai Pada Indeks "+x+" : "); 
           nilai [x] = papan.nextLine();
       }
       for(int i = 0; i < 10; i++){
           System.out.println(""+nilai[i]);
       }
    }
    
}
