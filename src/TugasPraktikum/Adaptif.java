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
public class Adaptif extends Sekolah {

    public Adaptif(String kategoriMapel, int jumlahMapel) {
        super(kategoriMapel, jumlahMapel);
    }
     public void tampilkan(){
        String Mapel = "Matematikan, IPA, Bahasa Inggris, Sejarah Indonesia";
     
        Sekolah s = new Sekolah("Adaptif", 4);
        s.tampilData();
        System.out.println(" Mata Pelajaran          : "+ Mapel);
       
}

    
}