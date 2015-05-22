/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.peminjamanbuku.view;

import id.co.blits.peminjamanbuku.util.KoneksiBase;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KoneksiBase koneksiBase = new KoneksiBase();
        koneksiBase.koneksiDatabase();
    }
    
}
