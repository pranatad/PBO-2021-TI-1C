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
public class Transaksi {

    public String namaMember, namaGame;
    public int id, lamaSewa;
    public double hargaBayar;

    public void tampilData() {
        System.out.println("Id    : " + id);
        System.out.println("Nama member   : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga Bayar   : " + hargaBayar);
        System.out.println("Lama Sewa(Jam)   : " + lamaSewa);
    }

    public int tampilTransaksi() {
        int hasil = (int) (lamaSewa * hargaBayar);
        System.out.println("Harga yang harus dibayar yaitu " +hasil+" Rupiah");
        return lamaSewa;
        
    }
}
