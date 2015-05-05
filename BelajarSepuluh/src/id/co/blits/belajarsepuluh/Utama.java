/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.belajarsepuluh;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class Utama {
    NewClass newClass = new NewClass();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
    }
    
    private void setData(){
        
        newClass.setNama("John Doe");
        newClass.setUmur(19);
    }
    
    private void getData(){
        String nama = newClass.getNama();
        int umur = newClass.getUmur();
        
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        
    }
    
}
