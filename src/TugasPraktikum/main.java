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
public class main {
    public static void main(String []args){
        System.out.println("Mata Pelajaran Sekolah ");
        System.out.println(" ");
        Produktif p = new Produktif("Produktif", 5);
        p.tampilkan();
        System.out.println(" ");
        Adaptif a = new Adaptif("Adaptif", 4);
        a.tampilkan();
        System.out.println(" ");
        Normatif n = new Normatif("Normatif", 5);
        n.tampilkan();
        
       
    }
    
}
