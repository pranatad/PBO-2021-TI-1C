/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Pranata
 */
public class Main {
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai pegawai1 = new Pegawai("2041720043", "Pranata", "Jalan Swedia");
        pegawai1.nama = "Pranata";
        pegawai1.gaji = 1000000;
        System.out.println("Nama Pegawai : "+pegawai1.getNama());
        pegawai1.printSemuaGaji();
    }
}
