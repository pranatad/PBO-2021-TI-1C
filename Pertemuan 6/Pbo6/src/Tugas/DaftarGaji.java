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
public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int gaji;

    
    
    DaftarGaji(String nip, String nama, String alamat){
        super();
    }
    
    public void addPegawai(Pegawai[] listPegawai) {
        this.listPegawai = listPegawai;
    }
    public void printSemuaGaji() {
        System.out.println("Gaji yang diperoleh : " +gaji);
    }
}