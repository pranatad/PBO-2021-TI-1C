/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Pranata
 */
public class Utama {

    public static void main(String[] args) {
        // manusia
        System.out.println("MANUSIA");
        Manusia mn = new Manusia();
        mn.bernafas();
        mn.makan();

        // manusia dosen
        System.out.println("DOSEN");
        Manusia mns = new Dosen();
        Dosen dosen = new Dosen();
        dosen.bernafas();
        mns.makan();
        dosen.lembur();

        // manusia mahasiswa
        System.out.println("MAHASISWA");
        Manusia mns2 = new Mahasiswa();
        Mahasiswa mhs = new Mahasiswa();
        mhs.bernafas();
        mns2.makan();
        mhs.tidur();
    }
}
