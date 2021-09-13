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
public class TestTransaksi {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transaksi tr1 = new Transaksi();
        Transaksi tr2 = new Transaksi();
        Transaksi tr3 = new Transaksi();
        tr1.id = 001;
        tr1.namaMember = "Pranata";
        tr1.namaGame = "Red Dead Redemption 2";
        tr1.hargaBayar = 680000;
        tr1.lamaSewa = 48;
        tr1.tampilData();
        tr1.tampilTransaksi();
        System.out.println();
        tr2.id = 002;
        tr2.namaMember = "Dito";
        tr2.namaGame = "God Of War";
        tr2.hargaBayar = 800000;
        tr2.lamaSewa = 90;
        tr2.tampilData();
        tr2.tampilTransaksi();
        System.out.println();
        tr2.id = 003;
        tr2.namaMember = "Fitriyansyah";
        tr2.namaGame = "Bioshock Infinite";
        tr2.hargaBayar = 120000;
        tr2.lamaSewa = 56;
        tr2.tampilData();
        tr2.tampilTransaksi();
                
}
}
