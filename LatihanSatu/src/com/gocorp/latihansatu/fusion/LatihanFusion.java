/*
 * Copyright (C) 2015 Digo Pratama <pratamawocky@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gocorp.latihansatu.fusion;

import java.util.Scanner;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class LatihanFusion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] negara = new String[10];
        
        Scanner papan = new Scanner(System.in);
        Scanner ketik = new Scanner(System.in);
        System.out.println("Masukkan Pilihan (1 & 2) : ");
        int pilihan = papan.nextInt();
        
        if (pilihan == 1) {
            for(int x = 1; x < 5; x++){
                System.out.print("Masukkan Nama Negara di Eropa Sebanyak "+x+" : ");
                negara [x] = ketik.nextLine();
            }
        } else if(pilihan == 2){
            for(int z = 1; z < 5;z++){
                System.out.print("Masukkan Nama Negara di Asia Sebanyak "+z+" : ");
                negara [z] = ketik.nextLine();
            }
        } else {
            System.out.println("Pilihan anda di luar jangkauan!!!");
        }
        for(int i = 1; i < 5; i++){
            System.out.println(""+negara[i]);
        }
        papan.close();
        ketik.close();
    }
    
}
