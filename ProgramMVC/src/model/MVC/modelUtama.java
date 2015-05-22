/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.MVC;

/**
 *
 * @author Digo Pratama
 */
import controlevents.MVC.controlListener;

public class modelUtama 
{
    private controlListener cl;
    private String namaDepan;
    private String namaBelakang;
    
    public void setModelUtama(controlListener cl)
    {
        this.cl = cl;
    }
    
    public void setNamaDepan(String namaDepan)
    {
        this.namaDepan = namaDepan;
        if(cl != null)
        {
            cl.Tampilkan(this);
        }
    }
    
    public void setNamaBelakang(String namaBelakang)
    {
        this.namaBelakang = namaBelakang;
        if(cl != null)
        {
            cl.Tampilkan(this);
        }
    }
    
    public String Output()
    {
        return "Nama anda adalah : " +namaDepan+" "+namaBelakang;
    }
}
