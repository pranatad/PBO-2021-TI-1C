/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.Tugas;

/**
 *
 * @author Pranata
 */
public class TestLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran();
        System.out.println("Lingkaran 1");
        l1.phi = 3.14;
        System.out.println("Diketahui phi adalah = " + l1.phi);
        l1.r = 14;
        System.out.println("Diketahui r/jari-jari adalah = " + l1.r);
        l1.hitungLuas();
        System.out.println();
        System.out.println("Lingkaran 2");
        l2.phi = 22 / 7;
        System.out.println("Diketahui phi adalah = " + l2.phi);
        l2.r = 7;
        System.out.println("Diketahui r/jari-jari adalah = " + l2.r);
        l2.hitungLuas();
        l2.hitungKeliling();
    }
}
