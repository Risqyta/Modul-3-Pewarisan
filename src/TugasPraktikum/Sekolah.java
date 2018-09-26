/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
public class Sekolah {
    private String kategoriMapel;
    private int jumlahMapel;

    public Sekolah(String kategoriMapel, int jumlahMapel) {
        this.kategoriMapel = kategoriMapel;
        this.jumlahMapel = jumlahMapel;
    }
    
    
    public String getKategoriMapel() {
        return kategoriMapel;
    }

    public int getJumlahMapel() {
        return jumlahMapel;
    }

    public void setKategoriMapel(String kategoriMapel) {
        this.kategoriMapel = kategoriMapel;
    }

    public void setJumlahMapel(int jumlahMapel) {
        this.jumlahMapel = jumlahMapel;
    }

    
    public void tampilData(){
        System.out.println(" Kategori Mata Pelajaran : "+ getKategoriMapel());
        System.out.println(" Jumlah Mata Pelajaran   : "+ getJumlahMapel());
    }
    
}
