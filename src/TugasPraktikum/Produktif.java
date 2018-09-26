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
public class Produktif extends Sekolah {

    public Produktif(String kategoriMapel, int jumlahMapel) {
        super(kategoriMapel, jumlahMapel);
    }

 public void tampilkan(){
        String Mapel = "RPL ,Simkomdig, Sistel, Desain Grafis, Komjardas";
        
        
        Sekolah s = new Sekolah("Produktif", 5);
        s.tampilData();
        
        System.out.println(" Mata Pelajaran          : "+ Mapel);
    }

   
    }

