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
public class Barang {

    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public void tampilData() {
        System.out.println("Kode    : " + kode);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Dasar   : " + hargaDasar + " Rupiah");
        System.out.println("Diskon   : " + diskon + "%");

    }

    public void hitungHargaJual() {
        diskon = diskon / 100;
        float harga = hargaDasar - (diskon * hargaDasar);
        System.out.println("Maka Total Harga Jual yaitu = " + harga + " Rupiah");
    }
}
