/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.tabel;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class DataMahasiswa {
    private String nama, npm, jurusan;

    public DataMahasiswa(){  
}

    public String getJurusan() {
    return jurusan;
}

    public void setJurusan(String jurusan) {
    this.jurusan = jurusan;
}

    public String getNama() {
    return nama;
}

    public void setNama(String nama) {
    this.nama = nama;
}

    public String getNPM() {
    return npm;
}

    public void setNPM(String npm) {
    this.npm = npm;
}
}
