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
public class Pegawai extends DaftarGaji {

    public String nip;
    public String nama;
    public String alamat;

    Pegawai(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public String getNama() {
        return nama;
    }
    public int getGaji() {
        return gaji;
    }
}
