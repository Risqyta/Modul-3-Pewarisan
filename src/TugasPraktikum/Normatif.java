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
public class Normatif extends Sekolah {

    public Normatif(String kategoriMapel, int jumlahMapel) {
        super(kategoriMapel, jumlahMapel);
    }

    
     public void tampilkan(){
        String Mapel = "Seni Budaya, Bahasa Indonesia, Pendidikan Agama, PKN, Pendidikan Jasmani";
        
      
        Sekolah s = new Sekolah("Normatif",5);
        s.tampilData();
        
        System.out.println(" Mata Pelajaran          : "+ Mapel);
    
     }}