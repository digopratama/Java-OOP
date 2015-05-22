/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.MVC;
/**
 *
 * @author Digo Pratama
 */
import model.MVC.modelUtama;
import view.MVC.frameUtama;
        
public class controlUtama
{
    private modelUtama mu;
    
    public void setModelUtama(modelUtama mu)
    {
        this.mu = mu;
    }
    
    public void TampilOutPut(frameUtama frame,controlKonfirmasi ck)
    {
        String namaDepan = frame.getTxtNama().getText();
        String namaBelakang = frame.getTxtNama2().getText();
        if(namaDepan.isEmpty())
        {
            ck.Peringatan("Silahkan isi nama anda");
            return;
        }
        mu.setNamaDepan(namaDepan);
        mu.setNamaBelakang(namaBelakang);
        
    }
}
