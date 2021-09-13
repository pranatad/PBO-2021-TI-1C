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
public class TestBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        Barang brg2 = new Barang();
        Barang brg3 = new Barang();
        System.out.println("Barang 1");
        brg1.kode = "00017";
        brg1.namaBarang = "Mouse";
        brg1.hargaDasar = 90000;
        brg1.diskon = 10;
        brg1.tampilData();
        brg1.hitungHargaJual();
        System.out.println();
        System.out.println("Barang 2");
        brg2.kode = "00043";
        brg2.namaBarang = "Keyboard";
        brg2.hargaDasar = 260000;
        brg2.diskon = 25;
        brg2.tampilData();
        brg2.hitungHargaJual();
        System.out.println();
        System.out.println("Barang 3");
        brg3.kode = "00020";
        brg3.namaBarang = "Web Cam";
        brg3.hargaDasar = 175000;
        brg3.diskon = 15;
        brg3.tampilData();
        brg3.hitungHargaJual();
    }
}
