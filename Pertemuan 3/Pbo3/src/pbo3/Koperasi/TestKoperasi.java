/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.Koperasi;

import java.util.Scanner;

/**
 *
 * @author Pranata
 */
public class TestKoperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.print("Masukkan pinjaman: ");
        donny.jumlahPinjaman = sc.nextInt();
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukkan angsuran: ");
        donny.angsur = sc.nextInt();
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
